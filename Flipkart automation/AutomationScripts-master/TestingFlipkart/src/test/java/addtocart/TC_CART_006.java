package addtocart;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class TC_CART_006 {

		WebDriver driver;
		@BeforeMethod
		void setUp() {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		
		@Test
		void addquantity() throws InterruptedException {
			driver.get("https://www.flipkart.com/redmi-note-10-aqua-green-64-gb/p/itm1820ea99832a9?pid=MOBGF47C9VZTMQPM&lid=LSTMOBGF47C9VZTMQPMCAOTGE&marketplace=FLIPKART&q=redmi+note+10&store=tyy%2F4io&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_1_5_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_1_5_na_na_ps&fm=SEARCH&iid=0e238c64-f342-4f83-9219-216adfa2dbe7.MOBGF47C9VZTMQPM.SEARCH&ppt=sp&ppn=sp&ssid=1h8pqpe43k0000001626511732830&qH=37347601431fd8b4");
			driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
			Thread.sleep(3000);
			WebElement qty = driver.findElement(By.xpath("//body/div[@id='container']/div/div[1]/div[1]/div[1]"));
			
			qty.getAttribute("value");
			WebElement plus = driver.findElement(By.xpath("//body/div[@id='container']/div/div/div/div[2]"));
			plus.click();
			Thread.sleep(3000);	
			WebElement addqty = driver.findElement(By.xpath("//body/div[@id='container']/div/div[2]/div[1]/div[1]"));
			
			addqty.getAttribute("value");
			
			
	}
		@AfterMethod
		void tearDown()
		{
			driver.close();
		}

}
