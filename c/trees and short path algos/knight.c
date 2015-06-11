#include<stdio.h>
#include<stdlib.h>

# define SIZE 8

int homeCol,homeRow,destCol,destRow;
int prevCol,prevRow,nextCol,nextRow;
int hori[]={1,2,2,1,-1,-2,-2,-1};
int vert[]={2,1,-1,-2,-2,-1,1,2};
int num,n,i;
int board[8][8];



void makeZero(int array[SIZE][SIZE]){
	int i,j;
	for(i=0;i<8;i++){
		for(j=0;j<8;j++){
			array[i][j]=0; 
		}
	}
	
}

// to print thr board
void showboard(int array[SIZE][SIZE]){
	int i,j;
	for(i=0;i<8;i++){
		for(j=0;j<8;j++) printf("%d ",array[i][j]);
		printf("\n");
	}
	
}

int isValid(int col,int row){
	if (col<8 && row<8) return 1;
	else return 0;
}
int next_Col(int col,int move){
	return col+hori[move];
	
}

int next_Row(int row,int move){
	return row+vert[move];
	
}
int move(int col,int row,int count,int n){
	
	
	prevCol=col;
	prevRow=row;
		
	nextCol=next_Col(prevCol,count);
	nextRow=next_Row(prevRow,count);
	
	
	
		if ((nextRow==destRow)&&(nextCol==destCol)){
			//num=n;
			return n+1;
		}
		if (isValid(nextCol,nextRow)){
			move(nextCol,nextRow,count,n+1);

		}
		else move(prevCol,prevRow,count++,n);

}

int main(){
	

	
//	makeZero(board);
//	showboard(board);
	
	printf("Enter the home: ");
	scanf("%d%d",&homeCol,&homeRow);
	
	printf("Enter the destination: ");
	scanf("%d%d",&destCol,&destRow);
	
//	printf("home= %d %d \ndest= %d %d \n",homeCol,homeRow,destCol,destRow);
	
	printf("number of moves= %d",move(homeCol,homeRow,0,0) );	
	
	
	return 0;
}
