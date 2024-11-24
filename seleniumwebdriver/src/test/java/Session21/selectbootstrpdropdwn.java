//select bootstrapdropdown***************************************************
package Session21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.matcher.EqualityMatcher;

public class selectbootstrpdropdwn {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2#google_vignette");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); // opens dropdown option 
		
		//1.select single option 
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//2.Capture all the options and find out size 
//		List<WebElement>	options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
//		System.out.println(options.size()); // 14
		
		//3.Printing the options from the dropdown
		
//		for(int i=0; i <options.size();i++) {
//			System.out.println(options.get(i).getText());
//		}
		//OR
//		for(WebElement  op:options ) {
//			System.out.println(op.getText());
//		}
		
		//4.Select multiple options from the dropdown
//		for(WebElement  op:options ) {
//			
//			if(op.getText().equals("Java") || op.getText().equals("Python"))
//			op.click();
//		}
//		
		
		
		
	}

}
