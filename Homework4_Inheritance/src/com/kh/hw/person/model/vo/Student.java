package com.kh.hw.person.model.vo;

public class Student extends Person {
	
	// 필드부
	private int grade; // 학년
	private String major; // 전공
	
	// 생성자부
	// 기본 생성자
	public Student() {}
	
	// 매개변수 생성자
	public Student(String name, int age, double height, double weight, int grade, String major) {
		
		super();
		this.grade = grade;
		this.major = major;
		
	}
	
	// 메소드부
	// getter()
	public int getGrade() {
		return grade;
	}
	
	public String getMajor() {
		return major;
	}
	
	// setter()
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	// 각 필드 반환 메소드
	@Override
	public String toString() {
		return super.getName() + " " + super.getAge() + " " + super.getHeight() + " " + super.getWeight() + " " + grade + " " + major;
	}

}
