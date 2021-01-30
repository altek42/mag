using System;
using System.IO;

public class AsmGenerator : IDisposable {
  private static string DIST_DIR = "dist";

  private string fileName;
  private StreamWriter outFile;

  private AsmGenerator(string fileName) {
    this.fileName = formatFileName(fileName);
    this.outFile = new StreamWriter(Path.Combine(DIST_DIR, $"{this.fileName}.il"));
    this.writeFileHeader();
  }

  private string formatFileName(string fileName) {
    string fileNoExt = Path.GetFileNameWithoutExtension(fileName);
    return fileNoExt.FirstCharToUpper();
  }

  public void Dispose() {
    this.writeFileFooter();
    this.outFile.Dispose();
    _instance = null;
  }

  private void writeFileHeader() {
    outFile.WriteLine(".assembly extern mscorlib {}");
    outFile.WriteLine($".assembly {this.fileName} {{}}");
    outFile.WriteLine($".module {this.fileName}.exe");
    outFile.WriteLine($"\n.class {this.fileName}.Program");
    outFile.WriteLine("extends [mscorlib]System.Object");
    outFile.WriteLine("{\n .method static void Main(string[] args)");
    outFile.WriteLine(" cil managed\n {\n  .entrypoint\n");
  }

  private void writeFileFooter() {
    outFile.WriteLine("  ret\n }\n}");
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
          outFile.WriteLine($"call instance string [mscorlib]System.{getSystemAsmType(source)}::ToString()");
          break;
        }
        case StoreItemType.DOUBLE: {
          Load(source);
          outFile.WriteLine($"conv.r4");
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
    outFile.WriteLine($"ldloca.s v_{item.Value}");
  }

  public void WriteToStdOutput(StoreItem item) {
    Load(item);
    string asmType = getAsmType(item);
    outFile.WriteLine($"call void [mscorlib]System.Console::WriteLine({asmType})");
  }

  public void Load(StoreItem item) {
    if (item.IsVariable) {
      this.LoadVariable(item);
    } else {
      this.LoadConstant(item);
    }
  }

  public void LoadConstant(StoreItem item) {
    if (item.IsVariable) {
      throw new ArgumentException("Item is variable.");
    }
    switch (item.ItemType) {
      case StoreItemType.INTEGER:
        outFile.WriteLine($"ldc.i4 {item.Value}");
        return;
      case StoreItemType.DOUBLE:
        outFile.WriteLine($"ldc.r4 {item.Value}");
        return;
      case StoreItemType.STRING:
        outFile.WriteLine($"ldstr \"{item.Value}\"");
        return;
      case StoreItemType.BOOLEAN:
        outFile.WriteLine($"ldc.i4.{item.Value}");
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
    outFile.WriteLine($"ldloc v_{item.Value}");
  }

  public void StoreVariable(StoreItem item) {
    outFile.WriteLine($"stloc v_{item.Value}");
  }

  public void InitializeVariable(StoreItem item) {
    if (!item.IsVariable) {
      throw new ArgumentException("Item is not variable.");
    }
    if (item.IsInitialized) {
      throw new ArgumentException("Variable is initialized.");
    }
    string asmType = getAsmType(item);
    outFile.WriteLine($".locals init({asmType} v_{item.Value})");
    item.IsInitialized = true;
    Store.Variables.Add(item.Value, item);
  }


  public void ExecuteArithmeticOperation(StoreItem item) {
    if (item.IsNotType(StoreItemType.ARITHMETIC_SIGN)) {
      throw new ArgumentException("Item should be an arithmetic sign.");
    }
    switch (item.Value) {
      case "+": outFile.WriteLine("add"); return;
      case "-": outFile.WriteLine("sub"); return;
      case "*": outFile.WriteLine("mul"); return;
      case "/": outFile.WriteLine("div"); return;
      default: throw new ArgumentException("Unsuported item sign");
    }
  }

  public void ExecuteConditionOperation(StoreItem item) {
    if (item.IsNotType(StoreItemType.CONDITION_SIGN)) {
      throw new ArgumentException("Item should be an condition sign.");
    }
    switch(item.Value) {
      case ">"  : outFile.WriteLine("cgt"); return;
      case ">=" : outFile.WriteLine("clt");
                  outFile.WriteLine("ldc.i4.0");
                  outFile.WriteLine("ceq");
                  return;
      case "<"  : outFile.WriteLine("clt"); return;
      case "<=" : outFile.WriteLine("cgt");
                  outFile.WriteLine("ldc.i4.0");
                  outFile.WriteLine("ceq");
                  return;
      case "==" :
      case "===": outFile.WriteLine("ceq"); return;
      case "!=" :
      case "!==": outFile.WriteLine("ceq");
                  outFile.WriteLine("ldc.i4.0");
                  outFile.WriteLine("ceq");
                  return;
      default: throw new ArgumentException("Unsuported item sign");
    }
  }

  public void ConcatStrings() {
    outFile.WriteLine("call string [mscorlib]System.String::Concat(string,string)");
  }

  public void CompareStrings(StoreItem item) {
    if (item.IsNotType(StoreItemType.CONDITION_SIGN)) {
      throw new ArgumentException("Item should be an condition sign.");
    }
    switch(item.Value) {
      case "==" :
      case "===": outFile.WriteLine("call bool [mscorlib]System.String::op_Equality(string,string)"); return;
      case "!=" :
      case "!==": outFile.WriteLine("call bool [mscorlib]System.String::op_Inequality(string,string)"); return;
      default: throw new ArgumentException("Unsuported item sign");
    }
  }

  public void EmptyLine() {
    outFile.WriteLine();
  }

  public void Comment(string comment) {
    outFile.WriteLine($"// {comment}");
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
    outFile.WriteLine($"brfalse.s {label}");
  }

  public void CreateLabel(string label){
    outFile.WriteLine($"{label}: ");
  }
}
