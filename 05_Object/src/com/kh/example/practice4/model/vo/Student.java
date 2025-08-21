package com.kh.example.practice4.model.vo;

public class Student {
	
	// 필드부
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	// 초기화 블럭을 이용해 각 필드 초기화 --> ?
	{
	grade = 3;
	classroom = 9;
	name = "채정민";
	height = 158.9;
	gender = '여';
	}
	
	// 생성자부
	public Student() {}
	
	// 메소드부
	// setter()
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// getter()
	public static int getGrade() {
		return grade;
	}
	
	public int getClassroom() {
		return classroom;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public char getGender() {
		return gender;
	}
	
	// 정보 출력
	public void information() {
		
		System.out.println("학생 정보를 출력합니다.");
		System.out.println(grade + "학년 " + classroom + "반 " + name + "(키 : " + height + "cm, " + gender + "학생)");
		
	}
	
}
