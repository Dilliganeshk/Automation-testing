package addtocart;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_CART_001 {

	WebDriver driver;
	
	@BeforeMethod
	void setUp() {
		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
	}
	@Test
	void addcart() throws InterruptedException {
		driver.get("https://www.flipkart.com/realme-8-pro-infinite-black-128-gb/p/itmaa9c73f5a987c?pid=MOBGYV98ZWDGFWKT&lid=LSTMOBGYV98ZWDGFWKTQQHZXF&marketplace=FLIPKART&q=realme+8+pro&store=tyy%2F4io&srno=s_1_1&otracker=AS_Query_OrganicAutoSuggest_3_6_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_3_6_na_na_na&fm=SEARCH&iid=03893acb-cc1c-45d3-ae2e-48a0cee457c5.MOBGYV98ZWDGFWKT.SEARCH&ppt=pp&ppn=pp&ssid=0wgvswpuw00000001626509954399&qH=6227e733eed05f4d");
		driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
		Thread.sleep(5000);
		WebElement addcart = driver.findElement(By.xpath("//span[normalize-space()='Place Order']"));
		boolean result = addcart.isDisplayed();
		if(result)
		{
			System.out.println("Test is passed");
		}
		else 
		{
			System.out.println("Test is failed");
		}
		//Thread.sleep(5000);
	
	}
	
	@AfterMethod
	void tearDown()
	{
		driver.close();
	}

}

