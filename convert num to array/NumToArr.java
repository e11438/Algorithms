import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class NumToArr {
	
	//if this method is used result still have to reversed 
	//so better using arraylists to impliment
	public static int[] toArr(int number){
		int i=0;
		int[] arr=new int[(Integer.toString(number)).length()];
		
		do { 
			arr[i] = number % 10; 
			number /= 10; 
			i++; 
		} while (number != 0); 
		
		return arr;		
	}
	
	//impliment using array lists
	
	public static ArrayList<Integer> toArr2(int number){
				
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		do { 
			list.add(number % 10); 
			number /= 10; 			 
		} while (number != 0); 
		
		Collections.reverse(list);
		
		return list;		
	}
	 public static void printArray( int[] inputArray )
	   {
	      // Display array elements              
	         for ( int element : inputArray ){        
	            System.out.print( element+" ");
	         }
	         System.out.println();
	    }
	
	public static void main(String args[]){		
		printArray( toArr(34587));
		
 
		
		ArrayList<Integer> names = toArr2(23467);
		 System.out.println("Using for loop");
	        for (int i = 0; i < names.size(); i++) {
	            System.out.println(names.get(i));
	        }
	      	      
	}

}
