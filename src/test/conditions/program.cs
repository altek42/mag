using System;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
          string a = "test1";
          string b = "1";
          
          bool test1 = a != b;
          // bool test2 = a + a == b;
          // bool test3 = b == a + a;
          // bool test4 = a + a == a + a;
          
          Console.WriteLine(test1);
          // Console.WriteLine(test2);
          // Console.WriteLine(test3);
          // Console.WriteLine(test4);
        }
    }
}
