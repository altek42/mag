using System;
using System.Collections.Generic;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 3;
            int b = 5;
            int c = nameFunc(a,b);
            Console.WriteLine("c");
            Console.WriteLine(c);
            string d = convert(4.7);
            Console.WriteLine(d);
        }

        static int mul(int a, int b) {
            int sum = a * b;
            return sum;
        }
        
        static int nameFunc(int a, int b) {
           int zm = mul(a,b);
           Console.WriteLine(zm);
           int returnValue = zm * 2;
           return returnValue;
        }

        static string convert(double a) {
            string tekst = "Zmienna: ";
            string result = tekst + a;
            return result;
        }
    }
}
