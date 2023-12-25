package Section6And7Prgms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.=' Chennai (MAA)']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[.=' Bengaluru (BLR)'])[2]")).click();
//		
//		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']/descendant::a[.=' Bengaluru (BLR)']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/descendant::a[.='16']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/descendant::a[.='2']")).click();
		Thread.sleep(1000);
		
	}

}
