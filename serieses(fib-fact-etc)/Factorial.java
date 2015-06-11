import java.math.BigInteger;


public class Factorial {
	
	public static BigInteger fact(int num){
		
		BigInteger fact = BigInteger.valueOf(1);
	    for (int i = 1; i <= num; i++)
	        fact = fact.multiply(BigInteger.valueOf(i));
	    
	    return fact;
	}
	
	public static void main(String[] args) {
		int num=8785856;
		System.out.println(fact(6));
	   
	}

}
