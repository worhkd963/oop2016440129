#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int a;
	int i = 0;
	int count = 0;
	
	printf("���ڸ� �Է��ϼ��� : ");
	scanf("%d", &a);

	for(i =1;i<=a;i++){
		if(a%i==0)
			count++;
	}
	if(count==2)
		printf("�Ҽ��Դϴ�.");
	else
		printf("�Ҽ��� �ƴմϴ�.");
	system("pause");
	return 0;

}