using System;

class programacincou4
{
    static void Main(string[]args)
    {
        int total;
        string[] frutas = { "sandia", "kiwi", "manzana", "mora" };
        total = 4;
        string[] antifrutas = new string[4];
        for (int i = 0;i<total; i++)
        {
            antifrutas[i] = frutas[total - i - 1];
            Console.WriteLine(antifrutas[i]);
        }
    }
}
