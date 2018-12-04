#include <stdio.h>
#include <Windows.h>
#include <stdlib.h>

//구조체 선언 : 기존의 데이터 타입으로 구성하여 새로운 데이터 타입을 선언한다.
//struct complex{
//	double real; //멤버 변수(member variable)
//	double imag; //상동(ditto)
//}; //구조체 선언은 반드시 세미콜론으로 끝내야 한다.
//
//typedef struct complex Complex; //자료형 "struct complex"를 앞으로 "Complex"라고 부르겠다.
//
////위의 두 문장을 한 문장으로 할 수 있다.

typedef struct complex{
	double real; //멤버 변수(member variable)
	double imag; //상동(ditto)
}Complex;
//데이터 타입의 별명 선언
typedef int myIntType; //자료형 "int"를 앞으로 "myIntType"라고도 부르겠다.

//함수 printComplex()
//입력 : 복소수
//출력 : 없음
//부수효과 : 없음
void printComplex(Complex *ptr){
	printf("%f + j%f\n", ptr->real, ptr->imag);
}

//함수 conjugate()
//입력 : 복소수(포인터)
//출력 : 없음
//부수효과 : 입력된 복소수가 켤레 복소수로 변환됨
void convertToconjugate(Complex *ptr){
	ptr->imag = -1*ptr->imag;
}

////함수 returnConjugate() Version 1
////입력 : 복소수 포인터
////출력 : 복소수 변수
////부수효과 : 없음
//Complex* returnConjugate(Complex * ptr){
//	Complex temp;
//	temp.real = ptr->real;
//	temp.imag = -1*ptr->imag;
//	return &temp;
//}

//함수 returnConjugate() Version 2 : Good
//입력 : 복소수 포인터
//출력 : 복소수 변수
//부수효과 : 없음
Complex* returnConjugate(Complex * ptr){
	Complex *tempPtr;
	tempPtr = (Complex*) malloc(sizeof(Complex));

	tempPtr->real = ptr->real;
	tempPtr->imag = -1*ptr->imag;
	return tempPtr;
}

Complex* returnPlusComplex(Complex *ptr1, Complex *ptr2){
	Complex * temp1;
	Complex * temp2;
	temp1 = (Complex*) malloc(sizeof(Complex));
	temp2 = (Complex*) malloc(sizeof(Complex));

	temp1->real = ptr1->real;
	temp1->imag = ptr1->imag;

	temp2->real = ptr2->real;
	temp2->imag = ptr2->imag;
}
int main(){	
	myIntType count = 10;// ==> int count = 10;

	//구조체 변수 선언
	Complex a;
	a.real = 10; //구조체변수의 멤버변수 접근방법 ==>구조체변수이름.멤버변수이름
	a.imag = 20;

	printComplex(&a);

	//구조체 포인터 변수 선언
	Complex *ptr;
	ptr = &a;
	ptr->real = 100; //구조체 포인터 변수의 멤버변수 접근방법 ==> 구조체변수이름->멤버변수이름
	ptr->imag = 200;
	//convertToconjugate(&a); 
	ptr = returnConjugate(&a); printComplex(ptr); 
	//printComplex(ptr);

	system("pause");
	return 0;
}