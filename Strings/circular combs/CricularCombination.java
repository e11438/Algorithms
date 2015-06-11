
public class CricularCombination {
	
	public static String[] circularSolutions(int num){
		String[] solArray = new String[Integer.toString(num).length()];
		
		solArray[0]=Integer.toString(num);
		for(int i=1;i<solArray.length;i++){
			String strNum =solArray[i-1];
			String toReplace = strNum.substring(1)+strNum.substring(0, 1);
			solArray[i]=toReplace;
		}
		return solArray;
		
	}

}
