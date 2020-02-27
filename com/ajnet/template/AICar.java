package com.ajnet.template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행 차입니다");
		System.out.println("자율 주행 차가 방향을 전환합니다");
	}

	@Override
	public void stop() {
		System.out.println("자율 주행 차가 스스로 멈춤니다.");

	}
	
	
	//Step 4 : wiper() 추상메소드가 상위에서정의되었으므로 Child Class에서 구쳔할 의무가 생김.
	@Override
	public void wiper() {
		System.out.println("AI가 와이퍼를 조작합니다");
		
	}
	
	@Override
	public void washCar() {
		System.out.println("자율차가 자동 세차를 합니다");
		
	}
	
	

}
