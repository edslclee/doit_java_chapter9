package com.ajnet.template;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c1 = new ManualCar();
		c1.run();
		System.out.println("------------------------------");
		Car c2 = new AICar();
		c2.run();
	}

}
