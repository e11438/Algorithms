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

long long sum=2;
long long i;		
for(i=1;i<2000000;i+=2){
	if(isprime(i)){
		printf("%llu\n",i);
		sum+=i;
	}

}
		
printf("%llu",sum);



return 0;
}

