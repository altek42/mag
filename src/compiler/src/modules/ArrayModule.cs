using System;

public class ArrayModule {

  public static readonly ArrayModule Instance = new ArrayModule();
  
  private AsmGenerator asmGenerator = AsmGenerator.Instance;

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

}
