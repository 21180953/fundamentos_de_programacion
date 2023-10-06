
using System;
namespace programaseis
{
    class programaseis
    {
        static void Main()
        {
            double c1, c2, c3, subtotal, total;
            Console.WriteLine("ingresa el precio del producto 1");
            c1= Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("ingresa el precio del producto 2");
            c2= Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("ingresa el precio del producto 3");
            c3 = Convert.ToDouble(Console.ReadLine());
            total = c1 + c2 + c3;
            subtotal = total / 1.16;
            Console.WriteLine("el IVA subtotal es " + subtotal);
            Console.WriteLine("el total es " + total);

        }
    }
}