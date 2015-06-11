import java.math.*;

public class BigFactors {
	
	public static int getNumberOfFactors(BigInteger number) {
	    // If the number is 1
	    int numberOfFactors = 1;

	    if (number.compareTo(BigInteger.ONE) <= 0)  {
	        return numberOfFactors;
	    }

	    BigInteger boundry = number.divide(new BigInteger("2"));
	    BigInteger counter = new BigInteger("2");

	    while (counter.compareTo(boundry) <= 0) {
	        if (number.mod(counter).compareTo(BigInteger.ZERO) == 0) {
	            numberOfFactors++;
	        }

	        counter = counter.add(BigInteger.ONE);
	    }

	    // For the number it self
	    numberOfFactors++;

	    return numberOfFactors;
	}
	
	
	public static long getNumberOfFactorsSpeed(BigInteger number){	
		
		BigInteger x = new BigInteger("2");
		long totalFactors = 1;
		while (x.multiply(x).compareTo(number) <= 0) {
		    int power = 0;
		    while (number.mod(x).equals(BigInteger.ZERO)) {
		        power++;
		        number = number.divide(x);
		    }
		    totalFactors *= (power + 1);
		    x = x.add(BigInteger.ONE);
		}
		if (!number.equals(BigInteger.ONE)) {
		    totalFactors *= 2;
		}
		
		return totalFactors;
		
	}
	
	public static void main(String args[]){
		
		BigInteger num=new BigInteger("100000000");
		
		System.out.println(getNumberOfFactors(num));
		System.out.println(getNumberOfFactorsSpeed(num));
		
		
	}
	

}
