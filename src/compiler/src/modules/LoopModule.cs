using System;

public class LoopModule {

  public static readonly LoopModule Instance = new LoopModule();
  
  private AsmGenerator asmGenerator = AsmGenerator.Instance;

  private LoopModule() {
  }

  public void BeginWhile() {
    int labelIndex = Store.NextLabelIndex();
    Store.PushLabelStack(labelIndex);
    asmGenerator.CreateLabel($"WL_{labelIndex}");
    asmGenerator.Comment($"BEGIN WHILE WL_{labelIndex}");
    asmGenerator.EmptyLine();
  }

  public void CheckWhileCondition() {
    StoreItem item = Store.PopStack();
    asmGenerator.Load(item);

    int labelIndex = Store.TopLabelStack();

    asmGenerator.JumpIfFalse($"WL_EXIT_{labelIndex}");
    asmGenerator.Comment("CHECK CONDITION WHILE");
    asmGenerator.EmptyLine();
  }

  public void EndWhile() {
    int labelIndex = Store.PopLabelStack();
    asmGenerator.Jump($"WL_{labelIndex}");
    asmGenerator.CreateLabel($"WL_EXIT_{labelIndex}");
    asmGenerator.Comment("END WHILE");
    asmGenerator.EmptyLine();
  }
}
