// main �Լ��� �ѹ���
#include <stdio.h>
#include <Windows.h>
int main(void) {

	int num;
	num = 0;

	printf("���� ������ �Է����ֽʽÿ� : ");
	scanf("%d" , &num);




	while (num <= 0)
	{
		printf("�����Դϴ�. �ٽ� �Է��� �ֽʽÿ� : ");
		scanf("%d" , &num);
	}

	num = num * 2;

	printf(" �Է��Ͻ� ������ �ι�� %d �Դϴ�." , num);

	system("pause");
	return 0;
}
