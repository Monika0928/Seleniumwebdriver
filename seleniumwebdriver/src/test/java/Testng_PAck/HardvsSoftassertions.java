// problems in hard assertions
package Testng_PAck;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

public class HardvsSoftassertions {

	@Test
	void hardassertion() {
		System.out.println("Testing ________");
		System.out.println("testng__________");
		
		Assert.assertEquals(1, 2); // if this assertion is failed next statements will not be executed 
		
		System.out.println("testng......");
		System.out.println("testng.........");
	}
//	
	@Test
		void softassertion() {
			System.out.println("Testing ________");
			System.out.println("testng__________");
			
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(1, 2); //softassertion
			
			System.out.println("testng......");
			System.out.println("testng.........");
			System.out.println("testng........");
			
			sa.assertAll();// its a mandatory method to execute method correctly if not softassertion method always show passed .
	}
	
}
	
	
