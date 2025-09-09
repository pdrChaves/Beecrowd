using System;
class URI
{
    static void Main(String[] args)
    {
        int[] vetor = new int[20];
        for (int i = 0; i < 20; i++)
        {
            vetor[i] = int.Parse(Console.ReadLine());
        }
        int j = 19;
        for (int i = 0; i<20; i++)
        {
            Console.WriteLine($"N[{i}] = {vetor[j]}");
            j=j-1;
        }
    }
}
