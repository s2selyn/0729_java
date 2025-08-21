package com.kh.chap02.model.vo;

	// 상속 어떻게? 자식클래스 extends 부모클래스
public class JapanFood extends Food {
	
	// 자바에서는 자식이 부모를 고름^^!
	
	// 필드부
	// 부모로부터 상속받은 부분은 기술하지 않는다!(없는것만 작성)
	private int fresh;
	
	// 생성자부, 생성자는 상속을 받을 수 없음, 클래스명이 달라서 새로 만들어줘야함
	public JapanFood() {}
	
	// 매개변수 생성자
	// foodName, material, cookingTime : 부모클래스의 필드에 대입해야함
	// fresh : 내 필드에 대입
	public JapanFood(String foodName, String material, int cookingTime, int fresh) {
		
		// 1. 부모클래스 접근제한자 변경 2. 부모클래스 세터호출 3. 부모클래스 매개변수생성자 호출
		// 그중에서 3번!
		super(foodName, material, cookingTime); // 부모클래스에 대입!
		
		// 내거는 내 필드에 대입
		this.fresh = fresh;
		
	}
	
	// 메소드부
	// 내 필드에 대한 getter/setter 필요
	public int getFresh() {
		return fresh;
	}
	
	public void setFresh(int fresh) {
		this.fresh = fresh;
	}
	
	// 문제 : information 메소드는? 부모로부터 상속받아서 나도 쓸 수 있음, 근데 부모가 가진 information을 호출하면 나만의 특색을 노출시킬 수 없음(신선도 못보여줌)
	// 메인메소드에서 불러보고왔음
	// 메소드를 상속받았는데 마음에 안들어 발전시키고싶어
	// 다시 쓸 수 있음 ==> 재정의
	// 메소드명을 똑같이 씀
	// 앞에 출력되어 나오던건 그대로 나와야함
	public String information() {
		
		/*
		return "음식명 : " + super.getFoodName()
			 + ", 주재료 : " + super.getMaterial()
			 + ", 조리시간 : " + super.getCookingTime()
			 + ", 신선도 :" + fresh;
		// 부모객체의 필드값을 사용하고싶으면? --> getFoodName해야함 --> 호출하려면 찾아가야 하는데 찾아가려면 부모의 주소를 알아야함 --> 부모의 주소를 나타내는 키워드는? super 
		
		// 출력해보면 나오는 부분 중에서 음식명 : 스시, 주재료 : 밥, 조리시간 : 20 문자열값은? --> 부모객체의 필드값을 문자열로 만든 것
		// 근데 부모의 information을 호출하면 돌아오는 부분임, 부모의 information 접근제한자 public임 --> 그러므로 여기가 중복코드가 됨!
		*/
		
		return super.information() + ", 신선도 : " + fresh;
		
	}
	
}
