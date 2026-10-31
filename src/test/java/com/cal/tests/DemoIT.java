package com.cal.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoIT {
	
	@Test(description = "Dummy IT Test" )
	public void dummyIntegratioTest() {
		Assert.assertEquals(true, true);
	}
}
