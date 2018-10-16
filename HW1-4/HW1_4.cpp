#include <stdio.h>
#include <Windows.h>
int main(){
	int score;
	while(1){
		printf("점수 입력 : ");
		scanf("%d", &score);
		if(score>100 || score<0){
			printf("점수를 다시 입력하세요\n");
			continue;
		}
			
		break;
	}
	
	
	

	if(score<=100 && score>=80)
		printf("A등급입니다.\n");
	else if(score<=79 && score>=60)
		printf("B등급입니다.\n");
	else if(score<=59 && score>=40)
		printf("C등급입니다.\n");
	else if(score<=39 && score>=20)
		printf("D등급입니다.\n");
	else if(score<=19 && score>=0)
		printf("E등급입니다.\n");
	system("pause");
	return 0;
}