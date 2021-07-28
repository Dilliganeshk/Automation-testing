package addtocart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_CART_005 {
	
	WebDriver Check_remove;
	
	@BeforeMethod
	void  setup() {
		WebDriverManager.chromedriver().setup();
		Check_remove = new ChromeDriver();
	}
	
	@Test
	void remove() throws InterruptedException {
		Check_remove.get("https://www.flipkart.com/realme-8-pro-infinite-black-128-gb/p/itmaa9c73f5a987c?pid=MOBGYV98ZWDGFWKT&lid=LSTMOBGYV98ZWDGFWKTQQHZXF&marketplace=FLIPKART&q=realme+8+pro&store=tyy%2F4io&srno=s_1_1&otracker=AS_Query_OrganicAutoSuggest_3_6_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_3_6_na_na_na&fm=SEARCH&iid=03893acb-cc1c-45d3-ae2e-48a0cee457c5.MOBGYV98ZWDGFWKT.SEARCH&ppt=pp&ppn=pp&ssid=0wgvswpuw00000001626509954399&qH=6227e733eed05f4d");
		Check_remove.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
		Thread.sleep(3000);
		Check_remove.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div[1]//div[2]//div[1]//div[2]//div[2]//div[2]")).click();
		Thread.sleep(3000);
		Check_remove.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
		Thread.sleep(3000);
		System.out.println("Test case is passed");
	}
		
			
			@AfterMethod
			void tearDown()
			{
		Check_remove.close();
	
	}
}

