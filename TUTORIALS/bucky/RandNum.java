import java.util.Random;

public class RandNum {
	
	public static void main(String args[]){
		Random dice=new Random();
		int number;
		//want number from 1 to 6
		for(int counter=1;counter<=10;counter++){
			number=dice.nextInt(6)+1;
			System.out.println(number);
		}
	}

}
