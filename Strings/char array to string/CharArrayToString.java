
public class CharArrayToString {
	
	public static String charToString(char[] a){
		return String.valueOf(a);
	}
	
	public static String charToString2(char[] a){
		return String.copyValueOf(a);
	}
	
	 public static String charArrayToString(char[] array) {
	        StringBuffer sb = new StringBuffer();
	        sb.append(array);
	        return sb.toString();
	    }
	
	public static void main(String[] args){
		char[] n={'a','c','d'};
		System.out.println(charToString(n));
		System.out.println(charToString2(n));
		System.out.println(charArrayToString(n));
	}
}
