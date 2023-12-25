package coreSeleniumQSPprgms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropDown
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		
	}

}
