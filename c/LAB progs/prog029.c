/* functions: pass-by-value and pass-by-reference 
 * 
 * In pass-by-value, a  copy  of  the value is passed
 * to the function. By default, the  scalar variables
 * in C are passed by value.
 * 
 * In pass-by-reference, a reference (address) of the 
 * callers variable is  passed  to  the  function. By
 * default, the arrays are  passed by reference in C.
 */
#include <stdio.h>

int incScalar(int);
void incArray(int [], int size);
void printArray(int [], int size);

int main(){
	int number = 1, numArray[] = {1,2,3,4}, size;
	
	printf("number before incScalar func. call %d\n", number);
	incScalar(number);
	printf("number after  incScalar func. call %d\n", number);

	size = sizeof(numArray)/sizeof(numArray[0]);
	printArray(numArray, size);
	incArray(numArray, size);
	printArray(numArray, size);
	
	return 0;
}

int incScalar(int n){
	n++;
	printf("n inside the incScalar func. %d\n", n);
	return n;
}

void incArray(int nA[], int size){
	int count;
	for(count=0; count < size;count++)
		nA[count]++;
	printArray(nA,size);
	return;
}

void printArray(int nA[], int size){
	int count;
	for(count=0; count < size;count++)
		printf("nA[%d] = %d\t",	count, nA[count]);
	puts("");
	return;
	
}
