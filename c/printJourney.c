/*
	CO222-Lab09_GroupB
	Author: E11305
	Problem 1
*/

#include <stdio.h>
#include <string.h>
#include<stdlib.h>


struct town	//Linked list to store town names 
	{ 	
	char name[64];
 	struct town *next;
	};


typedef struct town * node; 
node head = NULL;


void show_list()
{
	printf("Cities in reverse order : \n");
	node tmp = head;
	while(tmp)
		{ 
		printf("%s", tmp -> name);
    		tmp = tmp -> next;
  		}
}

  
void add(char item[64])		//Head insert method to store town names	
{
	node new_town = (node)malloc(sizeof(struct town));

	if(new_town)
		{
		strcpy(new_town->name,item);	//copy town name to the name varible of new_town linked list		
		new_town->next = head;
		head = new_town;
		}
		
}


int main()
{
	char input[64];
	
	while(1)
		{
		printf("Enter the city name : ");
		fgets(input,100,stdin);
		if(strcmp(input,"End\n")== 0) 
			break;
		add(input);
		}

	show_list();	
	return 0;
}




