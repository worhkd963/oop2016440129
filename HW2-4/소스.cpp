#include <stdio.h>
#include <Windows.h>
int main(){
	int i= 0;
	int sum = 0;
	for(i = 1; i<101; i++){
		if(i%3==0)
			sum = sum + i;
	}
	printf("3�� ������� �� ���� : %d\n", sum);
	system("pause");
	return 0;
}