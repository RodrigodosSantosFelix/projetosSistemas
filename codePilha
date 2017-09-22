/*Nome: Rodrigo dos Santos Felix
  RA: 010617040
*/

#include <iostream>
#include <stdio.h>
#include <conio.h>
#define MAX 6
#define MAXP1 4
#define MAXP2 4
typedef float TInfo;
typedef struct TPilha {
	TInfo elem[MAX];
	// de 0 ate MAXP1
	int topo1;
	// de MAX-MAXP2+1 ate MAX+1
	int topo2;
} TPilha;
void iniciaPilha(TPilha *p) {
	p->topo1 = 0;
	p->topo2 = MAX+1;
}
int inserePilha(TPilha *p, int qual, TInfo valor) {
	if (qual == 1) {
		if ((p->topo1 == (p->topo2-1)) || (p->topo1 == MAXP1)) {
			return 0;
			} else {
		p->topo1 = p->topo1 + 1;
		p->elem[p->topo1-1] = valor;
		return 1;
	}

	} else {
		if ((p->topo2 == (p->topo1+1)) || (p->topo2 == (MAX-MAXP2+1))) {
			return 0;
		} else {
		p->topo2 = p->topo2 - 1;
		p->elem[p->topo2-1] = valor;
		return 1;
		}
	}
}
int retiraPilha(TPilha *p, int qual, TInfo *valor) {
	if (qual == 1)
	{
		if(p->topo1 == 0)
		{
			return 0;
		}
		else
		{
			*valor = p->elem[p->topo1 - 1];
			p->topo1 = p->topo1 - 1;
			return 1;
		}
	}
	else
	{
		if (p->topo2 == MAX+1)
		{
			return 0;
		}
		else
		{
			*valor = p->elem[p->topo2 - 1];
			p->topo2 = p->topo2 + 1;
			return 1;
		}
	}
}
int main() {
	TPilha pilha;
	TInfo v;
	printf("\n");
	iniciaPilha(&pilha);
	if (inserePilha(&pilha, 2, 10)) {
		printf("Valor 10 inserido na pilha 1.\n");
	} else {
		printf("Pilha cheia.\n");
	}
	if (inserePilha(&pilha, 2, 11)) {
		printf("Valor 11 inserido na pilha 1.\n");
	} else {
		printf("Pilha cheia.\n");
	}
	if (inserePilha(&pilha, 2, 12)) {
		printf("Valor 12 inserido na pilha 1.\n");
	} else {
		printf("Pilha cheia.\n");
	}/*
	if (inserePilha(&pilha, 1, 13)) {
		printf("Valor 13 inserido na pilha 1.\n");
	} else {
	
		printf("Pilha cheia.\n");
	}
	if (inserePilha(&pilha, 1, 14)) {
		printf("Valor 14 inserido na pilha 1.\n");
	} else {
		printf("Pilha cheia.\n");
	}
	if (inserePilha(&pilha, 2, 20)) {
		printf("Valor 20 inserido na pilha 2.\n");
	} else {
		printf("Pilha cheia.\n");
	}
	if (inserePilha(&pilha, 2, 21)) {
		printf("Valor 21 inserido na pilha 2.\n");
	} else {
		printf("Pilha cheia.\n");
	}
	if (inserePilha(&pilha, 2, 22)) {
		printf("Valor 22 inserido na pilha 2.\n");
	} else {
		printf("Pilha cheia.\n");
	}*/
	if (retiraPilha(&pilha, 2, &v)) {
		printf("Valor retirado da pilha 1: %.2f.\n", v);
	} else {
		printf("Pilha vazia.\n");
	}/*
	if (inserePilha(&pilha, 2, 22)) {
		printf("Valor 22 inserido na pilha 2.\n");
	} else {
		printf("Pilha cheia.\n");
	}*/
	if (retiraPilha(&pilha, 2, &v)) {
		printf("Valor retirado da pilha 1: %.2f.\n", v);
	} else {
		printf("Pilha vazia.\n");
	}




/*
	if (inserePilha(&pilha, 2, 23)) {
		printf("Valor 23 inserido na pilha 2.\n");
	} else {
		printf("Pilha cheia.\n");
	}*/
	if (retiraPilha(&pilha, 2, &v)) {
		printf("Valor retirado da pilha 2: %.2f.\n", v);
	} else {
		printf("Pilha vazia.\n");
	}
	if (retiraPilha(&pilha, 2, &v)) {
		printf("Valor retirado da pilha 1: %.2f.\n", v);
	} else {
		printf("Pilha vazia.\n");
	}/*
	if (inserePilha(&pilha, 2, 24)) {
		printf("Valor 24 inserido na pilha 2.\n");
	} else {
		printf("Pilha cheia.\n");
	}*/
	getch();
	return 0;
}
