import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class File { 
    public static void main(String [] args) { 
    	
    	
    	
    	
    	
    	
	
		
    }
    
    public static ArrayList<String> readFileArrayList(String fileName){
    	//String fileName = "Try.java";                 // file 
		ArrayList<String> out = new ArrayList<String>();
	    
		try { 
		    FileReader fileRd = new FileReader(fileName); 
		    BufferedReader bufferRd = new BufferedReader(fileRd);
		    String line = null; 
		    while( (line = bufferRd.readLine()) != null) { 
		    	out.add(line);
		    }
		    fileRd.close();
		    bufferRd.close();
	
		} catch (FileNotFoundException x) { 
		    System.out.println("Make sure " + fileName + " is also here!");
		    System.exit(-1);
		} catch (IOException x) { 
		    System.out.println(x);
		    System.exit(-1);
		} 
    	
		return out;
    	
    }
    
    public static String[] readFileArray(String fileName){
    	//String fileName = "Try.java";                 // file 
		ArrayList<String> out = new ArrayList<String>();
	    
		try { 
		    FileReader fileRd = new FileReader(fileName); 
		    BufferedReader bufferRd = new BufferedReader(fileRd);
		    String line = null; 
		    while( (line = bufferRd.readLine()) != null) { 
		    	out.add(line);
		    }
		    fileRd.close();
		    bufferRd.close();
	
		} catch (FileNotFoundException x) { 
		    System.out.println("Make sure " + fileName + " is also here!");
		    System.exit(-1);
		} catch (IOException x) { 
		    System.out.println(x);
		    System.exit(-1);
		} 
		String[] bar = out.toArray(new String[out.size()]);
		return bar;
    	
    }
    
 // generic method printArray                         
    public static < T > void printArray( T[] inputArray )
    {
       // Display array elements              
          for ( T element : inputArray ){        
             System.out.print( element+"  " );
          }
          System.out.println();
     }
} 



