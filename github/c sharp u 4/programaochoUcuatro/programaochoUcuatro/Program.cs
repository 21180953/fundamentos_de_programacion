using System;

class programaUcuatro
{
    static void Main()
    {
        
        int[]numeros= { 2, 2, 3, 4, 5, 6, 7};
        int impares=0,pares=0,i,numero=0;
        for(i=0;i<7;i++)
        {
            numero = numeros[i];
            if (numero % 2 == 0)
            {
                pares++;
            }
            else
            {
                impares++;
            }
        }
        Console.WriteLine("pares: " + pares);
        Console.WriteLine("impares: " + impares);
    }
}
