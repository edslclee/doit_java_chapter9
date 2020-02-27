package com.ajnet.abstractex;

public class MyNoteBook extends NoteBook {

	@Override
	public void typing() {
		System.out.println("MyNoteBook에서 정의한 Method");

	}
	
	public void turnOn() {
		System.out.println("상위 클래스 Computer의 메소드를 overrding");
	}

}
