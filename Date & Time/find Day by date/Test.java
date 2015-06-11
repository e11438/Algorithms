import java.math.BigInteger;


public class Test {
	public static int findDay(long year,int month,int date){
		if(month==1||month==2)
			year--;
		String strY=Long.toString(year);
		int y=Integer.parseInt(strY.substring(2));
		int c=Integer.parseInt(strY.substring(0,2));
		
		int d=date;
		int m=0;
		if(month<3)
			m=month+10;
		else
			m=month-2;
		int ans= (d+(int)(2.6*m-0.2)+y+(y/4)+(c/4)-(2*c));
		return ans%7;
	}
	

	
	public static void main(String args[]){
		
		
		 System.out.println(findDay(2015,4,28));
	}

}
