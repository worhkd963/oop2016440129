#include <stdio.h>
#include <Windows.h>
void test(int a){
	a = 100;
}

void testPointer(int *ptr){
	*ptr = 100;
}
int main(){	
	int a = 10;
	test(a);
	printf("a = %d\n", *&a);

	//�����͸� �Ű����������� ����
	testPointer(&a);
	printf("a = %d\n", a);
	system("pause");
	return 0;
}