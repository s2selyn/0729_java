package com.kh.chap03.model.vo;

public abstract class GateBall extends Sports {
	// 상속하려고 하니까 빨간줄생김 --> The type GateBall must implement the inherited abstract method Sports.rule()
	// 만약에 extends만 해놓고 GateBall 객체생성할수있으면? 부모로부터 받은 rule 호출했을때 부모가 물려준 rule은 실행할 수 없음, 미완성이기 때문에!
	// 이 메소드가 어떻게 동작할지는 상속받은 곳에서 구현해주어야함! 안해주면 작업불가
	// 방법은 두개
	// 1. 추상메소드 구현
	/*
	 * 첫 번째 방법
	@Override
	public void rule() {
		
	} // 미완성된 메소드를 상속받은 내가 구현함
	*/
	
	// 2. GateBall 클래스도 추상 클래스로 선언 --> 나를 상속받을 누군가가 또 해라~ 하고 던짐, 나로도 객체 안만들거야!
	
	// 실제를 객체로 만들어서 사용하고싶은게 아니라 그냥 여러개의 객체를 다룰(여러개를 외부에서 볼) 껍데기가 필요한 시점에
	// 요거조거 같이 물려줘야겠다~ 필드, 메소드 물려줘야겠다~ 이런 경우에 추상클래스를 만들어 사용
	
}
