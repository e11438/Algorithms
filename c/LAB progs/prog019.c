/* /*	break and continue in a loop
 * 
 */
 
#include <stdio.h>
#include <stdlib.h>

int main(){
	int input;
	
	while(1){
		printf("Do you want to continue (YES = 1, No = 0): ");
		//puts("Do you want to continue (YES = 1, No = 0): ");
		//fputs("Do you want to continue (YES = 1, No = 0): ",stdout);
		scanf("%d", &input);	
		if(input){
			continue;
		}else{
			break;
		}
		
		printf("this won't be printed - hope you know why...");
		
	}
	
	return EXIT_SUCCESS;
}
