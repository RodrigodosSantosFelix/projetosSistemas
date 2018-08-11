<html xmlns = "http://www.w3.org/1999/xhtml">
<head>
<title>Desafio de Programacao</title>
</head>
<body>
<?php

print ( "<strong>Criando lista de Produtos</strong><br />" );
$produto = array ( "Mouse", "Monitor", "Processador", "Mesa", "Smartphone" );
for ( $i = 0; $i <count ( $produto); $i++ )
print ( "Nome do produto $i: $produto[$i] <br />" );

print ( "<strong>outro metodo</strong><br />");
	$primeiro[0] = "Mouse";
		$primeiro[1] = "Monitor";
		$primeiro[2] = "Processador";
		$primeiro[3] = "Mesa";
		
		for ( $i = 0; $i <count( $primeiro ); $i++ )
		print( "elemento $i e o $primeiro[$i] <br />" );
	
?>
</body>
</html>