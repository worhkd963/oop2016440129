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
int main(){	
	Node* pHead=NULL, *ptr; //������� ������, NULL�̸� ���Ḯ��Ʈ�� ���ٴ� �ǹ�(�� �������)
//	Node a,b;
//	a.score = 10; b.score = 20;
//	a.pNext = &b; b.pNext = NULL;
//	pHead = &a;
	pHead = createNode(10);
	ptr = createNode(20);
	addHead(&pHead, ptr);
	printLL(pHead);

	system("pause");
	return 0;
}