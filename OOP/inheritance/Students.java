
class Students { 
    private String name; 
    private String nid; 
    private String eNo; 
    private String regDate; 
    private double gpa; 

    private static int numberofstudents=0; 

    public Students(String name, String eNo, String nid, 
		   String regDate, double gpa) { 
	this.name    = name; 
	this.nid     = nid; 
	this.eNo     = eNo;
	this.regDate = regDate; 
	this.gpa     = gpa; 	
	numberofstudents++;
    }

    public void display () { 
	System.out.println("Name:\t" + this.getName() + 
			   " (" +  this.getNID() + ")\n" + 
			   "Reg:\t" + this.eNo + "\n" + 
			   "GPA:\t" + this.gpa);
    }

    public String getName() { 
	return this.name; 
    }

    public String getNID() { 
	return this.nid;
    }

    public int getYear() { 
	return Integer.parseInt(this.regDate);
    }

   
    public static int getNumberofStudents() { 
	return numberofstudents; 
    }
}
    