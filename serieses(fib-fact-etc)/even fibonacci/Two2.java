import java.math.BigInteger;
import java.util.Scanner;


public class Two2 {
	
	public static void main(String args[]){
		BigInteger two = new BigInteger("2");
		BigInteger four = new BigInteger("4");
		Scanner in = new Scanner(System.in);
		
		int t=in.nextInt();
		
		for(int i=0;i<t;i++){
			long n=in.nextLong();
			BigInteger lim=new BigInteger(Long.toString(n));
			BigInteger fib3 = two;
			BigInteger fib6 = BigInteger.ZERO;
			BigInteger result = two;
			BigInteger summed = BigInteger.ZERO;
			 
			while (result.compareTo(lim)<0) {
			    summed=summed.add(result);
			 
			    result = (fib3.multiply(four)).add(fib6);
			    fib6 = fib3;
			    fib3 = result;
			}
			
			System.out.println(summed);
			
		}
		
	}

}
