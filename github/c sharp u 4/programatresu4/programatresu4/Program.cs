using System;

class programatresu4
{
    static void Main(string[]args)
    {
        int total;
        Console.Write("introduce la cantidad de temperaturas:");
        total = Convert.ToInt32(Console.ReadLine());
        double[] temperaturas = new double[total];
        for (int i=0;i<total;i++)
        {
         Console.Write("introduce la temperatura en grados centigrados:");
        temperaturas[i] = Convert.ToDouble(Console.ReadLine());
        }
        for(int i = 0; i < total; i++)
        {
            double fahrenheit = temperaturas[i] * 9 / 5 + 32, kelvin = temperaturas[i] + 273.15;
            Console.WriteLine("Temperatura en °C: " + temperaturas[i] + ", en °F: " + fahrenheit + ", en °K: " + kelvin);
        }
    }
}