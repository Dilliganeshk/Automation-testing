package searchproduct;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_SEARCH_006 {

	
WebDriver Check_brand;
	
@BeforeMethod
	void setUP() {
		WebDriverManager.chromedriver().setup();
		Check_brand = new ChromeDriver();
	}

   @Test
	
	void brandcheck() throws InterruptedException {
		Check_brand.get("https://www.flipkart.com/search?q=mobiles&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_HistoryAutoSuggest_1_6_na_na_na&otracker1=AS_QueryStore_HistoryAutoSuggest_1_6_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=mobiles%7CMobiles&requestId=5e8e7769-bef7-49ac-beac-def43424e0c7&as-backfill=on");	
		Check_brand.findElement(By.cssSelector("div[title='realme'] div[class='_24_Dny']")).click();	
		Thread.sleep(3000);
		WebElement actualresult = Check_brand.findElement(By.xpath("//div[@class='_3ztiZO']//div[@class='_3sckoD']"));
		Thread.sleep(3000);
		boolean result = actualresult.isDisplayed();
		if(result)
		{
			System.out.println("Test is passed");
		}
		else 
		{
			System.out.println("Test is failed");
		}
		Thread.sleep(5000);
   }
   
   @AfterMethod
   void tearDown()
   {
	   Check_brand.close(); 
   }

}
