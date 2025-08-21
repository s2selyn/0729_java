package com.kh.example.practice1.model.vo;

public class Member {
	
	// 필드부
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// 생성자부
	public Member() {}
	
	// 메소드부
	public void changeName(String name) {
		this.memberName = name;
	}
	
	public void printName() {
		System.out.println("제 이름은 " + memberName + "이예용");
	}

}
