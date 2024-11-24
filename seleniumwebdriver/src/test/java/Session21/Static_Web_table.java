package Session21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Web_table {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1.find the number of rows in a table*****************************************************
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();//since it return count we shpuld store in int data type 
		//OR 
//		driver.findElement(By.tagName("tr")); **wen we have single table in page then we use it 
		System.out.println(rows); //7 
		
		//2.find the number of headers/columns in a table******************************************************
		
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(cols);
		
		//3.Read the data from specific row and column (5th row 1st column)*****************************
		
		String	text =driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
//		System.out.println(text);
		
		//4.Read all the data from rows and column *********************************************************
		
//		System.out.println("BookNmae"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
//		for(int r=2; r<=rows ; r++) {
//		 {
//			for(int c=1; c<=cols; c++) {
//				String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				System.out.println(value+"\t");
//				//we cannot pass vriable/strings  r, c directly in xpath so pass in in + and double "" quotes 
//				}
//				System.out.println();
//			 {
				
//			} 
//			}
//		} 
		
		//5.read data based on condition 
		
		//Print author name whose name is mukesh 
		 for(int r=2; r<rows; r++) {
	
		String author =	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		if(author.equals("Mukesh")) {
		
			String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
		System.out.println(bookname+ "\t" + author);
		}
		} 
		
//		//6.find the total prize of all books 
//		int total =0;
//		for(int r=2 ; r<=rows; r++) {
//			String prize = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
////			Prize storing the value in string format so ocnvert into int 
//			
//			total = total+Integer.parseInt(prize);
//		}
//		System.out.println("Total proze "+total);//7100
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
