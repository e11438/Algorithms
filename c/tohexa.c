#include<stdio.h>
#include<stdlib.h>


int main(){
	
	int num1,num2,num3,num4;
	
	printf("Enter four numbers: ");
	scanf("%d %d %d %d",&num1,&num2,&num3,&num4);
	
	
	printf("the numbers are %d %d %d %d\n",num1,num2,num3,num4);
	printf("the hexa numbers are %.4x %.4x %.4x %.4x\n",num1,num2,num3,num4);
	printf("the hexa numbers are %02X %02X %02X %02X\n",num1,num2,num3,num4);
	
	return 0;
}
