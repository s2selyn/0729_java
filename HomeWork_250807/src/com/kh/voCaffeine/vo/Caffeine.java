package com.kh.voCaffeine.vo;

public class Caffeine {

	// 필드부
	// 1) 모든 필드의 접근제한자를 private 으로 변경
	private String recipeName; // 레시피 이름
	private double milkContent; // 우유 함량(mL)
	private double caffeineContent; // 카페인 함량(mg)
	private String hasSyrup; // 시럽 유무
	private String cupSize; // 컵 사이즈(큰거, 중간거, 작은거)
	private double yourCaffeineIntake = 0;
	
	// 생성자부
	// 4) 기본생성자 및 모든 필드를 매개변수로 가지고 있는 생성자 생성
	// 기본생성자 생성
	public Caffeine() {}
	
	// 모든 필드를 매개변수로 가지고 있는 생성자 생성
	public Caffeine(String recipeName, double milkContent, double caffeineContent, String hasSyrup, String cupSize, double yourCaffeineIntake) {
		
		this.recipeName = recipeName;
		this.milkContent = milkContent;
		this.caffeineContent = caffeineContent;
		this.hasSyrup = hasSyrup;
		this.cupSize = cupSize;
		this.yourCaffeineIntake = yourCaffeineIntake;
		
	}
	
	// 메소드부
	// 2) 필드에 간접적으로 접근할 수 있도록 getter() / setter() 생성
	// getter() 생성
	public String getRecipeName() {
		return recipeName;
	}
	
	public double getMilkContent() {
		return milkContent;
	}
	
	public double getCaffeineContent() {
		return caffeineContent;
	}
	
	public String getHasSyrup() {
		return hasSyrup;
	}
	
	public String getCupSize() {
		return cupSize;
	}
	
	public double getYourCaffeineIntake() {
		return yourCaffeineIntake;
	}
	
	// setter() 생성
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	
	public void setMilkContent(double milkContent) {
		this.milkContent = milkContent;
	}
	
	public void setCaffeineContent(double caffeineContent) {
		this.caffeineContent = caffeineContent;
	}
	
	public void setHasSyrup(String hasSyrup) {
		this.hasSyrup = hasSyrup;
	}
	
	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}
	
	public void setYourCaffeineIntake(double yourCaffeineIntake) {
		this.yourCaffeineIntake = yourCaffeineIntake;
	}
	
	// 3) 모든 필드의 정보를 합쳐서 문자열의 형태로 반환해주는 info() 생성
	public String info() {
		
		String info = "메뉴 이름 : " + recipeName
					+ ", 우유 함량 : " + milkContent
					+ ", 카페인 함량 : " + caffeineContent
					+ ", 시럽유무 : " + hasSyrup
					+ ", 컵의 크기 : " + cupSize
					+ ", 카페인 섭취량 : " + yourCaffeineIntake;
		return info;
		
	}
	
	public void drink() {
		
		System.out.println("카페인 적당히 충전!");
		yourCaffeineIntake += caffeineContent;
		System.out.println("섭취하신 카페인은 총 " + yourCaffeineIntake + " mg 입니다.");
		
		// 많이 먹으면 경고 출력하고 싶음
		if(yourCaffeineIntake > 400) {
			System.out.println("오늘 잠을 못 잘 수도 있어요! 그만 마셔요!");
		}
		
	}
	
	public void drinkCustomized() {
		
		if(milkContent < 400) {
			
			System.out.println("우유를 20 mL 추가한 " + recipeName + "을/를 주문합니다!");
			milkContent = milkContent + 20;
			System.out.println("총 우유 함량은 " + milkContent + " mL 입니다.");
			System.out.println("-----");
			System.out.println("우유를 추가해서 카페인 적당히 충전하는 느낌!");
			
		} else {
			System.out.println("여기에는 더이상 우유를 추가할 수는 없어요 ㅠㅠ");
		}
		
		yourCaffeineIntake += caffeineContent;
		System.out.println("섭취하신 카페인은 총 " + yourCaffeineIntake + " mg 입니다.");
		
		if(yourCaffeineIntake > 400) {
			System.out.println("오늘 잠을 못 잘 수도 있어요! 그만 마셔요!");
		}
		
	}
	
}
