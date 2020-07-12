package com.syntax.class21;

public class USA {
	
	public static String country;
	String state; 
	String capital;
	
	USA(String usaState, String stateCapital) { // local
		state = usaState;
		capital = stateCapital;
		
	}
	
	void displayState() {
		System.out.println("ststae is " + state);
		
	}
	void displayCapital() {
		System.out.println("capital is " + capital);
	}
	
	void displayInfo() {
		displayState();
		displayCapital();
		
	}
	
	}


