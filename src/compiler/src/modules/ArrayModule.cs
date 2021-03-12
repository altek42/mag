using System;

public class ArrayModule {

  public static readonly ArrayModule Instance = new ArrayModule();
  
  private readonly AsmGenerator asmGenerator = AsmGenerator.Instance;
  private readonly VariableModule variableModule = VariableModule.Instance;

  private ArrayModule() {
  }

  public void CreateTempArray() {
    StoreItem array = StoreItem.CreateTemporaryVariable(StoreItemType.ARRAY);
    asmGenerator.CtorVariable(array);
    asmGenerator.Comment($"CREATE ARRAY {array.Value}");
    Store.PushStack(array);
  }

  public void AddElementToArray() {
    StoreItem item = Store.PopStack();
    StoreItem array = Store.TopStack();
    asmGenerator.Load(item);
    asmGenerator.AddElementToList(array);
  }

  public void CreateTableVariable(string value) {
    StoreItem index = Store.PopStack();
    variableModule.CreateVariable(value);
    StoreItem array = Store.PopStack().Clone();
    array.TableIndex= index;
    array.ItemType = StoreItemType.ARRAY_ELEMENT;
    asmGenerator.Comment($"{array.Value}[{index.Value}]");
    Store.PushStack(array);
  }

  public void GetArrayLength(string arrayName) {
    StoreItem array = Store.GetVariableIfExist(arrayName);
    if(!array.IsInitialized){
      throw new InvalidOperationException($"Variable {array.Print} is undfined");
    }
    if(array.IsNotType(StoreItemType.ARRAY, StoreItemType.FUNCTION_ARG)){
      throw new InvalidOperationException($"Variable {array.Print} must be an array");
    }
    StoreItem arrLen = StoreItem.CreateTemporaryVariable(StoreItemType.INTEGER);
    asmGenerator.InitializeVariable(arrLen);
    asmGenerator.Load(array);
    asmGenerator.GetListSize();
    asmGenerator.StoreVariable(arrLen);
    asmGenerator.Comment($"{arrLen.Print} = {array.Print}:LENGTH");
    Store.PushStack(arrLen);
  }
}
