package com.kh.chap02.model.vo;

			// 파생클래스			확장클래스
			// 후손클래스			조상클래스
			// 하위클래스			상위클래스
			// 서브클래스			슈퍼클래스
			// 자식클래스			부모클래스
public class KoreaFood extends Food {
	// extends --> 확장하다! Food클래스를 확장하는 KoreaFood클래스가 됨
	// 상속을 해주는 쪽을 부모클래스라고 표현 --> 영어로는 슈퍼클래스 --> 또는 상위클래스
	// 상속을 받는 쪽을 자식클래스라고 표현 --> 영어로는 서브클래스 --> 또는 하위클래스
	// 자바에서 이렇게 표현함(객체지향언어는 자바만 있는게아님) 언어마다 상속을 구현하는 방식이 다를 수 있음, 상속을 표현하는 단어도 다름 --> 상위클래스/하위클래스
	// 상속이 여러단계 걸쳐서 할수도 있음 --> 조상클래스/후손클래스
	// extends가 확장한다는 의미이므로 상속해주는 쪽을 확장클래스/ 상속받는쪽을 파생클래스
	
	// 필드부
	// 원래는 한식 클래스가 가져야 할 필드가 네개였음
	// foodName, material, cookingTime, spicy
	// [	Food 클래스가 가지고 있음		  ]
	// 앞에 세개는 Food클래스에 주고 상속받아서 써야지~ 했음
	// 푸드 클래스에 없는거, 나만 가지고 있는 고유한거(spicy) 선언
	private int spicy;
	
	// 생성자부, 내거 내가 만들어서 써야함
	public KoreaFood() {
		
		super(); // super : 부모객체의 주소값을 의미하는 키워드(KoreaFood는Food의 자식)
		// new Food();라고 쓴거나 마찬가지임 --> 부모 클래스의 생성자 호출, 객체 생성한 것
		
		System.out.println("응애 나 자식");
		
	} // 일단 기본생성자만
	
	// 메소드부
	// getter()
	public int getSpicy() {
		return spicy;
	}
	
	// setter()
	public void setSpicy(int spicy) {
		this.spicy = spicy;
	}
	
	// 상속받을준비 끝!
	// 지금은 KoreaFood랑 Food랑 아무 연관이 없음 --> 상속받으려면 상속 키워드를 써줘야함
	// 자바에서의 상속은 자식이 부모를 정함, 자식 클래스에 나 상속받겠다, 정의해야함
	
	// 나 상속받겠다는 어디에 정의하느냐? --> 클래스 선언부에 클래스 식별자 다음에 한칸띄움 --> extends 키워드 작성 --> 상속을 해줄 부모클래스명을 작성
	// 이제 KoreaFood는 Food가 가진 멤버를 사용할수있게됨
	
	// 지금 KoreaFood가 가진것은 spicy관련된것뿐
	// 일단 메인메소드 ㄱㄱ
	
}
