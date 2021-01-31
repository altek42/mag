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

  public void BeginFor() {
    int labelIndex = Store.NextLabelIndex();
    Store.PushLabelStack(labelIndex);
    asmGenerator.CreateLabel($"FL_{labelIndex}");
    asmGenerator.Comment($"BEGIN FOR FL_{labelIndex}");
    asmGenerator.EmptyLine();
  }

  public void CheckForCondition() {
    StoreItem item = Store.PopStack();
    asmGenerator.Load(item);

    int labelIndex = Store.TopLabelStack();

    asmGenerator.JumpIfFalse($"FL_EXIT_{labelIndex}");
    asmGenerator.Jump($"FL_BODY_{labelIndex}");
    asmGenerator.Comment("CHECK CONDITION FOR");
    asmGenerator.EmptyLine();
  }

  public void BeginForExpression() {
    int labelIndex = Store.TopLabelStack();
    asmGenerator.CreateLabel($"FL_EX_{labelIndex}");
  }

  public void EndForExpression () {
    int labelIndex = Store.TopLabelStack();
    asmGenerator.Jump($"FL_{labelIndex}");
    asmGenerator.CreateLabel($"FL_BODY_{labelIndex}");
  }

  public void EndFor() {
    int labelIndex = Store.PopLabelStack();
    asmGenerator.Jump($"FL_EX_{labelIndex}");
    asmGenerator.CreateLabel($"FL_EXIT_{labelIndex}");
    asmGenerator.Comment("END FOR");
    asmGenerator.EmptyLine();
  }
}
