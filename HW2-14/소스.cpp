#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int a;
	int sum = 0;
	int i = 0;

	printf("7보다 큰 정수를 입력하세요 : ");
	scanf("%d", &a);

	if(a<7){
		printf("입력 받은 숫자가 7보다 작습니다.");
		system("pause");
		return 0;
	}

	for(i=7;i<=a;i++)
		sum = sum + i;

	printf("합은 : %d\n", sum);
	system("pause");
	return 0;

}