#include <stdio.h>
int main(){
    double n,raio,area;
    scanf("%lf",&raio);
    n = 3.14159;
    area = n * (raio*raio);
    printf("A=%.4f\n",area);

    return 0;
}