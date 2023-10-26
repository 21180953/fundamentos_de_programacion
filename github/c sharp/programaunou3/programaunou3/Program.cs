using System;

class Programaunou3
{
    static void Main(string[] args)
    {
        Console.WriteLine("ingresa tu edad");
        int e = Convert.ToInt32(Console.ReadLine());
        if (e >= 18)
        {
            Console.WriteLine("eres mayor de edad");
        }
        else
        {
            Console.WriteLine("eres menor de edad");
        }
    }
}
