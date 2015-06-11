//import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class Email {
	
	public static void main(String []arg){
		//String fileName="C:/google.csv";
		
		String fileName= arg[arg.length-1];
		
		try{
			//ReadFile file = new ReadFile(fileName);
			//String [] readLines = file.openFile();
	//-------------------------------------------------------------		
			FileReader fileToRead =new FileReader(fileName);
			BufferedReader bf=new BufferedReader(fileToRead);
			
			String line=bf.readLine();
			//int numOfLines=0;
			
			
			while((line=bf.readLine())!=null){
				String [] data =line.split(",");
				for(int i=0;(i<data.length)&&(data[i]!="");i++){
					if(data[i].matches("(.*)@(.*)"))
						System.out.println(data[i]+" ");						
						
				}				
			}
			bf.close();
	//---------------------------------------------------------------------		
			
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
			
		
		
	}

}
