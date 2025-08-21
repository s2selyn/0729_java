package com.kh.chap01.model.vo;

	// 부모클래스 상속받기
public class Child1 extends Parent {
	
	// 필드부
	// int x, int y는 상속받으므로 기술할 필요없음
	private int z;
	
	// 생성자부
	// 기본생성자
	public Child1() {}
	
	// 매개변수생성자
	public Child1(int x, int y, int z) {
		
		super(x, y);
		this.z = z;
		
	}
	
	// 메소드부
	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	public void printChild1() {
		System.out.println("안뇽 나는 첫 번째 자식 클래스 Child1이야~");
	}
	
	@Override
	// 부모클래스가 가지고 있는 오버라이딩할 메소드를 메소드시그니처를 똑같이 써줌
	public void print() {
		System.out.println("자식 Child1이얌~");
	}

}
