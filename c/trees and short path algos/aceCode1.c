#include<stdio.h>
#include<stdlib.h>

#define NODECOUNT 7
 int n=0;

struct square {
	int row;
	int col;
};

struct bstNode {
		int depth;
        struct square sq;
        struct bstNode *child1, *child2, *child3, *child4, *child5, *child6, *child7, *child8;
};
//-------------------------------------------------------------------------------
struct bstNode1 {
		int depth;
        struct square sq;
        struct bstNode1 * array[8];
};
//------------------------------------------------------------------------------------

//define the root
struct bstNode1 * root;
//struct square nextMoves[8];
int hori[]={1,2,2,1,-1,-2,-2,-1};
int vert[]={2,1,-1,-2,-2,-1,1,2};

int isValid(struct square sq){
	if (sq.col<8 && sq.row<8) return 1;
	else return 0;
}
//============================================================================================
/*
shold be implemented inside the particular function
void calcMoves(struct square sq){
	struct square newSq;
	int i;
	for(i=0;i<8;i++){
		sq.col=+hori[i];
		sq.row=+vert[i];
		if(isValid(sq))
			nextMoves[i]=sq;
		else{
			sq.col=0;
			sq.row=0;
			nextMoves[i]=sq;
		}
	}
	
}
*/
//===========================================================================================


int isComplete(struct square dest,struct square array[]){
	int i,len;
	len=sizeof(array) / sizeof(array[0]);
	for (i=0;i<len;i++){
		if(array[i].col==dest.col && array[i].row==dest.row) return 1;
		
	}
	return 0;	
}

void makeTree(struct bstNode1 * root,struct square dest){
	int i;
	struct square nextMoves[8];
	n=+1;
	
	//========================================================================
	//compute next moves....
	struct square newSq;
	
	for(i=0;i<8;i++){
		newSq=root->sq;
		newSq.col=+hori[i];
		newSq.row=+vert[i];
		if(isValid(newSq))
			nextMoves[i]=newSq;
		else{
			newSq.col=0;
			newSq.row=0;
			nextMoves[i]=newSq;
		}
	}
	
	
	//=========================================================================
	
	for(i=0;i<8;i++){
		root->array[i]=(struct bstNode1 *)malloc(sizeof(struct bstNode1));
		newnode1->depth=n;
		newnode1->sq=nextMoves[i]
		
		
		
	}
		
}


int main(){
	int n=0;
	struct square source,dest;
	source.col=2;
	source.row=4;
	
	dest.col=5;
	dest.row=4;
	
	root=(struct bstNode1 *)malloc(sizeof(struct bstNode1));
	root->depth=n;
	root->sq=source;
	
	
	
	
	
	return 0;
}
