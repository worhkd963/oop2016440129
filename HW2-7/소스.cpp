#include <stdio.h>
#include <Windows.h>
int main(){
	int a = 0;
	int sum = 0;
	while(1){
		printf("������ �Է��ϼ��� : ");
		scanf("%d", &a);
		if(a==0)
			break;
		sum = sum + a;
	}

	printf("�Է¹��� ���� �� ���� : %d", sum);
	system("pause");
	return 0;
}