using System;
using System.Collections.Generic;

public static class Store {
  public static Stack<StoreItem> Stack { get; private set; }

  public static Stack<int> LabelStack { get; private set; }
  private static int _labelStackCounter = 0;

  public static Dictionary<string, StoreItem> Variables { get; private set; }

  static Store() {
    Stack = new Stack<StoreItem>();
    Variables = new Dictionary<string, StoreItem>();
    LabelStack = new Stack<int>();
  }

  public static void PushStack(StoreItem value) {
    Stack.Push(value);
  }

  public static StoreItem PopStack() {
    return Stack.Pop();
  }

  public static int PopLabelStack() {
    return LabelStack.Pop();
  }
  
  public static void PushLabelStack(int ifIndex) {
    LabelStack.Push(ifIndex);
  }

  public static int NextIfIndex() {
    return _labelStackCounter++;
  }

  public static int TopLabelStack() {
    return LabelStack.Peek();
  }
}
