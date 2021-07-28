package login;

	import login.ExcelUtility;

	import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.stream.Location;

	import org.apache.poi.ss.usermodel.DataFormatter;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.reporter.configuration.Theme;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LoginWithExternalData {
		
		
		WebDriver driver;

		@BeforeTest
		void setUp()
		{

			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		
		}
		
		
		
		@DataProvider // it enables ur method to act as data provider
		String[][] Data() throws IOException
		{
			String path = "C:\\Users\\poornesh\\eclipse-workspace\\Documents\\Nareshit online\\TestingFlipkart\\Data Files\\DataSheet.xlsx";     //Location ofLocation Thefile
			ExcelUtility eUtility= new ExcelUtility(path);
					
			int r= eUtility.getRowCount("Sheet1");
			int c= eUtility.getCellCount("Sheet1",r);
			System.out.println("no of rows"+r);
			System.out.println("no of cols"+c);
			
			String userdata[][]  = new String[r][c] ;// declaring array
			
		
			//addingvalues
			for(int i =1; i<=r;i++)//reading rows  data from excel file
			{ 
				for(int j=0; j<c;j++ )//reading cols data from excel file
				{ 
					
					userdata[i-1][j]=  eUtility.getCellData("Sheet1", i, j);
					System.out.print("["+i+"]["+j+"] value of userdata check = "+userdata[i-1][j]);
					
				}
				System.out.println();
			}
			
			 return userdata;
			
				 
		}
		
		
		                                                                          // by adding - login please connect to data for inputs
		@Test(description = "It will test both neagtive and positive test cases", dataProvider ="Data" )
		
		void Login(String username, String pass) throws InterruptedException
		{	
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(pass);
			driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Login')]")).click();
			

	}
		
		@AfterTest
		void tearDown()
		{
			driver.close();
			driver.quit();
		}
	}

