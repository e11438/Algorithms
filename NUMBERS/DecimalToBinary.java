
public class DecimalToBinary {
	
	public static String toBinary(int num){
		return Integer.toString(num, 2); 
	}
	
	public static String toBinary2(int num){
		return Integer.toBinaryString(num);
	}
	
	public static String toBinary3(int num){
		 String result = "";
	       

	          while(num > 0)
	            {
	              int residue = num % 2;
	              num     = num / 2;
	              result      = result + Integer.toString(residue);	              
	            }

	            return result;
	}
	
	public static void main(String[] args){
		int num=1000000;
		System.out.println(toBinary3(num));
		
	}

}
