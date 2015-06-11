/*
	Add two numbers (number1, number2) and 
	print the result (sum)

*/
#include <stdio.h>

int main(){

	// int number1, number2, sum;
	int number1;
	int number2;
	int sum; 	

	printf("Enter number1: ");
	scanf("%d", &number1); // number1 = input("Enter number1: ")

	printf("Enter number2: ");
	scanf("%d", &number2);

	sum = number1 + number2;

	printf("The sum of %d and %d is %d\n", number1, number2, sum);

	return 0;
}
