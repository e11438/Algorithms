#include <stdio.h>

 

void printmethod(int, char, char, char);

 

int main()

{

    int num;
    printf("Please enter the number of disks : \n");
    scanf("%d", &num);
    printf("These are the movements you should do :\n");
    printmethod(num, 'A', 'C', 'B');
    return 0;

}

void printmethod(int num, char from, char to, char rem)

{

    if (num == 1)

    {
        printf("Move disk 1 from %c to %c\n", from, to);
        return;
    }
	
	//printmethod(num - 1, from,to,rem);
    printmethod(num - 1, from, rem, to);
    printf("Move disk %d from %c to %c\n", num, from, to);
   	printmethod(num - 1, rem, to, from);

	return;

}
