#include <stdio.h>
#include <Windows.h>

int main(){	
	int a= 10; // ���� ���� + ���� �ʱ�ȭ
	int *ptr; // �����ͺ��� ����
	ptr = &a; // &a --> "address of" a, ���� a�� �ּ�(���� a�� ���� �Ҵ��� �޸��� ù ��° �ּ�)
	*ptr = 20; // *ptr --> "data of" ptr, �����ͺ��� ptr�� ����Ű�� ���� ������
	printf("a = %d\n", a);
	system("pause");
	return 0;
}