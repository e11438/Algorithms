/*
	Add two (double precision) floating point numbers
	(number1, number2) and print the result (sum)

*/
#include <stdio.h>

int main(){

	// floating point number1, number2, sum;
	double number1;
	double number2;
	double sum; 	

	printf("Enter number1: ");
	scanf("%lf", &number1); // number1 = input("Enter number1: ")

	printf("Enter number2: ");
	scanf("%lf", &number2);

	sum = number1 + number2;

	printf("The sum of %lf and %lf is %lf\n", number1, number2, sum);

	return 0;
}
