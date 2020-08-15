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
    outFile.WriteLine(" cil managed\n {\n  .entrypoint");
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

}
