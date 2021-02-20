using System;
using System.Collections.Generic;

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
    StoreItem param = StoreItem.CreateVariable(name);
    param.IsFunctionParam = true;
    param.IsInitialized = true;
    param.ItemType = StoreItemType.FUNCTION_ARG;
    Store.AddVariable(param);

    asmGenerator.Comment($"Param: {name}");
  }

  public void CallFunction(string name){
    int argCount = Store.FunctionCallArgumentPop();
    Stack<StoreItem> tmpStack = new Stack<StoreItem>();
    List<StoreItem> args = new List<StoreItem>();
    for(int i = 0; i< argCount; i++){
      tmpStack.Push(Store.PopStack());
    }
    for(int i = 0; i< argCount; i++){
      StoreItem elem = tmpStack.Pop();
      Store.PushStack(elem);
      args.Add(elem);
      Store.SetFunctionParamType(name, elem.ItemType, i);
      asmGenerator.Load(elem);
    }

    asmGenerator.Comment($"FUNC CALL {name}");
    asmGenerator.CallFunction(name, args);
  }

  public void InitializeCallFunctionArguments() {
    Store.FunctionCallInitialize();
  }

  public void AddArgument() {
    Store.FunctionCallArgumentIncrement();
  }

}
