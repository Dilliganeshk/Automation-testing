package customersupport;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_CUSTOMERSUPPORT_001 {
	
	WebDriver driver;
	@BeforeMethod
	void setUp()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	
	@Test
	void hoverable()throws InterruptedException {
		
	
	driver.get("https://www.flipkart.com/");
	//driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).click();
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9490946190");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("santhosh1999");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
Thread.sleep(2000);
System.out.println("Before");   
WebElement mainele=driver.findElement(By.xpath("//div[@class='exehdJ'][.=' More ']"));
System.out.println("After");
System.out.println("after"+mainele);
mainele.click();
mainele.click();
Thread.sleep(2000);
System.out.println("Before2");
WebElement childele=driver.findElement(By.xpath("//a[@href='/helpcentre']//child::div[contains(text(),'24x7 Customer Care')]"));
System.out.println("After2");
Thread.sleep(2000);
childele.click();
	}
	
	@AfterMethod
	void tearDown()
	{
driver.close();
driver.quit();
}
}