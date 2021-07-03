using System;
using System.Collections.Generic;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> arr = new List<int>();
            arr.Add(1);
            arr.Add(2);
            arr.Add(3);
            arr.Add(4);
            arr.Add(5);

            int a = arr.Count, b, c=0, e =5;
            string d;

            b = 2;
            d = "" + 4;

            Console.WriteLine(a);
            Console.WriteLine(b);
            Console.WriteLine(c);
            Console.WriteLine(d);
            Console.WriteLine(e);
        }
    }
}
