
public class mainCar {
	public static void main(String args[]){
		System.out.println("All car prices; ");
		for(Car c:Car.values())
			System.out.println(c+" costs "+c.getPrice()+" thousand dollars.");
		
	}

}
