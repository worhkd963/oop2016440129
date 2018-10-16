#include <stdio.h>
#include <Windows.h>
int main(){
	char s[10];
	printf("choose one of the following\n");
	printf("apple\n");
	printf("orange\n");
	printf("banana\n");
	printf("peach\n");
	printf("\n");

	printf("enter your choice here : ");
	scanf("%s", s);

	printf("Your choice is \"%s\"", s);
	system("pause");
	return 0;
}