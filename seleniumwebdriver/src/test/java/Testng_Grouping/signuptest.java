package Testng_Grouping;

import org.testng.annotations.Test;

public class signuptest {

	@Test(priority=1 , groups = {"regression"})
	void signupbyemail() {
		System.out.println("this is isgnup by email.........");
	}
	@Test(priority=2, groups = {"regression"})
	void signupbyfb() {
		System.out.println("this is signup by fb........");
	}
	@Test(priority=3,groups = {"regression"})
	void signupbytwitter() {
		System.out.println("this is signup by twitter.....");
	}
	
}
//<exclude name ="regression"/>