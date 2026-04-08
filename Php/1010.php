<?php
[$codPeca1, $qtdPeca1, $valorPeca1] = fscanf(STDIN, "%d %d %f");
[$codPeca2, $qtdPeca2, $valorPeca2] = fscanf(STDIN, "%d %d %f");

$valorPagar = ($qtdPeca1 * $valorPeca1) + ($qtdPeca2 * $valorPeca2);

echo "VALOR A PAGAR: R$ " . number_format($valorPagar,2,'.','') . "\n";
// no number_format:
// ( variavel , quantidade de casas decimais, ponto de centavos, ponto de milhas) 