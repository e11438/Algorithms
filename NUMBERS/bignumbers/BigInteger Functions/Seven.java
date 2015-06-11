import java.math.BigInteger;
import java.util.Scanner;


public class Seven {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println(isPrime(new BigInteger("11")));
		
		/*int t=in.nextInt();
		
		for(int i=0;i<t;i++){
			int num=in.nextInt();
			System.out.println(findPrime(num));
			
		}*/
	}
	public static BigInteger sqrt(BigInteger x) {
	    BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
	    BigInteger div2 = div;
	    // Loop until we hit the same value twice in a row, or wind
	    // up alternating.
	    for(;;) {
	        BigInteger y = div.add(x.divide(div)).shiftRight(1);
	        if (y.equals(div) || y.equals(div2))
	            return y;
	        div2 = div;
	        div = y;
	    }
	}
	public static boolean isPrime(BigInteger n) {
		BigInteger three=new BigInteger("3");
		BigInteger two=new BigInteger("2");
		BigInteger one=new BigInteger("1");
		BigInteger zero=new BigInteger("0");
	    if(n.compareTo(two)<0) return false;
	    if(n.intValue() == 2 || n.intValue() == 3) return true;
	    if(n.mod(two).equals(zero) || n.mod(three).equals(zero)) return false;
	    long sqrtN = sqrt(n).longValue()+1;
	    for(long i = 6L; i <= sqrtN; i += 6) {
	    	BigInteger bigI=new BigInteger(Long.toString(i)) ;
	        if(n.mod(bigI.subtract(one)).equals(zero) || n.mod(bigI.add(one)).equals(zero)) return false;
	    }
	    return true;
	}
	
	public static BigInteger findPrime(int n){
		BigInteger num=new BigInteger("3");
		BigInteger two=new BigInteger("2");
		int primeCount=1;
		
		for(;primeCount!=n;num=num.add(two)){
			if(isPrime(num)){
				primeCount++;
			}
			
		}
		
		return num.subtract(two);
	}

}
