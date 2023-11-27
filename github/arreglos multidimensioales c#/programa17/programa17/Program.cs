using System;

class Programa17
{
    static void Main()
    {
        int[,] matriz1 = new int[4, 4];
        int[,] matriz2 = new int[4, 4];
        int[,] resultado = new int[4, 4];

        Console.WriteLine("Ingrese los valores para la primera matriz:");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                Console.WriteLine("Ingrese el valor para la fila " + (i + 1) + " y la columna " + (j + 1));
                matriz1[i, j] = int.Parse(Console.ReadLine());
            }
        }

        Console.WriteLine("Ingrese los valores para la segunda matriz:");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                Console.WriteLine("Ingrese el valor para la fila " + (i + 1) + " y la columna " + (j + 1));
                matriz2[i, j] = int.Parse(Console.ReadLine());
            }
        }

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                for (int k = 0; k < 4; k++)
                {
                    resultado[i, j] += matriz1[i, k] * matriz2[k, j];
                }
            }
        }

        Console.WriteLine("El resultado de la multiplicación es:");
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                Console.Write(resultado[i, j] + " ");
            }
            Console.WriteLine();
        }
    }
}

