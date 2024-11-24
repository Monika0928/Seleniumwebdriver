package Testng_PAck;

import org.testng.annotations.Test;

//open app
//login
//logout 
// -2 -1 0 1 2 3
public class exe1 {
	@Test(priority=100)
	void open() {
		System.out.println("opening application..................");
	}
	@Test(priority =50)
	void login() {
		System.out.println("Login to application");
	}
	@Test(priority=10)
	void logout () {
		System.out.println("logout from application");
	}
	
}
