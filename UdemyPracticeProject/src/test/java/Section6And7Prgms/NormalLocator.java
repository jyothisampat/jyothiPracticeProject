package Section6And7Prgms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NormalLocator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));
		Thread.sleep(1000);
		
		
		
		//xpath on amazon page
		//id("CardInstance3qquJdNfgVp1TvUrkG8BJQ")/descendant::img
		//id("nav-flyout-icp")/descendant::span[.='ಕನ್ನಡ']

	}

}
