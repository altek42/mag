using System;
using System.Collections.Generic;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> myArray = new List<int>{10, 2, 13, 45};
            int x = myArray.Count;

            myArray[1+1] = 100;

            for(var i = 0; i < x; i = i + 1){
                Console.WriteLine(myArray[i]);
            }
        }
    }
}
