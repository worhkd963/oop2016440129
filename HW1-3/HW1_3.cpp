#include <stdio.h>
#include <Windows.h>
int main(){
	int a;
	int b;
	int c;

	printf("���� �Է� : ");
	scanf("%d", &a);
	printf("���� �Է� : ");
	scanf("%d", &b);
	printf("���� �Է� : ");
	scanf("%d", &c);

	if(a>b){
		if(a>c)
			printf("���� ū ���� : %d\n", a);
		else
			printf("���� ū ���� : %d\n", c);
	}else{
		if(b>c)
			printf("���� ū ���� : %d\n", b);
		else
			printf("���� ū ���� : %d\n", c);
	}
	system("pause");
	return 0;
}