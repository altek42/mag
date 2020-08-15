using System;
using System.Collections.Generic;

public class Store {
  public Stack<string> Stack { get; private set; }

  private Store()
  {
      Stack = new Stack<string>();
  }


  // SINGLETONE
  private static Store _instance = new Store();
  public static Store Instance {
    get {
      return _instance;
    }
  }
  public static void PushStack(string value){
    Instance.Stack.Push(value);
  }

  public static string PopStack(){
    return Instance.Stack.Pop();
  }
}
