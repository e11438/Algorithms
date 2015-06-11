
public class SortingAlgos {
	
	static void insertion_sort(int [] data) { 
    	for(int i=1;i<data.length;i++){
			int temp = data[i];
			for(int j=i-1;j>=0;j--){
				if(data[j]>temp){
					data[j+1] = data[j];
					data[j]= temp;
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
    		int temp = data[i];
    		data[i] = data[min];
    		data[min] = temp;
    	}
    }

    static void bubble_sort(int [] data) { 
    	for(int i=0;i<data.length;i++){
    		boolean swap=false;
    		for(int j=data.length-1;j>i;j--){
    			if(data[j]<data[j-1]){
    				int temp = data[j];
    				data[j] = data[j-1];
    				data[j-1] = temp;
    				swap = true;
    			}
    		}
    		if(!swap) break;    		
    	}
    }
    
    public static void merge_sort(int[] data){
    	
    }
    
    public static void quick_sort(int[] data){
    	
    }
    
    public static void bucket_sort(int[] data){
    	
    }

}
