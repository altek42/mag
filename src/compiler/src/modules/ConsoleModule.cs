using System;

public class ConsoleModule {

  public static readonly ConsoleModule Instance = new ConsoleModule();
  
  private AsmGenerator asmGenerator = AsmGenerator.Instance;

  private ConsoleModule() {
  }

  public void WriteStdOutput(){
    StoreItem item = Store.PopStack();
    if(item.IsType(StoreItemType.ARRAY)){
      asmGenerator.WriteArrayToStdOutput(item);
    }else {
      asmGenerator.WriteToStdOutput(item);
    }
    asmGenerator.EmptyLine();
  }
}
