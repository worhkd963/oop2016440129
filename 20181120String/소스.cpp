#include <stdio.h>
#include <Windows.h>
#include <string.h>
//printArray()
//�Է� : �迭
//��� : ����
//�μ�ȿ�� : ȭ�鿡 �迭�� ���� ���
//void printArray(int arr[], int len){
void printArray(char *arr, int len){ //������ �迭�� �Լ��� ������ ��� �� ������ �ַ� ����Ѵ�.
	for(int index = 0; index < len; index++)
		printf("array[%d] = %c\n", index, arr[index]);
}
int main(){	
	char c;
	c = 'A';
	printf("c = %d\n", c);
	printf("c = %c\n", c);

	char a[] = {'h', 'e', 'l', 'l', 'o'};
	printArray(a, 5);

	//���ڿ�(STRING)
	char b[] = "hello"; //==> char b[] = {'h', 'e', 'l', 'l', 'o', '\0'};
	printf("%s \n", b);

	printf("the length of the string is %d \n", strlen(b));


	char str1[50] = "hello";
	char *str2 = " world";

	strcat(str1, str2);
	printf("%s \n", str1);

	strcpy(str1, str2);
	printf("%s \n", str1);
	system("pause");
	return 0;
}