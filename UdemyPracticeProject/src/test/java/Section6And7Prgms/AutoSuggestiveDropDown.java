package Section6And7Prgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiveDropDown 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);
		//driver.findElement(By.id("ui-id-315")).click();
		List<WebElement> opts = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		for (WebElement opt : opts)
		{
			if (opt.getText().equalsIgnoreCase("India"))
			{
				opt.click();
				break;
			}
			
		}
	}

}
