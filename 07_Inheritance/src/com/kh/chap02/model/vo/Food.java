package com.kh.chap02.model.vo;
	/*
	 * 상속(Interitence)
	 * 
	 * 누군가 우리에게 상속이 무엇이냐고 물어본다면?
	 * 기존의 클래스를 이용해서 새로운 클래스를 만드는 기술 == 상속
	 * 
	 * (앞에 만들었던 클래스들에서)매 클래스마다 중복된 필드, 메소드들을 하나의 클래스로
	 * 정의해둔 후 해당 클래스의 멤버를 가져다 사용하는 개념
	 * 
	 */

public class Food {
	
	// 한국, 이탈리아, 일본 음식들이 공통적으로 가지고 있던 필드
	// 필드부 : foodName, material, cookingTime <-- 세개의 클래스가 동일하게 가지고 있었음, 얘네를 그냥 여기에 몰아넣자!
	protected String foodName;
	private String material;
	private int cookingTime;
	
	// 생성자부, 자기거 그냥 만듦!
	public Food() {
		System.out.println("안녕하세요 부모입니다.");
	}
	
	public Food(String foodName, String material, int cookingTime) {
		
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
		
	}
	
	// 메소드부
	// getter()
	public String getFoodName() {
		return foodName;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public int getCookingTime() {
		return cookingTime;
	}
	
	// setter()
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}
	
	// information()
	public String information() {
		
		// information 변수 선언 안하고 그냥
		// return "음식명 : " + foodName + ", 주재료 : " + material + ", 조리시간 : " + cookingTime; 으로 작성해도 됨
		String information = "음식명 : " + foodName
						   + ", 주재료 : " + material
						   + ", 조리시간 : " + cookingTime;
		return information;
		
	}

} // 앞에 있던 음식삼총사가 가지고있던 중복된 코드를 여기에 몽땅 넣었다!
	// 이 클래스를 상속받아서, 중복되는 것은 작성하지 않고, 고유한 것만 추가해서 만들어보기로 함 --> vo에 클래스 생성
