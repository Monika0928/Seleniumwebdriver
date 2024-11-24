package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_scrollbar {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//1.scrolldown the page by pixel number 
//	js.executeScript("window.scrollBy(0, 400)",  "");
//	//	return windowYOFFset means where scroll bar has stopped that position will be captured 
//	System.out.println(js.executeScript("return window.pageYOffset;"));
	
	//2.scroll the page upto the specified element
	/*WebElement ele  =driver.findElement(By.xpath("//div[@id='resizable']"));
	js.executeScript("arguments[0].scrollIntoView();",  ele);
	System.out.println(js.executeScript("return window.pageYOffset;")); */ // use pagexoffset for horizontal bar
	
	//3.scroll till  end of the page 
	
	// "document.body.scrollHeight" this parameter is representing end of parameter 
	js.executeScript("window.scrollBy(0, document.body.scrollHeight)");//for x axix use scrool weadth
	System.out.println(js.executeScript("return window.pageYOffset;"));//capture how many pixel its moved 
	Thread.sleep(5000);
	// go back to initial position 
	js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");//for x axis use scrollwidth 

	
	
	

	}

}
