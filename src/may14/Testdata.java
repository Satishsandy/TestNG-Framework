package may14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testdata {
	WebDriver driver;
	@Parameters({"Browser","URL"})
	@BeforeTest
	public void launchURLtest  (String Browser,String URL) {
		System.out.println("Running browser is:"+Browser);
		if(Browser.equals("chrome")) {
			driver= new ChromeDriver();
		
		}
		else if(Browser.equals("firefox"))
		{
			driver= new FirefoxDriver();
			
		}
		else {
		System.out.println("Browser is not valid:");
		}
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Parameters({"Username","Password"})
	@Test
	public void validatedata(String username,String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
	}
	@AfterTest
	public void tearDown(){
		driver.close();
		
	
	}
	

}
