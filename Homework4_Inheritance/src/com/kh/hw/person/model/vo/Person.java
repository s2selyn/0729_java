package com.kh.hw.person.model.vo;

public class Person {
	
	// 필드부
	private String name;
	private int age;
	private double height;
	private double weight;
	
	// 생성자부
	// 기본 생성자
	public Person() {}
	
	// 매개변수 생성자
	public Person(String name, int age, double height, double weight) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	// 메소드부
	// getter()	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	// setter()
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	// 각 필드 반환 메소드
	public String toString() {
		return "";
	}
	
}
