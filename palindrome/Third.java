
//import java.util.Scanner;
public class Third {
	
	public static boolean ispalindrom(int num){
		
		
		
		String str1 = Integer.toString(num);
		char[]	numArray=str1.toCharArray();
		
		int len=numArray.length;
		char[] revNumArray= new char[len];
		for(int i=0;i<len;i++){
			revNumArray[i]=numArray[len-1-i];
			
		}
		String revStr1 = new String(revNumArray);
		
		int revNum=Integer.parseInt(revStr1);
		if(num==revNum) return true;
		else return false;
		
	}
	
	public static void main(String args[]){
		int max=0;
		int prod;
		/*
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		int num = in.nextInt();
		*/
		for(int i=1;i<1000;i++){
			for(int j=1;j<1000;j++){
				prod=i*j;
				if(ispalindrom(prod)&&prod>max) max=prod;
									
			}
		}
		System.out.println(max);
		
	}

}
