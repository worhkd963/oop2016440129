#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int i,j;
	for(i=1; i<=3; i++) {
		for(j=0; j<7-i*2; j++) // 별 출력
			printf("*");
		printf(" "); // 공백
		j++;
		for(j=j ; j<7; j++) // 별 출력
			printf("*");
		printf("\n");
	}
	system("pause");
	return 0;

}