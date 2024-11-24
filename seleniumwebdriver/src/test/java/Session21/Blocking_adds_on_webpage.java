package Session21;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Blocking_adds_on_webpage {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		File file = new File("C:\\Users\\Monika\\Documents\\Monika\\uBlock-Origin.crx");
		options.addExtensions(file);
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://text-compare.com/");
			driver.manage().window().maximize();

	}

}
