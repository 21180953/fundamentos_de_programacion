using System;

class Programa15
{
    static void Main()
    {
        // Generar una matriz con números específicos
        double[,] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };

        int f = matriz.GetLength(0);
        int c = matriz.GetLength(1);
        for (int i = 0; i < f; i++)
        {
            double suma = 0;
            for (int a = 0; a < c; a++)
            {
                suma += matriz[i, a];
            }
            double media = suma / c;
            Console.WriteLine("La media de la fila es: " + media);
        }
    }
}

