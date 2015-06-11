
public class Test {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combinations c =new Combinations();
		c.generate("eeegeeks");
		for(int i=0;i<c.res.size();i++){
			System.out.println(c.res.get(i));
		}
		
		c.res.clear();
		
		System.out.println(c.res.size());	
	}

}
