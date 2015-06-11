#include<stdio.h>






int main(){

int fib=3,a=1,b=2;
int sum=2;

while(fib<4000000){
if(fib%2==0)
	sum+=fib;

a=b;
b=fib;
fib=a+b;

}
printf("the sum is %d\n.",sum);


return 0;
}
