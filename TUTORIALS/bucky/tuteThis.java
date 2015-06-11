
public class tuteThis {
	
	private int month;
	private int day;
	private int year;
	
	public tuteThis(int m,int d,int y){
		month=m;
		day=d;
		year=y;
		
		System.out.printf("The constructor for this is %s\n ",this);
	}

	public String toString(){
		String name=String.format("%d/%d/%d",month,day,year);
		return name;
	}
}
