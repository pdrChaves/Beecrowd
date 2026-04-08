<?php
[$a, $b, $c] = fscanf(STDIN, "%f %f %f");

$triangulo = ($a * $c)/2;
$circulo = 3.14159 * $c ** 2;
$trapezio = ($a + $b)/2 * $c;
$quadrado = $b ** 2;
$retangulo = $a * $b;

echo "TRIANGULO: " . number_format($triangulo,3,'.','') . "\n";
echo "CIRCULO: " . number_format($circulo,3,'.','') . "\n";
echo "TRAPEZIO: " . number_format($trapezio,3,'.','') . "\n";
echo "QUADRADO: "  . number_format($quadrado,3,'.','') . "\n";
echo "RETANGULO: " . number_format($retangulo,3,'.','') . "\n";