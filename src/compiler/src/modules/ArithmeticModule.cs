using System;

public class ArithmeticModule {

  public static readonly ArithmeticModule Instance = new ArithmeticModule();
  
  private AsmGenerator asmGenerator = AsmGenerator.Instance;
  private VariableModule variableModule = VariableModule.Instance;

  private ArithmeticModule() {
  }

  public void Assign(){
    StoreItem source = Store.PopStack();
    StoreItem dist = Store.PopStack();
    asmGenerator.Load(source);
    asmGenerator.RemoveLastDuplicate();
    if (!dist.IsInitialized) {
      dist.ItemType = source.ItemType;
      asmGenerator.InitializeVariable(dist);
    }
    asmGenerator.StoreVariable(dist);
    asmGenerator.Comment($"{dist.Print} = {source.Print}");
    asmGenerator.EmptyLine();
  }

  public void ProcessArithmeticOperation() {
    StoreItem arg2 = Store.PopStack();
    StoreItem sign = Store.PopStack();
    StoreItem arg1 = Store.PopStack();

    bool stringOperation = false;

    if (StoreItem.IsAnyType(StoreItemType.STRING, arg1, arg2)) {
      if (sign.Value != "+") {
        throw new InvalidOperationException($"Operation is not allowed for strings.");
      }
      stringOperation = true;

      arg1 = variableModule.CastVariable(arg1, StoreItemType.STRING);
      arg2 = variableModule.CastVariable(arg2, StoreItemType.STRING);
    }
    if(sign.Value == "/" || StoreItem.IsAnyType(StoreItemType.DOUBLE, arg1, arg2)){
      arg1 = variableModule.CastVariable(arg1, StoreItemType.DOUBLE);
      arg2 = variableModule.CastVariable(arg2, StoreItemType.DOUBLE);
    }

    asmGenerator.Load(arg1);
    asmGenerator.Load(arg2);
    if (stringOperation) {
      asmGenerator.ConcatStrings();
    } else {
      asmGenerator.ExecuteArithmeticOperation(sign);
    }

    StoreItem resultItem;
    if (arg1.IsTemporary) {
      resultItem = arg1;
    } else if (arg2.IsTemporary) {
      resultItem = arg2;
    } else {
      resultItem = StoreItem.CreateTemporaryVariable(arg1.ItemType);
      resultItem.Parent = arg1;
      asmGenerator.InitializeVariable(resultItem);
    }

    Store.PushStack(resultItem);
    asmGenerator.StoreVariable(resultItem);

    asmGenerator.Comment($"{resultItem.Print} = {arg1.Print} {sign.Value} {arg2.Print}");
    asmGenerator.EmptyLine();
  }
  public void ProcessArithmeticSign(string sign) {
    StoreItem item = StoreItem.CreateArithmeticSign(sign);
    Store.PushStack(item);
  }
}
