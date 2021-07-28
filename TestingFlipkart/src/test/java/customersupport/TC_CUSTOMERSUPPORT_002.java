package customersupport;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_CUSTOMERSUPPORT_002 {
	
	
	WebDriver driver;
	@BeforeMethod
	void setUp()
	{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	}
	@Test
	void clickable() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).click();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9490946190");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("santhosh1999");
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
				Thread.sleep(2000);
				WebElement mainele=driver.findElement(By.xpath("//div[@class='exehdJ'][.=' More ']"));
				mainele.click();
				mainele.click();
	}
	
			@AfterMethod
			void tearDown()
				{
				driver.close();
				}	
	
	
}

