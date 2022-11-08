package may12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class SecondTestNgClass {
WebDriver driver;
@BeforeTest
public void setUp()throws Throwable
{
	driver = new ChromeDriver();
   driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://primusbank.qedgetech.com/");
	driver.findElement(By.name("txtuId")).sendKeys("Admin");
	driver.findElement(By.name("txtPword")).sendKeys("Admin");
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
	Reporter.log("Running setup",true);
}
@Test
public void branches()
{
	driver.findElement(By.xpath("(//img)[5]")).click();
	Reporter.log("Executing Branch Test",true);
}
@Test
public void roles()
{
	driver.findElement(By.xpath("(//img)[6]")).click();
	Reporter.log("Executing roles Test",true);
}
@Test
public void users()
{
	driver.findElement(By.xpath("(//img)[7]")).click();
	Reporter.log("Executing user Test",true);
}
@AfterTest
public void tearDown()
{
	driver.close();
	Reporter.log("Running ");
}

}






