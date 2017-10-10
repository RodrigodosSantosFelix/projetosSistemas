/*Rodrigo dos Santos Felix
  RA: 010617040
  */
#include <iostream>
#include <stdio.h>
#include <conio.h>

void moveDisco(char origem, char destino)
{
	printf("%c -> %c\n", origem, destino);
}

void torreHanoi(int altura, char origem, char destino, char trabalho)
{
	
	if(altura == 1)
	{
		moveDisco(origem,destino);
		
	}
	else
	{
		torreHanoi(altura-1, origem, trabalho, destino);
		printf("%c -> %c\n", origem, destino);
		torreHanoi(altura-1, trabalho,destino, origem);
	
	}
}

main() {
	int n;
	
	printf("\nDigite a altura da torre: ");
	scanf("%d", &n);
	torreHanoi(n, 'A','B','C');
	getch();
}
