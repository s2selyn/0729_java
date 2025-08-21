package com.kh.chap05.model.vo;
	
	// 개발하다가(프로그램을 만들다가), 기능을 확장해야한다, 다형성을 이용해야한다면? 일반적으로 인터페이스를 이용해서 인터페이스를 구현하도록 함! --> implements 하고 인터페이스 식별자 MusicI 추가
	// Music 클래스를 상속받아서 사용할것이므로 extends 하고 상속받을 클래스 Music 기술
public class Hiphop extends Music implements MusicI, MultipleInterface {
	// 앞으로 만들 음악 클래스에 모두 재생기능을 넣고싶다 --> 인터페이스로 구현해보자 --> MusicI 만들고옴
	
	// 인터페이스가 가진 추상메소드를 구현하지 않았으므로 빨간줄! --> 오버라이딩으로 구현해줘야함 --> 완성!
	@Override
	public void play() {
		System.out.println("힙합을 재생합니다.");
	}
	
	// 이걸 구현하고싶은데 이미 상속받고있는 클래스가 있어서 인터페이스를 써야함, 오버라이딩함, 근데 이걸 상속받는 클래스마다 해줘야함 --> 재즈도 이거 구현하러감
	@Override
	public void stop() {
		System.out.println("음악을 멈춥니다.");
	}
	
}
