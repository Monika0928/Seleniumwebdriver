//alert without switch()****************************************************************
package Session21;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertwithoutswitch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));//explicitwait declaration 
		
		//alert without switch()

		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
	Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());

	System.out.println(myalert.getText());
	myalert.accept();
	}
	

}
