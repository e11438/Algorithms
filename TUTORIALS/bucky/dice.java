import java.util.Random;
public class dice {
	
	public static void main(String args[]){
		
		Random rand = new Random();
		int freq[]=new int[6];
		
		for(int roll=0;roll<1000;roll++){
			++freq[rand.nextInt(6)];
		}
		System.out.println("Face\tFrequency");
		
		for(int face=0;face<freq.length;face++){
			System.out.println((face+1)+"\t"+freq[face]);
		}
		
	}

}
