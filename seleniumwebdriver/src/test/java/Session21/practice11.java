package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice11 {
public static void main(String args[]) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/account");
	
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("abc100@gmail.com");
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[normalize-space()='Account']")).isDisplayed();
	
}
}
