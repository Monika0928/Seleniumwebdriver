//handling frames ***************************************************************/
package Session21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleframes {

	public static void main(String[] args) {
//		https://ui.vision/demo/webtest/frames/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame1 - first we need to switch to the frame *******************************************
		
		WebElement frame1 =	driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
//		
//		//passed frame as webelement // once it is switched we can interact with the element
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");//driver is here in frame 1
//		
//		//	with this defautl command we can get driver back to page from frame1 and again go from page to frame2
//		driver.switchTo().defaultContent();// it will go back to default page
//		
		//Frame2 ***********************************************************************************
		
//		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));//switch to frame 
//		driver.switchTo().frame(frame2);//pass the webelement in command 
//		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Welcome");//handle the element of frame 2
//		
//		driver.switchTo().defaultContent();// it will go back to default page
//		// *************************************************************************************************
//		
//		//Frame3****************************************************************************************
//	
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));//switch to frame 
		driver.switchTo().frame(frame3);//get a webelement
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Welcome");//perform action on webelement
		
		//Now interact with iframe inside the frame3 
//		since only 1 iframe inside a frame3 we can use index concept index(0)
		
		driver.switchTo().frame(0); //switching to frame using index 
		
		//TO locate element in iframe is difficult . so take that webpage address copy  and try to find the xpath so that is becomes easy
		//to locate the elements 
		driver.findElement(By.xpath("//div[@id='i8']")).click();
		
		driver.switchTo().defaultContent();// it will go back to default page
		
	
	
	
}

}
