#include <stdio.h>
#include <conio.h>
#define MAXELEM 3
typedef float TInfo;
typedef struct TFila {
TInfo elem[MAXELEM];
int fim;
} TFila;

void iniciaFila(TFila *p) {
(*p).fim = 0;
}

int insereFila(TFila *p, TInfo valor) {
if (p->fim == MAXELEM) {
return 0;
} else {
p->fim = p->fim + 1;
p->elem[p->fim-1] = valor;
return 1;
}
}

int retiraFila(TFila *p, TInfo *valor) {
if (p->fim == 0) {
return 0;
} 
else
 {
	*valor = p->elem[p->fim-1];
	
	for (int i = 0; i<p->fim-1; i++)
	{
		p->elem[i] = p->elem[i++];
	}
	p->fim = p->fim--;
	return 1;
}
}


int main() {
TFila fila;
TInfo v;
printf("\n");
iniciaFila(&fila);
if (retiraFila(&fila, &v)) {
printf("Valor retirado da fila: %.2f.\n", v);
} else {
printf("Fila vazia.\n");
}
if (insereFila(&fila, 1)) {
printf("Valor inserido.\n");
} else {
printf("Fila cheia.\n");
}
if (insereFila(&fila, 2)) {
printf("Valor inserido.\n");
} else {
printf("Fila cheia.\n");
}
if (insereFila(&fila, 3)) {
printf("Valor inserido.\n");
} else {
	printf("Fila cheia.\n");
}
if (insereFila(&fila, 4)) {
printf("Valor inserido.\n");
} else {
printf("Fila cheia.\n");
}
if (retiraFila(&fila, &v)) {
printf("Valor retirado da fila: %.2f.\n", v);
} else {
printf("Fila vazia.\n");
}
if (retiraFila(&fila, &v)) {
printf("Valor retirado da fila: %.2f.\n", v);
} else {
printf("Fila vazia.\n");
}
if (insereFila(&fila, 4)) {
printf("Valor inserido.\n");
} else {
printf("Fila cheia.\n");
}
if (retiraFila(&fila, &v)) {
printf("Valor retirado da fila: %.2f.\n", v);
} else {
printf("Fila vazia.\n");
}
if (retiraFila(&fila, &v)) {
printf("Valor retirado da fila: %.2f.\n", v);
} else {
printf("Fila vazia.\n");
}
getch();
return 0;
}
