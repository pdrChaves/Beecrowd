using System;
class URI
{
    public static void Main(string[] args)
    {
        int t = int.Parse(Console.ReadLine());
        if (t >= 2 && t <=50)
        {
            int[] vetor = new int[1000];
            for (int i = 0; i < 1000; i++)
            {
                vetor[i] = i % t;
                System.Console.WriteLine($"N[{i}] = {vetor[i]}");
            }
        }
    }
}
