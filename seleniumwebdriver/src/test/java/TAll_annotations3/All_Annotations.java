//All annotations 
package TAll_annotations3;

import org.testng.annotations.*;


public class All_Annotations {
	@BeforeSuite
	void bs() {
		System.out.println("this is before suite c3");
	}
	
	@AfterSuite
	void as() {
		System.out.println("this is after suite method c3");
	}
	@BeforeTest
	void bt() {
		System.out.println("this is befor test method");
	}

	@AfterTest
	void at() {
		System.out.println("this is after test method");
	}
	@BeforeClass
	void bc() {
		System.out.println("is before class method");
	}
	
	@AfterClass
	void ac() {
		System.out.println("is after class method");
	}
	@BeforeMethod
	void bm() {
		System.out.println("is before method");
	}
	@AfterMethod
	void am() {
		System.out.println("is after method");
	}
	
	// test methods 
	@Test(priority=1)
	void tm1() {
		System.out.println("this is test method1..........");
		}
	@Test(priority=2)
	void tm2() {
		System.out.println("this is test  method2 ...........");
	}



}