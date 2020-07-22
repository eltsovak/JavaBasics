package com.syntax.class26;

public class VehicleTest {
	
	public static void main(String[] args) {
		
	Vehicle	lambo = new Lamborgini("BHN4537458");
	
	lambo.drive();
	lambo.start();
	lambo.stop();
	lambo.openTrunk();
	int total = Vehicle.getTotal();
	System.out.println(total);
	
	System.out.println("------- second object ------");
	Car car = new Lamborgini("BHN458797");
	
	car.drive();
	car.start();
	car.stop();
	car.openTrunk();
	
	total = Car.getTotal(); // Vehicle.getTotal();
	System.out.println(total);
	
		
	}

}
