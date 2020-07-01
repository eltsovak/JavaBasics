package com.syntax.class16;

public class CalculatorTest {
	
	public static void main(String[] args) {
		
		
		// call method add();
		Calculator c = new Calculator();
		c.add(100, 200);
		c.add(10, 20);
		c.add(1000, 2000);
		
		// call method sub();
		c.sub (100, 10);
		
		// call method div();
		c.div(10, 2);
		
		// call method mult();
		c.mult(10, 10);
		
		
	}

}
