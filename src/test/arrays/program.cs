using System;
using System.Collections.Generic;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            // Console.WriteLine("Arrays");
            // List<int> myArray = new List<int>();
            // myArray.Add(10);
            // myArray.Add(22);
            // myArray.Add(13);
            // myArray.Add(45);

            // int i = 1;
            
            // Console.WriteLine(myArray[i]);

            List<int> myArray = new List<int>()
            {
            10,
            23,
            13,
            45
            };


            int i = 1;

            myArray[i] = 4;

            Console.WriteLine("["+string.Join(", ", myArray)+"]");
        }
    }
}
