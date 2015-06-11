#include<stdio.h>




int main(){
	
	int num,i;
	
	printf("Enter the number: ");
	scanf("%d",&num);
	
	printf("the factors of %d are :\n",num);
	
	for(i=1;i<=num/2;i++){
		if(num%i==0) printf("%d\n",i);
		
		
		
	}
	
	
	return 0;
}
