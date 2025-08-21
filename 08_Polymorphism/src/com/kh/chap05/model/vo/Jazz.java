package com.kh.chap05.model.vo;

public class Jazz extends Music implements MusicI {

	@Override
	public void play() {
		System.out.println("재즈를 재생합니다.");
	}
	
	/*
	@Override
	public void stop() {
		System.out.println("음악을 멈춥니다.");
	} // 어차피 똑같이 동작하면 중복이잖아!
	// 기존의 인터페이스를 구현한 클래스들이 동일한 메소드를 구현해야 할 때, 추상메소드로 구현하면 기존의 클래스를 전부 수정해야함
	// 그런식으로 수정 안하고 추가할수있는 방법이 만들어짐 --> default 메소드, 인터페이스에 가서 선언
	*/
	
}
