package com.kh.chap03.model.vo;

	// 1절. import를 해야 클래스를 쓸 수 있음
	/*
	import java.lang.String;
	import java.lang.Object;
	import java.lang.System;
	import java.lang.*; <-- 여태 쓰면서 위에거 import 한 적 없음, 실제로는 이게 생략되어있음(java.lang 패키지 밑에 있는 모든 클래스 전부, Math같은것도)
	*/
public class LastTime extends Object {
	
	// 아무생각없이 만들었지만 LastTime 뒤에는 extends Object가 붙어있음
	// 모든 클래스의 최상위 부모클래스 => Object => 생략가능
	
	// Object 클래스를 쓰고싶으면? 외부 클래스를 내부에서 사용하고 싶으면? --> 1절. import 절을 써야함
	// 여태 쓴 것 중에 이상한게 있음 --> String은 참조자료형(클래스), 내거에서 쓰려면 import를 해야함
	private String name;
	
	// 생성자 만들기, 생성자 만들때 LastTime이 객체로 heap에 올라가려면 선행조건은? --> 자식이 생기려면 부모가 먼저 생겨야함 Object를 메모리에 올리려면? Object를 생성자호출로 만들어야함, 부모클래스의 생성자 호출이 생략되어있음
	public LastTime() {
		/*super();*/ // 기본생성자 호출에는 부모클래스의 생성자 호출이 생략된것
	}
	
	public LastTime(String name) {
		/*super();*/ // 매개변수 생성자도 마찬가지로 부모클래스 생성자 호출이 생략되어있음
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		/*return;*/ // 얘도 원래 돌아가야하니까 있어야하는데 생략된것
	}
	
	// 여태까지 많은 클래스를 만들었지만 그동안 아무생각없이 썼던것들
	// Java에서 필요한 것들을 암묵적으로 만들어주었음
	
	/*
	 * Overriding
	 * riding은 위에 타는 것 --> overriding은 덮어쓰는거!
	 * 
	 * - 상속받고 있는 부모클래스의 메소드를 자식클래스에서 재정의(다시씀)하는 것
	 * - 부모클래스가 제공하고 있는 메소드를 자식이 고쳐서 사용하겠다는 의미
	 * - 자식클래스에 존재하는 오버라이딩 된 메소드가 우선권을 가져서 호출되게 됨
	 * 
	 * 가장 대표적인 예시가 toString()
	 * 
	 * 주의할 점(overriding의 성립조건)
	 * 메소드이름 대소문자, 매개변수 여부, 접근제한자 이런것들을 수정하면 자식클래스에 없어서 부모클래스로감
	 * 
	 * 오버라이딩 성립 조건!
	 * 
	 * 1. 부모메소드와 메소드명 동일(대소문자 구분 명확하게)
	 * 2. 매개변수의 자료형, 개수, 순서가 동일(변수명과는 무관함, 달라도됨)
	 * 3. 반환형이 동일
	 * 4. 부모메소드의 접근제한자보다 공유범위가 같거나 넓게 선언(우리는 private public 밖에 안해서 상관없긴해..)
	 * 기본적으로 이정도는 지켜야함! 이게 안돌아가면 어차피 오버라이딩이 성립이 안됨
	 * 
	 * -- 개발자들끼리의 약속
	 * 
	 * *** 오버라이딩한 메소드에는 반드시 @Override 애노테이션을 붙여주자
	 * 메소드 선언부 위에 써줌
	 * 
	 * @Override
	 * annotation
	 * 일종의 주석
	 * - 생략 가능
	 * - 꼭 붙이지 않더라도 부모메소드와 형태가 같으면 오버라이딩으로 판단
	 * 
	 * 왜 붙여야 하나요??
	 * 			=> 실수를 줄이자!
	 * 			=> 누가봐도 오버라이딩(이라고 알아볼 수 있음)
	 * 
	 */
	
	@Override // <-- 이런것을 애노테이션이라고 부름(달려있든 아니든 구현은 잘 됨, 이걸 달면 얻을 수 있는 이점은? 실수를 줄일 수 있다!
	// 소문자로 메소드를 선언했다면? 빨간줄로 뜸! 똑같은 형태로 안만들면 Java에서 알아서 overriding 여부를 확인시켜줌
	public String toString() {
		
		// 출력문을 쓸 때 자동으로 이 메소드 호출 결과가 반환되는것
		// 앞에서 info나 information을 작성해서 필드값을 반환해주도록 구현했지만 toString을 오버라이딩해서 구현함
		return "LastTime [name=" + name + "]";
		
	} // 이러고 실행클래스 ㄱㄱ
	
}
