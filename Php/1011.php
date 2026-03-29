<?php
$raio = (float)fgets(STDIN);
$esfera = 4/3 * 3.14159 * $raio ** 3;
echo "VOLUME = " . number_format($esfera,3,'.','') . "\n";