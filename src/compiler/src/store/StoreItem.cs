using System;

public class StoreItem {
  public StoreItemType ItemType { get; set; }
  public bool IsVariable { get; private set; }
  public bool IsNotVariable { get {
    return !IsVariable;
  } }
  public bool IsTemporary { get; private set; }

  public bool IsInitialized { get; set; }

  public bool IsFunctionParam { get; set; } = false;
  public int ParamPosition { get; set; }

  public StoreItem Parent { get; set; }

  private static uint temporaryVariableCounter = 0;

  private string value;
  public string Value {
    get { return this.value; }
    set { this.value = value; }
  }

  private string orginalName;
  public string OrginalName {
    get { return this.orginalName; }
    private set { this.orginalName = value; }
  }

  private StoreItem() {
    this.IsVariable = false;
    this.IsInitialized = false;
  }

  private StoreItem(StoreItem item) {
    this.ItemType = item.ItemType;
    this.IsVariable = item.IsVariable;
    this.IsTemporary = item.IsTemporary;
    this.IsInitialized = item.IsInitialized;
    this.Value = item.Value;
    this.OrginalName = item.OrginalName;
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
    StoreItem v = Store.GetVariableIfExist(name);
    if (null != v) {
      return v;
    }
    return createVariableBase(name);
  }

  static public StoreItem CreateTemporaryVariable(StoreItemType type) {
    StoreItem item = createVariableBase(getNextTmpName());
    item.IsTemporary = true;
    item.ItemType = type;
    return item;
  }

  static public StoreItem Clone(StoreItem item) {
    return new StoreItem(item);
  }

  public StoreItem CreateCastVariable(StoreItemType type) {
    StoreItem vessel = StoreItem.Clone(this);
    vessel.Value = getNextTmpName();
    vessel.IsVariable = true;
    vessel.ItemType = type;
    vessel.IsTemporary = true;
    vessel.IsInitialized = false;
    return vessel;
  }

  static private StoreItem createVariableBase(string name) {
    StoreItem item = new StoreItem();
    item.Value = name;
    item.OrginalName = name;
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

  static public StoreItem CreateConditionSign(string sign) {
    StoreItem item = new StoreItem();
    item.value = sign;
    item.ItemType = StoreItemType.CONDITION_SIGN;
    return item;
  }

  // SUGAR
  public bool IsType(StoreItemType type) {
    return this.ItemType == type;
  }
  public bool IsNotType(StoreItemType type) {
    return this.ItemType != type;
  }

  static public bool IsAllType(StoreItemType type, params StoreItem[] items){
    foreach (StoreItem item in items) {
      if(item.IsNotType(type)){
        return false;
      }
    }
    return true;
  }

  static public bool IsAllNotType(StoreItemType type, params StoreItem[] items){
    foreach (StoreItem item in items) {
      if(item.IsType(type)){
        return false;
      }
    }
    return true;
  }

  static public bool IsAnyType(StoreItemType type, params StoreItem[] items) {
    foreach (StoreItem item in items) {
      if(item.IsType(type)){
        return true;
      }
    }
    return false;
  }

  private static string getNextTmpName(){
    return $"tmp_{temporaryVariableCounter++}";
  }

  public String Print { get {
    return $"{this.ItemType}:{this.value}";
  }}

}
