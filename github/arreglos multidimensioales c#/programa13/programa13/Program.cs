using System;

class Programa13u4
{
    static void Main()
    {
        float[,] tempC = new float[2, 2];
        float[,] tempf = new float[2, 2];
        for (int f = 0; f < 2; f++)
        {
            for (int c = 0; c < 2; c++)
            {
                Console.WriteLine("Escribe la temperatura:");
                float temp = float.Parse(Console.ReadLine());
                tempC[f, c] = temp;
                tempf[f, c] = (temp * 9 / 5) + 32;
            }
        }

        Console.WriteLine("Las temperaturas en Fahrenheit son:");
        for (int f = 0; f < 2; f++)
        {
            for (int c = 0; c < 2; c++)
            {
                Console.Write(tempf[f, c] + " ");
            }
            Console.WriteLine();
        }
    }
}
