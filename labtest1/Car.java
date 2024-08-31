package labtest1;

public class Car extends Vechicle  {
 int numseats;
 
	public Car(String ml, double rt,int ns) {
		super(ml, rt);
		this.numseats=ns;
		
	}
	
	public void display()
	{
		System.out.println("model is:"+this.model);
		System.out.println("rental is:"+this.rentalpriceforday);
		System.out.println("seatcount is:"+this.numseats);
		
		
	}

	

}
