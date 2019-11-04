public class BasicCalculator implements Calculation
{
	private double value1;
	private double value2;
	
	public BasicCalculator(){}
	public BasicCalculator(double v1,double v2)
	{
		this.value1=v1;
		this.value2=v2;
	}
	
	public void setValue1(double v1)
	{
		this.value1=v1;
	}
	
	public double getValue1()
	{
		return value1;
	}
	
	public void setValue2(double v2)
	{
		this.value2=v2;
	}
	
	public double getValue2()
	{
		return value2;
	}
	
	public double add()
	{
		return (value1+value2); 
	}
	
	public double subtract()
	{
		return (value1-value2);

	}
	
	public double multiply()
	{
		return (value1*value2);
		
	}
	
	public double divide()
	{
		return (value1/value2);
		 
	}
}