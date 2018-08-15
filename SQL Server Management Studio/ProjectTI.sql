/*Nome dos funcion�rios e o sal�rio que cada um recebe.*/
Select Nome,Salario from Empregado inner join Cargo on (Cargo.IdCargo = Empregado.IdCargo)

/*Nome das funcion�rias (sexo feminino) e o sal�rio que cada uma recebe por ordem decrescente do valor do sal�rio*/
Select Nome,Salario from Empregado inner join Cargo on (Cargo.IdCargo = Empregado.IdCargo) where Sexo = 'F' Order by Salario desc

/*Nome do funcion�rio, a descri��o do cargo do mesmo e a sua idade.*/
select Nome,Descricao,Idade from Empregado inner join Cargo on (Cargo.IdCargo = Empregado.IdCargo)

/*O nome dos funcion�rios que est�o alocados no projeto n�mero 1: Reformula��o de website.*/
Select Nome From Empregado inner join Alocacao on (Empregado.IdEmpregado = Alocacao.Empregado_idEmpregado) inner join Projeto on (Alocacao.Projeto_idProjeto = Projeto.idProjeto) where idProjeto = 1

/*O nome dos funcion�rios que est�o alocados no projeto 2 (Implanta��o de sistema ERP) e os seus respectivos cargos.*/
Select Nome,Cargo.Descricao From Empregado inner join Cargo on (Cargo.IdCargo = Empregado.IdCargo) inner join
Alocacao on (Empregado.idEmpregado = Alocacao.Empregado_idEmpregado) inner join Projeto on (Alocacao.Projeto_idProjeto = Projeto.idProjeto) where idProjeto = 2

/*O identificador do projeto, o nome do projeto e o nome dos funcion�rios alocados em cada projeto.*/
Select Projeto.*,Nome from Empregado inner join Alocacao on (Empregado.idEmpregado = Alocacao.Empregado_idEmpregado) inner join Projeto on (Projeto.idProjeto = Alocacao.Projeto_idProjeto)

/*O identificador do projeto, o nome do projeto, o id dos funcion�rios, o nome dos funcion�rios alocados em cada projeto e seus respectivos cargos.*/
Select Projeto.*,idEmpregado,Nome,Cargo.Descricao from Empregado inner join Alocacao on (Empregado.idEmpregado = Alocacao.Empregado_idEmpregado)
 inner join Projeto on (Projeto.idProjeto = Alocacao.Projeto_idProjeto) inner join Cargo on (Cargo.idCargo = Empregado.idCargo)

 /*O nome dos funcion�rios que trabalham no projeto 3, bem como suas respectivas idades, cargos que ocupam, sal�rio e data de aloca��o no projeto.*/
 select Nome,Idade,Cargo.Descricao,Salario,dtAlocacao from Empregado inner join Alocacao on (Empregado.idEmpregado = Alocacao.Empregado_idEmpregado)
 inner join Projeto on (Projeto.idProjeto = Alocacao.Projeto_idProjeto) inner join Cargo on (Cargo.idCargo = Empregado.idCargo) where idProjeto = 3

 /*A quantidade de funcion�rios que trabalha em cada projeto.*/
 select idProjeto, count(Empregado_idEmpregado) as "Quantidade" from Alocacao inner join Projeto on (Projeto.idProjeto = Alocacao.Projeto_idProjeto)
 group by  idProjeto

 /*Mesmo que o 9, por�m, aparecendo o nome do projeto ao inv�s do ID.*/
 select Projeto.Descricao, count(Empregado_idEmpregado) as "Quantidade" from Alocacao inner join Projeto on (Projeto.idProjeto = Alocacao.Projeto_idProjeto)
 group by  Projeto.Descricao