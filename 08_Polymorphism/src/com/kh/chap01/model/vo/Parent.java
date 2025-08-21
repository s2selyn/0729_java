package com.kh.chap01.model.vo;

public class Parent {
	
	// 필드부
	private int x;
	private int y;
	
	// 생성자부
	// 기본생성자
	public Parent() {}
	
	// 매개변수생성자
	public Parent(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	// 메소드부
	// getter
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// setter
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	// 부모클래스 출력 메소드
	public void printParent() {
		System.out.println("안뇽 나는 부모클래스야~");
	}
	
	public void print() {
		System.out.println("나는 부모~");
	}
	
}
