package labtest1;

public class Vechicle {

	String model;
	double rentalpriceforday;
	
	
	public Vechicle(String ml,double rt)
	{
		this.model=ml;
		this.rentalpriceforday=rt;
		
	}
	
	public double calculaterentalcost(int days)
	{
		return (days* rentalpriceforday);
		
	}
	
	
	
}
