#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int num;
	int i;
	int numcal;
	printf(" �������� �˰���� ���ڸ� 1~9 ���̿��� �Է����ֽʽÿ� :");
	scanf("%d" , & num);

	i = 1;

	while ( i < 10)
	{
		numcal = 0;

		numcal = num * i;
		printf(" %d ���ϱ� %d �� %d �Դϴ�. \n" , num , i , numcal);

		i = i + 1;

	}
	system("pause");
	return 0;

}
