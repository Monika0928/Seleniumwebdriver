 // Alerts ******************
package Session21;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertss {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Alert with ok button .*****************************************************
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(3000);
		Alert myalert = driver.switchTo().alert(); //return type is ALert 
		System.out.println(myalert.getText());
		myalert.accept();
//		
		//Alert with ok and cancel button ********************************************
		
//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		Thread.sleep(3000);

		 //driver.switchTo().alert().accept();//close alert using ok button
//		 driver.switchTo().alert().dismiss();//close alert using cancel button
		 
		 //Promt alert ***************************************************************
		 
//		 driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
//		 Thread.sleep(3000);
//		Alert myalert1 =  driver.switchTo().alert();
//		
//		myalert1.sendKeys("welcome");
//		myalert1.accept();
//		driver.close();
	
	}

}
