import java.math.BigInteger;


public class BigIntegerToIntArray {
	
	public static int[] toArr(BigInteger num){
		 String temp = num.toString();
		 int[] newGuess = new int[temp.length()];
		 for (int i = 0; i < temp.length(); i++)
		 {
			 newGuess[i] = temp.charAt(i) - '0';
		 }
	 
		 return newGuess;
	 }

}
