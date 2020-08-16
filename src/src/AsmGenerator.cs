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
  public void WriteToStdOutput(String value){
    outFile.WriteLine($"ldstr \"{value}\"");
    outFile.WriteLine("call void [mscorlib]System.Console::WriteLine(string)");
  }

  public void Load(StoreItem item) {
    if(item.IsVariable){
      this.LoadVariable(item);
    } else {
      this.LoadConstant(item);
    }
  }

  public void LoadConstant(StoreItem item) {
    if(item.IsVariable){
      throw new ArgumentException("Item is variable.");
    }
    switch (item.ItemType)
    {
        case StoreItemType.INTEGER:
        outFile.WriteLine($"ldc.i4 {item.Value}");
        return;
        case StoreItemType.DOUBLE:
        outFile.WriteLine($"ldc.r4 {item.Value}");
        return;
        default: throw new ArgumentException("Unsuported item type");
    }
  }

  public void LoadVariable(StoreItem item) {
    if(!item.IsVariable) {
      throw new ArgumentException("Item is not variable.");
    }
    if(!item.IsInitialized){
      throw new ArgumentException("Variable is not initialized.");
    }
    outFile.WriteLine($"ldloc v_{item.Value}");
  }

  public void StoreVariable(StoreItem item) {
    outFile.WriteLine($"stloc v_{item.Value}");
  }

  public void InitializeVariable(StoreItem item) {
    if(!item.IsVariable) {
      throw new ArgumentException("Item is not variable.");
    }
    if(item.IsInitialized){
      throw new ArgumentException("Variable is initialized.");
    }
    string asmType;
    switch (item.ItemType)
    {
        case StoreItemType.INTEGER: asmType = "int32"; break;
        case StoreItemType.DOUBLE: asmType = "float32"; break;
        case StoreItemType.BOOLEAN: asmType = "boolean"; break;
        case StoreItemType.STRING: asmType = "string"; break;
        default: throw new ArgumentException("Unsuported item type");
    }
    outFile.WriteLine($".locals init({asmType} v_{item.Value})");
    item.IsInitialized = true;
    Store.Variables.Add(item.Value, item);
  }


  public void ExecuteArithmeticOperation(StoreItem item) {
    if(item.IsNotType(StoreItemType.ARITHMETIC_SIGN)) {
      throw new ArgumentException("Item should be an arithmetic sign.");
    }
    switch (item.Value)
    {
        case "+": outFile.WriteLine("add"); return;
        case "-": outFile.WriteLine("sub"); return;
        case "*": outFile.WriteLine("mul"); return;
        case "/": outFile.WriteLine("div"); return;
        default: throw new ArgumentException("Unsuported item sign");
    }
  }

  public void EmptyLine() {
    outFile.WriteLine();
  }

  public void Comment(string comment){
    outFile.WriteLine($"// {comment}");
  }
}
