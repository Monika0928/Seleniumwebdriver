//select hiddend ropdown *******************************************************8
package Session21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecthiddendropdwn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//Login steps
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//click on PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		//click on dropdown
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
		
		
//		Thread.sleep(5000);
//		//Click on one option 
////		driver.findElement(By.xpath("//span[normalize-space()='Content Specialist']")).click();
//		
//		//count number of option
//	List<WebElement> options = driver.findElements(By.xpath("//div[@role=\"listbox\"]//span")); // first capture all the elements
//	System.out.println(options.size());
//	
//	//printing statement
//	for ( WebElement op: options) {
//		System.out.println(op.getText());
//	}
	
	}

}