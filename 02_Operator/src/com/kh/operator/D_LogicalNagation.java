package com.kh.operator;

public class D_LogicalNagation {
	
	/*
	 * 논리(값) 부정 연산자 : 논리 값(true, false 두가지뿐)을 반대로 바꿔주는 연산자
	 * 단항연산자
	 * 
	 * [ 표현법 ] !논리값;
	 * 
	 * 
	 */

	public void method1() {
		
		System.out.println(!!true); // 중간점검 없이 바로 넣어보자
		// 출력하고싶다! 어떻게 해야 하지? 메서드를 호출해야 함
		// 호출하려면 어떻게 해야 함? 메인 메서드로 가야 함
		// 다녀왔으면 true를 !true로 수정
		// 가독성을 위해서 !!로 입력하기도 함 --> 반전에 반전을 해서 true가 나옴, 부정연산자가 붙어있음을 알려주기 위함

	} // 끝났으면 메인 메서드에서 주석처리
	
}
