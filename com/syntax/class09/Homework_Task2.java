package com.syntax.class09;

public class Homework_Task2 {
	
	public static void main(String[] args) {
		
//		2. Print the following pattern:
//			55555
//			44444
//			33333
//			22222
//			11111
		
		for (int i = 5; i >= 1; i--) {
			
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
	}

}
