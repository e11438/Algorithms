
public class Max {
	
	
	public static void main(String args[]){
		
		int[] array={0,1,2,1,0,-1,2,3,5,6,7,4,3,4,6,5,4};
		int max=array[0];
		for(int i=1;i<(array.length)-1;i++){
			if (array[i]>max) max=array[i];
			
		}
		System.out.println("The max is "+max);
		
	}

}
