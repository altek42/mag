using System;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
          bool test1 = 2 == 2;
          bool test2 = 2 == 1 + 1;
          bool test3 = 1 + 1 == 2;
          bool test4 = 1 + 1 == 1 + 1;

          bool test5 = 2.ToString() == "text";

          Console.WriteLine(test1);
          Console.WriteLine(test2);
          Console.WriteLine(test3);
          Console.WriteLine(test4);
          Console.WriteLine(test5);

          if (test1){
            Console.WriteLine("is true");
          }

          if (test5){
            Console.WriteLine("is false");
          }

          var number1 = 10;
          var number2 = 30;

          if (20 > number1) {
            Console.WriteLine("number1 is less than 20");
          }else {
            Console.WriteLine("number1 is greater than 20");
          }

          if (20 > number2) {
            Console.WriteLine("number2 is less than 20");
          }else {
            Console.WriteLine("number2 is greater than 20");
          }
        }
    }
}
