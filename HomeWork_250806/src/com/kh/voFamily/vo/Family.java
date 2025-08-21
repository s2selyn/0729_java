package com.kh.voFamily.vo;

public class Family {

	// 필드부
	public String name;
	public int birthYear;
	public String gender;
	public String favoriteFood;
	public int happinessLevel;
	
	// 메소드부
	public void eatFood() {
		
		if(happinessLevel < 50) {
			System.out.println(name + "와/과 함께 맛있는 것을 먹으러 가요~");
			happinessLevel = happinessLevel + 10;
		} else {
			System.out.println("배부른것같아요 ㅎㅎ");
		}
		
	}
	
	public void celebrateBirthday() {
		System.out.println(name + "와/과 함께 생일 축하!!!!!!");
	}
	
}
