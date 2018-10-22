#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int a;
	int max = 0;
	while(1){
		printf("정수를 입력하세요 : ");
		scanf("%d", &a);
		if(a==0)
			break;
		if(a>max)
			max=a;
	}
	printf("max = %d\n", max);
	system("pause");
	return 0;

}