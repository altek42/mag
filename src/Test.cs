using System;

class Test
{
    public void TestMethod(){
      int st = 100;
      string ca = "STO " + st;

      string d = st.ToString();
      Console.WriteLine(d);


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
