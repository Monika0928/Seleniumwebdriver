// css selector*************************************************
package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize(); // is a command through whcih we can maximize the window
		
		
		//	tag #id********
//		driver.findElement(By.cssSelector("input#b-query")).sendKeys("mac");
		
		// tag .class name ***************
//		driver.findElement(By.cssSelector("input.gsc-input")).sendKeys("mac");
		
		//	 tag attribute *************
//		driver.findElement(By.cssSelector("input[class='gsc-input']")).sendKeys("mac");	// double quotes one inside another double q is not allowed so change attribute value to single quote 
	
		//  tag class attribute ************
		driver.findElement(By.cssSelector("input.gsc-input[name='q']")).sendKeys("monika");
	
	}

}
