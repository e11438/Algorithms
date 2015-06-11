
#include <stdio.h>
#include<stdlib.h>



struct stack_node { 
  int data; 
  struct stack_node *next; 
};

typedef struct stack_node stack_node_t; 
typedef stack_node_t *stack_t; 

/* push the given data to given stack
 * return 0 on success -1 otherwise
 */
int push(int data, stack_t *stack); 

/* pop the item to given variable and return 1
 * else return 0
 */
int pop(int *data, stack_t *stack);


int main()
{
  int dec;
  printf("Enter number: ");
  scanf("%d",&dec);

  /* convert to binary and display */

  return 0;
}

int push(int data, stack_t *stack){
	
	 stack_t new_node = (struct stack_node *)malloc(sizeof(struct stack_node));

  if(new_node) { // we have memory 
    new_node -> data = data; 
    new_node -> next = *stack; 
    *stack = new_node; 
    return 0; // all good;
  }
  return -1; // error no memory
}

int pop(int *data, stack_t *stack){
	if(*stack){
		stack_t * temp;
		*data=*stack->data;
		temp=*stack;
		*stack=stack->next;
		free(temp);
		return 0;
	}
	printf("Stack is epmty");
	
}
	
	
	
}
