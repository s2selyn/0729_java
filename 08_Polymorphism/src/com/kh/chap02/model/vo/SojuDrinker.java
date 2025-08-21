package com.kh.chap02.model.vo;

public class SojuDrinker extends Drinker {
	
	// 얘만의 필드 하나정도
	private int limit;
	
	public SojuDrinker() {}
	
	public SojuDrinker(int limit) {
		this.limit = limit;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void setLimit() {
		this.limit = limit;
	}
	
	// Drink의 메소드를 오버라이딩하자
	@Override
	public void drink() {
		System.out.println("소주를 한 잔 마십니다.");
	}
	
	@Override
	public void eat() {
		System.out.println("곱창을 한 입 먹습니다.");
	}
	
}
