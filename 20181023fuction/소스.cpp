#include <stdio.h>
#include <Windows.h>

int gVar = 100; // 전역변수(global variable)
//함수 sum()
//입력 : 두 정수
//출력 : 두 정수의 합
//부수효과 : 없음


//함수 호출하기위해 필요한 정보
//1. 함수이름 선언
//2. 매개변수의 갯수
//3. 각 매개변수의 자료형
//4. 반환값의 자료형


int sum(int a, int b){ // 함수 선언
	static int c;	   // 함수 본체
	c = a + b; a=100;
	return c;
}

// 함수 : goodPrint()
// 입력 : 없음
// 출력 : 없음
// 부수효과 : 화면에 good 출력

void goodPrint(){
	printf("good\n");
}
int main(){	
	int x = 10, y =20, z;
	z = sum(x, y);
	printf("z = %d, x = %d\n", z, x);

	goodPrint();

	system("pause");
	return 0;
}