#include <stdio.h>
#include <Windows.h>

void swapElement(int *arr, int i, int j){
	int temp;
	temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}

//void insertElement(int *arr, int ele){
//	while(ele>0){
//		if(arr[ele-1]>arr[ele])
//			swapElement(arr, ele-1,ele);
//		else
//			break;
//		ele--;
//	}
//}
void insertElement(int *arr, int ele){
	int i = ele-1;
	int remember = arr[ele];
	while(i>=0 && arr[i]>remember){
		swapElement(arr, i+1, i);
//		arr[i+1]=arr[i];
//		arr[i]=remember;
		i--;
	}
}

void insertionSort(int *arr, int length){
	int i;
	for(i=1; i<length; i++){
		insertElement(arr, i);
	}
}
int main(){	
	int arr[] = {3,1,4,14,73,53,12,8,37};

	insertionSort(arr, sizeof(arr)/sizeof(int));

	for(int i = 0; i<sizeof(arr)/sizeof(int); i++){
		printf("%d ", arr[i]);
	}
	system("pause");
	return 0;
}