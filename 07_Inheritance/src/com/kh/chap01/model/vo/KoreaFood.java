package com.kh.chap01.model.vo;

public class KoreaFood {
	
	// 필드부
	private String foodName; // 음식 이름
	private String material; // 재료
	private int cookingTime; // 조리시간
	private int spicy; // 맵기 강도
	
	// 생성자부
	public KoreaFood() {}
	public KoreaFood(String foodName, String material, int cookingTime, int spicy) {
		
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
		this.spicy = spicy;
		
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
	
	public int getSpicy() {
		return spicy;
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
	
	public void setSpicy(int spicy) {
		this.spicy = spicy;
	}
	
	// informataion()
	public String information() {
		
		String information = "음식정보 [음식명 : " + foodName
						   + ", 재료 : " + material 
						   + ", 조리시간 : " + cookingTime
						   + ", 맵기정도 : " + spicy + "]";
		return information;
		
	}

}
