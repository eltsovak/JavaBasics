package com.syntax.class24;

public class HW_Areas {
	
	public double area(double length, double width) {
		return length * width;
	}
	
	public double area(double length) {
		return length * length;
	}
	
	public double area(double length, double width, double height) {
		return 2 * length * width + 2 * length * height + 2 * width * height;
	}

}
