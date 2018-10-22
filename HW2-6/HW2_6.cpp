// main 함수는 한번만
#include <stdio.h>
#include <Windows.h>
int main(void) {

	int num;
	num = 0;

	printf("양의 정수를 입력해주십시오 : ");
	scanf("%d" , &num);




	while (num <= 0)
	{
		printf("오류입니다. 다시 입력해 주십시오 : ");
		scanf("%d" , &num);
	}

	num = num * 2;

	printf(" 입력하신 정수의 두배는 %d 입니다." , num);

	system("pause");
	return 0;
}
