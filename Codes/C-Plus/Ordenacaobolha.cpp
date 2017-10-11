/*Rodrigo dos santos felix
  RA: 010617040
  */
#include <stdio.h>
#include <conio.h>

#define DEBUG 1

#define MAX 100

typedef int TChave;
typedef char TInfo[255];
typedef struct
{
	TChave chave;
	TInfo info;
} TDado;
typedef TDado TVetor[MAX];

void mostra(TVetor v, int n)
{
	int i;
	if (DEBUG)
	{
		printf("\n------------------------------------\n");
		for (i=0; i<n; i++)
		{
			printf("%3d: %3d %s\n", i, v[i].chave, v[i].info);
		}
		printf("---------------------------------------");
		
	}
}

void ordena(TVetor v, int n)
{
	int i, j, ordenado;
	TDado x;
	mostra(v, n);
	i = 1;
	ordenado = 0;
	while (!ordenado && (i<n))
	{
		ordenado = 1;
		for (j = n - 1; j>=i; j--)
		{
			if (v[j].chave > v[j-1].chave)
			{
				x = v[j];
				v[j] = v[j-1];
				v[j-1] = x;
				ordenado = 0;
			}
			mostra(v,n);
		}
		i++;
	}
	mostra(v,n);
}

int main()
{
	FILE *arquivo;
	TVetor v;
	int n, i;
	
	
	printf("\nABRINDO ARQUIVO...");
	arquivo = fopen("./ordenar.txt", "rt");
	if(!arquivo)
	{
		printf("\nERRO!\n");
		getch();
		return 1;
	}
	printf("\nArquivo Aberto!\n");
	printf("\nCARREGANDO DADOS...");
	i=0;
	while(!feof(arquivo) && i<MAX)
	{
		fscanf(arquivo, "%d,%s", &v[i].chave, v[i].info);
		i++;
	}
	n = i;
	if(!feof(arquivo))
	{
		printf("\nERRO!\n");
		getch();
		return 1;
	}
	printf("\nDados Carregados!\n");
	printf("\nFechando Arquivo...");
	fclose(arquivo);
	printf("\nARQUIVO FECHADO!\n");
	printf("\nOrdenando...");
	ordena(v, n);
	printf("\nORDENADO!\n");
	printf("\nABRINDO ARQUIVO...");
	arquivo = fopen("./ordenado.txt", "wt");
	if(!arquivo)
	{
		printf("\nERRO!\n");
		getch();
		return 1;
	}
	printf("\nARQUIVO ABERTO!\n");
	printf("\nSALVANDO DADOS...");
	for (i = 0; i<n; i++)
	{
		fprintf(arquivo, "%d,%s", v[i].chave, v[i].info);
		if (i < (n - 1)) fprintf(arquivo, "\n");
	}
	printf("\nDADOS SALVOS!\n");
	printf("\nFechando Arquivo...");
	fclose(arquivo);
	printf("\nARQUIVO FECHADO!\n");
	printf("\n**************************************************\n");
	getch();
	return 0;
}
