/*  Arithmetic in C
 * 
 * 	Mixed type operations and type casting (implicit and explicit)
 */

#include <stdio.h>

int main(){
	
	int num1 = 10, num2 = 20;
	double num3 = 20.0, ans;
	
	ans = num1 + num2;		
	printf("%d + %d = %.2lf\n",num1,num2,ans);
	
	ans = num1 / num2;
	printf("%d / %d = %.2lf\n",num1,num2,ans);
	
	ans = num1 / num3;
	printf("%d / %.2lf = %.2lf\n",num1,num3,ans);
	
	// make one or both of them double - TYPE CASTING
	// no point of type casting the answer
	ans = (double)num1 / (double)num2;
	printf("%d / %d = %.2lf\n",num1,num2,ans);
	
	return 0;
}