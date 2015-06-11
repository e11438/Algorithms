/* Type conversion (implicit type casting) and type casting (explicit)
 *
 * 
 */

#include <stdio.h>

int main(){
	double celsius, fahrenheit;
	
	printf("Enter the temperature in celsius: ");
	scanf("%lf", &celsius);
	fahrenheit = 9/5*celsius + 32;	// wrong!!
	//fahrenheit = celsius * 9 / 5 + 32; 
	printf("%.2lf degree C is %.2lf degree F\n", celsius,fahrenheit);
	
	return 0;
}
