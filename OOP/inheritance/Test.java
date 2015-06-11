
import java.util.ArrayList;
import java.util.HashMap;

class Test { 
    
    public static void main_test(String [] args) {
	Students a = new Students("Saman Jinadasa", "E/11/890", "889123234V", 
				"2011", 3.05); 
	a.display();
	System.out.println("Student reg data " + a.getYear());

	System.out.println("We have " + Students.getNumberofStudents() + 
			   " in batch");
    }

    public static void main_array(String [] args) {

	ArrayList <Students> e11 = new ArrayList<Students>(); 
	
	Students a = new Students("Saman Jinadasa", "E/11/890", "889123234V", 
				"2011", 3.05); 
	e11.add(a); 
	
	a = new Students("Sam Liyanage", "E/11/554", "90091223232V", "2011", 1.2);
	e11.add(a); 

	for(int i = 0; i < e11.size(); i++) { 
	    a = e11.get(i); 
	    a.display(); 
	}
    }    

    public static void main(String [] args) { 
	HashMap<String, Students> e11 = new HashMap<String, Students>(); 

	Students a = new Students("Saman Jinadasa", "E/11/890", "889123234V", 
				"2011", 3.05); 
	e11.put("E/11/890", a); 

	a = new Students("Sam Liyanage", "E/11/554", "90091223232V", "2011", 1.2);
	e11.put("E/11/554", a); 

	e11.get("E/11/890").display();
    }

	    
} // end Test class
 