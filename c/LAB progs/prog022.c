/* Read input from user/file and count 
 * 	upper case,
 * 	lower case,
 * 	digit,
 * 	total # of chars,
 * 	# of lines.
 */
 
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main(){
	
	char ch;
	int countUpper = 0,
		countLower = 0,
		countDigit = 0,
		countTotal = 0,
		countNLine = 0;
	
	while((ch = getchar()) >= 0){
		//putchar(ch);
		if(isupper(ch)) countUpper++;
		if(islower(ch)) countLower++;
		if(isdigit(ch)) countDigit++;
		if(ch == '\n')  countNLine++;
		countTotal++;
	}
	
	
	printf("CAPITAL = %d, simple = %d, D1g1t = %d, Total = %d, NLines = %d\n", 	
				countUpper,	countLower,	countDigit,	countTotal, countNLine);
												
	
	
	return EXIT_SUCCESS;
}
