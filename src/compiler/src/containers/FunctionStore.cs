using System;
using System.Collections.Generic;
using System.Linq;

public class FunctionStore {
  public Dictionary<string, StoreItem> Variables { get; private set; }
  public Dictionary<string, StoreItem> Params { get; private set; }
  public String Name { get; private set;}

  public StoreItem ReturnValue { get; set; }

  public bool IsReturnVoid { get {
    if(null == ReturnValue) return true;
    switch (ReturnValue.ItemType)
    {
        case StoreItemType.INTEGER:
        case StoreItemType.STRING:
        case StoreItemType.BOOLEAN:
        case StoreItemType.DOUBLE:
        case StoreItemType.ARRAY:
        case StoreItemType.ARRAY_ELEMENT:
        case StoreItemType.FUNCTION_ARG:
                 return false;
        default: return true;
    }
  }}
  public FunctionStore(string name)
  {
      Name = name;
      Variables = new Dictionary<string, StoreItem>();
      Params = new Dictionary<string, StoreItem>();
  }

  public void AddVariable(StoreItem variable){
    Variables.Add(variable.Value, variable);
  }

  public void AddParam(StoreItem param){
    param.ParamPosition = Params.Count;
    Params.Add(param.Value, param);
  }

  public void SetParamType(StoreItemType itemType, int position){
    Params.Values.Where( x => x.ParamPosition == position ).First().ItemType = itemType;
  }

  public void SetParamParent(StoreItem item, int position){
    Params.Values.Where( x => x.ParamPosition == position ).First().Parent = item;
  }

  public bool containsVariable(string variableName){
    return Variables.ContainsKey(variableName)
        || Params.ContainsKey(variableName);
  }

  public StoreItem GetVariable(string variableName) {
    StoreItem v = null;
    if(Variables.ContainsKey(variableName)){
      v = Variables[variableName];
    } else if(Params.ContainsKey(variableName)){
      v = Params[variableName];
    } 
    return v;
  }

  public StoreItem this[string variableName] {
    get { return GetVariable(variableName); }
    set { AddVariable(value); }
  }

  public string Print { get {
    return $"{this.Name}(...)";
  }}
}
