using System;
using System.Collections.Generic;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
          int a = myFunc(10);
          int b = myFunc(12);
          int c = a + b;
          bool x = false;
          bool y = !x;
          Console.WriteLine(x);
          Console.WriteLine(y);

          Console.WriteLine("" + a + " + " + b + " = " + c);
        }

        static int myFunc(int value){
            value = value + 2;
            String valueStr = value.ToString();
            Console.WriteLine("Tekst" + valueStr);
            return value;
        }
    }
}
