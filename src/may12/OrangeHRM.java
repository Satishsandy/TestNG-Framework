package may12;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class OrangeHRM {
	WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://orangehrm.qedgetech.com/");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
	 Reporter.log("Before Test,true");
  }
  @Test
  public void Admin() {
	  driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
	  Reporter.log("executing Admin",true);
	   }
  @Test(priority=0)
  public void Pim() {
	  driver.findElement(By.xpath("//b[text()='PIM']")).click();
	  Reporter.log("executing Pim",true);
	   }
  @Test
  public void Leave() {
	  driver.findElement(By.xpath("//b[text()='PIM']")).click();
	  Reporter.log("executing Leave",true);
	   }
  @Test(priority=1)
  public void Time() {
	  driver.findElement(By.xpath("//b[text()='Time']")).click();
	  Reporter.log("executing Time,true");
	   }
  @Test
  public void Performance() {
	  driver.findElement(By.xpath("//b[text()='Time']")).click();
	  Reporter.log("executing Performance",true);
	   }
  @Test
  public void Dashboard() {
	  driver.findElement(By.xpath("//b[text()='Dashboard']")).click();
	  Reporter.log("executing Dashboard",true);
	   }
  @AfterTest
  public void tearDown() {
	  Reporter.log("\"Running After test",true);
	  driver.close();
  }

}
