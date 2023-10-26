using System;

namespace programacuatro
{
    class programacuatro
    {
        static void Main()
        {
            double a, b, h, l1, l2, l3, p;
            Console.WriteLine("introduce la base del triangulo");
            b = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("introduce la haltura del tirangulo");
            h = Convert.ToDouble(Console.ReadLine());
            a = b * h / 2;
            Console.WriteLine("el area es " + a);
            Console.WriteLine("introduce el lado 1 del triangulo");
            l1 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("introduce el lado 2 del triangulo");
            l2 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("introduce el lado 3 del triangulo");
            l3 = Convert.ToDouble(Console.ReadLine());
            p = l1 + l2 + l3;
            Console.WriteLine("el perimetro es " + p);
        }
    }
}
