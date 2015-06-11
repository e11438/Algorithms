
public class arrayMethod {
	public static void main(String args[]){
		
		int bucky[]={3,4,5,6,7};
		change(bucky);
		
		for(int y:bucky){
			System.out.println(y);
		}
		
	}
	
	public static void change(int x[]){
		for(int counter =0;counter<x.length;counter++)
			x[counter]+=5;
	}
	public static void change2(int x[]){
		for(int counter:x){
			x[counter]+=6;
			
		}
	}
}
