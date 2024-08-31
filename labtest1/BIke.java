package labtest1;

public class BIke extends Vechicle  {
	int enginecapcity;
	 

	 public BIke(String ml, double rt,int egc) {
		super(ml, rt);
		this.enginecapcity=egc;
		
		
	}
	 
	 public void displayinfo()
	 {
	 
	 System.out.println("model is:"+this.model);
	 System.out.println("rental  is:"+this.rentalpriceforday);
	 System.out.println("capacity  is:"+this.enginecapcity);
		
		
		
	 
	 }
	
	 
	

}
