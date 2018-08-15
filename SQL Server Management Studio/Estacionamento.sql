create table Patio
(
	num int not null, ender varchar(40) not null, capacidade int not null, 
	Constraint PK_num primary key(num))

create table Modelo
(
	codMod int not null, Desc_2 varchar(40) not null,
	constraint Pk_codMod primary key(codMod)
	)

create table Cliente
(
	cpf int not null, nome varchar(60) not null, dtNasc Date
	Constraint PK_cpf primary key(cpf))

create table Veiculo
(
	placa varchar(8) not null, Modelo_codMod int, Cliente_cpf int, cor varchar(20), ano int,
	constraint PK_placa primary key (placa),
	constraint FK_ModelocodMod foreign key(Modelo_codMod) references Modelo(codMod),
	constraint FK_Cliente_cpf foreign key(Cliente_cpf) references Cliente(cpf)
	)

create table Estacionamento
(
	cod int not null, Patio_num int not null, Veiculo_placa varchar(8) not null, dtEntrada varchar(10), dtSaida varchar(10), hsEntrada varchar(10), hsSaida varchar(10),
	constraint Pk_cod primary key(cod),
	constraint FK_Pationum Foreign key(Patio_num) references Patio(num),
	constraint FK_VeiculoPlaca foreign key(Veiculo_placa) references Veiculo(placa)
	)





insert into Patio values
(	1, 'Av Principal',20)
insert into Patio values
(	2, 'Av Brasil',30)
insert into Patio values
(	3, 'Av Americas',15)

insert into Modelo values
( 10,'F250')

insert into Modelo values
( 20,'Ka')

insert into Modelo values
( 30,'Corsa')


insert into Cliente values
( 4166, 'José Silva','10-01-1990')

insert into Cliente values
( 4848, 'Maria Zild','09-05-1989')


insert into Veiculo values
('1234678',10,4166,'Azul', 2016)

insert into Veiculo values
('12340678',30,4848,'Preto', 2017)



insert into Estacionamento values
(18188,1,'1234678','10-11-2017','11-11-2017','10:00','23:30')