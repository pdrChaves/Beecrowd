<?php

[$a, $b, $c] = fscanf(STDIN, "%d %d %d");
$maiorAB = ($a+$b+abs($a-$b))/2;
$maiorABC = ($maiorAB+$c+abs($maiorAB - $c))/2;

echo "$maiorABC eh o maior\n";