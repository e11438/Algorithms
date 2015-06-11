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

typedef struct idxVal_{
	int index;
	int value;
}idxVal;

idxVal findMax(int numbers[]);
idxVal findMin(int numbers[]);
double findAvg(int numbers[]);

int main(){
	int nos[SIZE] = {5,3,7,4,2,8,6,9,1,0}, count;

	fputs("Array elements: ", stdout);
	
	for(count = 0; count < SIZE; count++)
		printf("%d ", nos[count]);
	puts(""); // newline
	
	printf("Largest --> nos[%d] = %d\n", findMax(nos).index, findMax(nos).value);
	printf("Smalest --> nos[%d] = %d\n", findMin(nos).index, findMin(nos).value);
	printf("The average  number in the array is %.2lf\n", findAvg(nos));
	
	return 0;
}

idxVal findMax(int numbers[]){
	int count, max = 0, idx = 0;
	for (count = 0; count < SIZE; count++){
		if (max < numbers[count]){
			max = numbers[count];
			idx = count;
		}
	}
	idxVal result = {idx, max};
	return result;
}

idxVal findMin(int numbers[]){
	int count, min = INT_MAX, idx = 0;
	for (count = 0; count < SIZE; count++){
		if (min > numbers[count]){
			min = numbers[count];
			idx = count;
		}
	}
	idxVal result = {idx, min};
	return result;
}

double findAvg(int numbers[]){
	int count, total = 0;
	for (count = 0; count < SIZE; count++){
		total += numbers[count];
	}
	return (double)total/SIZE; 
}
