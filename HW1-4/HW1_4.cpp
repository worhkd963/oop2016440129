#include <stdio.h>
#include <Windows.h>
int main(){
	int score;
	while(1){
		printf("���� �Է� : ");
		scanf("%d", &score);
		if(score>100 || score<0){
			printf("������ �ٽ� �Է��ϼ���\n");
			continue;
		}
			
		break;
	}
	
	
	

	if(score<=100 && score>=80)
		printf("A����Դϴ�.\n");
	else if(score<=79 && score>=60)
		printf("B����Դϴ�.\n");
	else if(score<=59 && score>=40)
		printf("C����Դϴ�.\n");
	else if(score<=39 && score>=20)
		printf("D����Դϴ�.\n");
	else if(score<=19 && score>=0)
		printf("E����Դϴ�.\n");
	system("pause");
	return 0;
}