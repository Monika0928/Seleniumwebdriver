//Handling checkboxes********************************************************************
package Session21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1.Select specific checkbox
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2.Selecting mltiple checkbox using looping statements- first capture all check box
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
//		for(int i=0 ; i<checkboxs.size(); i++) {
//			checkboxs.get(i).click();
//		}
//		
//		for(WebElement checkb : checkboxs) // enhanced for loop
//		{
//			checkb.click();
//		}
		
		//3.Select last three check boxes - total CB - no of CB u want to select 7-3=4 starting index should be 4 
//		for(int i=4; i<checkboxs.size() ; i++) {
//			checkboxs.get(i).click();
//			
//		}
		
		//4.Select first 3 checkboxes 
//		for(int i=0; i<3; i++) {
//			checkboxs.get(i).click();
//		}
		
		
		//5.Unselect checkboxes if they are selected 
		
		for(int i=0; i<3; i++) {
		checkboxs.get(i).click();
		}
		Thread.sleep(3000);
		for(int i=0; i<checkboxs.size();i++) {
			checkboxs.get(i).isSelected(); //checks if its selected and clicks again so that it gets diselected .
			checkboxs.get(i).click();
		}
//		
		
	}

}
