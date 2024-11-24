//Driver get methods ******************************************************
package Session21;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.semconv.SemanticAttributes.FaasTriggerValues;

public class Getmethods1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//get (url) - opens url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		// gettitle() - returns title of web page 
		//System.out.println(driver.getTitle());
		
		//getcurrenturl
		System.out.println(driver.getCurrentUrl());
		
		//getpagesource
//		System.out.println(driver.getPageSource());
		
		//getwindowhandle() return ID of the single browser window 
		//System.out.println(driver.getWindowHandle());
		
		//getwindowhandles()
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();

	 Set<String>	 getstring = driver.getWindowHandles();
	 System.out.println( getstring);
	}

}
