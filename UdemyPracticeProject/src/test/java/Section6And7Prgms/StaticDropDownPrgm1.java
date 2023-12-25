package Section6And7Prgms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class StaticDropDownPrgm1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//**********OLD DROPDOWN CURRENCY DETAILS********************
		
//		WebElement StaticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select s = new Select(StaticDropDown);
//		s.selectByIndex(3);
//		//to check whether the option is selected or nor ...............verification
//		System.out.println(s.getFirstSelectedOption().getText());
//		s.selectByVisibleText("AED");
//		System.out.println(s.getFirstSelectedOption().getText());
//		s.selectByValue("INR");
//		System.out.println(s.getFirstSelectedOption().getText());
		
		//********************NEW/UPDATED DROPDOWN PASSENGER DETAILS*************************
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		
		//By default 1 adult is selected
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//add 3 adults using for loop
//		for (int i = 1; i <3; i++) 
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
//		Thread.sleep(1000);
//		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//add 3 adult using while loop
		int i =1;
		while (i<3) 
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		Thread.sleep(1000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//verify that 4 adults are selected or not
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
	}

}

