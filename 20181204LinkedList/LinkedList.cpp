//Linked List����
#include <stdio.h>
#include <stdlib.h>
#include <Windows.h>

typedef struct node {
	int score;
	struct node *pNext;
}Node;

//�Լ� printLL() ȭ�鿡 ���Ḯ��Ʈ�� score���� ���
//�Է� : ���Ḯ��Ʈ (���Ḯ��Ʈ�� ����� ������)
//��� : ����
//�μ�ȿ�� : ����
void printLL(Node *pHead){
	while(pHead!=NULL){
		printf("score = %d\n", pHead->score);
		pHead = pHead->pNext;
	}
}

//�Լ� averageLL()
//�Է� : ���Ḯ��Ʈ
//��� : ���
//�μ�ȿ�� : ����
double averageLL(Node * ptr){
	int sum = 0, count = 0;
	double average;
	while(ptr!=NULL){
		sum +=ptr->score;
		count++;
		ptr = ptr->pNext;
	}
	average = (double) sum/count;

	return average;
}

//�Լ� createNode()
//�Է� : ����
//��� : ����ϳ��� �����Ҵ����� �����Ͽ� �����͸� ��ȯ�Ѵ�. �� �� score=�Է�, pNext = NULL���Ѵ�.
//�μ�ȿ�� : ����
Node* createNode(int input){
	Node* ptr;
	ptr = (Node*)malloc(sizeof(Node));
	ptr->score = input;
	ptr->pNext = NULL;
	return ptr;
}

//�Լ� addHead()
//�Է� : ���Ḯ��Ʈ, �� ���
//��� : ����
//�μ�ȿ�� : ���Ḯ��Ʈ ��忡 �� ��带 �߰�
void addHead(Node** pHead, Node* pNewNode){
	pNewNode->pNext = *pHead;
	*pHead = pNewNode;
}


//�Լ� returnTail()
//�Է� : ���Ḯ��Ʈ (���Ḯ��Ʈ�� ����� ������)
//��� : ������ ����� ������
//�μ�ȿ�� : ����
Node* returnTail(Node* ptr){
	if(ptr==NULL) //���Ḯ��Ʈ�� ��尡 ����
		return NULL;

	while(ptr != NULL){
		if(ptr->pNext == NULL)
			return ptr;
		ptr = ptr->pNext;
	}
}
//�Լ� addTail()
//�Է� : ���Ḯ��Ʈ, �߰��Ϸ��� ��� ������
//��� : ����
//�μ�ȿ�� : �߰��Ϸ��� ��尡 ���Ḯ��Ʈ�� Tail�� �߰���.
void addTail(Node* pHead, Node* pNode){
	if(pHead == NULL){
		printf("error \n");
	}
	Node* pTail = returnTail(pHead);
	pTail->pNext = pNode;
}
int main(){	

	//double test;
	//test = 10/4;
	//printf("test = %f\n", test); //1. (10/4)->2�� ��ȯ, 2. ������ 2�� double�� 2.0dmfh qusghks

	//test = 10.0/4;// 1. (10.0/4)->2.5�� ��ȯ
	//printf("test = %f\n", test);

	//test = ((double)10) /4;// 1. ������(int) 10�� �Ǽ���(double) 10.0���� ��ȯ
	//printf("test = %f\n", test);

	Node* pHead=NULL, *ptr; //������� ������, NULL�̸� ���Ḯ��Ʈ�� ���ٴ� �ǹ�(�� �������)
//	Node a,b;
//	a.score = 10; b.score = 20;
//	a.pNext = &b; b.pNext = NULL;
//	pHead = &a;
	pHead = createNode(11);
	ptr = createNode(20);
	addHead(&pHead, ptr);
	addTail(pHead, createNode(100));

	printLL(pHead);
	printf("average = %f\n", averageLL(pHead));

	system("pause");
	return 0;
}