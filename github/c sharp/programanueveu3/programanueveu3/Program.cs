using System;

class Programanueveu3
{
    static void Main(string[] args)
    {
        int he, s, h;
        Console.WriteLine("introduce la hora de entrada");
        he = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("introduce la hora de salida");
        s = Convert.ToInt32(Console.ReadLine());
        h = s - he;
        double c = 0;
        if (h <= 2)
        {
            c = h * 5.00;
        }
        else if (h <= 5)
        {
            c = 2 * 5.00 + (h - 2) * 4.00;
        }
        else if (h <= 10)
        {
            c = 2 * 5.00 + 3 * 4.00 + (h - 5) * 3.00;
        }
        else
        {
            c = 2 * 5.00 + 3 * 4.00 + 5 * 3.00 + (h - 10) * 2.00;
        }
        Console.WriteLine("El costo total es: " + c);
    }
}