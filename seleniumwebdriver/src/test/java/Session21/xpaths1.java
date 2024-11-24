// xpaths methodss***************************************************
package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpaths1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	// xpaths with single attribute 
//	 driver.findElement(By.xpath("//input[@class='gsc-input']")).sendKeys("moni");
		
//	// xpaths with multiple attribute
//	 driver.findElement(By.xpath("//input[@class='gsc-input'][@title='search']")).sendKeys("patne");
	 
	 //xpath with and or operators 
//	 driver.findElement(By.xpath("//input[@id='radio2' or @type='radio']")).click();
//	 
	 // xpath with inner text ()
//	 driver.findElement(By.xpath("//*[text() = 'Text Area Field']")).click();
//		 boolean  displayedstatus = driver.findElement(By.xpath("//*[text () ='Page One']")).isDisplayed();
//		 System.out.print(displayedstatus );
		
//		  String text = driver.findElement(By.xpath("//*[text () ='Page One']")).getText();
//		  System.out.println(text);
		
		
      //xpath with  contains()
	driver.findElement(By.xpath("//input[contains(@id, 'ert1')]")).click();
		
	 //xpath with start - with ()
	//driver.findElement(By.xpath("//input[starts-with(@id, 'conf')]")).click();
		
	// Chained xpath ()
		driver.findElement(By.xpath("//div[@class='widget-content']/img")).click();
	 driver.close();
		 

	} 

}
