Create table Medicos
(CRM int Primary key,
NomeMed Varchar (30),
EspecialidadeMed varchar (30))

Create table Pacientes
(NomePac varchar(30),
RG int,
CPF int Primary key ,
EnderecoPac varchar(30),
TelefonePac int,
NascPac Date)

Create table Tratamentos
(CodTratamento int Primary key,
CPF int Foreign key References Pacientes (CPF),
CRM int Foreign key References Medicos (CRM),
DataInicio date, 
DataFim date, 
)




