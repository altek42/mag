using System;

public class VariableModule {

  public static readonly VariableModule Instance = new VariableModule();
  
  private AsmGenerator asmGenerator = AsmGenerator.Instance;

  private VariableModule() {
  }

  public void DeclareVariable(string variableName) {
    Store.ChcekVariableExist(variableName);
    StoreItem item = StoreItem.CreateVariable(variableName);
    Store.PushStack(item);
  }

  public StoreItem CastVariable(StoreItem item, StoreItemType itemType){
    if(item.ItemType == itemType){
      return item;
    }

    StoreItem vessel = item.CreateCastVariable(itemType);
    asmGenerator.InitializeVariable(vessel);
    asmGenerator.CastVariable(item, vessel);

    asmGenerator.Comment($"{item.Print} -> {vessel.Print}\n");
    return vessel;
  }

  public void CreateVariable(string value) {
    StoreItem item = StoreItem.CreateVariable(value);
    if (!item.IsInitialized) {
      throw new InvalidOperationException($"Variable {item.Print} is undfined");
    }
    Store.PushStack(item);
  }

  public void CreateNumber(string value) {
    StoreItem item;
    if (value.Contains(".")) {
      item = StoreItem.CreateDouble(value);
    } else {
      item = StoreItem.CreateInteger(value);
    }
    Store.PushStack(item);
  }

  public void CreateString(string value) {
    value = value.Substring(1, value.Length - 2);
    StoreItem item = StoreItem.CreateString(value);
    Store.PushStack(item);
  }

  public void CreateBoolean(string value) {
    string booleanValue = value == "true" ? "1" : "0";
    StoreItem item = StoreItem.CreateBoolean(booleanValue);
    Store.PushStack(item);
  }
}
