
//javascript executor***********************************************************************
package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_Executerdemo1 {

	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@id='name']")).sendKeys("MOnika");
		
		//perform same thing using javascript executor
		
		WebElement	inputbox =  driver.findElement(By.xpath("//input[@id='name']"));
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		chrome driver is child of javascript executor hence it can hold its variable driver directly .and no need of upcasting
		JavascriptExecutor js=driver;
		
		//cal executescript method ()
		//arguments[0] is used to pass element  and set value attribute as monika 
		js.executeScript("arguments[0].setAttribute('value','monika')",inputbox);
		
		WebElement	radio = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", radio);
	}

}
