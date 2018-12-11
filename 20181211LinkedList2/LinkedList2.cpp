//Linked List����
#include <stdio.h>
#include <stdlib.h>
#include <Windows.h>

typedef struct node {
	int score;
	struct node *pNext;
}Node;

typedef struct linkedlist{
	Node *pHead;
	Node *pTail;
	int nNode;
}LinkedList;
//�Լ� printLL() ȭ�鿡 ���Ḯ��Ʈ�� score���� ���
//�Է� : ���Ḯ��Ʈ (���Ḯ��Ʈ�� ����� ������)
//��� : ����
//�μ�ȿ�� : ����
void printLL(LinkedList *pList){
	Node* ptr = pList->pHead;
	while(ptr!=NULL){
		printf("score = %d\n", ptr->score);
		ptr = ptr->pNext;
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
//�Է� : ���Ḯ��Ʈ����ü ������ (LinkedList*), �� ��� ������
//��� : ����
//�μ�ȿ�� : ���Ḯ��Ʈ ��忡 �� ��带 �߰�
void addHead(LinkedList* pList, Node* pNewNode){
	if(pList->pHead==NULL){
		pList->pTail = pNewNode;
	}
	pNewNode->pNext = pList->pHead; //#1
	pList->pHead = pNewNode; //#2
	pList->nNode++;
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
	LinkedList* pList;
	pList = (LinkedList*)malloc(sizeof(LinkedList));
	pList->pHead = pList->pTail = NULL; pList->nNode=0;

	addHead(pList, createNode(10));
	addHead(pList, createNode(20));
	addHead(pList, createNode(30));
	addHead(pList, createNode(40));
	
	printLL(pList);

	printf("tail : %d\n", pList->pTail->score);
	

	system("pause");
	return 0;
}