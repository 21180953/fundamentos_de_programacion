using System;
namespace programa16
{
    internal class programa16
    {
        static void Main(string[]args)
        {
            char[,] LETRAS = { { 'a', 'b', 'c' },{ 'd', 'e', 'f' } };
            for(int f = 1; f >= 0; f--)
            {
                for (int c = 1; c >= 0; c--)
                {
                    Console.WriteLine(LETRAS[f,c]+",");
                }
                Console.WriteLine();
            }
        }
    }
}
