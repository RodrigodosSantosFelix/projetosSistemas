CREATE TABLE Projeto
(
idProjeto int not null,
Descricao varchar(45) not null,
Constraint PKProj Primary key (idProjeto)
) 

INSERT INTO Projeto values (1, 'Reformulação de website')
INSERT INTO Projeto values (2, 'Implantação de sistema ERP')
INSERT INTO Projeto values (3, 'Instalação de rede WiFi')

CREATE TABLE Cargo
(
idCargo int not null,
Descricao varchar(45) not null,
Salario money,
Constraint PKCargo Primary key (idCargo)
) 

INSERT INTO Cargo values (10, 'Analista de sistemas', 2000)
INSERT INTO Cargo values (20, 'Programador', 1500)
INSERT INTO Cargo values (30, 'Web Desginer', 1300)
INSERT INTO Cargo values (40, 'Analista de banco de dados', 5000)
INSERT INTO Cargo values (50, 'Analista de redes', 3000)

CREATE TABLE Empregado
(
idEmpregado int not null,
IdCargo int not null,
Sexo varchar(1),
Nome varchar(45) not null,
Idade int,
Constraint PKEmpregado Primary key (idEmpregado),
Constraint FKEMpregado Foreign Key (IdCargo) references Cargo(Idcargo)
)

INSERT INTO Empregado values (101, 10, 'M', 'João', 34)
INSERT INTO Empregado values (102, 20, 'M', 'Pedro', 24)
INSERT INTO Empregado values (103, 20, 'F', 'Maria', 23)
INSERT INTO Empregado values (104, 20, 'M', 'José', 33)
INSERT INTO Empregado values (105, 10, 'F', 'Laura', 36)
INSERT INTO Empregado values (106, 30, 'F', 'Roberta', 22)
INSERT INTO Empregado values (107, 20, 'F', 'Daniela', 26)
INSERT INTO Empregado values (108, 40, 'M', 'Paulo', 26)
INSERT INTO Empregado values (109, 50, 'M', 'Marcelo', 32)
INSERT INTO Empregado values (110, 50, 'M', 'William', 35)
INSERT INTO Empregado values (111, 30, 'M', 'Felipe', 42)
INSERT INTO Empregado values (112, 10, 'F', 'Larissa', 26)


CREATE TABLE Alocacao
(
Projeto_idProjeto int not null,
Empregado_idEmpregado int not null,
dtAlocacao date,
Constraint FKAloc1 Foreign Key (Projeto_IdProjeto) references Projeto(idprojeto),
Constraint FKAloc2 Foreign Key (Empregado_IdEmpregado) references EMpregado(idempregado),
Constraint PKAloc Primary key (Projeto_idProjeto, Empregado_idEmpregado)
)

INSERT INTO Alocacao values (1, 101, '10-04-2013')
INSERT INTO Alocacao values (1, 102, '10-04-2013')
INSERT INTO Alocacao values (1, 112, '10-04-2013')
INSERT INTO Alocacao values (1, 105, '11-04-2013')
INSERT INTO Alocacao values (2, 101, '11-04-2013')
INSERT INTO Alocacao values (2, 104, '11-04-2013')
INSERT INTO Alocacao values (2, 107, '11-04-2013')
INSERT INTO Alocacao values (2, 108, '12-04-2013')
INSERT INTO Alocacao values (2, 109, '12-04-2013')
INSERT INTO Alocacao values (3, 109, '10-04-2013')
INSERT INTO Alocacao values (3, 110, '10-04-2013')
