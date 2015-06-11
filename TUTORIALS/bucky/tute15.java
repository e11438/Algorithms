import java.util.Scanner;
public class tute15 {
	
	private static Scanner input;

	public static void main(String args[]){
		
		input = new Scanner (System.in);
		hTute15 tuteObject=new hTute15();
		
		System.out.print("Enter Your first gf's name : ");
		String name=input.nextLine();
		
		tuteObject.setName(name);
		tuteObject.saying();
		
		
		
		
	}

}
