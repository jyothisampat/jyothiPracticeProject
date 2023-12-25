package TestNupdates;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodPrgm 
{
	@Test
	public void hi()
	{
		System.out.println("hi sampu baby ");
		//Assert.fail();
	}
	@Test(dependsOnMethods="hi")
	public void hello()
	{
		System.out.println("hello jyo baby ");
		
	}
	@Test(dependsOnMethods="hello")
	public void good()
	{
		System.out.println("you are looking too good bangari ");
	}
	@Test(dependsOnMethods="good")
	public void bye()
	{
		System.out.println("ok thank you baby...bye");
	}
	@Test(invocationCount=4)
	public void seeyou()
	{
		System.out.println("ok baby...see you later");
	}
	

}
