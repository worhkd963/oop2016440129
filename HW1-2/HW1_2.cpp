#include <stdio.h>
#include <Windows.h>
int main(){
	int a;
	printf("���� �Է� : ");
	scanf("%d", &a);

	if(a%2 == 1)
		printf("Ȧ���Դϴ�.\n");
	else
		printf("¦���Դϴ�.\n");
	system("pause");
	return 0;
}