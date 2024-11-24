// how to handle multiple window and close parent or child window - refere session 28 from last 50min 
package Session21;

import java.awt.Window;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlesbrowserwindow2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
	Set<String>	windowid = driver.getWindowHandles();
	
	for(String winid:windowid) {
		String title =	driver.switchTo().window(winid).getTitle();
	System.out.println(title);
	
	if(title.equals("OrangeHRM") || title.equals("Human Resources Management Software | OrangeHRM")) // we caby adding all the titlesn close sngle or multiple browser 
	{
		driver.close();
		break; // if we add break control comes out of for loop and nothing else action performed if want to perform 
				//close multiple browser dnt use break
	}
	}

	}

}
