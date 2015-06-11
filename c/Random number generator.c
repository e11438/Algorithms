#include <stdio.h>
#include <stdlib.h>
#include<time.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	printf("RAND_MAX is %d\n", RAND_MAX); // 32767
// Generate 10 pseudo-random numbers between 0 and 99
// without seeding the generator.
// You will get the same sequence, every time you run this program
int i;
for (i = 0; i < 10; ++i) {
printf("%d ", rand() % 100); // need <stdlib.h> header
}
printf("\n");
// Seed the random number generator with current time
srand(time(0)); // need <cstdlib> and <ctime> header
// Generate 10 pseudo-random numbers
// You will get different sequence on different run,
// because the current time is different
for (i = 0; i < 10; ++i) {
printf("%d ", rand() % 100); // need <stdlib.h> header
}
printf("\n");
	
	return 0;
}
