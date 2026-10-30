package com.cal.test;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cal.Calculator;

public class CalculatorTestCase {
	private Calculator cal = new Calculator(); //instance variable

	
	@Test(description = "Verify Calculator Add functionality for addition of 2 int number", groups = { "smoke", "sanity" })
	public void add_TwoIntegerNumbers_returnReuslt() {
//		Calculator cal = new Calculator();
		assertEquals(cal.add(20, 20), 40);
	}

	@Test(description = "Verify Calculator Add functionality for subtraction of 2 int number", groups = {"unit", "smoke", "sanity" })
	public void sub_TwoIntegerNumbers_returnReuslt() {
//		Calculator cal = new Calculator();
		Assert.assertEquals(cal.subtract(20, 10), 10);
	}

	@Test(description = "Verify Calculator Add functionality for multiple of 2 int number", groups = { "unit", "smoke", "sanity" })
	public void mul_TwoIntegerNumbers_returnReuslt() {
//		Calculator cal = new Calculator();
		Assert.assertEquals(cal.multiple(20, 10), 200);
	}

	@Test(description = "Verify Calculator Add functionality for division of 2 int number", groups = { "unit", "smoke", "sanity" })
	public void div_TwoIntegerNumbers_returnReuslt() {
//		Calculator cal = new Calculator();
		Assert.assertEquals(cal.divide(20, 10), 2);
	}
	
	@Test(description = "Verify Calculator Add functionality for diving Number with Zero", groups = { "unit", "smoke", "sanity" }, expectedExceptions = ArithmeticException.class)
	public void div_DivideNumberByZero_throwArithmeticException() {
//		Assert.assertEquals(cal.divide(20, 0), 2);
		cal.divide(20, 0);
	}
	
}
