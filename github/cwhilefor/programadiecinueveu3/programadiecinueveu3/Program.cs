using System;

namespace MyCompany.Programadiecinueveu3
{
    class Program
    {
        static void Main(string[] args)
        {
            int c, cn, cantidadceros = 0, numerosnegativos = 0, numerospositvos = 0;
            double n;

            Console.WriteLine("ingresa la cantidad de nuemros");
            cn = Convert.ToInt32(Console.ReadLine());

            for (c = 0; c < cn; c++)
            {
                Console.WriteLine("ingresa un nuemro");
                n = Convert.ToDouble(Console.ReadLine());

                if (n == 0)
                {
                    cantidadceros++;
                }
                else if (n > 0)
                {
                    numerospositvos++;
                }
                else
                {
                    numerosnegativos++;
                }
            }

            Console.WriteLine("cantidad de ceros" + cantidadceros);
            Console.WriteLine("cantidad de positivos" + numerospositvos);
            Console.WriteLine("cantidad de negativos" + numerosnegativos);
        }
    }
}