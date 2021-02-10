using System;
using System.Collections.Generic;

public class FunctionAsmLines {
  public List<string> AsmLines { private set; get; }
  public string Name {private set; get; }

  public FunctionAsmLines(string name){
    Name = name;
    AsmLines = new List<string>();
  }

  public void WriteLine(string asm){
    AsmLines.Add(asm);
  }
  
}
