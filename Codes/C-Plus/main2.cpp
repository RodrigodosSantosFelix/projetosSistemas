#include <iostream>
#include <stdio.h>
#include <conio.h>

void moveDisco(char origem, char destino)
{
	printf("%c -> %c\n", origem, destino);
}

void torreHanoi(int altura, char origem, char destino)
{
	if(altura > 1)
	{
		
	}
	else
	{
		moveDisco(origem,destino);
	}
}

void main()
{
	int n;
	printf("\nDigite a altura da torre: ");
	scanf("%n", &n);
	torreHanoi(n, 'A','B','C');
	getch();
}
