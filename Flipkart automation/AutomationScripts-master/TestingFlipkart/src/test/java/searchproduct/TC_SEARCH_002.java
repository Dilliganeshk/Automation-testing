package searchproduct;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class TC_SEARCH_002 {
		WebDriver driver;
		
		@BeforeMethod
		void setUp() {
			
			WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
		}
		
		@Test
		void checkfunctionality() throws InterruptedException  {
			
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
			//Verify the recommendation of product entered in the text field

			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
			Thread.sleep(5000);
			
			
			WebElement actualresult = driver.findElement(By.xpath("//input[@name='q']"));
			boolean result = actualresult.isDisplayed();
			if(result) 
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


