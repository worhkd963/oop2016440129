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
		printf("숫자를 입력하세요 : ");
		scanf("%d", &b);

		if(b>a)
			printf("입력하신 숫자보다 작습니다. \n");
		else if(b<a)
			printf("입력하신 숫자보다 큽니다. \n");
		else{
			printf("정답입니다. \n");
			break;
		}
		i++;
	}

	if(i==10){
		printf("그것도 못 맞추다니 멍청하군요?. \n");
		printf("=====Game Over=====\n");
	}
	system("pause");
	return 0;

}