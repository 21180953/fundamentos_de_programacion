using System;

namespace programa12U4 {
    internal class programa12U4
    {
        static void Main()
        {
            int[,] calf = { { 5, 7, 9,5 }, { 6, 8, 7,5 }, { 1,0, 3, 1 } };
            int fila = calf.GetLength(0);
            int columna = calf.GetLength(1);
            for (int f = 0; f < fila; f++)
            {
                for (int c = 0; c < columna; c++)
                {
                    Console.Write(calf[f, c] + ",");
                }
                Console.WriteLine();
            }
        }
    }

}
