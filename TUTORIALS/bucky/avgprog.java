import java.util.Scanner;

public class avgprog {
	
	private static Scanner input;
	public static void main (String args[]){
		input=new Scanner(System.in);
		int total=0;
		int grade,average,counter=0;
		System.out.println("Enter the numbers");
		while(counter<10){
			grade=input.nextInt();
			total+=grade;
			counter++;
		}
		average=total/10;
		System.out.println("Your average is "+average);
		
	}

}
