using System;

public class FunctionModule {

  public static readonly FunctionModule Instance = new FunctionModule();
  
  private AsmGenerator asmGenerator = AsmGenerator.Instance;

  private FunctionModule() {
  }

  public void BeginFunctionDeclaration(string functionName){
    asmGenerator.Comment($"Enter Function {functionName}");
  }

  public void EndFunctionDeclaration(string functionName) {
    asmGenerator.Comment($"Exit Function {functionName}");
  }

  public void AddParameter(string name){
    asmGenerator.Comment($"Param: {name}");
  }
}
