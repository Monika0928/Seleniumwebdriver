//Conditional methods *****************************************
package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalmethods2 {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
//		isdisplayed() is accessed from webelement class
//	WebElement	logo = driver.findElement(By.xpath("//input[@id='radio1']"));
//	System.out.println(logo.isDisplayed());
//	
//	  is enabled() 
     Boolean	status = driver.findElement(By.xpath("//input[@class='gsc-input']")).isEnabled();
     System.out.println(status );

     //is selected()
    Boolean male_id= driver.findElement(By.xpath("//input[@id='radio1']")).isSelected();
    System.out.println(male_id);
    WebElement female_id= driver.findElement(By.xpath("//input[@id='radio2']"));
    
//    male_id.click();
//    System.out.println(male_id.isSelected());
//    
//   female_id.click();
//   System.out.println(female_id.isSelected());
//   
//   Boolean correct = driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected();
//   System.out.println(correct);
//    
	}

}
