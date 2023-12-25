package TestNupdates;

import org.testng.annotations.Test;

public class BasicPrgm
{
	
	// it will execute based on ASCII value 
	@Test(priority=1)
	public void add()
	{
		int a= 12;
		int b=3;
		int c=a+b;
		System.out.println("sum of two number is "+c+" ");
	}
	@Test(groups="smoke")
	public void mul()
	{
		int d= 12;
		int e=3;
		int f=d*e;
		System.out.println("mul of two number is "+f+" ");
	}
	@Test(priority=-1)
	public void div()
	{
		int g= 12;
		int h=3;
		int i=g/h;
		System.out.println("div of two number is "+i+" ");
	}
	@Test(groups="regression")
	public void subtraction()
	{
		int k= 12;
		int h=3;
		int l=k-h;
		System.out.println("subtraction of two number is "+l+" ");
	}
	

}
