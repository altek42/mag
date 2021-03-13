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
            test(a,b);
            show(a,b);
        }

        static int test(int i1, int i2) {
           int x = i1 + i2;
           return x;
        }

        static void show(int s1, int s2) {
           Console.WriteLine("s1 " + s1 + " s2 "+ s2);
        }
    }
}
