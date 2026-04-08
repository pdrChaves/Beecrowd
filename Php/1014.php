<?php
// [$x, $y] = fscanf(STDIN, "%d %f");
$x = (int)fgets(STDIN);
$y = (float)fgets(STDIN);
$consumo = $x/$y;
echo number_format($consumo, 3, ".", "") . " km/l\n";