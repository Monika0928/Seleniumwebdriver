//assertions 
package Testng_PAck;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {

	@Test
	void testTItle() // if we dont user assertion method will always pass if the condition is pass or fail
	{
		String  exp_title="opencart";
		String act_title="opencart";
		
//		if(exp_title.equals(act_title))
//		{
//			System.out.println("test passed ");
//		}
//		else {
//			System.out.println("Test failed");
//		}
		
//		OR
//		Assert.assertEquals(exp_title, act_title);
	
//		OR
		if(exp_title.equals(act_title))
			{
				System.out.println("test passed ");
			Assert.assertTrue(true);
			}
			else {
				System.out.println("Test failed");
				Assert.assertTrue(false);
			}
		
	}
}
