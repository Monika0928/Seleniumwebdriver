package Testng_Pk2_annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {

	@Test
	void xyz () {
		System.out.println("This is xyz form c2");
	}
	
	@AfterTest
	void at() {
		System.out.println("this is after test method");
	}
}
