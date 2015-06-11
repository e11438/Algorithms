
public class Gcd {
	
	 private static int findGCD(int number1, int number2) {
	        //base case
	        if(number2 == 0){
	            return number1;
	        }
	        return findGCD(number2, number1%number2);
	    }
	 
	 public static void main(String args[]){
		 
		 System.out.println(findGCD(110,11));
		 String num1="101";
		 
		 System.out.println(num1.substring(2));
		 
		 if(49/98==4/8){
			 System.out.println("sadasd sadsa");
			 System.out.println(99/98);
			 System.out.println(9/8);
			 	
		 }
		 		 
	 }

}
