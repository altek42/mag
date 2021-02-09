using System;
using System.Collections.Generic;
using System.IO;

public class AsmGenerator : IDisposable {
  private static string DIST_DIR = "dist";

  private string fileName;

  private int tabSize = 1;

  private List<string> asmLines;
  private Dictionary<string, List<string>> asmFunctionsLines;

  private AsmGenerator(string fileName) {
    this.fileName = formatFileName(fileName);
    this.asmLines = new List<string>();
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
    outFile.WriteLine("  ret\n }\n}");
  }

  private void initializeAllVariables(StreamWriter outFile) {
    List<string> strVariables = new List<string>();
    foreach(KeyValuePair<string, StoreItem> element in Store.Variables){
      StoreItem item = element.Value;
      if(item.ItemType == StoreItemType.ARRAY){
        strVariables.Add($"class [mscorlib]System.Collections.Generic.List`1<int32> v_{item.Value}");
      } else {
        string asmType = getAsmType(item);
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
    asmLines.Add($"{tabStr}{line}");
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
    this.initializeAllVariables(outFile);
    foreach(string line in this.asmLines){
      outFile.WriteLine(line);
    }
    this.writeFileFooter(outFile);
    outFile.Dispose();
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
          writeLine($"call instance string [mscorlib]System.{getSystemAsmType(source)}::ToString()");
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
    writeLine($"ldloca.s v_{item.Value}");
  }

  public void WriteToStdOutput(StoreItem item) {
    Load(item);
    string asmType = getAsmType(item);
    writeLine($"call void [mscorlib]System.Console::WriteLine({asmType})");
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
    writeLine($"ldloc v_{item.Value}");
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
    Store.Variables.Add(item.Value, item);
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
      case StoreItemType.INTEGER: return "int32";
      case StoreItemType.DOUBLE: return "float32";
      case StoreItemType.BOOLEAN: return "bool";
      case StoreItemType.STRING: return "string";
      default: throw new ArgumentException("Unsuported item type");
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

}
