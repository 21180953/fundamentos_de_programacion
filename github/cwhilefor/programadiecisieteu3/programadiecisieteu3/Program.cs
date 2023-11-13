using System;

namespace MyCompany.Programadiecisieteu3
{
    class Program
    {
        static void Main(string[] args)
        {
            char c;
            Console.WriteLine("bien venido");

            do
            {
                Console.WriteLine("para salir imprima n");
                c = Console.ReadKey().KeyChar;
            } while (c != 'n');

            Console.WriteLine("saliste del programa");
        }
    }
}
