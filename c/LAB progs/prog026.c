/* functions
 * 
 * 		returnValueType functionName (parameterList){
 *			functionBody;
 * 			...
 * 			return expression;
 * 		}
 */

#include <stdio.h>
#include <limits.h>

#define SIZE 10

int findMax(int numbers[]);
int findMin(int numbers[]);
double findAvg(int numbers[]);

int main(){
	int nos[SIZE] = {5,3,7,4,2,8,6,9,1,0}, count;

	fputs("Array elements: ", stdout);
	
	for(count = 0; count < SIZE; count++)
		printf("%d ", nos[count]);
	puts(""); // newline
	
	printf("The largest  number in the array is %d\n", findMax(nos));
	printf("The smallest number in the array is %d\n", findMin(nos));
	printf("The average  number in the array is %.2lf\n", findAvg(nos));
	
	return 0;
}

int findMax(int numbers[]){
	int count, max = 0;
	for (count = 0; count < SIZE; count++){
		if (max < numbers[count]){
			max = numbers[count];
		}
	}
	return max;
}

int findMin(int numbers[]){
	int count, min = INT_MAX;
	for (count = 0; count < SIZE; count++){
		if (min > numbers[count]){
			min = numbers[count];
		}
	}
	return min;
}

double findAvg(int numbers[]){
	int count, total = 0;
	for (count = 0; count < SIZE; count++){
		total += numbers[count];
	}
	return (double)total/SIZE; 
}
