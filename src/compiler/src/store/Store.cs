using System;
using System.Collections.Generic;

public static class Store {
  public static Stack<StoreItem> Stack { get; private set; }

  public static Stack<int> IfStack { get; private set; }
  private static int _ifStackCounter = 0;

  public static Dictionary<string, StoreItem> Variables { get; private set; }

  static Store() {
    Stack = new Stack<StoreItem>();
    Variables = new Dictionary<string, StoreItem>();
    IfStack = new Stack<int>();
  }

  public static void PushStack(StoreItem value) {
    Stack.Push(value);
  }

  public static StoreItem PopStack() {
    return Stack.Pop();
  }

  public static int PopIfStack() {
    return IfStack.Pop();
  }
  
  public static void PushIfStack(int ifIndex) {
    IfStack.Push(ifIndex);
  }

  public static int NextIfIndex() {
    return _ifStackCounter++;
  }

  public static int TopIfStack() {
    return IfStack.Peek();
  }
}
