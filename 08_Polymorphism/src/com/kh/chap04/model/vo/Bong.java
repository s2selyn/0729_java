package com.kh.chap04.model.vo;

public class Bong implements Jjimdak {
	// 어쨌든 찜닭만드는 친구니까 찜닭을 구현해주기
	
	// Bong 클래스는 아직 인터페이스가 가진 order라는 추상메소드가 구현되지 않았음 --> 빨간줄
	@Override
	public void order() {
		System.out.println("국내산 건청양고추로만 맵기를 조절한 찜닭만들기");
	}
	
}
