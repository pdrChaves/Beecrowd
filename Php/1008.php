<?php
$num = (int)fgets(STDIN);
$horas = (int)fgets(STDIN);
$salario = (float)fgets(STDIN);
$receber = $horas * $salario;

echo "NUMBER = $num\n";
echo "SALARY = U$ " . number_format($receber,2,'.','') . "\n";
