/*
***Entrada
A entrada consiste de uma linha contendo os valores dos trˆes 
cr´editos A,B e C (1 <= A,B,C <=
1000).
***Saida
Seu programa deve imprimir uma linha contendo o caracter “S” se 
e poss´ivel viajar e voltar para
o presente, ou “N” caso contrario.
*/

#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	int a, b, c, soma;
	cin >> a >> b >> c;
	
	if(a == b || a == c || b == c){
		cout << "S" << endl;
	}
	else{
		int soma = (a + b);
		int soma1 = (a + c);
		int soma2 = (b + c);
		if (soma == c){
			cout << "S" << endl;
		}
		else if(soma1 == b){
			cout << "S" << endl;
		}else if(soma2 == a){
			cout << "S" << endl;
		}
		else
		{
			cout << "N" << endl;
		}
	}
	return 0;
}
