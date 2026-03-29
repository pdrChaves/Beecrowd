<?php
$nome = fgets(STDIN);
$fixo = (float)fgets(STDIN);
$montante = (float)fgets(STDIN);
$bonus = 0.15 * $montante;
$salario = $fixo + $bonus;

echo "TOTAL = R$ ". number_format($salario , 2 , '.' , '') . "\n";
