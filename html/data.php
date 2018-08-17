<html xmlns = "http://www.w3.org/1999/xhtml">
<head>
<title>Datas</title>
<body>
</head>
<?php
$data1 = new DateTime( '2018-10-01' );
$data2 = new DateTime( '2018-05-30T00:51:01.054123Z' );

$intervalo = $data1->diff( $data2 );

echo "Intervalo é de {$intervalo->y} anos, {$intervalo->m} meses e {$intervalo->d} dias";
echo $data2->format( 'u' );
echo $data2->format( 'y-m-d\Th:i:s:u' );

?>
</body>
</html>