/* input marks, check and print pass/fail 
	
	if (marks >= 50)
		print pass
	else
		print fail
*/

#include <stdio.h>

int main(){

	int marks;

	printf("enter your marks: ");
	scanf("%d", &marks);

	if (marks >= 50){
		printf("you should be happy\n");
		printf("you passed\n");
	}else{
		printf("sorry");	
		printf("fail\n");
	}


	return 0;
}
