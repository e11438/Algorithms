
public class MinMaxOfArray {
	
	 public static long maxOfArray(long[] numbers){
  	   long largetst = numbers[0];
        
         for(int i=1; i< numbers.length; i++)
         {
                 if(numbers[i] > largetst)
                         largetst = numbers[i];
                 
         }     
         
         return largetst;
  }

	 public static long minOfArray(long[] numbers){
	  	   long min = numbers[0];
	        
	         for(int i=1; i< numbers.length; i++)
	         {
	                 if(numbers[i] < min)
	                         min = numbers[i];
	                 
	         }     
	         
	         return min;
	  }


}
