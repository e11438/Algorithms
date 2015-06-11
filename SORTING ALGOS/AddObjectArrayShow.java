import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AddObjectArrayShow {
	
	public static Object[] set(Object[] a,Object[] b){
//   	 String a[] = {"a", "b", "c"};
//   	    String b[] = {"d", "e" };

   	    List<Object> list = new ArrayList<Object>(Arrays.asList(a));
   	    list.addAll(Arrays.asList(b));
   	    Object [] c = list.toArray();
   	    //String[] stringArray = Arrays.copyOf(c, c.length, String[].class);
   	    return c;
   }
	public static void printObj(Object[] array){
    	
    	for(int i=0 ; i<array.length;i++){
    		System.out.println(array[i]);
    	}
    	
    }

}
