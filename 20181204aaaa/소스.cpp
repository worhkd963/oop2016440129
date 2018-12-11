# include <stdio.h>
# include<stdlib.h>
#include <Windows.h>
//���α׷��� ����� ���
//1. ��ǻ�� ��� ����(�޸� ����, ����, ��������)
//2. ���ȭ (������ ���ȭ: �Լ�, ������ ���ȭ: ����ü)


////����ü ����: ������ ������ Ÿ������ �����Ͽ� ���ο� ������ Ÿ���� �����Ѵ�.
//   struct complex{
//      double real; //��� ����(member variable)
//      double imag; //��(ditto)
//   }; //����ü ������ �ݵ�� �����ݷ����� ������ �Ѵ�.
//   
//   typedef struct complex Complex;// �ڷ��� "struct complex"�� ������ "Complex"��� �θ��ڴ�.

   typedef struct complex{
      double real; 
      double imag; 
   } Complex;


   //������ Ÿ���� ���� ����
   typedef int myIntType;//�ڷ��� "int"�� "myIntType"��� �θ��ڴ�.

   //�Լ� : printComplex()
   //�Է� : ���Ҽ�
   //��� : ����
   //�μ�ȿ��: ����

   void printComplex(Complex* ptr) { //��κ��� ���, ����ü �����͸� �Ű������� ���� �޴´�.
      printf("%f+ j%f\n", ptr->real, ptr->imag);
   }
   
   //�Լ� convertToConjugate()
   //�Է�: ���Ҽ� (������)
   //���: ����
   //�μ�ȿ��: �Էµ� ���Ҽ��� �ӷ� ���Ҽ��� ��ȯ��
   void convertToConjugate(Complex* ptr) {
   //����ο� -1�� ���Ѵ�.
      ptr -> imag = -1 * ptr->imag;
   }
   ////�Լ� returnConjugate() Version 1 : bad
   ////�Է� : ���Ҽ� ������
   ////��� : ���Ҽ� ����
   ////�μ�ȿ�� : ����
   //Complex* returnConjugate(complex* ptr) {
   //   Complex temp;
   //   temp.real = ptr->real; temp.imag = -1 * ptr->imag;
   //   return &temp;
   //}

   //�Լ� returnConjugate() Version 2 : good
   //�Է� : ���Ҽ� ������
   //��� : ���Ҽ� ����
   //�μ�ȿ�� : ����
   Complex* returnConjugate(complex* ptr) {
      Complex* tempPtr;
      tempPtr = (Complex*) malloc(sizeof(Complex));//�����Ҵ�
      tempPtr->real = ptr->real; tempPtr ->imag = -1 * ptr->imag;
      return tempPtr;
   }

   //malloc(), free() : �����Ҵ�
   //�Լ� addComplex
   //�Է� : ���Ҽ� ������
   //���
   //�μ�ȿ��x

   Complex* addComplex(complex* ptr) {
      Complex* tempPtr;
      tempPtr = (Complex*) malloc(sizeof(Complex));//�����Ҵ�
      tempPtr->real = ptr->real; tempPtr ->imag = -1 * ptr->imag;
      return tempPtr;
   }


   int main() {
      myIntType count = 10;// ==> int count = 10;
      Complex a,b;

        Complex* ptr;
     a.real = 10; //����ü������ ������� ���ٹ�� ==> ����ü�����̸�.��������̸�
     a.imag = 20;

     printf("%f + j%f\n", a.real, a.imag);
     printComplex(&a);

     //����ü ������ ���� ����
     //��κ� ����ü�� ������ ������ ����Ͽ� �����Ѵ�.

   
     ptr = &a;
     ptr->real = 100;// ����ü ������ ������ ������� ���ٹ�� ==> ����ü�����̸�-->��������̸�
     ptr->imag = 200;
     printComplex(ptr);
     ptr = returnConjugate(&a); printComplex(ptr);
     //convertToConjugate(&a);   printComplex(&a); 
     
	 system("pause");
     return 0;

   }