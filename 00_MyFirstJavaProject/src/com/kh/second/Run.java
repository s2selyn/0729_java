package com.kh.second;

public class Run {

	public static void main(String[] args) {
		
		// printMyName(); // 그냥 메서드를 호출하면 The method printMyName() is undefined for the type Run
		// 외부 클래스에 존재하는 메소드들을 호출하고 싶을 때는?
		
		/*
		 * 호출할 메소드가 존재하는 클래스를 생성(new) 해줘야함
		 * 
		 * new는 마법의 생성주문
		 * 
		 * [ 표현법 ]
		 * "클래스이름" "클래스명을 대신할 별칭" = new "클래스이름()";
		 * 
		 * ↑ 이 내용은 다음 주 화/수에 걸쳐 이해를 할 예정
		 * 
		 */
		
		PrintController pc = new PrintController();
		
		// printMyName(); 얘를 부르고싶음
		pc.printMyName(); // pc를 부르고 .(온점)을 찍은 다음에 printMyName()을 부른다. 다 불렀으니 세미콜론
		// .
		// 참조연산자 / 직접접근연산자
		
		// 다른 이름의 클래스에 같은 이름을 가진 메서드를 부르고 싶으면 마찬가지로 클래스를 생성하고 호출하면됨 
		
	} // 메서드가 존재하는 클래스가 다르기 때문에 그냥 메서드를 부르면 안된다
	  // 같은 이름을 가진 메서드가 이름이 다른 여러 클래스에 존재하게 되면 컴퓨터가 구분할 수 없음
	  // 자기 자신의 클래스에서 찾았더니 존재하지 않아서 에러

}
