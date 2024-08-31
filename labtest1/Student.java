package labtest1;

public class Student {

	
	int age;
	String name;
	
	
	public Student(String nm, int ag)
	{
		this.age=ag;
		this.name=nm;
		
	}
	
	public void displayinfo()
	{
		 System.out.println("name is:"+this.name);
		  
		  System.out.println("age is:"+this.age);
       
       
	}
}

