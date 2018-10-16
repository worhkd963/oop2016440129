#include <stdio.h>
#include <Windows.h>
int main(){
	int a;
	int b;
	int c;

	printf("정수 입력 : ");
	scanf("%d", &a);
	printf("정수 입력 : ");
	scanf("%d", &b);
	printf("정수 입력 : ");
	scanf("%d", &c);

	if(a>b){
		if(a>c)
			printf("가장 큰 수는 : %d\n", a);
		else
			printf("가장 큰 수는 : %d\n", c);
	}else{
		if(b>c)
			printf("가장 큰 수는 : %d\n", b);
		else
			printf("가장 큰 수는 : %d\n", c);
	}
	system("pause");
	return 0;
}