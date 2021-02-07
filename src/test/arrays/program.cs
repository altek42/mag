using System;
using System.Collections.Generic;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Arrays");
            List<int> myArray = new List<int>();
            myArray.Add(10);
            myArray.Add(22);
            myArray.Add(13);
            myArray.Add(45);

            Console.WriteLine(myArray[0]);

        }
    }
}
