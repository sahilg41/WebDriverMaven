import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {
	
	public static WebDriver driver;
		
	    @Test
		public void launchBrowser() throws InterruptedException{
	    	WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("http://localhost:8090/clear/");
			Thread.sleep(2000);
			driver.findElement(By.id("UI")).sendKeys("P2001");
			driver.close();
			
		}
	    
	    
		
	

	}

	
