using System;
using System.Collections.Generic;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> items = new List<int>() { 2, 5, 3, 7, 8, 10, 15, 18, 24, 111, 12, 19, 87 };
            bool item = itemSearch(items, 15);
            if(!item) {
                Console.WriteLine("Item does not exist!");
            }
        }

        static bool itemSearch(List<int> items, int item){
            for (int i = 0; i < items.Count; i++)
            {
                if(items[i] == item){
                    Console.WriteLine("Found item " + item + " at index " + i);
                    return true;
                }
            }
            return false;
        }
    }
}
