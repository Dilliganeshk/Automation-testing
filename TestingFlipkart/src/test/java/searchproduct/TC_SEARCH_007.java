package searchproduct;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class TC_SEARCH_007 {

		WebDriver driver;
		
		@BeforeMethod
		void setUp(){
			
			WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
		}
		
		@Test
		void checkfunctionality() throws InterruptedException  {
			
			driver.get("https://www.flipkart.com/search?q=mobiles&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_1_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_1_na_na_na&as-pos=1&as-type=RECENT&suggestionId=mobiles%7CMobiles&requestId=0bebe1e7-30ec-446d-a6c1-e19daf2e1b0f&as-backfill=on");
			
			//Filtering based on price
			driver.findElement(By.xpath("//div[@class='_1YAKP4']//option[@value='7000']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='_3uDYxP']//option[@value='20000']")).click();
			Thread.sleep(3000);
			
			
			
			WebElement actualresult = driver.findElement(By.xpath("//div[@class='_3sckoD']"));
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

		
		
		



