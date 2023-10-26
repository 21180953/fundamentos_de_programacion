
using System;

namespace programauno
{
    class programauno
    {
        static void Main()
        {
            double m, p;
                Console.WriteLine("introduce la cantidad de metros");
            m = double.Parse(Console.ReadLine());
            p = m * 3.28084;
            Console.WriteLine("La longitud en pies es: " + p);
        }
    }    
}

