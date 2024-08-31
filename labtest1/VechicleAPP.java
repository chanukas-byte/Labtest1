package labtest1;

public class VechicleAPP {

	public static void main(String[] args) {
	
		
		Car c1= new  Car ("AUDI",3000.00,7);
		
		
		
		c1.display();
		
		System.out.println("your cost is :"+c1.calculaterentalcost(4));
		
		
		BIke B1= new BIke ("BMW",1000.00,2000);
		
		B1.displayinfo();
		
		
		System.out.println("your cost is :"+B1.calculaterentalcost(6));
		
		

	}

}
