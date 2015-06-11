
public class mainStatic {
	public static void main (String args[]){
		
		staticTute member1=new staticTute("Megan","Fox");
		staticTute member2=new staticTute("Natalie","Portman");
		staticTute member3=new staticTute("Taylor","Swift");
		
		System.out.println();
		System.out.println(member1.getLast());
		System.out.println(staticTute.getMembers());
	}

	
	
}
