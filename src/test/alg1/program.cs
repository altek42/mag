using System;
using System.Collections.Generic;

namespace dotnet
{
  class Program
  {
    static void swap(List<int> arr, int firstIndex, int secondIndex)
    {
      int temp = arr[firstIndex];
      arr[firstIndex] = arr[secondIndex];
      arr[secondIndex] = temp;
    }

    static List<int> bubbleSortAlgo(List<int> arraaytest)
    {
      int len = arraaytest.Count, i, j, stop;
      for (i = 0; i < len; i++)
      {
        for (j = 0, stop = len - i - 1; j < stop; j++)
        {
          if (arraaytest[j] > arraaytest[j + 1])
          {
            swap(arraaytest, j, j + 1);
          }
        }
      }
      return arraaytest;
    }

    static void Main(string[] args)
    {
      List<int> l = new List<int>() { 3, 6, 2, 5, -75, 4, 1 };
      List<int> r = bubbleSortAlgo(l);
      for (int i = 0; i < r.Count; i++)
      {
        Console.Write(r[i] + ", ");
      }
    }
  }
}
