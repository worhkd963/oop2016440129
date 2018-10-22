#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int num;
	int i;
	int numcal;
	printf(" 구구단을 알고싶은 숫자를 1~9 사이에서 입력해주십시오 :");
	scanf("%d" , & num);

	i = 1;
	
	while ( num < 1 || num >=10)
	{
		printf(" 올바른 숫자를 입력해주십시오 :");
		scanf("%d" , & num);

	}


	while ( i < 10)
	{
		numcal = 0;

		numcal = num * i;
		printf(" %d 곱하기 %d 는 %d 입니다. \n" , num , i , numcal);

		i = i + 1;

	}
	system("pause");
	return 0;

}
