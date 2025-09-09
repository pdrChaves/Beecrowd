using System;

class URI
{

    static void Main(string[] args)
    {
        int[] vetor = new int[10];
        int entrada;
        for (int i = 0; i < 10; i++)
        {
            entrada = int.Parse(Console.ReadLine());
            vetor[i] = entrada;
            if (entrada < 0 || entrada == 0)
            {
                vetor[i] = 1;
            }
            else
            {
                vetor[i] = entrada;
            }
            Console.WriteLine($"X[{i}] = {vetor[i]}");
        }
    }

}
