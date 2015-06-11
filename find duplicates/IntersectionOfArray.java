import java.util.HashSet;


public class IntersectionOfArray {
	
	public static void main(String[] args) {
        int[ ] arrayOne = { 1, 4, 5, 2, 7, 3, 9 };
        int[ ] arrayTwo = { 5, 2, 4, 9, 5 };
 
        Integer[ ] common = findCommon( arrayOne, arrayTwo );
 
        System.out.print( "Common Elements Between Two Arrays: " );       
        for( int entry : common ) {
            System.out.print( entry + " " );
        }
        //can compare Integer with int...no problem..!
       /* 
        Integer num2=2;
        
        int num3=2;
        if(num2==num3)
        	System.out.println("ela");
        	*/
	}
	   public static Integer[ ] findCommon( int[ ] arrayOne, int[ ] arrayTwo ) {
 
	    	int[ ] arrayToHash;
	    	int[ ] arrayToSearch;
 
	    	if( arrayOne.length < arrayTwo.length ) {
	    		arrayToHash = arrayOne;
	    		arrayToSearch = arrayTwo;
	    	} else {
	    		arrayToHash = arrayTwo;
	    		arrayToSearch = arrayOne;
	    	}
 
	        HashSet<Integer> intersection = new HashSet<Integer>( );
 
	        HashSet<Integer> hashedArray = new HashSet<Integer>( );
	        for( Integer entry : arrayToHash ) {
	            hashedArray.add( entry );
	        }
 
	        for( Integer entry : arrayToSearch ) {
	            if( hashedArray.contains( entry ) ) {
	                intersection.add( entry );
	            }
	        }
 
	        return intersection.toArray( new Integer[ 0 ] );
	    }

}
