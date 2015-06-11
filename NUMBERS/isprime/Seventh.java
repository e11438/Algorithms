

public class Seventh {
	
	public static boolean isprime(long num){
		 long targ=num/2;
		 int n=0;

		for(long i=1;i<=targ;i++){

			if(num%i==0)
				n++;
		}

		if (n==1) return true;
		else return false;
	}
		
		
	public static void main(String args[]){
		int count=0;
		long i=2;
		
		while(true){
			if(isprime(i)) count++;
			
			if(count==10001) break;
			else i++;
			
			
		}
		System.out.println(i);
	}

}
