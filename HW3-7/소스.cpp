// 7. ���� �迭�� ���� ��ȯ�ϴ� �Լ�

#include <stdio.h>
#include <Windows.h>

//�Լ��̸� addArray()
//�Է� : �迭
//��� : �迭 �� ��ҵ��� ��
//�μ�ȿ�� : ����

int addArray(int arr[], int length){
	int sum = 0, count = 0;
	for(count = 0; count < length; count++){
		sum = sum + arr[count];
	}
	return sum;
}

int main(){	
	int len= 4;
	int a[4] = {10, 20, 30, 40};

	printf("sum = %d\n", addArray(a, len));


	system("pause");
	return 0;
}