package Pom_Package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class logintest {
	WebDriver driver ;
 @BeforeClass
	void setup() {
	 driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 }

 @Test
 void testlogi() {
//	 call action method from test method and TM will interact with locators an dperform action 
	 loginpage2 lp = new loginpage2(driver);
	 lp.setusername("Admin");
	 lp.setpassword("admin123");
	 lp.clicklogin();
	 
	 Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	
 }
 
 @AfterClass
 void teardown() {
	 driver.quit();
 }
}
