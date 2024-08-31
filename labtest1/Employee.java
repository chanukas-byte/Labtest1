package labtest1;

public class Employee {
	 String name;
	 double salary;
	 

	 public Employee(String nm,double s)
	 {
		 this.name=nm;
		 this.salary=s;
		 
	 }
	 
	 public void displayinfo()
	 {
		 System.out.println("name is :"+this.name);
		 System.out.println("salary  is :"+this.salary);
		 
		 
	 }
	 
}

