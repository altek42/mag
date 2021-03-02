using System;
using System.Collections.Generic;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 2;
            int b = 3;
            int c = test(a,b);
            Console.WriteLine(c);
        }

        static int test(int i1, int i2) {
           int x = i1 + i2;
           return x;
        }
    }
}
