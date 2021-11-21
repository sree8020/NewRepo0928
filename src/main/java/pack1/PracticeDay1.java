///This is my First Program to push to GitHub

package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticeDay1 {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\msri4\\Desktop\\Sel _Drivers\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		// Open Chrome Browser
		
		WebDriver driver = new ChromeDriver();
		
		// Navigate to FreeCRM WebSite
		
		driver.get("https://ui.freecrm.com/");
		
		// Maximize the Window
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Verify the given URL provided 
		
		String avalue_url = driver.getCurrentUrl();
		
		String evalue_url = "https://ui.freecrm.com/";
		
		System.out.println("current url :"+ avalue_url);
		
		if(evalue_url.equals(avalue_url))
		{
			System.out.println("The URL of the page currently loaded in the browser");
		}
		else
		{
			System.out.println("The URL of the page currently not loaded in the browser");
		}
		
	  
  }
}
