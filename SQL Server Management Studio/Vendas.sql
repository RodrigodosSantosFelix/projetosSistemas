SELECT Vendas.Id, ItensDaVenda.IdProd, ItensDaVenda.QtdProd FROM ItensDaVenda INNER JOIN Vendas ON (ItensDaVenda.Id = Vendas.Id)
	Este script SQL retorna o Id da venda, o Id do produto e a quantidade vendida. Utilizanto as tabelas Vendas e ItensDaVenda, com seus relacionamentos atravez da PK Id da tabela Vendas e FK Id da tabela ItensDaVenda.

SELECT Vendas.Id, ItensDaVenda.IdProd, Produtos.Descricao, ItensDaVenda.QtdProd
FROM ItensDaVenda INNER JOIN Vendas ON (ItensDaVenda.Id = Vendas.Id) INNER JOIN Produtos ON (ItensDaVenda.IdProd = Produtos.IdProd)
	Este script SQL retorna o Id da venda, o Id do produto, nome do produto do produto e a quantidade de produto vendido. Utilizanto as tabelas Vendas, ItensDaVenda e Produtos, com seus relacionamentos atravez da PK Id da tabela Vendas e FK Id da tabela ItensDaVenda e a PK IdProd da tabela Produtos com FK IdProd da tabela ItensDaVenda

SELECT Vendas.Id, ItensDaVenda.IdProd, Produtos.Descricao, ItensDaVenda.QtdProd FROM ItensDaVenda INNER
JOIN Vendas ON (ItensDaVenda.Id = Vendas.Id) INNER JOIN Produtos ON (ItensDaVenda.IdProd = Produtos.IdProd) WHERE ItensDaVenda.QtdProd > 5
	Este script SQL retorna o Id da venda, o Id do produto, nome do produto do produto e a quantidade de produto vendido, retornando apenas os registros que possui quantidade de produto maior que 5. Utilizanto as tabelas Vendas, ItensDaVenda e Produtos, com seus relacionamentos atravez da PK Id da tabela Vendas e FK Id da tabela ItensDaVenda e a PK IdProd da tabela Produtos com FK IdProd da tabela ItensDaVenda

SELECT Produtos.IdProd, Produtos.Descricao FROM Produtos WHERE Produtos.IdProd IN (SELECT ItensdaVenda.IdProd  FROM ItensDaVenda WHERE ItensdaVenda.QtdProd = (SELECT MAX(ItensDaVenda.QtdProd) FROM ItensDaVenda))
	Este script SQL retorna o Id do produto e nome do produto, utilizando a tabela Produtos apenas. É realizado uma subconsulta que retorna o Id do produto da tabela ItensDaVenda e dentro desta subconsulta é realizado outra subconsulta que retorma a quantidade maxima de produtos da tabela ItensDaVenda. Retornando o Id do produto e nome do produto em maior quantidade.

SELECT Vendas.DataVenda, Produtos.Descricao, ItensDaVenda.QtdProd FROM ItensDaVenda INNER JOIN Vendas
ON (ItensDaVenda.Id = Vendas.Id) INNER JOIN Produtos ON (ItensDaVenda.IdProd = Produtos.IdProd)
	Este script SQL retorna a data da venda, nome do produto e a quantidade do produto. Utilizando as tabelas ItensDaVenda e Vendas com seus respectivos relacionamentos de PK Id da tabela Venda com FK Id da Tabela ItensDaVenda e utilizando juntamente a tabela Produtos com seu relacionamento de PK IdProd e FK IdProd da tabela ItensDaVenda

SELECT Vendas.DataVenda, Produtos.Descricao, ItensDaVenda.QtdProd FROM ItensDaVenda INNER JOIN Vendas
ON (ItensDaVenda.Id = Vendas.Id) INNER JOIN Produtos ON (ItensDaVenda.IdProd = Produtos.IdProd) WHERE Vendas.DataVenda = '13-01-2014'
	Este script SQL retorna a data da venda, nome do produto e a quantidade do produto. Utilizando as tabelas ItensDaVenda e Vendas com seus respectivos relacionamentos de PK Id da tabela Venda com FK Id da Tabela ItensDaVenda e utilizando juntamente a tabela Produtos com seu relacionamento de PK IdProd e FK IdProd da tabela ItensDaVenda com uma condicional que data da venda = '13-01-2014'

SELECT Vendas.DataVenda, SUM(ItensDaVenda.QtdProd) FROM ItensDaVenda INNER JOIN
Vendas ON (ItensDaVenda.Id = Vendas.Id) GROUP BY Vendas.DataVenda
	

SELECT Produtos.Descricao, SUM(ItensDaVenda.QtdProd) FROM ItensDaVenda INNER JOIN Produtos
ON (ItensDaVenda.IdProd = Produtos.IdProd) GROUP BY Produtos.Descricao HAVING SUM(ItensDaVenda.QtdProd) > 10

