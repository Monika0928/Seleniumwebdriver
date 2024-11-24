package Testng_PAck;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng_dependencies {

	@Test(priority=1)
	void openapp() {
		Assert.assertTrue(true);// expected true but passing false //now after adding dependency only if open app pass remaing will pass
	}
	
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login() {
		Assert.assertTrue(true);// expected true but passing false 
	}
	@Test(priority=3, dependsOnMethods= {"login"})
	void search() {
		Assert.assertTrue(false);
	}
	@Test(priority=4, dependsOnMethods= {"login", "search"})// to execute advance search both login and search shud pass
	void addvsearch(){
		Assert.assertTrue(true);
	}
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout(){
		Assert.assertTrue(true);
	}
}
