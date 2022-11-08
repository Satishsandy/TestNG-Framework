package may16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
  WebDriver driver;
  @Parameters({"Url"})
  @BeforeTest
  public void setup(String Url)throws Throwable
  {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(Url);
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	  Thread.sleep(2000);
  }
  @Parameters({"username","password","stockname","maxprice","minprice"})
  @Test
  public void verifydata(String Username, String Password,String Stockname,String Maxprice,String Minprice)throws Throwable
  {
	  
	  driver.findElement(By.xpath("//input[@id='useremail']")).sendKeys(Username);
	  driver.findElement(By.xpath("//input[@id='userpass']")).sendKeys(Password);
	  driver.findElement(By.xpath("//input[@id='loginsubmit']")).click();
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[text()='My Watchlist']")).click();
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("(//input[@value='+ Add Stock'])[1]")).click();
	  
	  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	  
	  new Select(driver.findElement(By.xpath("//input[@name='stocksearch']"))).selectByVisibleText(Stockname);
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  
	  driver.findElement(By.id("maxprice")).sendKeys(Maxprice);
	  driver.findElement(By.id("minprice")).sendKeys(Minprice);
	  
	  driver.findElement(By.id("add-stock-submit")).click();
	  Thread.sleep(3000);
	  driver.close();
	  
	
	  
	  
	  
  }
  @AfterTest
  public void tearDown()
  {
  	driver.close();
  }
}
