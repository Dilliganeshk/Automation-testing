package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TC_LOGIN_002 {
	
	WebDriver driver;
	
	@BeforeMethod
	void setUp()
	
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	@Test
	
	void VerifyLogin()
	{
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//form[@autocomplete='on']//input[@type='text']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("1334");
		driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Login')]")).click();
		
	}
	
	@AfterMethod
	void tearDown()
	{
		driver.close();
		
	}

}
