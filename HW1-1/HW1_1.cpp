#include <stdio.h>
#include <Windows.h>
int main(){
	int a;
	int b;

	printf("���� a�Է� : ");
	scanf("%d", &a);
	printf("���� b�Է� : ");
	scanf("%d", &b);

	printf("a = %d, b = %d \n", a, b);

	if(a>b){
		printf("ū ���� : %d \n", a);
	}else if(a<b){
		printf("ū ���� : %d \n", b);
	}else{
		printf("a�� b�� ����. %d \n", a);
	}
	system("pause");
	return 0;
}