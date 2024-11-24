package Session21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_pickers {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/"); //date picker website
		
		//switch to frame **************************************************************************
		driver.switchTo().frame(0);
		
		//methods1 using send keys 
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/05/2024");
		
		//method 2 use date picker
		String month = "July";
		String year ="2023";
		
		String date = "15";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//select the month and year 
		while(true) {
			
	String 	Currentmonth = 	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	System.out.println(Currentmonth);
	String currentyear =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	
	if(Currentmonth.equals(month)  && currentyear.equals(year) ) {
		break;
		
	}
//		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();	//future date
	//OR**************
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previouse date 
		}
		//select date
	List<WebElement>Alldate= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
	for(WebElement dt:Alldate) {
		if(dt.getText().equals(date)) {
			dt.click();
			break;
		}
	}
	
	}
}