#include <iostream>
#include <conio.h>

int somatoria(int n)
{
	if(n<=0)
	{
		
	return 0;
	
	}
	else
	{
		return n + somatoria(n-1);
		
	}
	
}

main()
{
	int s, n;
	printf("\nDigite o valor de N:");
	scanf("%d", &n);
	s = somatoria(n);
	printf("Resultado = %d", s);
	getch();
}
