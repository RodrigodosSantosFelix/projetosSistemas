<html xmlns = "http://www.w3.org/1999/xhtml">
<head>
<title>converter tipos de dados</title>
</head>
<body>
<?php
$conteudoString = "3.5 segundos";
$conteudoDouble = 79.2;
$conteudoInteger = 12;
?>
<?php
print( "$conteudoString e do tipo " . gettype( $conteudoString ) . "<br />" );
print( "$conteudoDouble e do tipo " . gettype( $conteudoDouble ) . "<br />" );
print( "$conteudoInteger e do tipo " . gettype( $conteudoInteger ) . "<br />" );
?>
<br />
converter tipos de dados:<br />
<?php
print( "$conteudoString" );
settype( $conteudoString, "double" );
print( "converter para double $conteudoString <br         />" );
print( "$conteudoString" );
settype( $conteudoString, "integer" );
print(" converter para inteiro $conteudoString <br />" );
settype( $conteudoString, "string" );
print( "retornar para um texto $conteudoString<br /><br />" );

$dados = "98.6 graus";
print( "depois do casting, $dados e um " . gettype( $dados ) . "<br /><br />" );
print( "usando casting : <br /> e um double: " . ( double ) $dados . "<br />e um integer : " . ( integer ) $dados );
print( "<br /><br />depois casting, $dados e um " . gettype( $dados ));
?>
</body></html>