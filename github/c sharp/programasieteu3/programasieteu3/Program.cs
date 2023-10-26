using System;

class Programasieteu3
{
    static void Main(string[] args)
    {
        Console.WriteLine("introduce la temperatura");
        double t = Convert.ToDouble(Console.ReadLine());
        if (t > 27)
        {
            Console.WriteLine("hace calor");
        }
        else if (t > 20)
        {
            Console.WriteLine("clima agradable");
        }
        else
        {
            Console.WriteLine("hace frio");
        }
    }
}

