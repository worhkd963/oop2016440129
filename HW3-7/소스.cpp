// 7. 정수 배열의 합을 반환하는 함수

#include <stdio.h>
#include <Windows.h>

//함수이름 addArray()
//입력 : 배열
//출력 : 배열 각 요소들의 합
//부수효과 : 없음

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