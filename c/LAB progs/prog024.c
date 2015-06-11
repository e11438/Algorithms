/*		Arrays (vectors)
 *		
 */ 
#include <stdio.h>
#include <stdlib.h>

#define SIZE 26

int main(){
	// declare and initialize
	double marks1[3] = {50.0, 75.9, 67.5};
	int marks2[] = {10,20,30,40,50,60,70}; 
	int count;
	
	// print marks1
	printf("marks1[0] = %lf \t marks1[1] = %lf \t marks1[2] = %lf\n", marks1[0], marks1[1], marks1[2]);
	
	// print marks2
	for (count = 0; count < sizeof(marks2)/sizeof(marks2[0]); count++)
		printf("marks2[%d] = %d\n", count, marks2[count]);
	
	// Use a constant to define the size
	char characters[SIZE];
	for (count = 0; count < SIZE; count++)
		characters[count] = 'a' + count;
	
	puts(characters);
	
	// Use a variable to define the size (user input)
	int size;
	scanf("%d", &size);
	int numbers[size];

	for (count = 0; count < size; count++)
		printf("array[%d] = %d\n", count, numbers[count]);

	return EXIT_SUCCESS;
}