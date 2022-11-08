package listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListenerClass.class)
public class Listers {
	@Test
	public void testmethod1() {
		System.out.println("Testmethod1");
	}
	@Test
	public void testmethod2() {
		System.out.println("Testmethod2");
		Assert.assertTrue(false);
	}
	@Test(timeOut = 1000)
	public void testmethod3()throws Throwable {
		Thread.sleep(3000);
		System.out.println("Testmethod3");
	}
	@Test(dependsOnMethods ="testmethod3" )
	public void testmethod4() {
		System.out.println("Testmethod4");
	}




}
