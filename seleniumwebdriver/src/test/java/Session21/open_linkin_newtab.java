package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class open_linkin_newtab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://deyga.in/");
		WebElement newlaunch= driver.findElement(By.xpath("//a[normalize-space()='New Launch']"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(newlaunch).keyUp(Keys.CONTROL).perform();//we can use this to launch the element in new tab 
		//but focus is on first page .

	}

}
