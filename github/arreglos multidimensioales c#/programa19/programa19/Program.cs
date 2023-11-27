using System;

class Programa19
{
    static void Main()
    {
        
        int[,] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int Pares = 0;
        int Impares = 0;

        
        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                if (matriz[i, j] % 2 == 0)
                {
                    Pares++;
                }
                else
                {
                    Impares++;
                }
            }
        }

        Console.WriteLine("Cantidad de números pares: " + Pares);
        Console.WriteLine("Cantidad de números impares: " + Impares);
    }
}
