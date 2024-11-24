package Session21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_pickers2 {
	
//	it is a user defined method for converting month from string - month object 
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//input i want to select form dropdown
		String reqyear= "2021";
		String reqmonth= "June";
		String reqdate = "20";
		
		driver.switchTo().frame("frame-one796456169");
	
		//click on calender icon inside frame 
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		//select year drop down
		WebElement yeardd = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectyear = new Select(yeardd);
		selectyear.selectByVisibleText(reqyear);
		
		//covert string month into object 
		

	}

}
