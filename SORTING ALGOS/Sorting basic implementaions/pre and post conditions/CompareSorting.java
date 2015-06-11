/**************************************************
 * Simple sorting algorithms 
 * Modified by E/11/438
 **************************************************/

class CompareSorting { 

    static void insertion_sort(int [] data) {
    	for(int i=1;i<data.length;i++){
    		int temp=data[i];
    		for(int j=i-1;j>=0;j--){
    			if(temp<data[j]){
    				data[j+1]=data[j];
    				data[j]=temp;
    			}
    		}
    	}
    }


    static void selection_sort(int [] data) { 
    	for(int i=0;i<data.length;i++){
    		int min=i;
    		for(int j=i+1;j<data.length;j++){
    			if(data[min]>data[j])
    				min=j;
    		}
    		int temp = data[min];
    		data[min]=data[i];
    		data[i]=temp;
    	}
    }

    static void bubble_sort(int [] data) { 
    	for(int i=0;i<data.length;i++){
    		boolean swap=false;
    		for(int j=data.length-1;j>i+1;j--){
    			if(data[j]<data[j-1]){
    				int temp=data[j];
    				data[j]=data[j-1];
    				data[j-1]=temp;  
    				swap=true;
    			}
    		}
    		if(!swap) break;
    	}
    }

    static int [] generate_data(int sizeOfData) { 
	/* create an array of sizeOfData and 
	 * populate with random integers betweem 0-1000
	 */
	return null; 
    }

    static int [] duplicate_array(int [] data) { 
	/* create a duplicate array of the given 
	 * useful when sending the same array to different 
	 * algorithms.
	 */
	return null; 
    }

    static void postCondition(int [] data) { 
	/* if sorted, for any i data[i] > data[i-1]
	 * Need to run this with java -ea CompareSorting
	 */
	int i; 
	for(i=1; i < data.length; i++) 
	    if(data[i] > data[i-1]) break; 

	assert i == data.length : "Algorithm is broken";
    }

    public static void main(String [] ar) {
	int [] d = {1, 2, 3, 14, 4, 5, 7};
	postCondition(d);
	System.out.println("HG" + d.length);
    }
}

	   