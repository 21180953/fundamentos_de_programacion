
using System;
namespace programados
{
    class programados
    {
        static void Main()
        {
            double c, f;
            Console.WriteLine("introduce la temperatura en grados centigrados");
            c = Convert.ToDouble(Console.ReadLine());
            f = c * 1.8 + 32;
                Console.WriteLine("La temperatura en grados Fahrenheit es: " + f);
        }
    }
}
