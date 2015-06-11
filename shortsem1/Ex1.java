
public class Ex1 {
	
	public static boolean subset(int [] sub,int [] supper){
		/* n is the count that how many elements of sub is in supper*/
		int n=0;
		for(int i=0;i<sub.length;i++){
			/*choose each element in sub one by one */
			
			for(int j=0;j<supper.length;j++){
				//compare the element in sub with every element in the supper
				
				if (sub[i]==supper[j]){
					/* if that element is in supper increment n*/
					n+=1;
					break;					
				}
			}
		}
		
		/*if every element of sub is in supper and sub and supper have different lengths 
		 * sub is a subset of supper */
		if(n==(sub.length)&&sub.length!=supper.length) return true;
		else return false;
	}
	
	public static void matrix_mul(int [][] a, int [][]b,int [][]c){
		
		int sum; 	
		int numRowA=a.length;			//number of rows in matrix a
		int numColA=a[1].length;		//number of columns in matrix a
		int numRowB=b.length;			//number of rows in matrix b
		int numColB=b[1].length;		//number of columns in matrix a
		
		if(numColA==numRowB){			
			/*matrix multiplication can be done only if number of columns in matrix a
			 *equal to number of rows in matrix b */
			
			for(int i=0;i<numRowA;i++){			//looping through rows in matrix a
				for(int j=0;j<numColB;j++){		//looping through columns in matrix b
					sum=0;	
					//sum is to calculate the each entry of matrix c
					
					for(int k=0;k<numRowB;k++){ 
						/*looping through each element of columns of b and rows of a */
						sum+=(a[i][k]*b[k][j]);
						//calculate the particular entry of matrix c
						
					}
					c[i][j]=sum; 
					//assign value to matrix c
				}
				
			}
		}
		/*if matrix a and b are of different size multiplication cant be done*/
		else System.out.println("Cant be done");
		
	}
	
	
	public static void printArray2D(int a[][]){
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	//-----------------------------------------------------------
	
	public static int[] remove_duplicates(int[] a){ 
		
		//length of array with duplicates
	    int len = a.length;

	    for(int i = 0; i < len; i++){	//selecting a element from array a
	        for(int j = i + 1; j < len; j++){
	        	/*from this loop it search for another identical element*/
	        	
	            if(a[i] == a[j]){
	            	/*if there is an identical one remove it and left shift 
	            	 *other elements */ 
	                int shiftLeft = j;
	                for(int k = j+1; k < len; k++, shiftLeft++){
	                    a[shiftLeft] = a[k];
	                }
	                
	                /*length is reduced by one 
	                 *we want array without repeats */
	                len--;
	                /*to search weather there are some more identical elements
	                 *for a[i]*/
	                j--;
	            }
	        }
	    }
	    /*len is reduced to the limit where there are no duplicates*/
	    /*enter the elements from array a to array sol */
	    int[] sol = new int[len];
	    for(int i = 0; i < len; i++){
	        sol[i] = a[i];
	    }
	    return sol;
	}
	
	//------------------------------------------------------------
	
	public static void printArray(int []a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String args[]){
		int []ar1={1,2,3,4,5,6,7,8};
		int []ar2={4,5,6,8,1};
		
		if(subset(ar2,ar1)==true) 
			System.out.println("elazzz");
		else
			System.out.println("not elazzz");
		
		System.out.println("---------------------------------------------------");
				
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{1,2},{3,4},{5,6}};
		int c[][]=new int[a.length][b[1].length];
		
		matrix_mul(a,b,c);
		printArray2D(c);
		
		System.out.println("---------------------------------------------------");
		
		int []rept={2,3,3,3,0,4,0,7};
		printArray(remove_duplicates(rept));
		
	}
	

}
