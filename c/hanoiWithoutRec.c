#include<stdio.h>
#include<stdlib.h>

struct stack_node { 
  	int data; 
  	struct stack_node *next; 
};
typedef struct stack_node stack_node_t; 
typedef stack_node_t *stack_t;

struct stack_pointer{
	stack_t *data;
	struct stack_pointer *next;
}; 


//---------------------------------------------------------------
int push(int data, stack_t *stack)
{
  	stack_node_t *tmp = malloc(sizeof(stack_node_t));
  	if(tmp) {
    		tmp -> data = data; 
   	 	tmp -> next = *stack; 
    		*stack = tmp; 
    		return 0; 
 	}
  	return -1; 
}

int pop(int *data, stack_t *stack) 
{
  	if(*stack) { 
    		stack_node_t *tmp;
    		tmp = *stack; 
    		*stack = (*stack) -> next; 
    		*data = tmp -> data; 
    		free(tmp);
    		return 1;
 	}
  	return 0;
}

int noOfElement(stack_t *stack){
	int i=1;
	if(*stack){
		stack_t temp=*stack;
		while(temp->next!=NULL){
			i++;
			temp=temp->next;
		}
	return i;
	}
	else return 0;
}
//---------------------------------------------------------------------------
struct stack_pointer *head;
stack_t A=NULL,B=NULL,C=NULL;

int main(){

int m,num,i;
printf("Enter the number of disks: ");
scanf("%d",&num);

for(i=num;i>0;i--) push(i,&A);

if(num%2==0){
	while(!((noOfElement(&C)==num)||(noOfElement(&B)==num))){
		if(A){
			if((B==NULL)||((B->data)>(A->data))){
				pop(&m,&A);
				push(m,&B);
				printf("Move disk %d from %c to %c\n",m,'A','B');
			}
			else {
				pop(&m,&B);
				push(m,&A);
				printf("Move disk %d from %c to %c\n",m,'B','A');
			}
		}
		else{
			pop(&m,&B);
			push(m,&A);
			printf("Move disk %d from %c to %c\n",m,'B','A');
		}	
		if(A){
			if((C==NULL)||((A->data)<(C->data))){
				pop(&m,&A);
				push(m,&C);
				printf("Move disk %d from %c to %c\n",m,'A','C');
			}
			else {
				pop(&m,&C);
				push(m,&A);
				printf("Move disk %d from %c to %c\n",m,'C','A');
			}
		}
		else{
			pop(&m,&C);
			push(m,&A);
			printf("Move disk %d from %c to %c\n",m,'C','A');
		}
		if(B){
			if((C==NULL)||((B->data)<(C->data))){
				pop(&m,&B);
				push(m,&C);
				printf("Move disk %d from %c to %c\n",m,'B','C');
			}
			else {
				pop(&m,&C);
				push(m,&B);
				printf("Move disk %d from %c to %c\n",m,'C','B');
			}
		}
		else{
			pop(&m,&C);
			push(m,&B);
			printf("Move disk %d from %c to %c\n",m,'C','B');
		}	
	}	
}	
else{	
	while(!((noOfElement(&C)==num)||(noOfElement(&B)==num))){
		if(A){
			if((C==NULL)||((C->data)>(A->data))){
				pop(&m,&A);
				push(m,&C);
				printf("Move disk %d from %c to %c\n",m,'A','C');
			}
			else {
				pop(&m,&C);
				push(m,&A);
				printf("Move disk %d from %c to %c\n",m,'C','A');
			}
		}
		else{
			pop(&m,&C);
			push(m,&A);
			printf("Move disk %d from %c to %c\n",m,'C','A');
		}
		if(((noOfElement(&C)==num)||(noOfElement(&B)==num))) break;
		
		if(A){
			if((B==NULL)||((A->data)<(B->data))){
				pop(&m,&A);
				push(m,&B);
				printf("Move disk %d from %c to %c\n",m,'A','B');
			}
			else {
				pop(&m,&B);
				push(m,&A);
				printf("Move disk %d from %c to %c\n",m,'B','A');
			}
		}
		else{
			pop(&m,&B);
			push(m,&A);
			printf("Move disk %d from %c to %c\n",m,'B','A');
			
		}
		if(((noOfElement(&C)==num)||(noOfElement(&B)==num))) break;
		
		if(C){
			if((B==NULL)||((C->data)<(B->data))){
				pop(&m,&C);
				push(m,&B);
				printf("Move disk %d from %c to %c\n",m,'C','B');
			}
			else {
				pop(&m,&B);
				push(m,&C);
				printf("Move disk %d from %c to %c\n",m,'B','C');
			}
		}
		else{
			pop(&m,&B);
			push(m,&C);
			printf("Move disk %d from %c to %c\n",m,'B','C');
		}	
	}
}
return 0;
}
