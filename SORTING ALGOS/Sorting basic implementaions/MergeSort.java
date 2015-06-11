import java.util.Arrays;
import java.util.Random;


public class MergeSort {
		//this is inefficient coz high space complexity
		public static int[] split(int[] data,int from,int to){
			/*An array will return including elements in 'from' and  
			 * excluding 'to' element 
			 */
			int[] result = new int[to-from+1];
			result=Arrays.copyOfRange(data, from, to);			
			return result;
		}
	
		public static int[] merge_sort(int[] data){
			if(data.length==1) return data;
			int mid = data.length/2;
			
			int[] left = split(data,0,mid);
			int[] right = split(data,mid,data.length);
			
			left = merge_sort(left);
			right = merge_sort(right);
			
			return combine(left,right);
			
		}
		
		public static int[] combine(int[] a,int[] b){
			int total = a.length+b.length;
			int[] merged = new int[total];
			
			int i=0,j=0,k;
			for(k=0;k<total && i<a.length && j<b.length;k++){
				
				if(a[i]<b[j]) merged[k] = a[i++];
				else merged[k] = b[j++];
			}
			
			for(;k<total && i<a.length;k++,i++){
				merged[k] = a[i];
			}
			for(;k<total && j<b.length;k++,j++){
				merged[k] = b[j];
			}
			return merged;			
		}
	
		static int [] generate_data(int sizeOfData) { 
		/* create an array of sizeOfData and 
		 * populate with random integers between 0-1000
		 */
	    	int[] result = new int[sizeOfData];
	    	Random rand = new Random();
	    	for(int i=0;i<result.length;i++){
	    		result[i]= rand.nextInt(100) + 1;
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
	    
	    public static void printArray(int[] data){
	    	for(int i=0;i<data.length;i++){
	    		System.out.print(data[i]+" ");
	    	}
	    	System.out.println();
	    }
	
	
	public static void main(String [] args){
		
		int[] arr1 = generate_data(10);
		System.out.println(arr1.length/2);
		printArray(arr1);
		int[] cpArr = merge_sort(arr1);
		printArray(cpArr);
		
	}

}
