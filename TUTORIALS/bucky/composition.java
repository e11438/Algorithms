
public class composition {
	private String name;
	private tuteThis birthday;
	
	public composition (String theName,tuteThis theDate){
		name=theName;
		birthday=theDate;
	}
	
	public String toString(){
		String lname=String.format("My name is %s, My birthday is %s",name,birthday);
		return lname;
	}
	

}
