/* EOF - ctrl-D (for linux) or ctrl-Z (for windows)
 * 		- or the real end-of-file
 */
#include <stdio.h>
#include <stdlib.h>

int main(){
	
	char ch;

	
	while((ch = getchar()) >= 0){
		putchar(ch);
	}
	
	
	return EXIT_SUCCESS;
}
