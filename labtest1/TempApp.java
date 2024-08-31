package labtest1;

import java.util.Scanner;


public class TempApp {

	public static void main(String[] args) {
		TemparuteConverter T1= new TemparuteConverter();
		TemparuteConverter T2= new TemparuteConverter();
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("enter the temp in celcuis-:");
		double celcuis =sc.nextDouble();
		
		System.out.println("enter the temp in faranheight:-");
		
		double faranheight =sc.nextDouble();
		
		double con1= T1.celcuistofaranheight(celcuis);
		System.out.println("celcuis   "+celcuis+""+" equalto ="+"faranhieght:"+con1);
		
		double con2= T2.faranheighttoCelcuis(faranheight);
		System.out.println("faranheight   "+faranheight +"is "+"  equalto ="+"celcuis"+con2);
		
		
		
		
		

	}

}
