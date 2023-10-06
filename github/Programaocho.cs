
using System;

namespace programaocho
{
    class programaocho
    {
        static void Main()
        {
            double c1, c2, c3, c4, c5, c6, p;
            Console.WriteLine("Ingresa calificación 1:");
            c1 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Ingresa calificación 2:");
            c2 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Ingresa calificación 3:");
            c3 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Ingresa calificación 4:");
            c4 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Ingresa calificación 5:");
            c5 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Ingresa calificación 6:");
            c6 = Convert.ToDouble(Console.ReadLine());
            p = c1 + c2 + c3 + c4 + c5 + c6 / 6;
            Console.WriteLine("promedio es" + p);
        }
    }
}
