﻿using System;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            int num1 = 1;
            int num2 = 1;
            for (; num1 < 10; ++num1)
            {
                for (; num2 < 5; ++num2)
                Console.WriteLine("i=" + (num1 + num2).ToString() + " [" + num1.ToString() + "][" + num2.ToString() + "]");
                num2 = 1;
            }
            Console.WriteLine("While test end");
            int num3 = 1;
            for (int index = 0; index < 10; ++index)
                Console.WriteLine(num3 + index);
            Console.WriteLine("For test end");
        }
    }
}