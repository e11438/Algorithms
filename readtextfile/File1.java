import java.io.*;

public class File1 { 
    public static void main(String [] args) { 

	String fileName = "File.java";                 // file 
	try { 
	    FileReader fileRd = new FileReader(fileName); 
	    BufferedReader bufferRd = new BufferedReader(fileRd);
	    String line = null; 
	    while( (line = bufferRd.readLine()) != null) { 
		System.out.println(line);
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
    }
}   