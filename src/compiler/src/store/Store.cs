using System;
using System.Collections.Generic;

public static class Store {
  public static Stack<StoreItem> Stack { get; private set; }
  public static Dictionary<string, StoreItem> Variables { get; private set; }

  static Store() {
    Stack = new Stack<StoreItem>();
    Variables = new Dictionary<string, StoreItem>();
  }

  public static void PushStack(StoreItem value) {
    Stack.Push(value);
  }

  public static StoreItem PopStack() {
    return Stack.Pop();
  }
}
