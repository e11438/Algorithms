
public class IsThereGreaterOne {

	/**
	 * @param args
	 */
	
public static boolean isthereGreaterOne(String str,int num,int start,int end){
		
		int mid =(start+end)/2;
		if(start>end)
			return false;
		if(Integer.parseInt(str.charAt(mid)+"")>num)
			return true;
		else
			return isthereGreaterOne(str,num,mid+1,end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		String charSet ="123";
		int bigNum=2;
    	for(int j=0;j<charSet.length();j++){
    		for(int k=1;k<=charSet.length();k++){
    			//if(j<charSet.length()&&k<=charSet.length())
    			if(j>=0&&j<k){
    				if(isthereGreaterOne(charSet.substring(j, k),bigNum,0,k-j-1)) { 
    					System.out.println(charSet.substring(j, k));
    					count++;
    				}
    			}
    		}
    		
    	}
    	
    	System.out.println(count);

	}

}
