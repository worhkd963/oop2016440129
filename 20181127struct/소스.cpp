#include <stdio.h>
#include <Windows.h>
#include <stdlib.h>

//����ü ���� : ������ ������ Ÿ������ �����Ͽ� ���ο� ������ Ÿ���� �����Ѵ�.
//struct complex{
//	double real; //��� ����(member variable)
//	double imag; //��(ditto)
//}; //����ü ������ �ݵ�� �����ݷ����� ������ �Ѵ�.
//
//typedef struct complex Complex; //�ڷ��� "struct complex"�� ������ "Complex"��� �θ��ڴ�.
//
////���� �� ������ �� �������� �� �� �ִ�.

typedef struct complex{
	double real; //��� ����(member variable)
	double imag; //��(ditto)
}Complex;
//������ Ÿ���� ���� ����
typedef int myIntType; //�ڷ��� "int"�� ������ "myIntType"��� �θ��ڴ�.

//�Լ� printComplex()
//�Է� : ���Ҽ�
//��� : ����
//�μ�ȿ�� : ����
void printComplex(Complex *ptr){
	printf("%f + j%f\n", ptr->real, ptr->imag);
}

//�Լ� conjugate()
//�Է� : ���Ҽ�(������)
//��� : ����
//�μ�ȿ�� : �Էµ� ���Ҽ��� �ӷ� ���Ҽ��� ��ȯ��
void convertToconjugate(Complex *ptr){
	ptr->imag = -1*ptr->imag;
}

////�Լ� returnConjugate() Version 1
////�Է� : ���Ҽ� ������
////��� : ���Ҽ� ����
////�μ�ȿ�� : ����
//Complex* returnConjugate(Complex * ptr){
//	Complex temp;
//	temp.real = ptr->real;
//	temp.imag = -1*ptr->imag;
//	return &temp;
//}

//�Լ� returnConjugate() Version 2 : Good
//�Է� : ���Ҽ� ������
//��� : ���Ҽ� ����
//�μ�ȿ�� : ����
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

	//����ü ���� ����
	Complex a;
	a.real = 10; //����ü������ ������� ���ٹ�� ==>����ü�����̸�.��������̸�
	a.imag = 20;

	printComplex(&a);

	//����ü ������ ���� ����
	Complex *ptr;
	ptr = &a;
	ptr->real = 100; //����ü ������ ������ ������� ���ٹ�� ==> ����ü�����̸�->��������̸�
	ptr->imag = 200;
	//convertToconjugate(&a); 
	ptr = returnConjugate(&a); printComplex(ptr); 
	//printComplex(ptr);

	system("pause");
	return 0;
}