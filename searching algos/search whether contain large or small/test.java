import java.util.ArrayList;


public class test {
	
	public static boolean containLow(ArrayList<Long> data,long key){
		int low = 0;
        int high = data.size() - 1;
         
        while(high >= low) {
            int middle = (low + high) / 2;
            if(data.get(middle)< key) {
                return true;
            }
            if(data.get(middle) < key) {
                low = middle + 1;
            }
            if(data.get(middle) > key) {
                high = middle - 1;
            }
       }
       return false;
	}
	
	public static boolean containHigh(ArrayList<Long> data,long key){
		int low = 0;
        int high = data.size() - 1;
         
        while(high >= low) {
            int middle = (low + high) / 2;
            if(data.get(middle)> key) {
                return true;
            }
            if(data.get(middle) < key) {
                low = middle + 1;
            }
            if(data.get(middle) > key) {
                high = middle - 1;
            }
       }
       return false;
	}


}
