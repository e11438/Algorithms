import java.util.Arrays;


public class ObjSort {
	
	public static void main(String args[]){
		 
		Student[] students = new Student[4];
 
		Student pineappale = new Student("nimal", 70); 
		Student apple = new Student("Anuradha", 95); 
		Student orange = new Student("Tharaka", 82); 
		Student banana = new Student("Isuru", 90); 
 
		students[0]=pineappale;
		students[1]=apple;
		students[2]=orange;
		students[3]=banana;
		
		//sort with student's marks  
		Arrays.sort(students);
 
		int i=0;
		for(Student temp: students){
		   System.out.println("Students " + ++i + " : " + temp.getName() + 
			", Marks : " + temp.getMarks());
		}	
		
		//sort with name of students
		Arrays.sort(students, Student.studentNameComparator);
		
		i=0;
		for(Student temp: students){
		   System.out.println("Students " + ++i + " : " + temp.getName() + 
			", Marks : " + temp.getMarks());
		}
		
		System.out.println("studentName1".compareTo("studentName2"));
		System.out.println("sdasdasd".compareTo("sdsd"));
		Integer num=23;
		System.out.println(num.compareTo(56));
		
	}	

}
