using System;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = 5;
            float y = (float)x;
            var constIntDiv = (float)10 / 15;

            Console.WriteLine("" + x + y + constIntDiv);
        }
    }
}
