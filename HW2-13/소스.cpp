
#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int month, day;

	printf("month�� �Է��ϼ��� : ");
	scanf("%d", &month);
	printf("month�� �Է��ϼ��� : ");
	scanf("%d", &day);

	printf("%d�� %d�� ", month, day);

	switch(month) {
		case 1: 
			printf("%d", day);
			break;
		case 2:
			printf("%d", 31+day);
			break;
		case 3:
			printf("%d",31+28+day);
			break;
		case 4:
			printf("%d",31+28+31+day);
			break;
		case 5:
			printf("%d",31+28+31+30+day);
			break;
		case 6:
			printf("%d",31+28+31+30+31+day);
			break;
		case 7:
			printf("%d",31+28+31+30+31+30+day);
			break;
		case 8:
			printf("%d",31+28+31+30+31+30+31+day);
			break;
		case 9:
			printf("%d",31+28+31+30+31+30+31+31+day);
			break;
		case 10:
			printf("%d",31+28+31+30+31+30+31+31+30+day);
			break;
		case 11:
			printf("%d",31+28+31+30+31+30+31+31+30+31+day);
			break;
		case 12:
			printf("%d",31+28+31+30+31+30+31+31+30+31+30+day);
			break;
		default :
			printf("�߸� �Է��ϼ̽��ϴ�.");
	}
	system("pause");
	return 0;

}