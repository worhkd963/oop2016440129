#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int i = 0;
	int sum = 0;
	for(i = 1; i<101;i++)
		sum = sum+i;

	printf("sum = %d", sum);
	system("pause");
	return 0;

}