package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	
	// 실행용 메소드
	public static void main(String[] args) {
		
		// 기본 생성자를 통해 Member type의 객체를 생성
		Member member = new Member();
		
		// changeName()를 이용해 값 변경
		member.changeName("채정민");
		
		// printName()를 이용해 출력
		member.printName();
		
	}
	
}
