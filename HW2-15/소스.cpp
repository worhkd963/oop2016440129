#include <stdio.h>
#include <Windows.h>
#include <time.h>
#include < stdlib.h>
int main(void)
{
	int a;
	int b;
	int i=0;

	a = (rand()%100)+1;
	while(i<10){
		printf("���ڸ� �Է��ϼ��� : ");
		scanf("%d", &b);

		if(b>a)
			printf("�Է��Ͻ� ���ں��� �۽��ϴ�. \n");
		else if(b<a)
			printf("�Է��Ͻ� ���ں��� Ů�ϴ�. \n");
		else{
			printf("�����Դϴ�. \n");
			break;
		}
		i++;
	}

	if(i==10){
		printf("�װ͵� �� ���ߴٴ� ��û�ϱ���?. \n");
		printf("=====Game Over=====\n");
	}
	system("pause");
	return 0;

}