package com.cal;

public class Calculator {
	public double add(double numberOne, double numberTwo) {
//		int result = numberOne+numberTwo;
//		return result;
		System.out.println("Number One "+numberOne);
		System.out.println("Number Two "+numberTwo);
		System.out.println(numberOne+" + "+numberTwo);
		return numberOne+numberTwo;
	}
	public double subtract(double numberOne, double numberTwo) {
		System.out.println("Number One "+numberOne);
		System.out.println("Number Two "+numberTwo);
		System.out.println(numberOne+" + "+numberTwo);
		return numberOne-numberTwo;
	}
	public double multiple(double numberOne, double numberTwo) {
		System.out.println("Number One "+numberOne);
		System.out.println("Number Two "+numberTwo);
		System.out.println(numberOne+" * "+numberTwo);
		return numberOne*numberTwo;
	}
	public double divide(double numberOne, double numberTwo) {
		
		
		if(numberTwo==0) {
			throw new ArithmeticException();
		}
		
		System.out.println("Number One "+numberOne);
		System.out.println("Number Two "+numberTwo);
		System.out.println(numberOne+" / "+numberTwo);
		return numberOne/numberTwo;
	}
}
