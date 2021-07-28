package searchproduct;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class TC_SEARCH_005 {
		
		WebDriver Check_rating;
		
		@BeforeMethod
		void setUp()
		{
			WebDriverManager.chromedriver().setup();
			Check_rating = new ChromeDriver();
		}
		
		@Test
		void rating() throws InterruptedException {
		Check_rating.get("https://www.flipkart.com/search?q=mobiles&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_HistoryAutoSuggest_1_6_na_na_na&otracker1=AS_QueryStore_HistoryAutoSuggest_1_6_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=mobiles%7CMobiles&requestId=5e8e7769-bef7-49ac-beac-def43424e0c7&as-backfill=on");	
		WebElement expectedresult = Check_rating.findElement(By.cssSelector("div[title='4★ & above'] div[class='_24_Dny']"));
		expectedresult.click();
		Thread.sleep(5000);
		WebElement actualresult = Check_rating.findElement(By.xpath("//div[@class='_3ztiZO']"));
		boolean result = actualresult.isDisplayed();
		if(result) 
		{
			System.out.println("Test is passed");
		}
		else 
		{
			System.out.println("Test is failed");
		}
		
		}
		
		@AfterMethod
		void tearDown()
		{
			Check_rating.close();
		}

	}


