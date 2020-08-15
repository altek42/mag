using System;

public class StoreItem {
  public StoreItemType ItemType { get; private set; }
  public bool IsVariable { get; private set; }
  
  private string value;
  public string Value
  {
      get { return this.value; }
      set { this.value = value; }
  }

  private StoreItem() {
    this.IsVariable = false;
  }

  static public StoreItem CreateInteger(string value) {
    StoreItem item = new StoreItem();
    item.ItemType = StoreItemType.INTEGER;
    item.Value = value;
    return item;
  }
  
  static public StoreItem CreateString(string value) {
    StoreItem item = new StoreItem();
    item.ItemType = StoreItemType.STRING;
    item.Value = value;
    return item;
  }
  
  static public StoreItem CreateBoolean(string value) {
    StoreItem item = new StoreItem();
    item.ItemType = StoreItemType.BOOLEAN;
    item.Value = value;
    return item;
  }
  
  static public StoreItem CreateDouble(string value) {
    StoreItem item = new StoreItem();
    item.ItemType = StoreItemType.DOUBLE;
    item.Value = value;
    return item;
  }

  static public StoreItem CreateVariable(string name) {
    StoreItem item = new StoreItem();
    item.Value = name;
    item.IsVariable = true;
    item.ItemType = StoreItemType.NULL;
    return item;
  }

  static public StoreItem CreateArithmeticSign(string sign) {
    StoreItem item = new StoreItem();
    item.Value = sign;
    item.ItemType = StoreItemType.ARITHMETIC_SIGN;
    return item;
  }

  // SUGAR
  public bool IsType(StoreItemType type) {
    return this.ItemType == type;
  }
  public bool IsNotType(StoreItemType type) {
    return this.ItemType != type;
  }
}
