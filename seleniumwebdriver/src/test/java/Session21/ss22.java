package Session21;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ss22 {

	
		public static void main(String[] args)  {
			//launch the browser 
			WebDriver driver = new ChromeDriver();	    
			driver.get("https://www.purplle.com/");
			driver.manage().window().maximize();
			
			String title = driver.getTitle();
			System.out.println(title);
			
			String pageSource = driver.getPageSource();
System.out.println(pageSource);

String currentURL = driver.getCurrentUrl();
System.out.println(currentURL);

String single = driver.getWindowHandle();
System.out.println(single);

Set<String> many = driver.getWindowHandles();
System.out.println(many);



}
}