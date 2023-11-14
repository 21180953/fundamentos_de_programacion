using System;

class programaDiezUcuatro
{
    static void Main()
    {
        int i, numerodeletras = 0;
        double promedio;
        string[] paises = { "brazil","bolivia","reinounido","argentina"};
        for (i = 0; i < paises.Length; i++)
        {
            numerodeletras+=paises[i].Length;
        }
        promedio = numerodeletras / 4;
        Console.WriteLine("el promedio de letras del nombre de cada pais es: " + promedio);
    }
}

