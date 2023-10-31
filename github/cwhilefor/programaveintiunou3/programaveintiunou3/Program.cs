using System;

namespace MyCompany.Programaveintiunou3
{
    class Program
    {
        static void Main(string[] args)
        {
            int cn, i;
            double n, cubo;

            Console.WriteLine("ingresa la cantidad de numeros a los que les vas a sacar el cuadrado");
            cn = Convert.ToInt32(Console.ReadLine());

            for (i = 0; i < cn; i++)
            {
                Console.WriteLine("ingresa el numero");
                n = Convert.ToDouble(Console.ReadLine());
                cubo = n * n * n;
                Console.WriteLine("el cubo es " + cubo);
            }
        }
    }
}

