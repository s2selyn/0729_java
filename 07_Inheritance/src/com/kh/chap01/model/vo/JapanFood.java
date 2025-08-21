package com.kh.chap01.model.vo;

public class JapanFood {

	// 필드부
	private String foodName; // 음식 이름
	private String material; // 재료
	private int cookingTime; // 조리시간
	private int fresh; // 신선함의 농도
	
	// 생성자부
	public JapanFood() {}
	public JapanFood(String foodName, String material, int cookingTime, int fresh) {
		
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
		this.fresh = fresh;
		
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
	
	public int getFresh() {
		return fresh;
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
	
	public void setFresh(int fresh) {
		this.fresh = fresh;
	}
	
	// informataion()
	public String information() {
		
		String information = "음식정보 [음식명 : " + foodName
						   + ", 재료 : " + material
						   + ", 조리시간 : " + cookingTime
						   + ", 신선도 : " + fresh + "]";
		return information;
		
	}

}
