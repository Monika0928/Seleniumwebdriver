package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("welcome");
		
		Actions act = new Actions(driver);
		
		//cntrl +A -select text -keydown is for pressing the key 
		//here just control A press and releasin 
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();	
		
		
		//ctrl+c copy text to clikpboard
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//tab shift to 2nd box 
		//pressing the tab and releasing the tab 
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//ctrl +v pass the text 
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		
	
	
	}

}