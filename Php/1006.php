<?php
$a = (float)fgets(STDIN);
$b = (float)fgets(STDIN);
$c = (float)fgets(STDIN);

$a *= 2;
$b *= 3;
$c *= 5;
$media = ($a + $b + $c) / 10;

echo "MEDIA = " . number_format($media,1,'.','') . "\n";