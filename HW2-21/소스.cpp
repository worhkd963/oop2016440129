#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int a;
	int i, j;
	int count = 0;
	int sum = 0;
	
	printf("���ڸ� �Է��ϼ��� : ");
	scanf("%d", &a);

	for(i =2;i<=a;i++){
		for(j=1;j<=i;j++){
			if(i%j==0)
				count++;
		}
		if(count==2)
			sum = sum +i;
		count = 0;
	}
	printf("�Է¹��� ���� ������ �Ҽ����� ���� %d �Դϴ�.\n", sum);
	system("pause");
	return 0;

}