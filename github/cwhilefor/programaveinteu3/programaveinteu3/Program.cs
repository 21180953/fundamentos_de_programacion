using System;

namespace MyCompany.Programaveinteu3
{
    class Program
    {
        static void Main(string[] args)
        {
            int i;
            double ahorrod = 3, ahorroa = 3;

            Console.WriteLine("ahorro diario " + ahorrod);

            for (i = 0; i < 364; i++)
            {
                ahorrod = ahorrod * 3;
                Console.WriteLine("ahorro diario " + ahorrod);
                ahorroa = ahorroa + ahorrod;
            }

            Console.WriteLine("ahorro anual " + ahorroa);
        }
    }
}
