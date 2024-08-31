package labtest1;

public class Parttimeepmloyee extends Employee{

	int othrs;
	
	public Parttimeepmloyee(String nm, double s,int oh) {
		super(nm, s);
		this.othrs=oh;
		
	}
	
	public void displayinfo()
	{
		System.out.println("name is:"+this.name);
		System.out.println("salary  is:"+this.salary);
		System.out.println("ot hrs is:"+this.othrs);
		
	}

	


}
