#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int a;
	int sum = 0;
	int i = 0;

	printf("7���� ū ������ �Է��ϼ��� : ");
	scanf("%d", &a);

	if(a<7){
		printf("�Է� ���� ���ڰ� 7���� �۽��ϴ�.");
		system("pause");
		return 0;
	}

	for(i=7;i<=a;i++)
		sum = sum + i;

	printf("���� : %d\n", sum);
	system("pause");
	return 0;

}