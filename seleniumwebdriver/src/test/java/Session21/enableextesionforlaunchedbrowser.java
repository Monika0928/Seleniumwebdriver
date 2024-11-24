//enable extensions at run time 
package Session21;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class enableextesionforlaunchedbrowser {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		File file = new File("C:\\Users\\Monika\\Documents\\Custom Office Templates\\SelectorsHub.crx");
		options.addExtensions(file);
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://text-compare.com/");
			driver.manage().window().maximize();
			
	}

}
