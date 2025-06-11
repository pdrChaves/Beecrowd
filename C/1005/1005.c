#include <stdio.h>
int main (){
    double A,B,nA,nB,media;
    scanf("%lf",&A);
    scanf("%lf",&B);
    nA = A * 3.5;
    nB = B * 7.5;
    if (A>= 0 && A<=10 && B>=0 && B<=10)
    {
        media = (nA+nB) / 11.0;
        printf("MEDIA = %.5lf\n", media);
    }
    return 0;
}
