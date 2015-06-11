/* 	type renaming - giving new name to a type
	with the "typedef" keyword"
*/

#include <stdio.h>

// giving a new name for a type
// "unsigned char" is given a new name "marks"
typedef unsigned char marks;

int main(){

	int myVar; // declaring variable myVar with type int

	marks gp106marks; //  declaring variable gp106marks with type marks
	marks co222marks;

	gp106marks = 99;
	co222marks = 45;

	return 0;
}
