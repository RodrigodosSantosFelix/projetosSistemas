/*Nome: Rodrigo dos Santos Felix
  RA: 010617040
  */
#include <stdio.h>
#include <conio.h>
#define MAXELEM 3
typedef int TInfo;
typedef struct TFila {
TInfo elem[MAXELEM];
// de 1 ate MAXELEM
int inicio;
// de 1 ate MAXELEM
int fim;
// de 0 ate MAXELEM
int quantidade;
} TFila;
void iniciaFila(TFila *f) {
f->inicio = 1;
f->fim = MAXELEM;
f->quantidade = 0;
}

int insereFila(TFila *f, TInfo valor) {
	if (f->quantidade == MAXELEM) {
		return 0;
	} else {
	f->fim = (f->fim % MAXELEM) + 1;
	f->elem[f->fim-1] = valor;
	f->quantidade = f->quantidade + 1;
	return 1;
	}
}


int retiraFila(TFila *f, TInfo *valor) {
	if(f->quantidade == 0) {
		return 0;
	} else {
		*valor = f->elem[f->inicio-1];
		f->inicio = (f->inicio % MAXELEM) + 1;
		f->quantidade = f->quantidade--;
		return 1;
	}
	
	
}


int main() {
TFila fila;
TInfo v;
printf("\n");
iniciaFila(&fila);
if (retiraFila(&fila, &v)) {
printf("Valor retirado da fila: %d.\n", v);
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
printf("Valor retirado da fila: %d.\n", v);
} else {
printf("Fila vazia.\n");
}
if (retiraFila(&fila, &v)) {
printf("Valor retirado da fila: %d.\n", v);
} else {
printf("Fila vazia.\n");
}
if (insereFila(&fila, 4)) {
printf("Valor inserido.\n");
} else {
printf("Fila cheia.\n");
}
if (retiraFila(&fila, &v)) {
printf("Valor retirado da fila: %d.\n", v);
} else {
	
	printf("Fila vazia.\n");
}
if (retiraFila(&fila, &v)) {
printf("Valor retirado da fila: %d.\n", v);
} else {
printf("Fila vazia.\n");
}
if (retiraFila(&fila, &v)) {
printf("Valor retirado da fila: %d.\n", v);
} else {
printf("Fila vazia.\n");
}
getch();
return 0;
}
