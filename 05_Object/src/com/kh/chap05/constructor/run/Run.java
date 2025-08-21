package com.kh.chap05.constructor.run;

import java.util.Scanner;

import com.kh.chap05.constructor.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		
		// Scanner sc = new Scanner(); // import해도 에러 --> 스캐너는 기본생성자는 사용할 수 없음
		Member member = new Member(); // 우리는 여태 이렇게 불렀음, 클래스 이름이랑 괄호 열고닫고 == Member() <-- 얘는 기본생성자 호출!이라고 부름
		// 객체 생성은 new가 하는 것, 생성자는 객체의 초기 상태를 설정하는데 사용
		
		System.out.println(member.info());
		
		Member member2 = new Member("하하호호"); // <-- 얘는 매개변수가 한 개(문자열 타입 하나) 존재하는 생성자를 만들어놓은걸 부름
		
		Member member3 = new Member("user01", "1234"); // <-- 메소드 호출 시 매개변수를 두개 넘겨주면 매개변수가 두 개인 생성자를 호출하는 것이 됨
		System.out.println(member3.info()); // 이 한줄에서 일어나는 일을 설명
		/*
		 * 왼쪽부터 본다~
		 * 1. Member member3 은 stack에 올라감
		 * 2_1. new를 만남, heap에 이미 필드가 올라감(공간이 할당되고 기본값이 대입되어 있음), 필드가 올라가있어야 필드에 접근할 수 있음
		 * 2_2. 2_1의 상태에서 생성자를 호출, 생성자를 호출하는 순간 인자값 두개를 전달함 --> 생성자 매개변수에 순서대로 들어감 --> 생성자 블럭 안에서 필드에 대입되는 작업이 진행 --> 생성자 블럭이 끝나면 필드에 인자값이 대입되어 있음
		 * 3. 객체의 주소값이 memeber3에 대입됨
		 * 
		 */
		
		// 생성자를 통해 객체 생성과 동시에 이 객체를 유효한 상태로 만들어줄 수 있다.
		
		Member member4 = new Member("user02", "pass02", "홍길동");
		System.out.println(member4.info());
		
		// 생성자 생성하고 객체를 생성할 때 이 객체가 유효성을 가질 수 있도록하는 특별한 메소드
		
	}

}
