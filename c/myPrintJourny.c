#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct node{
	char array[20];
	struct node *next;
};

struct node *head=NULL;	

void newEntry(char entry[]){
	struct node *tmp1;
	struct node *newnode=(struct node*)malloc(sizeof(struct node));
	if(head){
		tmp1=head;
		head=newnode;
		head->next=tmp1;
		
		
		strcpy(newnode->array,entry);
		
	}
	else{
		head=newnode;
		newnode->next=NULL;
		
		strcpy(newnode->array,entry);
			
	}
}

void printList(){

struct node *tmp;
	if(head){
		tmp=head;
		while(tmp){
			printf("%s\n",tmp->array);
			tmp=tmp->next;
		}
	}
}	


int main(){
	char ch,city[20];
		

	while(1){

		//printf("Enter the city: ");
		//scanf("%[^\n]%*c",city);
		int i=0;
		printf("Enter the city: ");
		while((ch=getchar())!='\n'){
			city[i]=ch;
			i++;
		
		}
		
		city[i]='\0';
		if(strcmp(city,"End")!=0)	newEntry(city);
		else { 
			printList();
			break;
		}
	}		
	


return 0;
}
