package may14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Addcart {
	WebDriver driver;
	@Test
	public void addcart() throws Throwable
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])[9]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])[10]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[normalize-space()='PROCEED TO CHECKOUT'])[1]")).click();
		Thread.sleep(2000);
		
		String url = driver.findElement(By.id("productCartTables")).getText();
		System.out.println(url);
		
		String amount =driver.findElement(By.xpath("(//span[@class='totAmt'])[1]")).getText();
		System.out.println(amount);
		
		driver.close();
	}

}
