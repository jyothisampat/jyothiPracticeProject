package TestNupdates;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPrgm
{
	@DataProvider
	public Object[][] bms()
	{
		Object[][] arr = new Object[2][2];//[2]set  [2]data
		arr[0][0]="Bangalore";
		arr[0][1]="mysore";
//		arr[0][2]="Bagalakot";
		
		arr[1][0]="QSP";
		arr[1][1]="TYSS";
//		arr[1][2]="WFH";
		return arr;
	}
	@Test(dataProvider="bms")
	public void getData(String src, String dst)
	{
		System.out.println("From    "+src+"     to  "+  dst);
	}
	

}
