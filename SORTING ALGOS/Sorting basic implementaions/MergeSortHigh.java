import java.util.Arrays;
import java.util.Random;


public class MergeSortHigh {
	
	public static void merge_sort(int [ ] a)
	{
		int[] tmp = new int[a.length];
		merge_sort(a, tmp,  0,  a.length - 1);
	}


	private static void merge_sort(int [ ] a, int [ ] tmp, int start, int end)
	{
		if( start < end )
		{
			int mid = (start + end) / 2;
			merge_sort(a, tmp, start, mid);
			merge_sort(a, tmp, mid + 1, end);
			merge(a, tmp, start, mid + 1, end);
		}
	}


    private static void merge(int[ ] a, int[ ] tmp, int start, int mid, int end )
    {
        int leftEnd = mid - 1;
        int k = start;
        int num = end - start + 1;

        for(;start <= leftEnd && mid <= end;)
            if(a[start]<a[mid])
                tmp[k] = a[start++];
            else
                tmp[k] = a[mid++];

        while(start <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[start++];

        while(mid <= end)  // Copy rest of right half
            tmp[k++] = a[mid++];

        // Copy tmp back
        for(int i = 0; i < num; i++, end--)
            a[end] = tmp[end];
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
	merge_sort(arr1);
	printArray(arr1);
	
}


}
