#include <stdio.h>
#include <Windows.h>
int main(){
	int i= 1;
	int sum = 0;
	do{
		if(i%3==0)
			sum = sum + i;
		i++;
	}while(i<101);
	printf("3의 공배수의 총 합은 : %d\n", sum);
	system("pause");
	return 0;
}