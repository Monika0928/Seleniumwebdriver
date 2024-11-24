//Hard assertions 
package Testng_PAck;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertions {

	@Test 
	void test() {
		Assert.assertEquals("xyz", "xyz"); //compare 2 value if equal test pass if not fail 
		Assert.assertEquals(123, 124);
		
//		Assert.assertEquals("abc", 124);
//		Assert.assertNotEquals(123, 124); //passed
		
//		Assert.assertNotEquals(123, 123); //failed
//		Assert.assertTrue(false); // failed 
		
//		Assert.assertTrue(true); // passed 
//		Assert.assertTrue(1==2); //failed
		
//		Assert.assertTrue(1==1); //passed 
		
		Assert.fail(); // without having any test method, condition , will fail the test method 
	}
}
