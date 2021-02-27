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

            swap(arr, 2, 4);

            int size = arr.Count;
            for (int i = 0; i < size; i ++) {
                Console.WriteLine("X: " + arr[i]);
            }
        }

        static void swap(List<int> arr, int i1, int i2) {
            int tmp = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = tmp;
        }
    }
}
