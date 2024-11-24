//Icons that are not clickabel -- > SVG ELements 
package Session21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Svg_elements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//relative xpath using Text method 
//		driver.findElement(By.xpath("//span [normalize-space()='Time']")).click();
		
		//identifying SVG Elements 
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M422,332H9')]")).click();

	}

}
