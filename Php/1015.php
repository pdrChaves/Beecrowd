<?php
[$x1, $y1] = fscanf(STDIN, "%f %f");
[$x2, $y2] = fscanf(STDIN, "%f %f");
$distancia = sqrt(($x2 - $x1)**2 +($y2 - $y1)**2);

echo number_format($distancia,4,'.','') . "\n";