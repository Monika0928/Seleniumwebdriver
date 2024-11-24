package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Doubleclick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult"); // if we have frame id we can directly add in index
		
		WebElement	box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = 	driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button =   driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
			
		box1.clear();
		box1.sendKeys("Welcome");
		
		//double click  action on button
		
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
			
		
			
		//validate : Box 2 contains "Welcome"
		String	text = box2.getAttribute("value"); // here since the box2 value dont have inner text we are using value of text box1
		//and if we dont have inner text for html code we can use getattribute and value as element .
		System.out.println(text);
		
		if(text.equals("Welcome")) {
			System.out.println("Successfully copied the text ");
		}
		else {
			System.out.println("text not copied");
		}

	}

}
