#include <stdio.h>
#include <Windows.h>
//printArray()
//�Է� : �迭
//��� : ����
//�μ�ȿ�� : ȭ�鿡 �迭�� ���� ���
//void printArray(int arr[], int len){
void printArray(int *arr, int len){ //������ �迭�� �Լ��� ������ ��� �� ������ �ַ� ����Ѵ�.
	for(int index = 0; index < len; index++)
		printf("array[%d] = %d\n", index, arr[index]);
}

//�Լ� : findMinIndex()
//�Է� : �迭(�迭�̸�, �迭����)
//��� : �ּҰ��� �ε���
int findMinIndex(int *arr, int length){
	int minIndex = 0;
	int count;
	for(count = 1; count<length; count++){
		if(arr[minIndex] > arr[count])
			minIndex = count;
	}
	return minIndex;
}

//�Լ� : findeMin()
//�Է� : �迭(�迭�̸�, �迭����)
//��� : �迭 �ּҰ�
int findMin(int *arr, int length){
	int min;
	int count;
	min = arr[0];
	for(count = 1; count < length; count++){
		if(min > arr[count])
			min = arr[count];
	}
	return min;
}

//�Լ� : swapElement()
//�Է� : �迭, �ΰ��� �ε���
//��� : ����
//�μ�ȿ�� : �迭�� �� �ε��� element�� �ٲ��.
void swapElement(int *arr, int i, int j){
	int temp;
	temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
//�Լ� : selectionSort()
//�Է� : �迭
//��� : ����
//�μ�ȿ�� : �迭�� ���ĵ�
void selectionSort(int *arr, int length){
	
	
}
int main(){	
	int a[] = {30, 35, 27, 15, 40}; 

	printf("minimum value of the array is %d\n", findMin(a,5));
	printf("The index of the minimum value is %d\n", findMinIndex(a,5));
	swapElement(a, 0, 3);
	printArray(a, 5);
	
	selectionSort(a, 5);
	printArray(a, 5);
	//a = ptr; //error Why? �迭�� �̸�(a)�� ���� ������ �ִ�. �� rvalue�̴�.
	//10 = a[2]; //���� ���� ����

	//printArray(a, 3);
	system("pause");
	return 0;
}