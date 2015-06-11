#include<stdio.h>
#include<stdlib.h>
#include<math.h>





int main(){
	
	int  num;
	
	printf("Enter an integer: ");
	scanf("%d",&num);
	
	double sqNum=sqrt((double)num);
	printf("the square of %d is %d and square root of %d is %f.\n",num,num*num,num,sqNum);
	
	
	
	return 0;
}
