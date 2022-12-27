package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic 
{
	
		WebDriver driver;
		@BeforeMethod
		public void openapp()
		{
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		@AfterMethod
		public void closeapp() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.quit();
		}
	}
