using System;

class Test
{
    public void TestMethod(){
      int st = 100;
      string stStr = st.ToString();

      bool b = false;
      string bStr = b.ToString();

      double d = 1.0;
      d += 1.2;
      string dStr = d.ToString();
      Console.WriteLine(d);

      float f = 2.0f;
      f += 1.2f;
      string fStr = f.ToString();
      Console.WriteLine(f);
    }
}
