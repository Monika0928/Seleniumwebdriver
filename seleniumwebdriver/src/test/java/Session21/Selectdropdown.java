//select drop down *******************************************
package Session21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Select - First we should select  the dropdown option 
		
		WebElement dropcount = driver.findElement(By.xpath("//select[@id='country']"));
		
		//We should choose one option in the dropdown
		
		Select drpcount = new Select(dropcount);// take select class object  and pass web element in  a variable 
		
//		using this select object we can perform multiple  operation
		
		drpcount.selectByVisibleText("Japan");
//		drpcount.selectByValue("canada");// value is attribute of element
//		drpcount.selectByIndex(2); // we should assume the index value 
	
//		************************************************************************************************
		//Capture the options from the dropdown -take select class object 
		
		List<WebElement> option = drpcount.getOptions();
		System.out.println(option.size());
		
		//get the option and print
//		for(int i =0; i<option.size(); i++) {
//			System.out.println(option.get(i).getText());
//			
//		}
		
//		enhanced for loop
//		for(WebElement op: option) {
//		System.out.println(op.getText());
//		}
//		
		
		
		
		
		
		
	}

}
