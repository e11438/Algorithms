
#include<stdio.h>


long long isprime(long long num){
 long long targ=num/2;
long long i,n=0;

for(i=1;i<=targ;i++){

	if(num%i==0 && num!=2)
		n++;
}

if (n==1) return 1;
else return 0;
}


int main(){


	//int in;
	long long max=0,i;
	long long num=600851475143;
	//printf("Enter a number:");
	//scanf("%d",&in);

	//printf("the output is %d\n.",isprime(in));
	long long targ=num/2+1;
	//num is not a prime number,so...
	//printf(" %d\n",targ);
	for(i=1;i<targ;i+=2){
		//printf(" %llu\n",i);
		if(num%i==0)
			if(isprime(i)==1){
				printf(" \t%llu\n",i);
				max=i;
			}
	}	

	printf("The max is: %llu\n",max);

	return 0;
}
