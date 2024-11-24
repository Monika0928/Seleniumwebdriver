//grouping sanity tc.
package Testng_Grouping;

import org.testng.annotations.Test;

public class logintests {

	@Test(priority=1 , groups= {"sanity"})
	void loginbymail() {
		System.out.println("this is login by email.");
	}
	@Test(priority=2, groups= {"sanity"})
	void loginbyfb() {
		System.out.println("this is login by fb....");
	}
	
	@Test(priority=3, groups= {"sanity"})
	void loginbytwitter() {
		System.out.println("this is login by twitter...");
	}
}
