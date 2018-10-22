#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int a;
	int i = 0;
	int count = 0;
	
	printf("숫자를 입력하세요 : ");
	scanf("%d", &a);

	for(i =1;i<=a;i++){
		if(a%i==0)
			count++;
	}
	if(count==2)
		printf("소수입니다.");
	else
		printf("소수가 아닙니다.");
	system("pause");
	return 0;

}