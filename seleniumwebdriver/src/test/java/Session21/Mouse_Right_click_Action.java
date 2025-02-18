package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Right_click_Action {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement	Button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		Actions act = new Actions(driver); //import driver as parameter 
		
		//right click on button 
		act.contextClick(Button).build().perform();
		

		//click on copy
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		Thread.sleep(50000);
		
		//close the popup
		driver.switchTo().alert().accept();
		
		
		
	}

}
