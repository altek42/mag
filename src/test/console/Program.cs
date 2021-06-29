using System;
using System.Collections.Generic;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("tekst 123\"");
            Console.WriteLine("tekst 456");
            Console.WriteLine(10);
            Console.WriteLine(10.4);
            Console.WriteLine(true);

            string v1 = "tekst 1";
            string v2 = "tekst 2";
            int v3 = 20;
            float v4 = 20.6f;
            bool v5 = false;

            Console.WriteLine(v1);
            Console.WriteLine(v2);
            Console.WriteLine(v3);
            Console.WriteLine(v4);
            Console.WriteLine(v5);

            Console.WriteLine(10 + 1);  // 11
            Console.WriteLine(v3 + 13); // 33

            Console.WriteLine(v1 + " " + v2); // 33

            List<int> tab = new List<int>();
            tab.Add(1);
            tab.Add(2);
            tab.Add(3);
            Console.WriteLine("[ "+string.Join(", ", tab)+" ]");
        }
    }
}
