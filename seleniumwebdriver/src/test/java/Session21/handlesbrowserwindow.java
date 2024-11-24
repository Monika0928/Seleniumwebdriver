//Browser Window handles 
package Session21;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handlesbrowserwindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		

//		Parent and child window ID is stored in mywindow variable we can print them respectively in 2 ways 
		Set<String>	windowid = driver.getWindowHandles(); // capturing bth window ID 
	
		
		//APproach 1 - convert into set into list and extract because set doesnt have get method**************************
//		
		List<String> windowlist = new ArrayList(windowid);
		String Parentid =windowlist.get(0); //capturing window ids into list  we can switch from one browser window to another 
		String chilid = windowlist.get(1);
			
		//switch to child window
			driver.switchTo().window(chilid);
			System.out.println(driver.getTitle());
			
//			//switch to parent window
//			driver.switchTo().window(Parentid);
//			System.out.println(driver.getTitle());
			
		//Approach 2 using looping statement *******************************************************
		for(String windid:windowid)	// storing the windowid in String storing it in  variable winid
		{
			
		String title = driver.switchTo().window(windid).getTitle(); //we dont no which windowid it is switching so we use get title
		System.out.println(title);

		if(title.equals("OrangeHRM")) // just change the title on whihc ever browser u want to prform action 
		{
			System.out.println(driver.getCurrentUrl());
			//Some validation on parent window
		}
	

	
	
	
	
	
	}}}


