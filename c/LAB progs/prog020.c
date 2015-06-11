/*	do-while-loop: example (using break)
 * 
 * Prompt user for positive integers and display the count, max, min
 * and average. Terminate when user enters -1.
 */

#include <stdio.h>
#include <limits.h>

#define TRUE 1

int main(){
	
	int number, max = 0, min = INT_MAX, count = 0, sum = 0;
	
	//printf("Enter a positive integer or -1 to exit: ");
	//scanf("%d", &number);
	
	while(TRUE){ //(number != -1){

		printf("Enter a positive integer or -1 to exit: ");
		scanf("%d", &number);
	
		if (number == -1) break;

		count++;
		sum += number;
		
		if (number > max) max = number;
		if (number < min) min = number;
		
		//printf("Enter a positive integer or -1 to exit: ");
		//scanf("%d", &number);
	}
	
	if (count){
		printf("Number entered  : %d\n", count);
		printf("The sum         : %d\n", sum);
		printf("The average     : %.2lf\n", (double)sum/count); 
		printf("The maximum     : %d\n", max);
		printf("The minimum     : %d\n", min);
	}
	return 0;
}
