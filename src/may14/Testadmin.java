package may14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testadmin {
	@Test
	public void verifyTittle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String expected= "OrangeHRM";
		String actual=driver.getTitle();
		try {
			Assert.assertEquals(expected, actual,"tittle is not matching");
		}catch(Throwable t) {
			System.out.println(t.getMessage());
		}
		driver.close();
	}

}
