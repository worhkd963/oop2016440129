#include <stdio.h>
#include <Windows.h>
int main(){
	int a = 0;
	int i =0;
	int sum = 0;

	for(i=0;i<10;i++){
		printf("������ �Է��ϼ��� : ");
		scanf("%d", &a);
		sum = sum + a;
	}

	printf("������ : %d", sum);
	system("pause");
	return 0;
}