using System;

class Programseisucuatro
{
    static void Main()
    {
        int total;
        int[] desordenados = { 10, 9, 8,7 };
        total = 4;
        int[] ordenados = new int[4];
        for (int i = 0; i < total; i++)
        {
            ordenados[i] = desordenados[total - i - 1];
            Console.WriteLine(desordenados[i]);
        }
    }
}
