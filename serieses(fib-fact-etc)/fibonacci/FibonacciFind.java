import java.math.BigInteger;


public class FibonacciFind {
	
public static int fib(int num){
		
		return fib(0,0,1,num);
	}
	
	public static int fib(int i,int a,int b,int n){
			if(i==n) return a;
			else return fib(i+1,b,a+b,n);
			
	}
	
	
	public static BigInteger fibLarge(BigInteger num){
		BigInteger zero=new BigInteger("0");
		BigInteger one=new BigInteger("1");
		
		return fibLarge(zero,zero,one,num);
	}
	
	public static BigInteger fibLarge(BigInteger i,BigInteger a,BigInteger b,BigInteger n){
		if(i.compareTo(n)==0) return a;
		else return fibLarge(i.add(new BigInteger("1")),b,a.add(b),n);
		
	}
	
	public static void main(String args[]){
		int count=1;
		
		while(true){
			
			System.out.println(fib(count));
			count++;
			if(count>12) break;
			
			
		}
	}

}
