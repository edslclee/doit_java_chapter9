package com.ajnet.template;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다");
		System.out.println("사람이 핸들을 조작 합니다");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟습니다");

	}

	//Step 3 : wiper() 추상메소드가 상위에서정의되었으므로 Child Class에서 구쳔할 의무가 생김.
	@Override
	public void wiper() {
		System.out.println("사람이 와이퍼를 조작합니다");
		
	}

}
