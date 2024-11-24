package Testng_PAck;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orange_HRM {
	WebDriver driver; // making it global can be accessd throught the class  // create variable outside the method and use variable 
	
	@Test(priority=1)
		void openapp () {
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
			
		}
	
	@Test(priority=2)
	void logo() {
		boolean  logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Is displayed "+logo);
	}
	
	@Test(priority=3)
	void login() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	@Test (priority=4)
	void close() {
		driver.close();
	}
	
	
	
	

}
