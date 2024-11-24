package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hoveraction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://deyga.in/");
		
		WebElement	combo = driver.findElement(By.xpath("//a[@class='new-color-style menu-color-6 Heading u-h6 nav-menu']"));
		WebElement combo2 = driver.findElement(By.xpath("//a[@class='Link Link--secondary'][normalize-space()='Combo']"));
		
		Actions act = new  Actions(driver); // action class expects a driver as a prameter
		
		//using the act object of action class we can access all the methods of action class
		
		//mouse over action 
		 act.moveToElement(combo).moveToElement(combo2).click().build().perform();  
		//build is a method which will create an action and perform () will complete an action 
		
		//Right click  action 
	
	
	
	}

}
