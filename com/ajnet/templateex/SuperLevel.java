package com.ajnet.templateex;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다");

	}

	@Override
	public void jump() {
		System.out.println("엄청 높이 jump합니다");

	}

	@Override
	public void turn() {
		System.out.println("빨리 Turn 합니다");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("**** Super Level입니다 ****");

	}

}
