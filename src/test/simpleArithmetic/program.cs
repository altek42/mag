using System;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            int unAssigment;

            int negative = -2;
            Console.WriteLine(negative);

            int constIntAdd = 10 + 15;   // 25
            int constIntSub = 10 - 15;   // -5
            int constIntMul = 10 * 15;   // 150
            double constIntDiv = 10 / 15;   // 0.6666666666666666

            int constIntChain1 = 100 + 50 - 25;            // 125
            int constIntChain2 = 100 + 50 * 2;             // 200
            int constIntChain3 = 100 + 100 / 2 * 3 + 10;   // 260

            string constStr1 = "Test " + "concat";
            string constStr2 = 1 + " concat";
            string constStr3 = "Test " + 8;
            string constConcat = constStr1 + constStr2 + constStr3;

            double constRealAdd = 10.1 + 12.3; // 22.4
            double constRealSub = 10.1 - 5.6;  // 4.5
            double constRealMul = 10.5 * 2.2;  // 23.1
            double constRealDiv = 100.4 / 2.1; // 47.80952380952381

            double constRealChain1 = 100.7 + 50.4 - 25.9;                  // 125.19999999999999
            double constRealChain2 = 100.7 + 50.4 * 1.8;                   // 191.42000000000002
            double constRealChain3 = 100.7 + 10.40 / 1.67 * 3.1 + 10.23;   // 130.2353892215569

            string constStr4 = "Real " + 7.4;
            string constStr5 = 4.7 + " real.";

            Console.WriteLine(constIntAdd);
            Console.WriteLine(constIntSub);
            Console.WriteLine(constIntMul);
            Console.WriteLine(constIntDiv);

            Console.WriteLine(constIntChain1);
            Console.WriteLine(constIntChain2);
            Console.WriteLine(constIntChain3);

            Console.WriteLine(constStr1);
            Console.WriteLine(constStr2);
            Console.WriteLine(constStr3);
            Console.WriteLine(constConcat);

            Console.WriteLine(constRealAdd);
            Console.WriteLine(constRealSub);
            Console.WriteLine(constRealMul);
            Console.WriteLine(constRealDiv);

            Console.WriteLine(constRealChain1);
            Console.WriteLine(constRealChain2);
            Console.WriteLine(constRealChain3);

            Console.WriteLine(constStr4);
            Console.WriteLine(constStr5);

            int zmienna1 = 1;
            string zmienna2, zmienna3 = "z3";

            zmienna2 = "z2";

            Console.WriteLine(zmienna1);
            Console.WriteLine(zmienna2);
            Console.WriteLine(zmienna3);

            int x = 1;
            x++;
            Console.WriteLine(x);

            double b = 5 + 4.5;
            Console.WriteLine(b);
        }
    }
}
