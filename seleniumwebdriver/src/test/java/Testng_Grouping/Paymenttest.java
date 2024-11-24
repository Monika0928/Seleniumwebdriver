//all these comes under sanity , regression ,(functional)
package Testng_Grouping;

import org.testng.annotations.Test;

public class Paymenttest {

	@Test(priority=1, groups= {"sanity","regression","functional"})
	void paymentinrs() {
		System.out.println("payment in rupees........");
	}
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void paymentindollars() {
		System.out.println("payment in dollars.....");
	}
}
