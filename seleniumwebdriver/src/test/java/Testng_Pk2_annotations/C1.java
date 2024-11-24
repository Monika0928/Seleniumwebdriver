// Test 
package Testng_Pk2_annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	
	@Test
	void abc () {
		System.out.println("This is abc from c1");
	}
	@Test
	void dfg(){
		System.out.println("this is dfg method");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("this is befor test method");
	}

}
