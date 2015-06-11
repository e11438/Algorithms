/* Using ctype library
 * 
 * Program to print a character entered is whether a
 * 	capital letter
 * 	simple letter
 * 	digit
 * 	others
 */
 
 #include <stdio.h>
 #include <ctype.h>
 
 int main(){
	 
	char ch;
	
	printf("Enter your character: ");
	//scanf("%c", &ch);
	ch = getchar();
	
	if (isalpha(ch)){
		if(isupper(ch)){
			printf("%c is CAPITAL letter\n", ch);
		}else{
			printf("%c is simple letter\n", ch);
		}
	}else if (isdigit(ch)){
		printf("%c is a DIGIT type\n", ch);
	}else{ 
		printf("%c is OTHER type\n", ch);
	}	
	
	return 0;
 }
  is