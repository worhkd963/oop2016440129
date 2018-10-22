#include <stdio.h>
#include <Windows.h>
int main(void)
{
	int i = 0;
	int j = 0;
	int count = 0;
	

	for(i =1;i<=100;i++){
		for(j=1;j<=i;j++){
		if(i%j==0)
			count++;
		}
		if(count==2)
			printf("%d\n", i);
		count = 0;
	}
	system("pause");
	return 0;

}