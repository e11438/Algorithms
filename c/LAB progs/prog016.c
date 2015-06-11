/* Loops in C
 * 
 * (1) for loop with pre- and post- increments
 * (2) equivalent while loops for the for loop
 * (3) do-while loop and its equivalent while loop
 */

#include <stdio.h>

int main(){
	
	int count;
	
	/* * * * * * * * * * * * * * * * * * * * */
	/*    equivalent for and while loops     */
	for(count = 1; count <= 10; count++){
		printf("count = %d \n", count);
	}
	
	count = 1;
	while (count <= 10){
		printf("count = %d \n", count);
		count++;
	}
	/* * * * * * * * * * * * * * * * * * * * */
	
	/* * * * * * * * * * * * * * * * * * * * */
	/*    equivalent for and while loops     */
	for(count = 1; count <= 10; ++count){
		printf("count = %d \n", count);
	}
	
	count = 1;
	while (count <= 10){
		printf("count = %d \n", count);
		++count;
	}
	/* * * * * * * * * * * * * * * * * * * * */
	
	/* * * * * * * * * * * * * * * * * * * * */
	/* do-while and equivalent while loops   */
	count = 1;
	do{
		printf("count = %d \n", count);		
		count++;
	}while(count <= 10);
	
	count = 1;
	printf("count = %d \n", count);
	count++;
	while(count <= 10){
		printf("count = %d \n", count);
		count++;		
	}
	
	/* * * * * * * * * * * * * * * * * * * * */
	
	return 0;
}
