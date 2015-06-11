import java.util.HashSet;


public class Test {
	
	public static void main(String args[]){
		
		String s1 = new String("Sychelless");
		String s2 = new String("Sydney");
		
		HashSet<Character> h1 = new HashSet<Character>(), h2 = new HashSet<Character>();
		for(int i = 0; i < s1.length(); i++)                                            
		{
		  h1.add(s1.charAt(i));
		}
		for(int i = 0; i < s2.length(); i++)
		{
		  h2.add(s2.charAt(i));
		}
		h1.retainAll(h2);
		Character[] res = h1.toArray(new Character[0]);
		
		
		System.out.println(h1.size());
	}

}
