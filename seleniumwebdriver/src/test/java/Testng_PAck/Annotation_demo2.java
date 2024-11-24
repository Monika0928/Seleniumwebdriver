// before and after class 
package Testng_PAck;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//TC2:
//1.Login :  is prerequisite @Before class
//2.Search :  @Test  //test method will execute seperatly 
//3.Adv search: @Test
//4.Logout:  @After class 


public class Annotation_demo2 {
	@BeforeClass
	void login() {
		System.out.println("This is login.........");
	}
	@Test (priority=1)
	void search() {
		System.out.println("this is search..........");
	}
	@Test(priority =2)
	void advanc () {
		System.out.println("advance search........");
	}
	@AfterClass
	void logout() {
		System.out.println("this is logout");
	}
	
}
