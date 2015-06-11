#include<stdio.h>
#include<stdlib.h>
#include<string.h>



struct courses{				//create a structure for course list..
	char data[20];
	struct courses *next;
};

struct details{				//create a structure for detail list..
	char number[7];
	char name[20];
	struct courses *course;
	struct details *next;
};

struct details *dhead=NULL;		//make the head of detail list 

/* Implement the function to add details of students with the head of relevent course list*/
void newEntryDetails(char eNumber[],struct courses *spointer,char eName[]){
	struct details *tmp1,*tmp2;
	struct details *newnode=(struct details*)malloc(sizeof(struct details));
	if(dhead){
		tmp1=dhead;
		while(tmp1){			//this loop is for finding the end of the list
			tmp2=tmp1;		//store the address of final node in tmp2
			tmp1=tmp1->next;
		}

		tmp2->next=newnode;		//assigning values...
		newnode->next=NULL;
		strcpy(newnode->number,eNumber);
		newnode->course=spointer;
		strcpy(newnode->name,eName);
	}
	else{
		dhead=newnode;			//assigning values if it is the first entry...
		newnode->next=NULL;
		strcpy(newnode->number,eNumber);
		newnode->course=spointer;
		strcpy(newnode->name,eName);
	}
}

//Implement the function to add courses to list
void newEntryCourses(struct courses *spointer,char eCourse[]){
	struct courses *tmp1,*tmp2;
	struct courses *newnode=(struct courses*)malloc(sizeof(struct courses));
	if(spointer){
		tmp1=spointer;
		while(tmp1){			//this loop is for finding the end of the list
			tmp2=tmp1;		//store the address of final node in tmp2
			tmp1=tmp1->next;	
		}

		tmp2->next=newnode;		//assigning values...
		newnode->next=NULL;
		strcpy(newnode->data,eCourse);
		
	}
	else{
		spointer=newnode;		//assigning values if it is the first entry..
		newnode->next=NULL;
		strcpy(newnode->data,eCourse);
		
	}
}
//implement the function to print a list...
void printList(){

struct details *tmp;
	if(dhead){
		tmp=dhead;
		while(tmp){
			printf("E_Number:%s\n",tmp->number);
			printf("Name:%s\n",tmp->name);
		//---------------------------------------------------
			struct courses *tmp2;
				tmp2=tmp->course;	/*get the address of head of the course list to tmp2*/
				printf("Coureses:");
				while(tmp2){			//print the course list
					printf("%s\t",tmp2->data);
					tmp2=tmp2->next;
				}
				puts("");
		//---------------------------------------------------
			tmp=tmp->next;
		}
	}
}	


int main(){
	char eNumber[7],eName[20],eCourse[20],ch;
	struct courses *head;
	
	

			
	while(1){
	//------------------------------------------------
		printf("E_Number: ");
		scanf("%[^\n]%*c",eNumber);
		printf("Name: ");
		scanf("%[^\n]%*c",eName);
		
		
		head=(struct courses*)malloc(sizeof(struct courses));	/* Making the first node of the course list and give it's addrs to pointer head*/
		
		printf("Courses: \n");	
		scanf("%[^\n]%*c",eCourse);

		strcpy(head->data,eCourse);	//assigning data to first node of the course list
		head->next=NULL;
		while(1){			//Add other courses to list..
		
			scanf("%[^\n]%*c",eCourse);
			if(strcmp(eCourse,"End")==0)	break;/*When "End" is entered it stops enter dete to the source list*/
		
			else{
				newEntryCourses(head,eCourse);
			}
		}
		
		newEntryDetails(eNumber,head,eName);
		//printf("%s",eNumber);

		fflush(stdin);
		ch=getchar();
		
		if(ch=='\n') continue;	/*If press Enter it give a chance to enter details of another student*/		
		if(ch=='E') break;	//If 'E' is prssed finish the data entering process
			
		
	}
	puts("");
	printList();		//print the list...
return 0;
}
