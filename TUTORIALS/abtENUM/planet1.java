import java.util.Scanner;

public enum planet1 {
	Mercury(1,3.303e+23,2.4397e6),
	Venus(2,4.869e+24,6.0518e6),
	Earth(3,5.976e+24,6.37814e6),
	Mars(4,6.421e+23,3.3972e6),
	Jupiter(5,1.9e+27,7.1492e7),
	Saturn(6,5.688e+26,6.0268e7),
	Uranus(7,8.686e+25,2.5559e7),
	Neptune(8,1.024e+26,2.4746e7);
	
	private final int num;
	private final double mass;
	private final double radius;
	
	planet1(int  num1,double mass1,double radius1){
		num=num1;
		mass=mass1;
		radius=radius1;
	}
	
	private double getMass(){
		return mass;
	}
		
	private double getRadius(){
		return radius;
	}
	
	public static final double G=6.673e-11;
	public static double w;
	double surfaceGravity(){
		return G*mass/(radius*radius);
	}
	
	
	double surfaceWeight(double otherMass){
		return otherMass*surfaceGravity();
		
	}
	
	
	public void howItIs(planet1 planet,double mass){
		switch(planet){
		case Mercury:
			 w =planet.surfaceWeight(mass);
			break;
		case Venus:
			 w =planet.surfaceWeight(mass);
			break;
		case Earth://case SUNDAY:
			 w =planet.surfaceWeight(mass);
			break;
		case Mars:
			 w =planet.surfaceWeight(mass);
			break;
		case Jupiter:
			 w =planet.surfaceWeight(mass);
			break;
		case Saturn:
			 w =planet.surfaceWeight(mass);
			break;
		case Neptune:
			 w =planet.surfaceWeight(mass);
			break;
			default:
				break;
		}
	}
	public static void main(String args[]){
		/*if(args.length!=1){
			System.err.println("usage:java planet<earth weight>");
			System.exit(-1);
		}
		*/
		Scanner weight=new Scanner(System.in);
		
		System.out.print("Enter the Weight on the Earth in Kg:");
		
		double earthWeight=weight.nextDouble();
		double mass=earthWeight/Earth.surfaceGravity();
		
		for (planet1 p:planet1.values())
			System.out.printf("Your weight on %s is %f\n", p,p.surfaceWeight(mass));
		
		
		
			
	}



}
