using System;
using System.Collections.Generic;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = func(10, 5);
            Console.WriteLine("X: " + x);
        }

        static int func(int x, int y) {
            Console.WriteLine("Functions");
            return x + y;
        }
    }
}
