#include <stdio.h>
#include <Windows.h>

//�Լ� printArray()
//�Է� : �迭
//��� : ����
//�μ�ȿ�� : ȭ�鿡 ��� ��Ҹ� ���

void printArray(int arr[], int length){ //(�迭�̸�[], �迭����)
	int count = 0;
	while(count < length){
		printf("a[%d] = %d\n", count, arr[count]);
		count++;
	}
}
int main(){
	int len = 4;
	//�迭 ����
	//1. �迭�� �̸� : a
	//2. ����� �ڷ��� : int
	//3. �迭�� ���� : 4
	//int a[4]; // �迭����

	//a[0] = 20;
	//a[1] = 200;
	//a[2] = 2000;
	//a[3] = 20000;

	int a[4] = {2, 20, 200, 2000}; // �迭 �ʱ�ȭ ���

	int arr[] = {3, 30, 300};//���� 3�� �迭 ����

	printArray(a,len); // �迭�� �Ű������� (�迭�� �̸� a, �迭�� ���� len)
	/*int count = 0;

	while(count < len){
		printf("a[%d] = %d\n", count, a[count]);
		count++;
	}*/

	//�迭�� �Ű������� �Լ��� ������ ���

	system("pause");
	return 0;
}