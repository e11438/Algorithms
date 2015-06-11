import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Permutations {
	public static ArrayList<String> list =new ArrayList<String>();
    // print N! permutation of the characters of the string s (in order)
    public  static void perm1(Object[] s) { perm1("", s); }
    private static void perm1(Object prefix, Object[] s) {
        int N = s.length;
        if (N == 0) list.add((String)prefix);
        else {
            for (int i = 0; i < N; i++)            	
            	perm1(prefix + (String)s[i],set(Arrays.copyOfRange(s,0,i) , Arrays.copyOfRange(s,i+1,N)));              
        }
    }       
    
    public  static void permPrint(Object[] s) { permPrint("", s); }
    private static void permPrint(Object prefix, Object[] s) {
        int N = s.length;
        if (N == 0) System.out.println((String)prefix);
        else {
            for (int i = 0; i < N; i++)            	
            	permPrint(prefix + (String)s[i],set(Arrays.copyOfRange(s,0,i) , Arrays.copyOfRange(s,i+1,N)));              
        }
    }       
    
    public static Object[] set(Object[] a,Object[] b){
//    	 String a[] = {"a", "b", "c"};
//    	    String b[] = {"d", "e" };

    	    List<Object> list = new ArrayList<Object>(Arrays.asList(a));
    	    list.addAll(Arrays.asList(b));
    	    Object [] c = list.toArray();
    	    //String[] stringArray = Arrays.copyOf(c, c.length, String[].class);
    	    return c;
    }
    
    
   // String[] both = ArrayUtils.addAll(first, second);
    //int[] newArray = Arrays.copyOfRange(oldArray, startIndex, endIndex);
    
    // print N! permutation of the elements of array a (not in order)
    public static void perm2(String s) {
       int N = s.length();
       char[] a = new char[N];
       for (int i = 0; i < N; i++)
           a[i] = s.charAt(i);
       perm2(a, N);
    }

    private static void perm2(char[] a, int n) {
        if (n == 1) {
            System.out.println(a);
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            perm2(a, n-1);
            swap(a, i, n-1);
        }
    }  

    // swap the characters at indices i and j
    private static void swap(char[] a, int i, int j) {
        char c;
        c = a[i]; a[i] = a[j]; a[j] = c;
    }



    public static void main(String[] args) {
       int N = 3;
       String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String elements = alphabet.substring(0, N);
       String[] first={"0 ","10 ","11 "};
       String a[] = {"a", "b", "c"};
       String b[] = {"d", "e" };
       
       //printObj(set(a,b));
       permPrint(first);
//       ArrayList<String> try1 = Permutations.list;
//       for (Object name : try1) {
//           System.out.println((String)name);
//       }
//       perm1(first);
       System.out.println();
       //perm2(elements);
    }
    
    public static void printObj(Object[] array){
    	
    	for(int i=0 ; i<array.length;i++){
    		System.out.println(array[i]);
    	}
    	
    }
}
