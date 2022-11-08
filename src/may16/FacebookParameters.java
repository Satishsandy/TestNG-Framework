package may16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookParameters {
WebDriver driver;
@Parameters({"url"})
@BeforeTest
public void setup(String app) throws Throwable
{
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get(app);
	//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	Thread.sleep(3000);
}
@Parameters({"fname","sname","email","reenteremail","password","dbay","bmonth","byear"})
@Test
public void validatefacebook(String firstname,String surname,String email,String reemail,String pass,String day,String month,String year) throws Throwable
{
	driver.findElement(By.linkText("Create New Account")).click();
	WebDriverWait mywait = new WebDriverWait(driver, 10);
	mywait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("firstname")));
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.findElement(By.name("firstname")).sendKeys(firstname);
	driver.findElement(By.name("lastname")).sendKeys(surname);
	driver.findElement(By.name("reg_email__")).sendKeys(email);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(reemail);
	driver.findElement(By.name("reg_passwd__")).sendKeys(pass);
	new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText(day);
	new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText(month);
	new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText(year);
	driver.findElement(By.xpath("//input[@value='2']")).click();
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	Thread.sleep(4000);
}
@AfterTest
public void tearDown()
{
	driver.close();
}
}
















