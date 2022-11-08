package may12;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Primus_Bank {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest()throws Throwable {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Running BeforeTest",true);
		 Thread.sleep(3000);
	  }
  @Test
  public void pBanking()throws Throwable {
	  driver.findElement(By.xpath("(//img[@id='IMG3'])[1]")).click();
	  Reporter.log("Executing pbanking Test",true);
	  Thread.sleep(3000);
  }
  @Test
  public void cBanking() throws Throwable{
	  driver.findElement(By.xpath("(//img)[5]")).click();
	  Reporter.log("Executing cbanking Test",true);
	  Thread.sleep(3000);
  }
  @Test
  public void iBanking()throws Throwable {
	  driver.findElement(By.xpath("(//img)[6]")).click();
	  Reporter.log("Executing ibanking Test",true);
	  Thread.sleep(3000);
  }
   @AfterTest
  public void afterTest() {
	   driver.close();
	   Reporter.log("Running afterTest",true);
  }

}
