//Linked List연습
#include <stdio.h>
#include <stdlib.h>
#include <Windows.h>

typedef struct node {
	int score;
	struct node *pNext;
}Node;

//함수 printLL() 화면에 연결리스트의 score값을 출력
//입력 : 연결리스트 (연결리스트의 헤드노드 포인터)
//출력 : 없음
//부수효과 : 없음
void printLL(Node *pHead){
	while(pHead!=NULL){
		printf("score = %d\n", pHead->score);
		pHead = pHead->pNext;
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
//입력 : 연결리스트, 새 노드
//출력 : 없음
//부수효과 : 연결리스트 헤드에 새 노드를 추가
void addHead(Node** pHead, Node* pNewNode){
	pNewNode->pNext = *pHead;
	*pHead = pNewNode;
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

	//double test;
	//test = 10/4;
	//printf("test = %f\n", test); //1. (10/4)->2를 반환, 2. 정수형 2를 double형 2.0dmfh qusghks

	//test = 10.0/4;// 1. (10.0/4)->2.5를 반환
	//printf("test = %f\n", test);

	//test = ((double)10) /4;// 1. 정수형(int) 10을 실수형(double) 10.0으로 변환
	//printf("test = %f\n", test);

	Node* pHead=NULL, *ptr; //헤드노드의 포인터, NULL이면 연결리스트가 없다는 의미(로 약속하자)
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