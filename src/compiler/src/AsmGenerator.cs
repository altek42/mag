using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.RegularExpressions;

public class AsmGenerator : IDisposable {
  private static string DIST_DIR = "dist";

  private string fileName;

  private int tabSize = 1;

  private List<string> asmLines;
  private Dictionary<string, FunctionAsmLines> asmFunctionsLines;

  private AsmGenerator(string fileName) {
    this.fileName = formatFileName(fileName);
    this.asmLines = new List<string>();
    this.asmFunctionsLines = new Dictionary<string, FunctionAsmLines>();
  }

  private string formatFileName(string fileName) {
    string fileNoExt = Path.GetFileNameWithoutExtension(fileName);
    return fileNoExt.FirstCharToUpper();
  }

  public void Dispose() {
    this.createAsmFile();
    _instance = null;
  }

  private void writeFileHeader(StreamWriter outFile) {
    outFile.WriteLine(".assembly extern mscorlib {}");
    outFile.WriteLine($".assembly {this.fileName} {{}}");
    outFile.WriteLine($".module {this.fileName}.exe");
    outFile.WriteLine($"\n.class {this.fileName}.Program");
    outFile.WriteLine("extends [mscorlib]System.Object");
    outFile.WriteLine("{\n .method static void Main(string[] args)");
    outFile.WriteLine(" cil managed\n {\n  .entrypoint");
  }

  private void writeFileFooter(StreamWriter outFile) {
    outFile.WriteLine("\n}");
  }

  private void writeMainFunctionFooter(StreamWriter outFile) {
    outFile.WriteLine("  ret\n }");
  }

  private void initializeAllVariables(StreamWriter outFile, Dictionary<string, StoreItem> variables) {
    List<string> strVariables = new List<string>();
    foreach(KeyValuePair<string, StoreItem> element in variables){
      StoreItem item = element.Value;
      StoreItem elem = item;
      while(elem.IsType(StoreItemType.FUNCTION_ARG)){
        elem = elem.Parent;
      }
      StoreItemType itemType = elem.ItemType;
      if(itemType == StoreItemType.ARRAY){
        strVariables.Add($"class [mscorlib]System.Collections.Generic.List`1<int32> v_{item.Value}");
      } else if (itemType == StoreItemType.UNDEFINED) {
        continue;
      } else {
        string asmType = getAsmType(elem);
        strVariables.Add($"{asmType} v_{item.Value}");
      }
    }
    strVariables.Sort();

    outFile.Write("  .locals init(\n         ");
    outFile.Write(string.Join(",\n         ", strVariables));
    outFile.Write(")\n\n");
  }

  private void writeLine(string line) {
    string tabStr = new String(' ', tabSize*2);
    string asm = $"{tabStr}{line}";

    if(Store.ProcessingFunction != null){
      writeLineToFunction(Store.ProcessingFunction, asm);
    } else {

      asmLines.Add(asm);
    }
  }

  private void writeLineToFunction(string functionName, string asm) {
    FunctionAsmLines funcAsm = asmFunctionsLines[functionName];
    funcAsm.WriteLine(asm);
  }

  public void RemoveLastDuplicate() {
    int lastIndex = asmLines.Count - 1;
    if(lastIndex < 1) return;
    if(asmLines[lastIndex] == asmLines[lastIndex-1]){
      asmLines.RemoveAt(lastIndex);
    }
  }

  private void createAsmFile() {
    StreamWriter outFile = new StreamWriter(Path.Combine(DIST_DIR, $"{this.fileName}.il"));
    this.writeFileHeader(outFile);
    this.initializeAllVariables(outFile, Store.Variables);
    foreach(string line in this.asmLines){
      outFile.WriteLine(line);
    }
    this.writeMainFunctionFooter(outFile);
    this.createAsmFunctions(outFile);
    this.writeFileFooter(outFile);
    outFile.Dispose();
  }

  private void createAsmFunctions(StreamWriter outFile) {
    foreach(var item in asmFunctionsLines){
      writeAsmFunction(outFile, item.Value);
    }
  }

  private void writeAsmFunction(StreamWriter outFile, FunctionAsmLines functionAsmLines) {
    string funcName = functionAsmLines.Name;
    FunctionStore funcStore = Store.Functions[funcName];
    if(!funcStore.IsUsed){
      return;
    }
    outFile.WriteLine("\n");
    string returnValueType = getAsmReturnType(funcStore.ReturnValue);
    outFile.Write($" .method static {returnValueType} f_{funcName}(");
    writeAsmFunctionParameters(outFile, funcStore);
    outFile.WriteLine($") cil managed\n {{");
    this.initializeAllVariables(outFile, funcStore.Variables);
    foreach(string line in functionAsmLines.AsmLines){
      string asmLine = line;
      while(asmLine.Contains('#')){
        asmLine = functionPostProcessing(asmLine, funcStore);
      }
      outFile.WriteLine(asmLine);
    }
    outFile.WriteLine("  ret");
    outFile.WriteLine(" }");
  }

  private string functionPostProcessing(string line, FunctionStore store){
    Regex regex = new Regex(@"#(\w+)#(\w+)(@(\w+))?(#(\w+))?");
    Match match = regex.Match(line);
    if(match.Success){
      string pragma = match.Groups[1].Value;
      string funcName = match.Groups[4].Value;

      FunctionStore variableStore = store;
      if(!string.IsNullOrEmpty(funcName)){
        variableStore = Store.Functions[funcName];
      }

      switch (pragma)
      {
          case "CAST_VARIABLE":
              string src = match.Groups[2].Value;
              StoreItem srcVar = variableStore.GetVariable(src);
              string castAsm = $"call instance string [mscorlib]System.{getSystemAsmType(srcVar)}::ToString()";
              return regex.Replace(line, castAsm, 1);
          case "FUNC_PARAM_TYPE":
              string varName = match.Groups[2].Value;
              StoreItem variable = variableStore.GetVariable(varName).RootItem;
              return regex.Replace(line, getAsmType(variable), 1);
          default:
            break;
      }
      
    }
    return line;
  }

  private void writeAsmFunctionParameters(StreamWriter outFile, FunctionStore funcStore){
    List<String> elements = new List<string>();
    string space = "\n       ";
    foreach (KeyValuePair<string, StoreItem> pair in funcStore.Params) {
      StoreItem item = pair.Value;
      elements.Add($"{space}{getAsmType(item.RootItem)} v_{item.Value}");
    }
    outFile.Write(string.Join(", ", elements));
  }

  // SINGLETON
  private static AsmGenerator _instance;
  public static AsmGenerator Create(string sourceFileName) {
    if (_instance != null) {
      _instance.Dispose();
    }
    _instance = new AsmGenerator(sourceFileName);
    return _instance;
  }
  public static AsmGenerator Instance {
    get {
      if (_instance == null) {
        throw new InvalidOperationException("AsmGenerator is not created. Call `AsmGenerator.Create(string sourceFileName)` first.");
      }
      return _instance;
    }
  }

  // FUNCTIONALITY
  
  public void CastVariable(StoreItem source, StoreItem destiny){
    if(source.IsNotVariable){
      StoreItem tmp = StoreItem.CreateTemporaryVariable(source.ItemType);
      InitializeVariable(tmp);
      Load(source);
      StoreVariable(tmp);
      source = tmp;
    }
    switch (destiny.ItemType)
    {
        case StoreItemType.STRING: {
          LoadAddress(source);
          if(source.IsType(StoreItemType.FUNCTION_ARG)){
            string funcName = "";
            if(Store.ProcessingFunction != null){
              funcName = "@" + Store.ProcessingFunction;
            }
            writeLine($"#CAST_VARIABLE#{source.Value}{funcName}");
          }else {
            writeLine($"call instance string [mscorlib]System.{getSystemAsmType(source)}::ToString()");
          }
          break;
        }
        case StoreItemType.DOUBLE: {
          Load(source);
          writeLine($"conv.r4");
          break;
        }
        default:
          throw new ArgumentException("Cast type is not supported.");
    }
    StoreVariable(destiny);
  }

  public void LoadAddress(StoreItem item) {
    if(item.IsNotVariable){
      throw new ArgumentException("Item should be a variable.");
    }
    if(item.IsFunctionParam){
      writeLine($"ldarga v_{item.Value}");
    } else {
      writeLine($"ldloca.s v_{item.Value}");
    }
  }

  public void WriteToStdOutput(StoreItem item) {
    Load(item);
    string asmType = getAsmType(item);
    writeLine($"call void [mscorlib]System.Console::WriteLine({asmType})");
  }

  public void WriteArrayToStdOutput(StoreItem item) {
    writeLine("ldstr   \"[ \"");
    writeLine("ldstr   \", \"");
    Load(item);
    writeLine($"call string [mscorlib]System.String::Join<int32>(string, class [mscorlib]System.Collections.Generic.IEnumerable`1<!!0/*int32*/>)");
    writeLine("ldstr   \" ]\"");
    writeLine($"call string [mscorlib]System.String::Concat(string, string, string)");
    writeLine($"call void [mscorlib]System.Console::WriteLine(string)");
  }

  public void Load(StoreItem item) {
    if (item.IsVariable) {
      this.LoadVariable(item);
    } else {
      this.LoadConstant(item);
    }
  }

  public void LoadNoRepeat(StoreItem item) {

  }

  public void LoadConstant(StoreItem item) {
    if (item.IsVariable) {
      throw new ArgumentException("Item is variable.");
    }
    switch (item.ItemType) {
      case StoreItemType.INTEGER:
        writeLine($"ldc.i4 {item.Value}");
        return;
      case StoreItemType.DOUBLE:
        writeLine($"ldc.r4 {item.Value}");
        return;
      case StoreItemType.STRING:
        writeLine($"ldstr \"{item.Value}\"");
        return;
      case StoreItemType.BOOLEAN:
        writeLine($"ldc.i4.{item.Value}");
        return;
      default: throw new ArgumentException("Unsuported item type");
    }
  }

  public void LoadVariable(StoreItem item) {
    if (!item.IsVariable) {
      throw new ArgumentException("Item is not variable.");
    }
    if (!item.IsInitialized) {
      throw new ArgumentException("Variable is not initialized.");
    }

    if(item.IsType(StoreItemType.ARRAY_ELEMENT)){
      LoadVariableWithoutCheck(item);
      Load(item.TableIndex);
      GetElementFromList();
    } else {
      LoadVariableWithoutCheck(item);
    }
  }

  public void LoadVariableWithoutCheck(StoreItem item){
    if(item.IsFunctionParam){
      writeLine($"ldarg v_{item.Value}");
    } else {
      writeLine($"ldloc v_{item.Value}");
    }
  }

  public void StoreVariable(StoreItem item) {
    writeLine($"stloc v_{item.Value}");
  }

  public void InitializeVariable(StoreItem item) {
    if (!item.IsVariable) {
      throw new ArgumentException("Item is not variable.");
    }
    if (item.IsInitialized) {
      throw new ArgumentException("Variable is initialized.");
    }
    item.IsInitialized = true;
    Store.AddVariable(item);
  }

  public void InitializeVariableFromUndefined(StoreItem item) {
     if (!item.IsVariable) {
      throw new ArgumentException("Item is not variable.");
    }
    if (item.IsInitialized) {
      throw new ArgumentException("Variable is initialized.");
    }
    item.IsInitialized = true;
  }

  public void CtorVariable(StoreItem item){
    InitializeVariable(item);
    if (item.ItemType == StoreItemType.ARRAY){
      writeLine("newobj instance void class [mscorlib]System.Collections.Generic.List`1<int32>::.ctor()");
      StoreVariable(item);
      LoadVariable(item);
    }
  }


  public void ExecuteArithmeticOperation(StoreItem item) {
    if (item.IsNotType(StoreItemType.ARITHMETIC_SIGN)) {
      throw new ArgumentException("Item should be an arithmetic sign.");
    }
    switch (item.Value) {
      case "+": writeLine("add"); return;
      case "-": writeLine("sub"); return;
      case "*": writeLine("mul"); return;
      case "/": writeLine("div"); return;
      default: throw new ArgumentException("Unsuported item sign");
    }
  }

  public void ExecuteConditionOperation(StoreItem item) {
    if (item.IsNotType(StoreItemType.CONDITION_SIGN)) {
      throw new ArgumentException("Item should be an condition sign.");
    }
    switch(item.Value) {
      case ">"  : writeLine("cgt"); return;
      case ">=" : writeLine("clt");
                  writeLine("ldc.i4.0");
                  writeLine("ceq");
                  return;
      case "<"  : writeLine("clt"); return;
      case "<=" : writeLine("cgt");
                  writeLine("ldc.i4.0");
                  writeLine("ceq");
                  return;
      case "==" :
      case "===": writeLine("ceq"); return;
      case "!=" :
      case "!==": writeLine("ceq");
                  writeLine("ldc.i4.0");
                  writeLine("ceq");
                  return;
      default: throw new ArgumentException("Unsuported item sign");
    }
  }

  public void ConcatStrings() {
    writeLine("call string [mscorlib]System.String::Concat(string,string)");
  }

  public void CompareStrings(StoreItem item) {
    if (item.IsNotType(StoreItemType.CONDITION_SIGN)) {
      throw new ArgumentException("Item should be an condition sign.");
    }
    switch(item.Value) {
      case "==" :
      case "===": writeLine("call bool [mscorlib]System.String::op_Equality(string,string)"); return;
      case "!=" :
      case "!==": writeLine("call bool [mscorlib]System.String::op_Inequality(string,string)"); return;
      default: throw new ArgumentException("Unsuported item sign");
    }
  }

  public void EmptyLine() {
    writeLine("");
  }

  public void Comment(string comment) {
    writeLine($"// {comment}");
  }

  private string getAsmType(StoreItem item) {
    switch (item.ItemType) {
      case StoreItemType.ARRAY_ELEMENT:
      case StoreItemType.INTEGER: return "int32";
      case StoreItemType.DOUBLE: return "float32";
      case StoreItemType.BOOLEAN: return "bool";
      case StoreItemType.STRING: return "string";
      case StoreItemType.FUNCTION_ARG: return $"#FUNC_PARAM_TYPE#{item.Value}";
      case StoreItemType.ARRAY: return "class [mscorlib]System.Collections.Generic.List`1<int32>";
      default: throw new ArgumentException("Unsuported item type");
    }
  }

  private string getAsmReturnType(StoreItem item) {
    try
    {
      StoreItem returnVariable = item.RootItem;
      if(null == returnVariable && item.IsType(StoreItemType.FUNCTION_ARG)){
        returnVariable = item;
      }
      return getAsmType(returnVariable);
    }
    catch (System.Exception)
    {
      return "void";
    }
  }

  private string getSystemAsmType(StoreItem item) {
    switch (item.ItemType) {
      case StoreItemType.INTEGER: return "Int32";
      case StoreItemType.DOUBLE: return "Single";
      case StoreItemType.BOOLEAN: return "Boolean";
      default: throw new ArgumentException("Unsuported item type");
    }
  }

  public void JumpIfFalse(string label){
    writeLine($"brfalse {label}");
  }

  public void JumpIfTrue(string label) {
    writeLine($"brtrue {label}");
  }

  public void Jump(string label){
    writeLine($"br {label}");
  }

  public void CreateLabel(string label){
    writeLine($"{label}: ");
  }
  
  public void AddElementToList(StoreItem array){
    writeLine("callvirt   instance void class [mscorlib]System.Collections.Generic.List`1<int32>::Add(!0)");
    LoadVariable(array);
  }

  public void GetElementFromList() {
    writeLine("callvirt   instance !0 class [mscorlib]System.Collections.Generic.List`1<int32>::get_Item(int32)");
  }

  public void SetElementForList() {
    writeLine("callvirt   instance void class [mscorlib]System.Collections.Generic.List`1<int32>::set_Item(int32, !0)");
  }

  public void GetListSize() {
    writeLine("callvirt   instance int32 class [mscorlib]System.Collections.Generic.List`1<int32>::get_Count()");
  }

  public void CreateFunction(string name) {
    FunctionAsmLines functionAsmLines = new FunctionAsmLines(name);
    if(asmFunctionsLines.ContainsKey(name)){
      throw new ArgumentException($"Function `{name}` already exist.");
    }
    asmFunctionsLines.Add(name, functionAsmLines);
    Store.SetFunction(name);
  }

  public void EndFunction() {
    Store.ClearFunction();
  }

  public void CallFunction(string name, List<StoreItem> args){
    IEnumerable<string> argsTypes = args.Select( x => getAsmType(x) );
    string argsAsm = string.Join(", ", argsTypes);

    FunctionStore funcStore = Store.Functions[name];
    string returnValueType = getAsmReturnType(funcStore.ReturnValue);
    if(
      null != funcStore.ReturnValue &&
      funcStore.ReturnValue.IsType(StoreItemType.FUNCTION_ARG) &&
      returnValueType.Contains('#')
    ){
      returnValueType += $"@{name}";
    }
    
    writeLine($"call {returnValueType} {this.fileName}.Program::f_{name}({argsAsm})");
  }

  public void Pop(){
    writeLine("pop");
  }
  public void Return(){
    writeLine("ret");
  }

  public void Negation() {
    writeLine("ldc.i4.0");
    writeLine("ceq");
  }
}
