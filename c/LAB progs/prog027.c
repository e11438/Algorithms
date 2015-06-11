/* declaring and using compound types
 * 
 * struct and typedef
 * 
 * complex number example
 */
#include <stdio.h>
#include <stdlib.h> // system() function

typedef struct _ {
	int real, img;
} complex;

complex add(complex, complex);
complex sub(complex, complex);
complex mul(complex, complex);

int main(){
	complex in1, in2, out;
	int choice;
	
	while (1){
		puts("\nGive your choice for complex number operations");
		puts("==============================================");
		puts("Press 1 to add");
		puts("Press 2 to subtract");
		puts("Press 3 to multiply");
		puts("Press 4 to clear screen");
		puts("Press 5 to exit");
		fputs("Enter your choice: ", stdout);
		scanf("%d", &choice);
		
		if (choice == 5)
			return 0;
		
		if (choice == 4){
			system("clear");
			continue;
		}
		
		if (choice >= 1 && choice <= 3){
			printf("Enter the real and imag. parts of the first complex number (separate by space): ");
			scanf("%d %d", &in1.real, &in1.img);
			
			printf("Enter the real and imag. parts of the second complex number (separate by space): ");
			scanf("%d %d", &in2.real, &in2.img);	
		}else{
			puts("Invalid choice. Enter your choice again");
			continue;
		}
		
		switch (choice){
			case 1:
					out = add(in1, in2);
					printf("The sum of the numbers entered is %d + %di\n", out.real, out.img);
					break;
			case 2:
					out = sub(in1, in2);
					printf("The sub. btw  the numbers entered is %d + %di\n", out.real, out.img);
					break;
			case 3:
					out = mul(in1, in2);
					printf("The mul btw the numbers entered is %d + %di\n", out.real, out.img);
					break;
			
			default:
					continue;			
		}
	}
	
	return 0;
}

complex add(complex cn1, complex cn2){
	complex res;
	res.real = cn1.real + cn2.real;
	res.img  = cn1.img  + cn2.img;
	return res;	
}

complex sub(complex cn1, complex cn2){
	complex res;
	res.real = cn1.real - cn2.real;
	res.img  = cn1.img  - cn2.img;
	return res;	

}

complex mul(complex cn1, complex cn2){
	complex res;
	res.real = cn1.real*cn2.real - cn1.img*cn2.img;
	res.img  = cn1.real*cn2.img  + cn2.real*cn1.img;
	return res;	
}
