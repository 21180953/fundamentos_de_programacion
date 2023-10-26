using System;

class Programaochou3
{
    static void Main(string[] args)
    {
        Console.WriteLine("introduce el primer numero");
        double n1 = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("introduce el segundo numero");
        double n2 = Convert.ToDouble(Console.ReadLine());
        if (n1 < n2)
        {
            Console.WriteLine("El segundo número " + n2 + " es mayor");
        }
        else if (n1 > n2)
        {
            Console.WriteLine("El primer número " + n1 + " es mayor");
        }
        else
        {
            Console.WriteLine("ambos numeros son iguales");
        }
    }
}

