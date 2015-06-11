import java.io.IOException;


public class FileData {
		
	public static void main(String args[]) throws IOException{
		
		String fileName="C:/Thirteen.txt";
		
		try{
			ReadFile file = new ReadFile(fileName);
			String [] readLines = file.openFile();
			
			StringBuffer sb = new StringBuffer("");
			for(int i=0;i<readLines.length;i++){
				System.out.println(readLines[i]);
			}
				
			
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
