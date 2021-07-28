package searchproduct;

	//import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class TC_SEARCH_003 {


		WebDriver driver;
		
	
		@BeforeMethod
		void setUp(){
			
			WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
		}
		
		@Test
		void checkfunctionality() throws InterruptedException{
			
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
			

			driver.findElement(By.name("q")).sendKeys("airpods");
			
	           WebElement result= driver.findElement(By.xpath("//button[@type='submit']"));
	           result.submit();
			
			Thread.sleep(3000);
			boolean acutalresult = result.isDisplayed();
			if(acutalresult) 
			{
				System.out.println("Test case is passed");
			}
			else
			{
				System.out.println("test case is failed");
			}
		}
		
		@AfterMethod
		void tearDown()
		{
			driver.close();
		}

	}




