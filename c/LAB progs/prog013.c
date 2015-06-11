/* Overflow and Underflow
 * 
 * an example with short int type
 * 
 */
#include <stdio.h>

int main(){
	
	short sint1 = 32767;
	short sint2 = -32768;
	
	printf("sint1 = %hd\n", sint1);
	printf("sint2 = %hd\n", sint2);	
	
	printf("sint1 = %hd\n", sint1+1); // overflow
	printf("sint2 = %hd\n", sint2-1); // underflow
	
	return 0;
}
