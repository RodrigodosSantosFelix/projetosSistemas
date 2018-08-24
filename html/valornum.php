<html>
<head><title>Exiber o numero</title></head>
<body>
<?php
	extract($_POST);
	$nrand = rand(1,50);
	echo(" o numero e' $numero e numero aleatorio e' $nrand");
?>
</body>
</html>