//Nome do desenvolvedor: Rodrigo dos Santos Felix 010617040
//Data de codificação: 17/10/2017
#include <stdio.h>
#include <conio.h>
#include <malloc.h>

typedef int TInfo;
typedef struct no {
	TInfo info;
	int freq;
	no *esq, *dir;
} TNo;
typedef TNo *PNo;
typedef PNo TArv;

void inicia(TArv *a) {
	*a = NULL;
}

void imprime(TArv a, int n) {
	int i;
	if (a != NULL) {
		imprime(a->dir, n+5);
		for (i=0; i<n; i++) {
			printf(" ");
		}
		printf("%d (%d)\n", a->info, a->freq);
		imprime(a->esq, n+5);
	}
}

void mostraTextual(TArv a) {
	printf("<");
	if (a != NULL) {
		printf(" %d ", a->info);
		mostraTextual(a->esq);
		printf(" ");
		mostraTextual(a->dir);
	}
	printf(">");
}

void mostra(TArv a) {
	imprime(a, 5);
	printf("--------------------\n");
	mostraTextual(a);
	printf("\n--------------------\n");
	getch();
}

void insere(TArv *a, TInfo x) {
	PNo p;
	if (*a == NULL) {
		p = (PNo)malloc(sizeof(TNo));
		p->info = x;
		p->freq = 1;
		p->esq = NULL;
		p->dir = NULL;
		*a = p;
	} else {
		if (x < (*a)->info) {
			insere(&(*a)->esq, x);
		} else {
			if (x > (*a)->info) {
				insere(&(*a)->dir, x);
			} else {
				(*a)->freq = (*a)->freq + 1;
			}
		}
	}
}

TArv busca(TArv a, TInfo x) {
	if (a == NULL) {
		return NULL;
	} else {
		if (x == a->info) {
			return a;
		} else {
			if (x < a->info) {
				return busca(a->esq, x);
			} else {
				if (x > a->info) {
					return busca(a->dir, x);
				}
			}
		}
	}
}

void termina(TArv *a) {
	if (*a != NULL) {
		termina(&(*a)->esq);
		termina(&(*a)->dir);
		free(*a);
		*a = NULL;
	}
}

int main() {
	
	TArv arv, aux;
	
	inicia(&arv);
	mostra(arv);
	
	aux = busca(arv, 10);
	if (aux) {
		printf("Valor: %d\n", aux->info);
	} else {
		printf("Valor nao encontrado!\n");
	}
	getch();
	
	insere(&arv, 10);
	mostra(arv);
	
	aux = busca(arv, 10);
	if (aux) {
		printf("Valor: %d\n", aux->info);
	} else {
		printf("Valor nao encontrado!\n");
	}
	getch();
	
	aux = busca(arv, 15);
	if (aux) {
		printf("Valor: %d\n", aux->info);
	} else {
		printf("Valor nao encontrado!\n");
	}
	getch();
	
	insere(&arv, 5);
	mostra(arv);
	insere(&arv, 15);
	mostra(arv);
	
	aux = busca(arv, 15);
	if (aux) {
		printf("Valor: %d\n", aux->info);
	} else {
		printf("Valor nao encontrado!\n");
	}
	getch();
	
	insere(&arv, 7);
	mostra(arv);
	insere(&arv, 12);
	mostra(arv);
	insere(&arv, 3);
	mostra(arv);
	insere(&arv, 18);
	mostra(arv);
	
	aux = busca(arv, 20);
	if (aux) {
		printf("Valor: %d\n", aux->info);
	} else {
		printf("Valor nao encontrado!\n");
	}
	getch();
	
	aux = busca(arv, 10);
	if (aux) {
		printf("Valor: %d\n", aux->info);
	} else {
		printf("Valor nao encontrado!\n");
	}
	getch();
	
	aux = busca(arv, 3);
	if (aux) {
		printf("Valor: %d\n", aux->info);
	} else {
		printf("Valor nao encontrado!\n");
	}
	getch();
	
	aux = busca(arv, 5);
	if (aux) {
		printf("Valor: %d\n", aux->info);
	} else {
		printf("Valor nao encontrado!\n");
	}
	getch();
	
	insere(&arv, 7);
	mostra(arv);
	insere(&arv, 7);
	mostra(arv);
	insere(&arv, 3);
	mostra(arv);
	insere(&arv, 7);
	mostra(arv);
	insere(&arv, 15);
	mostra(arv);
	
	termina(&arv);
	mostra(arv);
	
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
