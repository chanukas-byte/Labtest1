package labtest1;

public class Coursename extends Student  {

	String coursename;
	
	
	public Coursename(String nm, int ag,String csn) {
		super(nm, ag);
		this.coursename=csn;
		
		
	}
	public void displaycourseinfo()
	{
		System.out.println("name is:"+this.name);
		System.out.println("age is:"+this.age);
		System.out.println("course name is:"+this.coursename);
	}

	

}
