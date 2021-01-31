using System;

public class ConditionModule {

  public static readonly ConditionModule Instance = new ConditionModule();
  
  private AsmGenerator asmGenerator = AsmGenerator.Instance;
  private VariableModule variableModule = VariableModule.Instance;

  private ConditionModule() {
  }

  public void ProcessCondition() {
    StoreItem arg2 = Store.PopStack();
    StoreItem sign = Store.PopStack();
    StoreItem arg1 = Store.PopStack();

    bool stringOperation = false;
    if (StoreItem.IsAnyType(StoreItemType.STRING, arg1, arg2)) {
      if (!Array.Exists(new[] {"==", "===", "!=", "!=="}, x => x == sign.Value) ) {
        throw new InvalidOperationException($"Operation is not allowed for strings.");
      }
      stringOperation = true;

      arg1 = variableModule.CastVariable(arg1, StoreItemType.STRING);
      arg2 = variableModule.CastVariable(arg2, StoreItemType.STRING);
    }

    asmGenerator.Load(arg1);
    asmGenerator.Load(arg2);

    if (stringOperation) {
      asmGenerator.CompareStrings(sign);
    } else {
      asmGenerator.ExecuteConditionOperation(sign);
    }

    StoreItem resultItem;
    if (arg1.IsTemporary && arg1.IsType(StoreItemType.BOOLEAN)) {
      resultItem = arg1;
    } else if (arg2.IsTemporary && arg2.IsType(StoreItemType.BOOLEAN)) {
      resultItem = arg2;
    } else {
      resultItem = StoreItem.CreateTemporaryVariable(StoreItemType.BOOLEAN);
      asmGenerator.InitializeVariable(resultItem);
    }
    Store.PushStack(resultItem);
    asmGenerator.StoreVariable(resultItem);

    asmGenerator.Comment($"{resultItem.Print} = {arg1.Print} {sign.Value} {arg2.Print}");
    asmGenerator.EmptyLine();
  }
  public void ProcessConditionSign(string sign) {
    StoreItem item = StoreItem.CreateConditionSign(sign);
    Store.PushStack(item);
  }

  public void BeginIfStatement(){
    int ifIndex = Store.NextLabelIndex();
    Store.PushLabelStack(ifIndex);
  }

  public void IfStatementCondition() {
    StoreItem item = Store.PopStack();
    asmGenerator.Load(item);

    int ifIndex = Store.TopLabelStack();
    asmGenerator.JumpIfFalse($"IF_{ifIndex}");

    asmGenerator.Comment($"if ({item.Print} == false) JUMP IF_{ifIndex}");
  }

  public void EndIfStatement() {
    int ifIndex = Store.PopLabelStack();
    asmGenerator.CreateLabel($"IF_{ifIndex}");
  }

  public void ElseStatement() {
    int elseIndex = Store.NextLabelIndex();
    int ifIndex = Store.PopLabelStack();
    asmGenerator.Jump($"IF_{elseIndex}");
    asmGenerator.CreateLabel($"IF_{ifIndex}");
    Store.PushLabelStack(elseIndex);

    asmGenerator.Comment($"ELSE");
  }
}
