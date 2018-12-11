# include <stdio.h>
# include<stdlib.h>
#include <Windows.h>
//프로그래밍 언어의 기능
//1. 컴퓨터 기능 지원(메모리 접근, 연산, 순서제어)
//2. 요약화 (절차적 요약화: 함수, 선언적 요약화: 구조체)


////구조체 선언: 기존의 데이터 타입으로 구성하여 새로운 데이터 타입을 선언한다.
//   struct complex{
//      double real; //멤버 변수(member variable)
//      double imag; //상동(ditto)
//   }; //구조체 선언은 반드시 세미콜론으로 끝내야 한다.
//   
//   typedef struct complex Complex;// 자료형 "struct complex"를 앞으로 "Complex"라고 부르겠다.

   typedef struct complex{
      double real; 
      double imag; 
   } Complex;


   //데이터 타입의 별명 선언
   typedef int myIntType;//자료형 "int"를 "myIntType"라고도 부르겠다.

   //함수 : printComplex()
   //입력 : 복소수
   //출력 : 없음
   //부수효과: 없음

   void printComplex(Complex* ptr) { //대부분의 경우, 구조체 포인터를 매개변수로 전달 받는다.
      printf("%f+ j%f\n", ptr->real, ptr->imag);
   }
   
   //함수 convertToConjugate()
   //입력: 복소수 (포인터)
   //출력: 없음
   //부수효과: 입력된 복소수가 켤례 복소수로 변환됨
   void convertToConjugate(Complex* ptr) {
   //허수부에 -1을 곱한다.
      ptr -> imag = -1 * ptr->imag;
   }
   ////함수 returnConjugate() Version 1 : bad
   ////입력 : 복소수 포인터
   ////출력 : 복소수 변수
   ////부수효과 : 없음
   //Complex* returnConjugate(complex* ptr) {
   //   Complex temp;
   //   temp.real = ptr->real; temp.imag = -1 * ptr->imag;
   //   return &temp;
   //}

   //함수 returnConjugate() Version 2 : good
   //입력 : 복소수 포인터
   //출력 : 복소수 변수
   //부수효과 : 없음
   Complex* returnConjugate(complex* ptr) {
      Complex* tempPtr;
      tempPtr = (Complex*) malloc(sizeof(Complex));//동적할당
      tempPtr->real = ptr->real; tempPtr ->imag = -1 * ptr->imag;
      return tempPtr;
   }

   //malloc(), free() : 동적할당
   //함수 addComplex
   //입력 : 복소수 포인터
   //출력
   //부수효과x

   Complex* addComplex(complex* ptr) {
      Complex* tempPtr;
      tempPtr = (Complex*) malloc(sizeof(Complex));//동적할당
      tempPtr->real = ptr->real; tempPtr ->imag = -1 * ptr->imag;
      return tempPtr;
   }


   int main() {
      myIntType count = 10;// ==> int count = 10;
      Complex a,b;

        Complex* ptr;
     a.real = 10; //구조체변수의 멤버변수 접근방법 ==> 구조체변수이름.멤버변수이름
     a.imag = 20;

     printf("%f + j%f\n", a.real, a.imag);
     printComplex(&a);

     //구조체 포인터 변수 선언
     //대부분 구조체는 포인터 변수를 사용하여 접근한다.

   
     ptr = &a;
     ptr->real = 100;// 구조체 포인터 변수의 멤버변수 접근방법 ==> 구조체변수이름-->멤버변수이름
     ptr->imag = 200;
     printComplex(ptr);
     ptr = returnConjugate(&a); printComplex(ptr);
     //convertToConjugate(&a);   printComplex(&a); 
     
	 system("pause");
     return 0;

   }