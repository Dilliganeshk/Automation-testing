package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_LOGIN_001 {
	
	WebDriver driver;
	
 @BeforeMethod
	void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	@Test
	void VerifyLogin() throws InterruptedException
	{
		driver.get("https://www.flipkart.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8328490187");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Hanshu@09");
		WebElement login =driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Login')]"));
		login.click();
		
		
		String pagenameString=driver.getTitle();
		SoftAssert softAssert= new SoftAssert();
		
		if(pagenameString.equals("Online Shopping Site for Mobiles,Electronics,Furniture,Grocery"))
		{
			WebElement Myaccount= driver.findElement(By.className("exehdJ"));
			softAssert.assertEquals(Myaccount.isDisplayed(),true);
			System.out.println("after checking");
			Thread.sleep(3000);
		}
		
		
		
		// Boolean b_Myaccount =Myaccount.isDisplayed();
		 
		 
		 //if(b_Myaccount)
			//{
			//	System.out.println("Test case is pass");
			//}
			//else
			//{
				//System.out.println("test case is failed");
			//}
		 //Thread.sleep(2000);
		
		 
	}
	
	@AfterMethod
		 void tearDown()
		 {
		driver.close();
	}
	}
