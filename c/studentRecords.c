/*
	CO222-Lab09_GroupB
	Author: E11305
	Problem 2
*/

#include <stdio.h>
#include<stdlib.h>
#include <string.h>


struct newone	//Linked list to store courses done by a student
	{
	char nam[64];
	struct newone *after;
	};

struct student //Gereral linked list to store information of a student
	{
	char name[64];
	char enu[64];
	struct newone *link;	//Pointer variable to store address of newone linked list
	struct student *next;
	};


typedef struct student *type;
type head = NULL;
typedef struct newone *ctype ;
ctype c_head = NULL;;

  
void add(char in_name[64],char in_enum[64],ctype in)	//Head insert method to store student details
{	
	type new_student = (type)malloc(sizeof(struct student));

	if(new_student)
	{
		strcpy(new_student->name,in_name);//copy student name to the name varible of new student linked list
		strcpy(new_student->enu,in_enum);//copy student e number to the enu varible of new student linked list
		new_student->link = in;		
		new_student->next = head;
		head = new_student;	
	}	
}

  
ctype add_course(char item[256])	//Head insert method to store courses
{	
	
	ctype new_course = (ctype)malloc(sizeof(struct newone));
	
	if(new_course)
		{
			strcpy(new_course->nam,item);		
			new_course->after = c_head;
			c_head = new_course;
		}
		return c_head;	
}


void show_list()
{
	type tmp = head;
	ctype temp = tmp-> link;
	while(tmp)
		{
		printf("\nE_Number: E11%s\n", tmp -> enu );
		printf("Name: %s\n", tmp ->name);
		printf("Courses: ");
		while(temp)
			{
			printf("%s ", temp ->nam );
			temp = temp -> after;
			}

    		tmp = tmp -> next;
		if(tmp!=NULL)  		
			temp = tmp->link;
		}
}


int main()
{
	char inname[64],incourses[256],inenu[64];
	ctype add_out;	//Store output of add_course function
	
	while(1)
		{
		printf("E_Number:E11");
		scanf("%s",inenu);
		if(strcmp(inenu,"End")== 0) //If user input is "End",then programe stops and gives output
				break;
		printf("Name:");
		scanf("%s",inname);
		printf("Courses:");
		
		while(1)
			{
			scanf("%s",incourses);
			if(strcmp(incourses,"End")== 0)//If user input as courses is "End",then asks for a new student details
				break;
			add_out = add_course(incourses);       
			}

		add(inname,inenu,add_out);
		c_head = NULL;	//To start next student linked list to store details of next student's details
		}

	show_list();	
	return 0;
}


