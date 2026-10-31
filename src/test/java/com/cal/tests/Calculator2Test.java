package com.cal.tests;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cal.Calculator;

public class Calculator2Test {
	private Calculator cal = new Calculator(); //instance variable

	
	@Test(description = "Verify Calculator Add functionality for addition of 2 int number", groups = { "smoke", "sanity" })
	public void add_TwoIntegerNumbers_returnReuslt() {
//		Calculator cal = new Calculator();
		String data=System.getProperty("data");
		System.out.println("Running Test "+data);
		assertEquals(cal.add(20, 20), 40);
	}

	
}
