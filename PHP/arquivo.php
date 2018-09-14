<html xmlns = "http://www.w3.org/1999/xhtml">
	<head>
		<title>Resultados da Pesquisa ao Banco de Lista de e-mail</title>
		<style type="text/css">
			body { font-family: arial, sans-serif;
			background-color: lightblue }
			h3 { color: white }
			table { background-color: lightgrey }
			td { padding-top: 2px;
			padding-bottom: 2px;
			padding-left: 6px;
			padding-right: 6px;
			border-width: 1px;
			border-style: outset }
		</style>
	</head>

	<body>
		<?php
			extract( $_POST );

			//conectar ao banco de dados mysql.
			$servidor = "localhost";
			$usuario = "root";
			$senha = "";
			$bancodados = "listaemail";

			$conexao = new mysqli($servidor, $usuario, $senha, $bancodados);

			//verificar
			if( $conexao->connect_error ){
				die("conexao falhou: " . $conexao->connect_error);
			}

			//comandos sql
			$sql = "select * from contatos";
			$resultado = $conexao->query($sql);
		?>
		<!--fim do PHP script -->

		<h3>Lista novos contatos</h3>
		<table>
			<tr>
				<td>ID</td>
				<td>Sobrenome</td>
				<td>Nome</td>
				<td>E-Mail</td>
				<td>Fone</td>
			</tr>
			<?php
				//busca cada registro em um conjunto de resultados
				while($linha = $resultado->fetch_assoc()){
					//constroi a tabela com os resultados 
					print( "<tr>" );

					foreach ($linha as $key => $value) 
						print("<td>$value</td>");

						print("</tr>");
					
				}
				$conexao->close();
			?>
			<!-- fim do script PHP -->
		</table>
	</body>
</html>
