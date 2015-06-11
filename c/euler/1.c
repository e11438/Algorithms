#include<stdio.h>


int main(){
int max=1000,i,sum=0;

	for(i=0;i<max;i++){
		if (i%3==0 ||i%5==0)
			sum+=i;

	}
	printf("the sum is %d\n.",sum);

return 0;
}
