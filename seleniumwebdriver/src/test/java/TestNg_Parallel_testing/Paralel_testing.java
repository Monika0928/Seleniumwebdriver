package TestNg_Parallel_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Paralel_testing {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException // value=chrome , chrome is stored in br string variable
	{
		switch (br.toLowerCase())
		{
		case "chrome" :driver=new ChromeDriver(); break; // will exit from just switch case 
		case "edge" : driver=new EdgeDriver(); break;
//		case "firefox" : driver=new FirefoxDriver(); break;
		default : System.out.println("invlaid browser"); return;// will exit from entire setup method
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test(priority=1)
	void testlogo() {
	boolean	status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	Assert.assertEquals(status, true);
	}
	@Test(priority=2)
		void testitle() {
			Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		}
	@Test(priority=3)
	void testurl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterClass
	void teardown() {
		driver.quit();
	}
}
