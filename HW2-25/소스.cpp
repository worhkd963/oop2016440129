#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int i, j ;
	for(i=0; i<11; i++) {
		if(i<6) { // 별이 감소
			for(j=0; j<11-2*i; j++) // 별 찍기
				printf("*");
			printf("\n");
		}
		else { // 별이 증가
			for(j=0; j<2*i-9; j++) // 별 찍기
				printf("*");
			printf("\n");
		}
	}
	printf("-------------------\n");

	for(i=0; i<11; i++) {
		if(i<6) {
			for(j=0; j<11-2*i; j++) { // 행의 길이 감소
				if(j<6-i) // 숫자 감소
					printf("%d",5-i-j);
				else // 숫자 증가
					printf("%d",i+j-5);
			}
			printf("\n");
		}
		else { // 행의 길이 증가
			for(j=0; j<2*i-9; j++) {
				if(j<i-4) // 숫자 감소
					printf("%d",-j-5+i);
				else // 숫자 증가
					printf("%d",j+5-i);
			}
			printf("\n");
		}
	}
	system("pause");
	return 0;

}