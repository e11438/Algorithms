
public class Pandigital {
	
	public static boolean isPan(String s1){
		//String s1=Integer.toString(num1)+Integer.toString(num2)+Integer.toString(num3);
				
		if(s1.length()==9&&!s1.contains("0")){
			if(s1.contains("1")&&s1.contains("2")&&s1.contains("3")&&s1.contains("4")&&s1.contains("5")&&s1.contains("6")&&s1.contains("7")&&s1.contains("8")&&s1.contains("9"))
				return true;
			else
				return false;
		}
		else
			return false;
		
	}

}
