
public class EnumTestWithThis {
	Day day;
	
	public EnumTestWithThis(Day day){
		this.day=day;
	}
	
	public void howItIs(){
		switch(day){
		case MONDAY:
			System.out.println("Mondays are bad");
			break;
		case FRIDAY:
			System.out.println("fridays are better");
			break;
		case SATURDAY:case SUNDAY://case SUNDAY:
			System.out.println("Weekends are best");
			break;
		default:
			System.out.println("Week days are so-so");
			break;
		}
	}
	
	public static void main (String args[]){
		EnumTest firstDay=new EnumTest(Day.MONDAY);
		firstDay.howItIs();
		EnumTest secondDay=new EnumTest(Day.TUESDAY);
		secondDay.howItIs();
		
		EnumTest thirdDay=new EnumTest(Day.FRIDAY);
		thirdDay.howItIs();
		
		EnumTest fourthDay=new EnumTest(Day.SUNDAY);
		fourthDay.howItIs();
		
		
		
	}


}
