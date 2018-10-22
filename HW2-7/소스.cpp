#include <stdio.h>
#include <Windows.h>
int main(){
	int a = 0;
	int sum = 0;
	while(1){
		printf("정수를 입력하세요 : ");
		scanf("%d", &a);
		if(a==0)
			break;
		sum = sum + a;
	}

	printf("입력받은 수의 총 합은 : %d", sum);
	system("pause");
	return 0;
}