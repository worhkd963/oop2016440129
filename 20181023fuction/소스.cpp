#include <stdio.h>
#include <Windows.h>

int gVar = 100; // ��������(global variable)
//�Լ� sum()
//�Է� : �� ����
//��� : �� ������ ��
//�μ�ȿ�� : ����


//�Լ� ȣ���ϱ����� �ʿ��� ����
//1. �Լ��̸� ����
//2. �Ű������� ����
//3. �� �Ű������� �ڷ���
//4. ��ȯ���� �ڷ���


int sum(int a, int b){ // �Լ� ����
	static int c;	   // �Լ� ��ü
	c = a + b; a=100;
	return c;
}

// �Լ� : goodPrint()
// �Է� : ����
// ��� : ����
// �μ�ȿ�� : ȭ�鿡 good ���

void goodPrint(){
	printf("good\n");
}
int main(){	
	int x = 10, y =20, z;
	z = sum(x, y);
	printf("z = %d, x = %d\n", z, x);

	goodPrint();

	system("pause");
	return 0;
}