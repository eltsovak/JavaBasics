package com.syntax.class08;

public class BreakAndcontinue {
	public static void main(String[] args) {
		
		// We are counting from 1 to 10 
		// We want to stop the loop when we reach 4
		
		System.out.println("---BREAK----");
		for (int i = 1; i <= 10; i++) {
			
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("We are outside of the loop");
		
		System.out.println("---CONTINUE----");
		for (int i = 1; i <= 10; i++) {
			
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("We are outside of the loop");
	}

}
