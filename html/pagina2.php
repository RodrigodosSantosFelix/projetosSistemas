<html xmlns = "http://www.w3.org/1999/xhtml">
<head>
	<title>Array manipulador</title>
</head>
<body>
	<?php
		print( "<strong>criando o primeiro array</strong><br />" );
		$primeiro[0] = 5;
		$primeiro[1] = 10;
		$primeiro[2] = 20;
		$primeiro[3] = 30;
		
		for ( $i = 0; $i <count( $primeiro ); $i++ )
		print( "elemento $i e o $primeiro[$i] <br />" );
		$soma = $primeiro[2] + $primeiro[3];
		print( "resultado da soma $soma <br />" );
		print( "<br /><strong>Criando o segundo array</strong><br />");
			
		$segundo = array( "zero", "um", "dois", "tres" );
		for ( $i = 0; $i <count( $segundo ); $i++ )
		print( "elemento $i e o $segundo[$i] <br />" );
		
		print ( "<br /><strong>criando o terceiro aarray</strong><br />" );
		$terceiro[ "marcelo" ] = 21;
		$terceiro[ "henrique" ] = 18;
		$terceiro[ "eliane" ] = 23;
		for ( reset( $terceiro ); $element = key( $terceiro ); next( $terceiro ) )
		print( "$element tem a idade de $terceiro [$element] anos <br />" );
		print ( "<br /><strong>criando o quarto array </strong><br />" );
		$quarto = array( "January" => "first", "February" => "second", "March" => "third", "April" => "fourth", "May" => "fifth", 
		"June" => "sixth", "July" => "seventh", "August" => "eighth", "September" => "ninth", "October" => "tenth", "September" => "ninth",
		"October" => "tenth", "November" => "eleventh", "December" => "twelfth" );
			
		foreach ( $quarto as $element => $value )
		print ( "$element e o $value mes <br />" );
	?>
</body>
</html>