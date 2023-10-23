using System;

class Programaseisu3
{
    static void Main(string[] args)
    {
        int n;
        Console.WriteLine("ingresa un numero entero positivo");
        n = Convert.ToInt32(Console.ReadLine());
        if (n < 0)
        {
            Console.WriteLine("el numero es negativo por favor ingresa otro numero");
            n = Convert.ToInt32(Console.ReadLine());
        }
        if (n % 2 == 0)
        {
            Console.WriteLine("es par " + n);
        }
        else
        {
            Console.WriteLine("es impar " + n);
        }
    }
}

