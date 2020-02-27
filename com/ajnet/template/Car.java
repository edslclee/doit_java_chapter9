package com.ajnet.template;

public abstract class Car {
	
	
	public abstract void  drive();
	public abstract void  stop();
	//STEP 1 : 시나리오의 변경으로 wiper()메소드가 추가됨
	public abstract void  wiper();
	
	//Hook Method step 1: 
	public void washCar() {
		
	}
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	
	public final void run() {
		startCar();
		drive();
		//STEP 2 : 시나리오에 wiper()메소드가 추가됨
		wiper();
		stop();
		//Hook Method Step 2:
		washCar();
		turnOff();
	}
	
}
