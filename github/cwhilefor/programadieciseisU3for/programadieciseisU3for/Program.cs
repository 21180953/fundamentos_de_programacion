using System;

namespace MyCompany.Programadieciseisu3
{
    class Program
    {
        static void Main(string[] args)
        {
            int c = 1, horas;
            double pago, sueldo;

            while (c <= 20)
            {
                Console.WriteLine("introduce la cantidad de horas trabajadas");
                horas = Convert.ToInt32(Console.ReadLine());

                Console.WriteLine("introduce el pago");
                pago = Convert.ToDouble(Console.ReadLine());

                sueldo = horas * pago;
                Console.WriteLine("El sueldo del empleado " + c + " es " + sueldo);

                c++;
            }
        }
    }
}

