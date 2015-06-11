import java.util.HashMap;


public class CanMakeAPalindrome {

	/**
	 * @param args
	 */
	
	public static boolean canMakePal(String str){
		HashMap<String,String> set =new HashMap<String,String>();
		if(str.length()%2==0){
			for(int i=0;i<str.length();i++){
				if(set.containsKey(str.charAt(i)+"")){
					set.remove(str.charAt(i)+"");
				}else{
					set.put(str.charAt(i)+"", str.charAt(i)+"");
				}
				
			}		
			if(set.size()==0)
				return true;
			else
				return false;
			
		}else{
			for(int i=0;i<str.length();i++){
				if(set.containsKey(str.charAt(i)+"")){
					set.remove(str.charAt(i)+"");
				}else{
					set.put(str.charAt(i)+"", str.charAt(i)+"");
				}
				
			}		
			if(set.size()==1)
				return true;
			else
				return false;
			
		}
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
