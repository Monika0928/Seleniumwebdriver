//explicit wait command
package Session21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expictwaitcmd {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
//		explicit wait 
		WebDriverWait mywait = new WebDriverWait(driver , Duration.ofSeconds(10));// declaration
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
//		How to apply this mywait on element
//		it works on condition aplly untill() and use expectedconditions class
//		take visibilityOfElementLocated() method
		
        WebElement	usertestx = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	    usertestx.sendKeys("Monika");

	  WebElement  userpwd =  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
	  userpwd.sendKeys("123");
	  //		driver.quit();

	  
	}

}
