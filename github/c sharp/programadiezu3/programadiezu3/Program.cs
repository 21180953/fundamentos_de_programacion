using System;

class Programadiezu3
{
    static void Main(string[] args)
    {
        Console.WriteLine("introduce el pago por hora");
        double sh = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("introduce el numero de horas trabajadas en la semana");
        int h = Convert.ToInt32(Console.ReadLine());
        double ss;
        if (h <= 40)
        {
            ss = sh * h;
        }
        else
        {
            int he = h - 40;
            ss = 40 * sh + he * sh * 2;
        }
        Console.WriteLine("El sueldo semanal es: " + ss);
    }
}
