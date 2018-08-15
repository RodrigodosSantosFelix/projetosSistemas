create trigger geraruserpw on Funcionarios
for insert
As

Begin
	declare @CPF int
	declare @Nome nvarchar(50)
	declare @Cargo nvarchar(50)
	declare @Departamento nvarchar(50)

	set @CPF = (select CPF from inserted)
	set @Nome = (select Nome from inserted)
	set @Cargo = (select Cargo from inserted)
	set @Departamento = (select Departamento from inserted)

	begin
		insert into Usuario_Senha (CPF,Usuario,Senha) values (@CPF, SUBSTRING(@Nome,1,2)+substring(@Cargo,(LEN(@Cargo)-2),(LEN(@Cargo)-1)),SUBSTRING(@Departamento,1,2)+SUBSTRING(@Cargo,((len(@Cargo)-@Cargo)+1),((len(@Cargo)-@Cargo)+2)))
	end
	end