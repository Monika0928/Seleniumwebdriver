package Session21;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taking_screenshots {
	

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
	
			//1.FUll page screenshot
//		TakesScreenshot ts = (TakesScreenshot)driver;
//			
//			//getScreenshot retruns file type object
//		File sourcefile = ts.getScreenshotAs(OutputType.FILE);//dont know the sourcefile location //getscreenshot method we caling from takesscreeshot inteface 
//		
//		//get screenshot into our location 
//		File targetfile = new File("C:\\Users\\Monika\\eclipse-workspace\\seleniumwebdriver\\src\\test\\resources\\Screenshots\\fullpg.png");
//		
//		//copy source file into target location 
//		sourcefile.renameTo(targetfile);
	
		//2.taking screenshot of specific section
//			WebElement	featuredsection = driver.findElement(By.xpath("//div[@class='homepage-activeuser-content']"));
		File	sourcefile = featuredsection; // getScreenshotAs we are calling form webelement
		File targetfile = new File("C:\\Users\\Monika\\eclipse-workspace\\seleniumwebdriver\\src\\test\\resources\\Screenshots\\section.png");
		sourcefile.renameTo(targetfile);
//		
		//3.Capture the screenshot of webelement
		WebElement logo = driver.findElement(By.xpath("//a[@class='nav-link-hed'][normalize-space()='Solutions']"));
//		File sourcefile = logo.getScreenshotAs(OutputType.FILE);
//		File targetfile = new File("C:\\Users\\Monika\\eclipse-workspace\\seleniumwebdriver\\src\\test\\resources\\Screenshots\\elemt.png");
//		sourcefile.renameTo(targetfile);
	}
	
	
	

}
