import java.math.BigInteger;


public class POW {
	
	public static long pow(long base, long exp){        
	    if(exp ==0){
	        return 1;
	    }
	    if(exp ==1){
	        return base;
	    }

	    if(exp % 2 == 0){
	        long half = pow(base, exp/2);
	        return half * half;
	    }else{
	        long half = pow(base, (exp -1)/2);
	        return base * half * half;
	    }       
	}
	
	public static BigInteger pow(int base, int exp){      
		BigInteger one =new BigInteger("1");
		BigInteger bigBase =new BigInteger(Integer.toString(base));
		
	    if(exp ==0){
	        return one;
	    }
	    if(exp ==1){
	        return bigBase;
	    }

	    if(exp % 2 == 0){
	        BigInteger half = pow(base, exp/2);
	        return half.multiply(half);
	    }else{
	        BigInteger half = pow(base, (exp -1)/2);
	        return (half.multiply(half)).multiply(new BigInteger(Integer.toString(base)));
	    }       
	}

}
