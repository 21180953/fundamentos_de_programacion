using System;

namespace MyApp
{
    internal class program
    {
        static void Main(string[]args)
        {
            int[] edades = { 17, 18, 19, 18, 17 };
            for (int i = 0; i<edades.Length; i++)
            {
            Console.WriteLine("indice" + i + "es"+ edades[i]);

                if (edades[i] >= 18)
                    Console.WriteLine("eres mayor de edad");
                else
                    Console.WriteLine("eres menor de edad");
            }

            
        }
    }
}