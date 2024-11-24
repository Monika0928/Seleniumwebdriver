package Session21;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args) throws IOException {
		/*
		Link should have href = "https://xyz.com"
		https://xyz.com  --->hit  server  --->capture the status code 
		If the status code is < 400 it is not a broken link 
		If the status code is >= 400 then it’s a broken link 

		 */
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		List<WebElement>  link=  driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		int noofbrokerlinks = 0;
		for(WebElement linkelement :link) //reading one by one element in variable linkelement
		{
			String hrefattvalue =linkelement.getAttribute("href"); // because href value is in string form
			if(hrefattvalue==null || hrefattvalue.isEmpty()) // href cannot be empty or null 
			{
			System.out.println("hrefttvalue is null or empty . so not possible to check");	
			continue ;
			}
			//hit url to the server 
			//hrefattvalue < --  url is in string format and convert it in url format 
			
			try {
				
			
			URL linkURL = new URL(hrefattvalue);//convert href String  value into URL format 
			HttpURLConnection	conn = (HttpURLConnection) linkURL.openConnection(); // open conections to server 
			conn.connect(); //connect to server and send request to server 
			
			if(conn.getResponseCode()>=400) 
			{
				System.out.println("Broken link ");
				noofbrokerlinks++;
			}
			else 
			{
				System.out.println("Not broken link");
			}
		}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("Number of broken links :"+ noofbrokerlinks); // 42
	}
}


