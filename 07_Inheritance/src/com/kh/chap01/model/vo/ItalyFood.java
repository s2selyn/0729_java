package com.kh.chap01.model.vo;

public class ItalyFood {

	// 필드부
	private String foodName; // 음식 이름
	private String material; // 재료
	private int cookingTime; // 조리시간
	private int oil; // 기름의 양
	
	// 생성자부
	public ItalyFood() {}
	public ItalyFood(String foodName, String material, int cookingTime, int oil) {
		
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
		this.oil = oil;
		
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
	
	public int getOil() {
		return oil;
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
	
	public void setOil(int oil) {
		this.oil = oil;
	}
	
	// informataion()
	public String information() {
		
		String information = "음식정보 [음식명 : " + foodName
						   + ", 재료 : " + material 
						   + ", 조리시간 : " + cookingTime
						   + ", 오일량 : " + oil + "]";
		return information;
	
	}

}
