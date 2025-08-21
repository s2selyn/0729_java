package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	
	// 실행용 메소드
	public static void main(String[] args) {
		
		// 기본 생성자를 통해 객체 생성
		Book book1 = new Book();
		
		// 매개변수 3개인 생성자를 통해 객체 생성
		Book book2 = new Book("낭만을 팝니다", "독립출판", "양버터, 루미칠리");
		
		// 매개변수 5개인 생성자를 통해 객체 생성
		Book book3 = new Book("봄의 소원", "이음서가", "양버터, 루미칠리", 12000, 0.0);
		
		// inform()을 통해 출력
		book1.inform();
		book2.inform();
		book3.inform();
		
	}
	

}
