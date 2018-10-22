#include <stdio.h>
#include <Windows.h>
int main(){
	int a = 0;
	int i =0;
	int sum = 0;

	for(i=0;i<10;i++){
		printf("정수를 입력하세요 : ");
		scanf("%d", &a);
		sum = sum + a;
	}

	printf("총합은 : %d", sum);
	system("pause");
	return 0;
}