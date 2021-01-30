using System;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
          int a = 1;
          bool x = a == 1;
          bool y = x;
          // if(x) {
          //   Console.WriteLine("Success!");
          // } else {
          //   Console.WriteLine("Fail :(");
          // }

          // if(x) {
          //   Console.WriteLine("Success 2!");
          // }

          if(x) {
            Console.WriteLine("IF X");
          } else if(y) {
            Console.WriteLine("ELSE IF Y");
          } else {
            Console.WriteLine("ELSE");
          }

          a += a;
          Console.WriteLine("End");
        }
    }
}
