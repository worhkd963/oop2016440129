#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int i, j ;
	for(i=0; i<11; i++) {
		if(i<6) { // ���� ����
			for(j=0; j<11-2*i; j++) // �� ���
				printf("*");
			printf("\n");
		}
		else { // ���� ����
			for(j=0; j<2*i-9; j++) // �� ���
				printf("*");
			printf("\n");
		}
	}
	printf("-------------------\n");

	for(i=0; i<11; i++) {
		if(i<6) {
			for(j=0; j<11-2*i; j++) { // ���� ���� ����
				if(j<6-i) // ���� ����
					printf("%d",5-i-j);
				else // ���� ����
					printf("%d",i+j-5);
			}
			printf("\n");
		}
		else { // ���� ���� ����
			for(j=0; j<2*i-9; j++) {
				if(j<i-4) // ���� ����
					printf("%d",-j-5+i);
				else // ���� ����
					printf("%d",j+5-i);
			}
			printf("\n");
		}
	}
	system("pause");
	return 0;

}