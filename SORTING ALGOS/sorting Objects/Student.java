import java.util.Comparator;


public class Student implements Comparable<Student> {
	
	private String name;
	private int marks;
	
	public Student(String name,int marks){
		this.name=name;
		this.marks=marks;		
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}
	
	public int compareTo(Student compStudent) {		 
		int comparemark = compStudent.getMarks();
 
		//if we want to sort in ascending order
		return this.marks - comparemark; 
	}	
	
	public static Comparator<Student> studentNameComparator  = new Comparator<Student>() {

		public int compare(Student student1, Student student2) {

			String studentName1 = student1.getName().toUpperCase();
			String studentName2 = student2.getName().toUpperCase();

			//if we want to sort in ascending order
			return studentName1.compareTo(studentName2);

			}

	};
	
	
}
