
public class StringToIntArray {
	
	 public static int[] toIntArray(String temp){
		 
		 int[] newGuess = new int[temp.length()];
		 for (int i = 0; i < temp.length(); i++)
		 {
			 newGuess[i] = temp.charAt(i) - '0';
		 }
	 
		 return newGuess;
	 }

}
