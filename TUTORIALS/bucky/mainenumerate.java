import java.util.EnumSet;


public class mainenumerate {
	
	public static void main(String args[]){
		for(enumerate people:enumerate.values())
			//String name=String.format("%s\t%s\t%s\n",people,people.getDesc(),people.getyear());
			System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getyear());
		
			
			System.out.println("\nAnd now for the range of constants!!!\n");
			for (enumerate people:EnumSet.range(enumerate.kelsey,enumerate.candy) )
				
				System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getyear());
					
	} 
	

}
   