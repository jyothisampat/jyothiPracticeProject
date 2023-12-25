package Section6And7Prgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
//		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	
//*******************count the number of check boxes*****************************************
//		List<WebElement> count = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		System.out.println(count.size());
	
		
//***************************select all the chech boxes**********************************************
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i = 0; i < checkboxes.size(); i++) 
		{
			WebElement ele = checkboxes.get(i);
			Thread.sleep(2000);
			ele.click();
		}
		
	}

}
