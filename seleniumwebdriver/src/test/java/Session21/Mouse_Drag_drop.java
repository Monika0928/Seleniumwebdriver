package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Drag_drop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act = new Actions(driver);
		
		//drag and drop 
		WebElement madrid =	driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(madrid, italy).perform(); // madrid is source element and italy is target element 

	}

}
//div[@id='box7']//div[@id='box106']//div[@id='box106']