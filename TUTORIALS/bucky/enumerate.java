
public enum enumerate {
	bucky("nice","22"),
	kelsey("cutie","10"),
	julia("bigmistake","12"),
	nicole("italian","13"),
	candy("different","14"),
	erine("iwish","16");
	
	private final String desc;
	private final String year;
	
	enumerate(String description,String birthday){
		desc=description;
		year=birthday;
		
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getyear(){
		return year;
	}

}
