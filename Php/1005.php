<?php
$a = (float) fgets(STDIN);
$b = (float) fgets(STDIN);

$a *= 3.5;
$b *= 7.5;
$media = ($a + $b) / 11;
echo "MEDIA = " . number_format($media, 5, '.', '') . "\n"; 