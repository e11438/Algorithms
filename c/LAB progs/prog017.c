/*	for-loop: example
 * 
 * Get a number (upper bound) from the user. Sum the integers from
 * 1 to the given upper bound and compute the average 
 */
#include <stdio.h>

int main(){
	
	int upperBound, sum = 0;
	double average;
	
	printf("Enter the upper bound: ");
	scanf("%d",&upperBound);
	
	int count;
	for (count = 1; count <= upperBound; count++){
		sum += count;
	}
//	average = sum / upperBound;	// wrong
	average = (double) sum / upperBound;
	printf("ALL: sum is %d and average is %.2lf\n", sum, average);
	
	// sum and avg of odd numbers
	sum = 0;
	for (count = 1; count <= upperBound; count+=2)
		sum += count;
	average = (double) sum / upperBound;
	printf("ODD: sum is %d and average is %.2lf\n", sum, average);
	
	// sum and avg of even numbers
	sum = 0;
	for (count = 2; count <= upperBound; count+=2)
		sum += count;
	average = (double) sum / upperBound;
	printf("EVEN: sum is %d and average is %.2lf\n", sum, average);
	
	return 0;
}
