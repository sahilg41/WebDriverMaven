import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {
	
	public static WebDriver driver;
		
	    @Test
		public void launchBrowser(){
	    	WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://gmail.com");
			driver.close();
			
		}
	    
	    
		
	

	}

	
