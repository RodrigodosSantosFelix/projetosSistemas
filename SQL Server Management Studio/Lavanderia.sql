1 - A quantidade de pedidos feitos por cada um dos funcion�rios.
	SELECT Nome_Func, count(Pedidos.ID_Pedido) FROM Funcionarios INNER JOIN Pedidos ON (Funcionarios.ID_Func = Pedidos.ID_Func) GROUP BY Nome_Func

2. Os n�meros dos pedidos, os c�digos e as descri��es dos produtos
contidos em cada um deles.
	SELECT Itens_do_Pedido.ID_Pedido, Produtos.ID_Produto, Desc_Produto FROM Itens_do_Pedido INNER JOIN Produtos ON (Itens_do_Pedido.ID_Produto = Produtos.ID_Produto) GROUP BY Itens_do_Pedido.ID_Pedido, Produtos.ID_Produto, Desc_Produto

3. Os n�meros dos pedidos atendidos e os c�digos e nomes dos
funcion�rios respons�veis por cada um dos pedidos.
	SELECT Pedidos.ID_Pedido, Pedidos.ID_Func, Nome_Func FROM Funcionarios INNER JOIN Pedidos ON (Funcionarios.ID_Func = Pedidos.ID_Func) INNER JOIN Itens_do_Pedido ON (Itens_do_Pedido.ID_Pedido = Pedidos.ID_Pedido)  GROUP BY Pedidos.ID_Pedido, Pedidos.ID_Func, Nome_Func, Status_Pedido HAVING Status_Pedido = 'Atendido'

4. Os n�meros dos pedidos que incluem o produto AMACIANTE.
	SELECT Itens_do_Pedido.ID_Pedido FROM Itens_do_Pedido INNER JOIN Produtos ON (Itens_do_Pedido.ID_Produto = Produtos.ID_Produto) WHERE Desc_Produto = 'Amaciante'

5. O n�mero dos pedidos n�o atendidos, os itens que est�o contidos em
cada um deles (c�digo e descri��o) e os c�digos e nomes dos
funcion�rios respons�veis pelos pedidos n�o atendidos.
	SELECT Pedidos.ID_Pedido, Produtos.*, Funcionarios.* FROM Funcionarios INNER JOIN Pedidos ON (Funcionarios.ID_Func = Pedidos.ID_Func) INNER JOIN Itens_do_Pedido ON (Pedidos.ID_Pedido = Itens_do_Pedido.ID_Pedido) INNER JOIN Produtos ON (Itens_do_Pedido.ID_Produto = Produtos.ID_Produto) GROUP BY Funcionarios.ID_Func, Nome_Func, Pedidos.ID_Pedido, Produtos.Desc_Produto, Produtos.ID_Produto, Status_Pedido HAVING Status_Pedido != 'Atendido'

6. Os nomes dos funcion�rios respons�veis pelos pedidos com os
maiores n�meros de itens diferentes (variedade).
	SELECT Nome_Func FROM Funcionarios INNER JOIN Pedidos ON (Funcionarios.ID_Func = Pedidos.ID_Func) INNER JOIN Itens_do_Pedido ON (Pedidos.ID_Pedido = Itens_do_Pedido.ID_Pedido) INNER JOIN Produtos ON (Itens_do_Pedido.ID_Produto = Produtos.ID_Produto) WHERE Itens_do_Pedido.ID_Pedido = (SELECT COUNT(ID_Produto) FROM Itens_do_Pedido )

/*
	6 N�o Concluida
*/


7. Os nomes dos funcion�rios respons�veis pelos pedidos com as
maiores quantidades de itens solicitados.
	SELECT Nome_Func FROM Funcionarios INNER JOIN Pedidos ON (Funcionarios.ID_Func = Pedidos.ID_Func) INNER JOIN Itens_do_Pedido ON (Pedidos.ID_Pedido = Itens_do_Pedido.ID_Pedido) WHERE Pedidos.ID_Pedido = (SELECT MAX(Qtde_Prod) FROM Itens_do_Pedido) GROUP BY Nome_Func