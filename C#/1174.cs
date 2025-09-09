using System;
using System.Globalization;
using System.Threading;


class URI
{
    static void Main(String[] args)
    {

        CultureInfo culture = new CultureInfo("en-US");
        Thread.CurrentThread.CurrentCulture = culture;
        Thread.CurrentThread.CurrentUICulture = culture;

        double[] vetor = new double[100];
        for (int i = 0; i < 100; i++)
        {
            vetor[i] = double.Parse(Console.ReadLine());
        }
        for (int i = 0; i < 100; i++)
        {
            if (vetor[i] <= 10)
            {
                Console.WriteLine($"A[{i}] = {vetor[i]:F1}");
            }
        }
    }
}
