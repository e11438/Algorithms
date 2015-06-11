import java.util.ArrayList;
import java.util.Collections;


public class sortDecOrder {

	/**
	 * @param args
	 */
	
	public static String reverse5(final String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }
	
	public static void main(String[] args) {
		
		//sort an arrayList in descending order 
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		 Collections.sort(arr2, Collections.reverseOrder());

	}

}
