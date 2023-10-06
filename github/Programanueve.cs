
using System;
namespace programanueve
{
    class programanueve
    {
        static void Main()
        {
            int e;
            Console.WriteLine("ingresa tu edad");
            e = Convert.ToInt32(Console.ReadLine());
            if (e >= 18)
            {
                Console.WriteLine("Eres mayor de edad.");
            }
            else
            {
                Console.WriteLine("Eres menor de edad.");
            }
        }
    }
}