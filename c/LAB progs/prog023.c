/* arrays (or vectors) */

#include <stdio.h>

int main(){
	int mark, count; // scalar and you can store 1 integer
	int marks[10]; // array that can store 10 integers
	
	marks[0] = 10; // assign 10 to first element
	marks[9] = 50; // assign 50 to last element
	marks[5] = 25; // assign 25 to the 6th element
	marks[1] = marks[0] + marks[5];
	
	for (count = 0; count < 10; count++){
		printf("marks[%d] = %d \n", count, marks[count]);
	}
	
	//printf("%d %d %d %d\n", marks[0], marks[1], marks[5], marks[9]);
	
	
	return 0;
}









