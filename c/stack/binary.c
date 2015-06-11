#include <stack.h>
#include <stdio.h>

stack_node_t *head;
//stack_t *head2;
head=NULL;

int m;
int main()
{
  int dec,rem;
  printf("Enter number: ");
  scanf("%d",&dec);
	
  /* convert to binary and display */
	while(dec>0){
		//head2=&head;
		rem=dec%2;
		dec=dec/2;
		push(&rem,&head);
	}
	
	stack_t *head2;
	head2=&head;
	while(*head2==NULL){
		pop(&m,head2);
		*head2=(*head2)->next;
		printf("%d ",m);
	}
	

  return 0;
}
