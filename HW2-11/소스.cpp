#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int a;
	int i =2;
	do{
		printf("������ �Է��ϼ��� : ");
		scanf("%d", &a);
		if(a==0)
			break;
		printf("a => ");
		while(i<a){
			if(a%i==0)
				printf("%d ", i);
			i++;
		}
		i=2;
		printf("\n");
	}while(a!=0);

	system("pause");
	return 0;

}