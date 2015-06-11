
public class MyImp {
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

    public static void printArray(int[] array){
    	for(int i=0;i<array.length;i++){
    		System.out.print(array[i]+" ");
    	}
    	System.out.println();
    }
	
	
	public static void main(String args[]){
		
		int [] d = {1, 2, 3, 14, 4, 5, 7};
		insertion_sort(d);
		 printArray(d);
		
	}

}
