//Nome do desenvolvedor: Rodrigo dos Santos Felix 010617040
//Data de codificação: 17/10/2017
#include <stdio.h>
#include <conio.h>
#include <malloc.h>
typedef int TInfo;
typedef struct no
{
	TInfo info;
	no *esq, *dir;
} TNo;
typedef TNo *PNo;
typedef PNo TArv;
void inicia(TArv *a)
{
	*a = NULL;
}

void insere(TArv *a, TInfo x)
{
	TArv auxiliar;
	if(*a != NULL)
	{
		if (x < (*a)->info)
		{
			insere(&(*a)->esq, x);
		}
		else
		{
			insere(&(*a)->dir, x);
		}
	}
	else
	{
		auxiliar = (TArv)malloc(sizeof(TNo));
		auxiliar->info = x;
		auxiliar->esq = NULL;
		auxiliar->dir = NULL;
		*a = auxiliar;
	}
	
}

void imprime(TArv a, int n)
{
	int i;
	if (a != NULL)
	{
		imprime(a->dir, n+5);
		for (i=0; i<n; i++)
		{
			printf(" ");
		}
	printf("%d\n", a->info);
	imprime(a->esq, n+5);
	}
}

void mostra(TArv a)
{
	imprime(a, 5);
	printf("--------------------\n");
	getch();
}

void mostraTextual(TArv a)
{
	if(a != NULL)
	{
	
	printf("<%d", a->info);
	mostraTextual(a->esq);
	mostraTextual(a->dir);
	
	}
	else
	{
		printf("<>");
	}
	
	
	
}
void termina(TArv *a)
{
	if (*a != NULL)
	{
		termina(&(*a)->esq);
		termina(&(*a)->dir);
		free(a);
		*a = NULL;
	}
}

int main()
{
	TArv arv;
	inicia(&arv);
//	mostra(arv);
	insere(&arv, 10);
//	mostra(arv);
	insere(&arv, 5);
//	mostra(arv);
	insere(&arv, 15);
//	mostra(arv);
	insere(&arv, 7);
//	mostra(arv);
	insere(&arv, 12);
//	mostra(arv);
	insere(&arv, 3);
//	mostra(arv);
	insere(&arv, 18);
//	mostra(arv);
	mostraTextual(arv);
	termina(&arv);
//	mostra(arv);

	return 0;
}
