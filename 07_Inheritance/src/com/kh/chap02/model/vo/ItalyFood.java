package com.kh.chap02.model.vo;

	// Food가 가지고 있는 멤버는 상속받아서 사용하려고 함
public class ItalyFood extends Food {
	
	// 필드부, 중복되는거 빼고 나만 가진 필드
	private int oil;
	
	// 생성자부, 생성자는 상속받을수없음, 클래스명이 달라서 내거 내가 만드는수밖에 없음
	public ItalyFood() {
		
		// 우리가 안보이는 사이에 부모생성자 구문이 들어가있음(생략가능)
		super();
		
	}
	
	public ItalyFood(String foodName, String material, int cookingTime, int oil) {
		
		/*
		super.setFoodName(foodName);
		super.setMaterial(material);
		super.setCookingTime(cookingTime);
		*/
		
		// 매개변수 생성자를 호출하면 여기에서 필드값을 전달해서 대입할 수 있음, 이게 제일 편할듯!
		super(foodName, material, cookingTime); // 부모거는 부모생성자 호출해서 부모에 넣고
		this.oil = oil; // 매개변수 네개임, 내건 내 필드에 넣어줘야함
		
		/*
		this.oil = oil;
		super(foodName, material, cookingTime);
		*/ // 이렇게는 안됨, 부모가 먼저 생겨야 할 수 있으므로
		
	}
	// 이거 만들다가 그림그림
	// Run의 메인에서 이 생성자를 호출함 --> value값을 네개 전달함, 앞의 세개는 ItalyFood객체에 담는것이 아님 --> foodName 지역변수로 전달받은 "기름파스타"value값은 부모객체의 foodName 필드에 담아야함
	// this.foodName = foodname; 으로는 안됨..The field Food.foodName is not visible
	// this를 super로 바꿔서 super.foodName = foodname; 해도 안보인다고함
	// 접근제한자가 private이기 때문에 안보임 --> Food의 필드 접근제한자를 public으로 바꾸면? 되긴 되는데 아무데서나(Run 클래스) 갈 수 있음
	// setter 사용해도 되긴 하는데 --> protected 접근제한자를 써보자! 상속구조에만 접근 가능, Run 클래스에서는 안됨
	
	// 해결방법
	// 1. 부모클래스의 접근제한자를 바꿔버림
	// 캡슐화 원칙 X (private이 아니게 된 순간 캡슐화 깨짐) => 적합한 방법은 아님
	
	// 2. 부모클래스의 접근제한자 public인 setter메소드를 호출 --> super로 참조해서 호출
	// 캡슐화 원칙도 지켜줌(private가 유지되어있으니까!)
	
	// 3. 부모클래스가 가지고 있는 매개변수 생성자를 호출
	// (더 쉬운 방법) setter의 역할을 하는 public인 다른 친구가 있음 --> 매개변수생성자 필드를 모두 매개변수로 가지고있음--> 생성자! 이미 기본생성자 호출해서 객체만들어봤음
	
	// 메소드부, 내건 내거 getter/setter 생성
	public int getOil() {
		return oil;
	}
	
	public void setOil(int oil) {
		this.oil = oil;
	}

}
