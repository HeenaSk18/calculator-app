package com.runner;

import com.cal.Calculator;

public class Runner {

	public static void main(String[] args) {
		System.out.println("TECH WITH JATIN");
		System.out.println("Calculator App");
		Calculator cal=new Calculator();
//		System.out.println(cal.add(10, 20));
		double result=cal.add(10, 20);
		System.out.println("RESULT Add "+result);
		
		result=cal.subtract(30, 20);
		System.out.println("RESULT Sub "+result);
		
		result=cal.multiple(11, 20);
		System.out.println("RESULT Mul "+result);
		
		result=cal.divide(10, 20);
		System.out.println("RESULT Div "+result);
	}

}
