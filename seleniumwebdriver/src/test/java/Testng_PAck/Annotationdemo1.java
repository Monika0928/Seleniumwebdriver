package Testng_PAck;


	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Annotationdemo1 {

	//1.Login : @before method
	//2.Search :  @Test
	//3.Logout:  @After method
	//4.Login 
	//5.Adv search - @Test
	//6.Logout

	//-----------------------------------------------------------------------------------
		@BeforeMethod
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
		@AfterMethod
		void logout() {
			System.out.println("this is logout");
		}
		

	}


