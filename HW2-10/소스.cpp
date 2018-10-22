#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int a;
	int i =2;

	printf("정수를 입력하세요 : ");
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