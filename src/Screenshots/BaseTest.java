package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}
	@AfterMethod
	public void screenshotCapture() {
		
	}
	public void captureScreenshot(String filename) {
		File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\satish\\Pictures\\Screenshots.png"+filename);
		try{
			FileUtils.copyFile(screen, dst);
		}catch(IOException e) {
			e.getMessage();
		}
		
		
		System.out.println("Screenshot saved Successfully");
	}

}
