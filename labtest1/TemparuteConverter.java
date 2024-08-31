package labtest1;

public class TemparuteConverter {
	double temp;
	
	public TemparuteConverter()
	{
		this.temp=0;
		
		
	}
	public double gettemp()
	{
		return temp;
		
	}
	public double celcuistofaranheight(double celcuis)
	{
		return( celcuis * 9/5) +32;
		
	}
	
	public double faranheighttoCelcuis(double faranheight)
	{
		return (faranheight-32)*5/9;
		
	}
	

}
