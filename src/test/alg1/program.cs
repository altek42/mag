using System;
using System.Collections.Generic;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
          List<int> list = new List<int>() { 3, 6, 2, 5, -75, 4, 1 };
          list = bubbleSortAlgo(list);
          for(int i = 0; i < list.Count; i++){
            Console.Write(list[i] + ", ");
          }
        }

        static void swap(List<int> arr, int i1, int i2) {
           int temp = arr[i1];
           arr[i1] = arr[i2];
           arr[i2] = temp;
        }

       static List<int> bubbleSortAlgo(List<int> v_arraaytest)
        {
          int count = v_arraaytest.Count;
          for (int index1 = 0; index1 < count; ++index1)
          {
            int num = 0;
            for (int index2 = count - index1; num < index2; ++num)
              Console.WriteLine("[" + index1.ToString() + "," + num.ToString() + "]");
          }
          return v_arraaytest;
        }
    }
}
