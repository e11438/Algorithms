
public class DupRem {
	
	public static int[] remove_duplicates(int[] a){
		int comp,n,numOfRepeats=0;
		for(int i=0;i<a.length;i++){
			n=0;
			comp=a[i];
			for(int j=0;j<a.length;j++){
				if(comp==a[j]&&(i!=j)){
					numOfRepeats++;					
				}
				
			}
		}
		int sol[]=new int[(a.length-numOfRepeats)];
		int solIndex=0;
		for(int i=0;i<a.length;i++){
			n=0;
			comp=a[i];
			for(int j=0;j<a.length;j++){
				if(comp==a[j]&&(j!=i)){
					n=2;
					break;
				}
			}
			if(n==0){
				sol[solIndex]=comp;
				solIndex++;
			}
			
		}
		return sol;
	}
	public static void printArray(int []a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		int []ar1={1,2,3,4,5,6,7,8};
		int []ar2={4,5,6,8,1};
		
		/*
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{1,2},{3,4},{5,6}};
		int c[][]=new int[a.length][b[1].length];
		
		*/
		
		System.out.println("---------------------------------------------------");
		
		int []rept={2,3,4,5,2,4,6,7};
		
		
		
		printArray(remove_duplicates(rept));
		printArray(remove_duplicates(ar1));
		printArray(remove_duplicates(ar2));
	}
	
	
	

}
