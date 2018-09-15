<?php
	$servidor = "localhost";
	$usuario = "root";
	$senha = "";
	$bancodados = "concessionaria";

	extract( $_POST );
	$fabricante = $_POST["ffabricante"];

	//criar conexao
	$conexao = new mysqli($servidor, $usuario, $senha, $bancodados);

	//verificar estado conexao
	if( $conexao->connect_error){
		die("conexao falhou: " . $conexao->connect_error);
	}

	$sql = "select * from veiculo where fabricante = '$fabricante'";
	$resultado = $conexao->query($sql);

	if($resultado->num_rows > 0){
		//saida de dados
		while ($linha = $resultado->fetch_assoc()) {
			echo "carro : " . $linha["descricao"]. "<br>" . " fabricante: " . $linha["fabricante"]. " " . "<br>";
		}
	}
	else{
		echo "zero resultados";
	}
	$conexao->close();
?>