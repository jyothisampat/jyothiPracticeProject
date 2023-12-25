package coreSeleniumQSPprgms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchCroAndFirefox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		WebDriver driver1 = new ChromeDriver();
//		driver1.manage().window().maximize();
//		Thread.sleep(2000);
	}

}
