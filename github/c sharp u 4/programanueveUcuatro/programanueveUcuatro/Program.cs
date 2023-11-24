using System;

class programanueveUcuatro
{
    static void Main()
    {
        int i,c;
        string[] nombres= {"josue","roberto", "humberto","miguel" };
        string[] apellidos = { "godinez", "hernandez", "navejas", "diaz" };

        string[]nombrescompletos= new string[nombres.Length];
        for (i = 0; i < nombres.Length; i++)
        {
            nombrescompletos[i] = nombres[i] + " " + apellidos[i];
        }

        Console.WriteLine("Nombres completos:");
        for (c = 0; c < nombrescompletos.Length; c++)
        {
            Console.WriteLine(nombrescompletos[c]);
        }
    }
}