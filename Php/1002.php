<?php
$n = (float)fgets(STDIN);
$area = 3.14159 * ($n ** 2);

echo "A=" . number_format($area,4, '.' , '') . "\n"; 
/*
    para tirar a virgula de milhas, 
    coloca '.' para manter as casas decimais e 
    '' para removar a casa das milhas
*/