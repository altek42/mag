using System;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Loops");
            bool a = false;
            int x = 0;
            while (a){
                Console.WriteLine(x);
                x = x + 1;
            }
        }
    }
}
