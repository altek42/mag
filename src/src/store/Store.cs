using System;
using System.Collections.Generic;

public class Store {
  public Stack<StoreItem> Stack { get; private set; }

  private Store()
  {
      Stack = new Stack<StoreItem>();
  }


  // SINGLETONE
  private static Store _instance = new Store();
  public static Store Instance {
    get {
      return _instance;
    }
  }
  public static void PushStack(StoreItem value){
    Instance.Stack.Push(value);
  }

  public static StoreItem PopStack(){
    return Instance.Stack.Pop();
  }
}
