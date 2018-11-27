#include <stdio.h>
#include <Windows.h>

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

//�Լ� returnConjugate()
//�Է� : ���Ҽ� ������
//��� : ���Ҽ� ����
//�μ�ȿ�� : ����
Complex* returnConjugate(Complex * ptr){
	Complex *temp=(Complex*)malloc(sizeof(Complex));
	temp->real = ptr->real;
	temp->imag = -1*ptr->imag;
	return temp;
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