using System;

class programasieteUcuatro
{
    static void Main()
    {
        double media, mediana,total=0;
        int[] numeros={8,9,11,11,12};
        for(int i = 0; i<numeros.Length; i++)
        {
            total += numeros[i];

        }
        media = total / numeros.Length;
        mediana = numeros[2];
        Console.WriteLine("la mediana es: " + mediana);
        Console.WriteLine("la media es: " + media);
    }
}
