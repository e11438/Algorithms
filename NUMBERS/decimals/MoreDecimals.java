import java.math.*;
import java.lang.*;

public class MoreDecimals {

	public static void main(String args[]){
	/*	
		 // create 3 BigDecimal objects
        BigDecimal bg1, bg2, bg3;

        bg1 = new BigDecimal("16");
        bg2 = new BigDecimal("3");

        // divide bg1 with bg2 with 3 scale
	bg3 = bg1.divide(bg2, 3, RoundingMode.CEILING);

        String str = "Division result is " +bg3;
*/		
		int scale = 100;
		BigDecimal num1 = new BigDecimal(103993);
		BigDecimal num2 = new BigDecimal(33102);
		System.out.println(num1.divide(num2, scale, RoundingMode.HALF_UP).toString());
		
		
	}
	
	

}
