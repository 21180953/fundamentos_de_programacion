using System;

class Programatresu3
{
    static void Main(string[] args)
    {
        Console.Write("escribe el dia de la semana numerico:");
        int dia = Convert.ToInt32(Console.ReadLine());
        switch (dia)
        {
            case 1:
                Console.WriteLine("lunes");
                break;
            case 2:
                Console.WriteLine("martes");
                break;
            case 3:
                Console.WriteLine("miercoles");
                break;
            case 4:
                Console.WriteLine("jueves");
                break;
            case 5:
                Console.WriteLine("viernes");
                break;
            case 6:
                Console.WriteLine("sabado");
                break;
            case 7:
                Console.WriteLine("domingo");
                break;
            default:
                Console.WriteLine("no existe el dia ingresado");
                break;
        }
    }
}
