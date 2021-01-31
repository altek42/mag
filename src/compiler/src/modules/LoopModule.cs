using System;

public class LoopModule {

  public static readonly LoopModule Instance = new LoopModule();
  
  private AsmGenerator asmGenerator = AsmGenerator.Instance;

  private LoopModule() {
  }

  public void BeginWhile() {

  }

  public void CheckWhileCondition() {

  }

  public void EndWhile() {

  }
}
