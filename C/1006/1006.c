#include <stdio.h>
int main(){
    double A,B,C,nA,nB,nC,media;
    scanf("%lf",&A);
    scanf("%lf",&B);
    scanf("%lf",&C);
    nA = A * 2;
    nB = B * 3;
    nC = C * 5;
    media = (nA+nB+nC)/10;
    printf("MEDIA = %.1lf\n",media);
    return 0;
}