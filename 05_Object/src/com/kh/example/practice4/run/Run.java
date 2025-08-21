package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {
	
	// 실행용 메소드
	public static void main(String[] args) {
		
		// 기본 생성자를 통해 Student 객체 생성
		Student student = new Student();
		
		// information()으로 정보 출력
		student.information();
		
	}

}
