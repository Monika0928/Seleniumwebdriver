package Session21;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker_using_method {
	
	static void selectfuturedate(WebDriver driver , String month , String year,String date) //select month and year using method calling 
	{
		while(true) {
			
			String 	Currentmonth = 	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			System.out.println(Currentmonth);
			String currentyear =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(Currentmonth.equals(month)  && currentyear.equals(year) ) {
				break;
				
			}
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();	
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

//*************************************************************************************************************************
//	static void selectdate(WebDriver driver, String date) // select date using method calling 
//	
//{
//		//select date
//		List<WebElement>Alldate= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
//		for(WebElement dt:Alldate) {
//			if(dt.getText().equals(date)) {
//				dt.click();
//				break;
//			}
//		}
//	}
////****************************************************************************************************************************
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/"); //date picker website
		
		//switch to frame **************************************
		driver.switchTo().frame(0);
		
		//methods1 using send keys 
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/05/2024");
		
		//method 2 use date picker
		String month = "May";
		String year ="2026";
		
		String date = "15";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
//***************************************************************************************************************
	selectfuturedate(driver,month,year,date);
//	selectdate(driver , date);
//********************************************************************************************************
	}
}
