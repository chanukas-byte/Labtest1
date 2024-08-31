package labtest1;

import java.util.Scanner;


public class Mathoperation {
	
	
	public void drawmutiplication(int num , int range)
	{
		for (int i=0;i<range;i++)
		{
			System.out.println(num+"*"+i+"="+(num*i));
			
		}
		
	}
	
	public int factorial() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the positive number:");
		int num =sc.nextInt();
		
		int res=1;
		for (int i=1;i<=num;i++)
		{
			res=res*i;
			
		}
		
		return res;
		
		
		
	}

}
