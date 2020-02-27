package com.ajnet.abstractex;

//STEP 2 change class to abstract class
// public class Computer {
public abstract class Computer {
	
//	void display() {
//		System.out.println("Display method is called");
//	}
	
//STEP 1 change method to abstract method	
//	public void display();
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
	
}

