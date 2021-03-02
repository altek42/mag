using System;
using System.Collections.Generic;

public static class Store {
  public static Stack<StoreItem> Stack { get; private set; }

  public static Stack<int> LabelStack { get; private set; }
  public static Stack<int> FunctionCallArgCounterStack { get; private set; }

  private static int _labelStackCounter = 0;

  public static Dictionary<string, StoreItem> Variables { get; private set; }

  public static Dictionary<string, FunctionStore> Functions { get; private set; }

  public static string ProcessingFunction { get; private set; }

  static Store() {
    Stack = new Stack<StoreItem>();
    Variables = new Dictionary<string, StoreItem>();
    Functions = new Dictionary<string, FunctionStore>();
    LabelStack = new Stack<int>();
    FunctionCallArgCounterStack = new Stack<int>();
    ProcessingFunction = null;
  }

  public static void PushStack(StoreItem value) {
    Stack.Push(value);
  }

  public static StoreItem PopStack() {
    return Stack.Pop();
  }

  public static StoreItem TopStack() {
    return Stack.Peek();
  }

  public static int PopLabelStack() {
    return LabelStack.Pop();
  }
  
  public static void PushLabelStack(int ifIndex) {
    LabelStack.Push(ifIndex);
  }

  public static int NextLabelIndex() {
    return _labelStackCounter++;
  }

  public static int TopLabelStack() {
    return LabelStack.Peek();
  }

  public static void FunctionCallInitialize() {
    FunctionCallArgCounterStack.Push(0);
  }

  public static void FunctionCallArgumentIncrement(){
    int value = FunctionCallArgCounterStack.Pop();
    FunctionCallArgCounterStack.Push(value+1);
  }

  public static int FunctionCallArgumentPop() {
    return FunctionCallArgCounterStack.Pop();
  }

  private static void AddVariable(string funcName, StoreItem variable){
    if(!Functions.ContainsKey(funcName)){
      Functions[funcName] = new FunctionStore(funcName);
    }
    if(variable.IsFunctionParam){
      Functions[funcName].AddParam(variable);
    }else {
      Functions[funcName].AddVariable(variable);
    }
  }

  public static void AddVariable(StoreItem variable) {
    if(null == ProcessingFunction) {
      Variables.Add(variable.Value, variable);
    } else {
      AddVariable(ProcessingFunction, variable);
    }
  }


  public static void SetFunction(string funcName) {
    ProcessingFunction = funcName;
  }

  public static void SetFunctionReturnValue(StoreItem item) {
    Functions[ProcessingFunction].ReturnValue = item;
  }

  public static void ClearFunction() {
    ProcessingFunction = null;
  }

  public static void ChcekVariableExist(string variableName) {
    if((null == ProcessingFunction && Variables.ContainsKey(variableName))
    || (isFunctionVariableExist(variableName))
    ) {
        throw new InvalidOperationException($"Variable `{variableName}` already initialized.");
    }
  }

  public static StoreItem GetVariableIfExist(string variableName) {
    if(null == ProcessingFunction && Variables.ContainsKey(variableName)){
      return Variables[variableName];
    } else if( isFunctionVariableExist(variableName) ){
      return Functions[ProcessingFunction][variableName];
    }
    return null;
  }

  private static bool isFunctionVariableExist(string variableName){
    return null != ProcessingFunction
        && Functions.ContainsKey(ProcessingFunction)
        && Functions[ProcessingFunction].containsVariable(variableName);
  }

  public static void SetFunctionParamType(string functionName, StoreItemType itemType, int position){
    Functions[functionName].SetParamType(itemType, position);
  }
}
