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
    StoreItem array = Store.PopStack();

    asmGenerator.Load(array);
    asmGenerator.Load(index);
    asmGenerator.GetElementFromList();

    StoreItem arrayItem = StoreItem.CreateTemporaryVariable(StoreItemType.INTEGER);
    asmGenerator.InitializeVariable(arrayItem);
    asmGenerator.StoreVariable(arrayItem);
    Store.PushStack(arrayItem);

    asmGenerator.Comment($"{arrayItem.Value} = {array.Value}[{index.Value}]");
    asmGenerator.EmptyLine();
  }
}
