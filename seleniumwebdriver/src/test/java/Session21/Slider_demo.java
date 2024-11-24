package Session21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act = new Actions(driver);
			
		// when we us
		//minimum slider 
			
//		WebElement	min_slide = driver.findElement(By.xpath("//div[@class='price-range-block']//span"));
//		System.out.println("location of minimum slider before moving :"+ min_slide.getLocation());// this method will return x-axis and y-axis 
//		//System.out.println("location of minimum slider:"+ min_slide.getLocation().getX()); // getx will return only x value 
//		//since its horizontal slider we can only change x axis 
//		act.dragAndDropBy(min_slide, 100, 254).perform();
//		System.out.println("location of minimum slider after moving :"+ min_slide.getLocation());//(161,250)
	
		//Maximum slider 
		
		WebElement	max_slider = driver.findElement(By.xpath("//span[2]"));
		System.out.println("location of maximum slider:"+max_slider.getLocation());//(544 , 250)
		act.dragAndDropBy(max_slider, -100, 250).perform(); // sice we are reducing the value we should minus 
		System.out.println("location of maximum slider after moving:"+max_slider.getLocation());//(442, 250)
	
	}

}
