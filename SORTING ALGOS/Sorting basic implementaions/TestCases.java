import java.util.Random;


public class TestCases {
	
	static int [] generate_data(int sizeOfData) { 
		/* create an array of sizeOfData and 
		 * populate with random integers betweem 0-1000
		 */
	    	int[] result = new int[sizeOfData];
	    	Random rand = new Random();
	    	for(int i=0;i<result.length;i++){
	    		result[i]= rand.nextInt(1000) + 1;
	    	}    	 
	    	return result; 
	    }

	    static int [] duplicate_array(int [] data) { 
		/* create a duplicate array of the given 
		 * useful when sending the same array to different 
		 * algorithms.
		 */
	    	int[] result = new int[data.length];
	    	for(int i=0;i<result.length;i++){
	    		result[i]= data[i];
	    	} 
	    	
		return result; 
	    }
	
	
	public static void main(String args[]){
		int n =3/2;
		System.out.println(n);
		
	}

}
