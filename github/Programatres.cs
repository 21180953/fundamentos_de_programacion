
using System;
namespace programaocho
{
    class programaocho
    {
        static void Main()
        {
            double a,l;
            Console.WriteLine("intorduce el valor del lado del hexagono");
            l=Convert.ToDouble (Console.ReadLine());
            a = (3 * Math.Sqrt(3) / 2) * (l * l);
            Console.WriteLine("el area del heaxogono es" + a);
        }
    }
}
