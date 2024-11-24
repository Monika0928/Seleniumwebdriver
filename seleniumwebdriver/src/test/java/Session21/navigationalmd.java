package Session21;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalmd {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");// accepts URL only in string format
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		URL myurl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// accepts URL in string and URL object format 
//		driver.navigate().to(myurl);
		
		

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
//		driver.navigate().forward();
//		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
	
	
	
	}

}
