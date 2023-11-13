using System;
    namespace unidadu4
{
    internal class unidadu4
    {
        static void Main(string[] args)
    {
            
            int suma=0, PROMEDIO,tam;
            Console.WriteLine("Escribe las calificaciones a procesar");
            tam = Convert.ToInt32(Console.ReadLine());
            int[] calf = new int[tam];
            for (int c=0;c<calf.Length;c++)
            {
            Console.WriteLine("Escribe la calificacion " + c + ":");
                calf[c]= Convert.ToInt32(Console.ReadLine());
            }
            for(int i=0;i<calf.Length;i++)
            {
                suma += calf[i];
            }
            PROMEDIO = suma / calf.Length;
            Console.WriteLine("tu promedio es " + PROMEDIO);
    }

    }
}