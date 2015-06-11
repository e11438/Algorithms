/*double
 * byte
 * short
 * int
 * float
 * 
 */
public class convertion {
	public static void main (String args[]){
		
		Double dobj=new Double("10.50");
		//use the byte value of double class to convert it into byte type.
		
		byte b=dobj.byteValue();
		System.out.println(b);
		
		//use short value method of double class to convert it into short type
		short s=dobj.shortValue();
		System.out.println(s);
		
		//use intvalue method of double class to convert it into int type
				int i=dobj.intValue();
				System.out.println(i);
				
		//use float value method of double class to convert it into short type
			float f=dobj.floatValue();
			System.out.println(f);
			
		//use double value method of double class to convert it into short type
			double d=dobj.doubleValue();
			System.out.println(d);
	}

}
