
public class SumOfFactors {
	
	
	public static int sumOfFactors(int n){
		int num=n;
		 int prod=1;
		    for(int k=2;k*k<=n;k++){
		        int p=1;
		        while(n%k==0){
		            p=p*k+1;
		            n/=k;
		        }
		        prod*=p;
		    }
		    if(n>1)
		        prod*=1+n;
		    return prod-num;
		
	}

	public static BigInteger sumOfFactorsNormal(BigInteger number) {
	    // If the number is 1
		BigInteger sum=new BigInteger("0");
	    int numberOfFactors = 1;

	    if (number.compareTo(BigInteger.ONE) <= 0)  {
	        return sum;
	    }

	    BigInteger boundry = number.divide(new BigInteger("2"));
	    BigInteger counter = new BigInteger("2");

	    while (counter.compareTo(boundry) <= 0) {
	        if (number.mod(counter).compareTo(BigInteger.ZERO) == 0) {
	            sum=sum.add(counter);
	        }

	        counter = counter.add(BigInteger.ONE);
	    }

	   
	    return sum.add(new BigInteger("1"));
	}
	
	
	
	public static void main(String args[]){
		
		System.out.println(sumOfFactors(12));
		System.out.println(sumOfFactors(28));
		
	}

}
