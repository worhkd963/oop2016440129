#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int a;
	int i =2;

	printf("������ �Է��ϼ��� : ");
	scanf("%d", &a);
	printf("a => ");
	while(i<a){
		if(a%i==0)
			printf("%d ", i);
		i++;
	}

	system("pause");
	return 0;

}