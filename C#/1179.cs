using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        List<int> pares = new List<int>();
        List<int> impares = new List<int>();

        for (int i = 0; i < 15; i++)
        {
            int n = int.Parse(Console.ReadLine());

            if (n % 2 == 0)
            {
                pares.Add(n);
                if (pares.Count == 5)
                {
                    for (int j = 0; j < pares.Count; j++)
                        Console.WriteLine($"par[{j}] = {pares[j]}");
                    pares.Clear();
                }
            }
            else
            {
                impares.Add(n);
                if (impares.Count == 5)
                {
                    for (int j = 0; j < impares.Count; j++)
                        Console.WriteLine($"impar[{j}] = {impares[j]}");
                    impares.Clear();
                }
            }
        }
        for (int i = 0; i < impares.Count; i++)
            Console.WriteLine($"impar[{i}] = {impares[i]}");

        for (int i = 0; i < pares.Count; i++)
            Console.WriteLine($"par[{i}] = {pares[i]}");
    }
}
