#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int a;
	int i, j;
	int count = 0;
	int sum = 0;
	
	printf("숫자를 입력하세요 : ");
	scanf("%d", &a);

	for(i =2;i<=a;i++){
		for(j=1;j<=i;j++){
			if(i%j==0)
				count++;
		}
		if(count==2)
			sum = sum +i;
		count = 0;
	}
	printf("입력받은 숫자 이하의 소수들의 합은 %d 입니다.\n", sum);
	system("pause");
	return 0;

}