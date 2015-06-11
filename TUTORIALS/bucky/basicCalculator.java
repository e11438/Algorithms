import java.util.Scanner;
public class basicCalculator {
	 private static Scanner bucky;

	public static void main(String args[]){
		 bucky = new Scanner(System.in);
		 
		 double fnum,snum,answer;
		 
		 System.out.print("Enter the first number: ");
		 fnum=bucky.nextDouble();
		 System.out.print("Enter the second number: ");
		 snum=bucky.nextDouble();
		 answer=fnum+snum;
		 System.out.println(answer);
	}
}
