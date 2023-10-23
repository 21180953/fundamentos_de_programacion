using System;

class Programacuatrou3
{
    static void Main(string[] args)
    {
        Console.WriteLine("ingresa el mes numerico");
        int mes = Convert.ToInt32(Console.ReadLine());
        switch (mes)
        {
            case 1:
                Console.WriteLine("enero");
                break;
            case 2:
                Console.WriteLine("febrero");
                break;
            case 3:
                Console.WriteLine("marzo");
                break;
            case 4:
                Console.WriteLine("abril");
                break;
            case 5:
                Console.WriteLine("mayo");
                break;
            case 6:
                Console.WriteLine("junio");
                break;
            case 7:
                Console.WriteLine("julio");
                break;
            case 8:
                Console.WriteLine("agosto");
                break;
            case 9:
                Console.WriteLine("septiembre");
                break;
            case 10:
                Console.WriteLine("octubre");
                break;
            case 11:
                Console.WriteLine("noviembre");
                break;
            case 12:
                Console.WriteLine("diciembre");
                break;
        }
    }
}