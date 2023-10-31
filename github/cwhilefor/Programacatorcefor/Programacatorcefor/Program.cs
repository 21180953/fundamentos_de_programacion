using System;

namespace MyCompany.Programacatorcefor
{
    class Program
    {
        static void Main(string[] args)
        {
            for (int c = 0; c < 200; c++)
            {
                if (c % 2 == 0)
                {
                    Console.WriteLine(c);
                }
            }
        }
    }
}

