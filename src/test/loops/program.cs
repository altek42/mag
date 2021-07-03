using System;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = 1;
            int y = 1;
            while( x< 10){
                while(y < 5){
                    var i = x + y;
                    Console.WriteLine("i=" + i + " ["+ x+"]["+y+"]");
                    y = y + 1;
                }
                y = 1;
                x = x + 1;
            }
            
            Console.WriteLine("While test end");

            x = 1;

            for (int index = 0; index < 10; index = index + 1) {
                int element = x + index;
                Console.WriteLine(element);
            }

            Console.WriteLine("For test end");
        }
    }
}
