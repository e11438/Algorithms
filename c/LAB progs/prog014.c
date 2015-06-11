/* 	Compound Assignment Operators 
 * 					& 
 * 
 * 	Increment/Decrement Operators
 */

#include <stdio.h>

int main(){
	
	int num1;
	
	num1 = 10;
	num1 *= 10;  // change the operator and show
	printf("num1 = %d\n", num1);
	
	int count = 0;	

	printf("counter = %d\n", count++);
	printf("counter = %d\n", ++count);
	
	int count2, count3;
	
	count2 = count++;
	count3 = ++count;
	
	printf("count2 = %d \t count3 = %d \n", count2, count3);
	
	return 0;
}
