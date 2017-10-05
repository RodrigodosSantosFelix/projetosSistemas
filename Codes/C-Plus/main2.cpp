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
		torreHanoi(altura-1, origem, destino, trabalho);
		torreHanoi(altura-1,origem,trabalho,destino);
		moveDisco(origem,destino);
		printf("%c -> %c\n", trabalho,destino);
	
	}
}

main() {
	int n;
	
	printf("\nDigite a altura da torre: ");
	scanf("%d", &n);
	torreHanoi(n, 'A','B','C');
	getch();
}
