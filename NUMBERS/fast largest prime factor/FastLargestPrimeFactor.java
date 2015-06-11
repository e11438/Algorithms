
public class FastLargestPrimeFactor {
	
	public static void largestPrimeFactor(long num){
		long k=2L;
		long m=0L;
		
		while(num>1){
			while(num%k==0){
				m=k;
				num=num/k;
			}
			if(k>2)
				k+=2;
			else
				k=3;
			
		}
		
		System.out.println(m);
		
	}

}
