
public class CompareStringWithouCase {

	public static void main(String args[]) {
	      String str1 = "Strings are immutable";
	      String str2 = "Strings are immutable";
	      String str3 = "Integers are not immutable";

	      int result = str1.compareToIgnoreCase( str2 );
	      System.out.println(result);
		  
	      result = str2.compareToIgnoreCase( str3 );
	      System.out.println(result);
		 
	      result = str3.compareToIgnoreCase( str1 );
	      System.out.println(result);
	      
	      System.out.println("==========part two====================");
	      String s1 = "sdsdsd";  
	      String s2 = "sdsdsd323";  
	      int compare = s1.compareTo(s2);  
	      if (compare < 0)  
	      {  
	          // s1 is smaller than s2  
	      }  
	      else if (compare > 0)  
	      {  
	          // s1 is larger than s2  
	      }  
	      else  
	      {  
	          // s1 is equal to s2  
	      }  
	   }
}
