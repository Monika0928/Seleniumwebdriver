//using page factory approcah 
package Pom_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage2 {
// constructor
	WebDriver driver;
	loginpage2(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//locators 
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_user_name ;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_user_pwd ;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement txt_user_btn ;
//	findby annotation will capture the element and store in variable 
	
//	to locate group of web elements 
//	@FindBy(tagName = "a")
//	List<WebElement> links;
	
	
	// Action method 
	 public void  setusername(String user)
	 {
		(txt_user_name).sendKeys("Monika");
	 }
	 public void setpassword(String pwd)
	 {
		(txt_user_pwd).sendKeys("123");
	 }
	 public void clicklogin()
	 {
		(txt_user_btn).click();
	 }
	






}
