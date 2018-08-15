a) Exiba a placa e o nome dos donos de todos os ve�culos.
	select placa,Cliente.nome from Veiculo inner join Cliente on (Veiculo.Cliente_cpf = Cliente.cpf)

b) Exiba o CPF e o nome do cliente que possui o veiculo de placa �JJJ-2020�.
	select cpf, nome from Veiculo inner join Cliente on (Veiculo.Cliente_cpf = Cliente.cpf) where placa = '1234678'

c) Exiba a placa e a cor do ve�culo que possui o c�digo de estacionamento 1.
	select placa, cor from Veiculo inner join Estacionamento on (Veiculo.placa = Estacionamento.Veiculo_placa) where cod = 18188

d) Exiba a placa e o ano do ve�culo que possui o c�digo de estacionamento 1.
	

e) Exiba a placa, o ano do ve�culo e a descri��o de seu modelo, se ele possuir ano a partir de
2000.
	select placa, ano, Desc_2 from Veiculo inner join Modelo on (Modelo.codMod = Veiculo.Modelo_codMod) where ano >= 2000

f) Exiba o endere�o, a data de entrada e de sa�da dos estacionamentos do ve�culo de placa
�JEG-1010�.
	

g) Exiba a quantidade de vezes que os ve�culos de cor verde estacionaram.

select COUNT(*) from Veiculo inner join Estacionamento on (Veiculo.placa = Estacionamento.Veiculo_placa) where cor = 'Azul'

h) Liste todos os clientes que possuem carro de modelo 1.
select * from 


i) Liste as placas, os hor�rios de entrada e sa�da dos ve�culos de cor verde.
SELECT placa, hsEntrada, hsSaida from Veiculo inner join Estacionamento on (Veiculo.placa = Estacionamento.Veiculo_placa) where cor = 'Azul'

j) Liste todos os estacionamentos do ve�culo de placa �JJJ-2020�.
select cod from Veiculo inner join Estacionamento on (Veiculo.placa = Estacionamento.Veiculo_placa) where placa = '1234678'

k) Exiba o nome do cliente que possui o ve�culo cujo c�digo do estacionamento � 2.


l) Exiba o CPF do cliente que possui o ve�culo cujo c�digo do estacionamento � 3.


m) Exiba a descri��o do modelo do ve�culo cujo c�digo do estacionamento � 2.


n) Exiba a placa, o nome dos donos e a descri��o dos os modelos de todos os ve�culos.

















