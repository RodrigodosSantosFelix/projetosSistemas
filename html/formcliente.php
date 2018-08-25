<html>
	<head>
		<title>exibe informacoes de cadastro</title>
	</head>
	<body>
		<?php
			extract($_POST);
			echo(" Nome: $nome ");
			echo ("<br>data de nascimento: $datanasc ");
			echo("<br>altura: $altura ");
		?>
	</body>
</html>