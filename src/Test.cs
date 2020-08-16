using System;

class Test
{
    public void TestMethod(){
      string o = "gg";
      o = o + "pp";
      string a = "abc" + "def";
      string b = "ooo" + 1;
      string c = 2 + "hhh";

      Console.WriteLine(a);
      Console.WriteLine(b);
      Console.WriteLine(c);
    }
}
