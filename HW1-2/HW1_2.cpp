#include <stdio.h>
#include <Windows.h>
int main(){
	int a;
	printf("정수 입력 : ");
	scanf("%d", &a);

	if(a%2 == 1)
		printf("홀수입니다.\n");
	else
		printf("짝수입니다.\n");
	system("pause");
	return 0;
}