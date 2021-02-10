using System;

public class FunctionModule {

  public static readonly FunctionModule Instance = new FunctionModule();
  
  private AsmGenerator asmGenerator = AsmGenerator.Instance;

  private FunctionModule() {
  }

  public void BeginFunctionDeclaration(string functionName){
    asmGenerator.Comment($"FUNCTION {functionName}");
    asmGenerator.EmptyLine();
    asmGenerator.CreateFunction(functionName);
  }

  public void EndFunctionDeclaration(string functionName) {
    asmGenerator.EndFunction();
  }

  public void AddParameter(string name){
    asmGenerator.Comment($"Param: {name}");
  }

  public void CallFunction(string name){
    asmGenerator.Comment($"FUNC CALL {name}");
    asmGenerator.CallFunction(name);
  }

}
