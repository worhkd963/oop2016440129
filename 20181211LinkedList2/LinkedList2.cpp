//Linked List연습
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
//함수 printLL() 화면에 연결리스트의 score값을 출력
//입력 : 연결리스트 (연결리스트의 헤드노드 포인터)
//출력 : 없음
//부수효과 : 없음
void printLL(LinkedList *pList){
	Node* ptr = pList->pHead;
	while(ptr!=NULL){
		printf("score = %d\n", ptr->score);
		ptr = ptr->pNext;
	}
}

//함수 averageLL()
//입력 : 연결리스트
//출력 : 평균
//부수효과 : 없음
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

//함수 createNode()
//입력 : 성적
//출력 : 노드하나를 동적할당으로 생성하여 포인터를 반환한다. 이 때 score=입력, pNext = NULL로한다.
//부수효과 : 없음
Node* createNode(int input){
	Node* ptr;
	ptr = (Node*)malloc(sizeof(Node));
	ptr->score = input;
	ptr->pNext = NULL;
	return ptr;
}

//함수 addHead()
//입력 : 연결리스트구조체 포인터 (LinkedList*), 새 노드 포인터
//출력 : 없음
//부수효과 : 연결리스트 헤드에 새 노드를 추가
void addHead(LinkedList* pList, Node* pNewNode){
	if(pList->pHead==NULL){
		pList->pTail = pNewNode;
	}
	pNewNode->pNext = pList->pHead; //#1
	pList->pHead = pNewNode; //#2
	pList->nNode++;
}


//함수 returnTail()
//입력 : 연결리스트 (연결리스트의 헤드노드 포인터)
//출력 : 마지막 노드의 포인터
//부수효과 : 없음
Node* returnTail(Node* ptr){
	if(ptr==NULL) //연결리스트에 노드가 없음
		return NULL;

	while(ptr != NULL){
		if(ptr->pNext == NULL)
			return ptr;
		ptr = ptr->pNext;
	}
}
//함수 addTail()
//입력 : 연결리스트, 추가하려는 노드 포인터
//출력 : 없음
//부수효과 : 추가하려는 노드가 연결리스트의 Tail로 추가됨.
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