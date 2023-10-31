using System;

namespace MyCompany.Programadicieochou3
{
    class Program
    {
        static void Main(string[] args)
        {
            double salario = 1500;

            for (int c = 1; c <= 6; c++)
            {
                Console.WriteLine("salario: " + salario);
                salario += salario * 0.10;
            }

            Console.WriteLine("El salario al cabo de 6 años es: $" + salario);
        }
    }
}
