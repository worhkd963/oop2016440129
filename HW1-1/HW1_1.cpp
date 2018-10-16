#include <stdio.h>
#include <Windows.h>
int main(){
	int a;
	int b;

	printf("정수 a입력 : ");
	scanf("%d", &a);
	printf("정수 b입력 : ");
	scanf("%d", &b);

	printf("a = %d, b = %d \n", a, b);

	if(a>b){
		printf("큰 수는 : %d \n", a);
	}else if(a<b){
		printf("큰 수는 : %d \n", b);
	}else{
		printf("a와 b는 같다. %d \n", a);
	}
	system("pause");
	return 0;
}