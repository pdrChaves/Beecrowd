#include <stdio.h>
int main (){
    int numero;
    double horas,salario, valor;
    
    scanf("%d",&numero);
    scanf("%lf",&horas);
    scanf("%lf",&valor);
    salario = valor * horas;
    printf("NUMBER = %d\n",numero);
    printf("SALARY = U$ %.2lf\n",salario);
    return 0;   
}
