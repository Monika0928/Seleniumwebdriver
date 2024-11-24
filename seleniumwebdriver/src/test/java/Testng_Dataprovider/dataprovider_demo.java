package Testng_Dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_demo {
	
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider="dp")
	void testlogin(String email, String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/account");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd); //no need to hardcode data 
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Account']")).isDisplayed();
		
		}
	
	
	@AfterClass
	void teardown() { 
		driver.close();
	}
	
	@DataProvider(name = "dp",  indices = {0,3} ) //by adding the indices we can just executes the no of time we want to execute 2 times 0 , is 1st and 2nd index 
	Object loginData() {
		Object data[][]= //object kind of data can hold any type of data
			{
			{"abc@gmail.com","test123"},
			{"xyz@gmailcom","test@345"},
			{"moni@gmail.com","test@123"},
			{"patne@gmail.com","test@123"},
				
		};
		return data;
	}
}
