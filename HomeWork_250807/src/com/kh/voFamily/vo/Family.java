package com.kh.voFamily.vo;

public class Family {

	// 필드부
	// 1) 모든 필드의 접근제한자를 private 으로 변경
	private String name;
	private int birthYear;
	private String gender;
	private String favoriteFood;
	private int happinessLevel;
	
	// 생성자부
	// 4) 기본생성자 및 모든 필드를 매개변수로 가지고 있는 생성자 생성
	// 기본생성자 생성
	public Family() {}
	
	// 모든 필드를 매개변수로 가지고 있는 생성자 생성
	public Family(String name, int birthYear, String gender, String favoriteFood, int happinessLevel) {
		this.name = name;
		this.birthYear = birthYear;
		this.gender = gender;
		this.favoriteFood = favoriteFood;
		this.happinessLevel = happinessLevel;
	}
	
	// 메소드부
	// 2) 필드에 간접적으로 접근할 수 있도록 getter() / setter() 생성
	// getter() 생성
	public String getName() {
		return name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public String getGender() {
		return gender;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}
	
	public int getHappinessLevel() {
		return happinessLevel;
	}
	
	// setter() 생성
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	
	public void setHappinessLevel(int happinessLevel) {
		this.happinessLevel = happinessLevel;
	}

	// 3) 모든 필드의 정보를 합쳐서 문자열의 형태로 반환해주는 info() 생성
	public String info() {
		
		String info = "가족의 이름 : " + name
					+ ", 가족의 출생년도 : " + birthYear
					+ ", 가족의 성별 : " + gender
					+ ", 가족이 가장 좋아하는 음식 : " + favoriteFood
					+ ", 가족의 현재 행복도 : " + happinessLevel;
		return info;
		
	}
	
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
