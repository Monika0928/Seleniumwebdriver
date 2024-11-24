// Locators ***********************************************************
package Session21;

import java.awt.Image;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		//launch the browser 
		WebDriver driver = new ChromeDriver();	    
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
//		//Name 
//		driver.findElement(By.name("textboxn")).sendKeys("mac");
//		
//		//Id 
//		boolean isdisplayedstatus  = driver.findElement(By.id("pah")).isDisplayed();
//		System.out.println(isdisplayedstatus);
		
//		//link text and partial link text 
		
//		driver.findElement(By.linkText("Home")).click();
		
		//class name 
		List<WebElement> headerlinks  = driver.findElements(By.className("title"));
		System.out.println("No of header links :" + headerlinks.size());
		
		//tage name 
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println("No of links in portal :"+links.size() );
		
		List<WebElement> images =  driver.findElements(By.tagName("img"));
		System.out.println("Number of images :" + images.size() );
	
		

	}
}
