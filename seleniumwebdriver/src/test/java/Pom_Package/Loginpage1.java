//without using page factory 
package Pom_Package;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage1 {
	//Constructor - will initiate the driver automatically 
	
	WebDriver  driver;
	
	 Loginpage1(WebDriver  driver)
	{
		this.driver=driver;
	}
	//Locators 
	
	By txt_user_loc = By.xpath("//input[@placeholder='Username']");
	By txt_user_loc1 = By.xpath("//input[@placeholder='Password']");
	By btn_user_loc = By.xpath("//button[normalize-space()='Login']");
	
	//Action  methods 
	 public void  setusername(String user)
	 {
		 driver.findElement(txt_user_loc).sendKeys("Monika");
	 }
	 public void setpassword(String pwd)
	 {
		 driver.findElement(txt_user_loc1).sendKeys("123");
	 }
	 public void clicklogin()
	 {
		 driver.findElement(btn_user_loc).click();
	 }
	
	








}
