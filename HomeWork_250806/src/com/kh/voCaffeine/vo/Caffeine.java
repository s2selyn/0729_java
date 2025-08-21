package com.kh.voCaffeine.vo;

public class Caffeine {

	//  필드부
	public String recipeName; // 레시피 이름
	public double milkContent; // 우유 함량(mL)
	public double caffeineContent; // 카페인 함량(mg)
	public String hasSyrup; // 시럽 유무
	public String cupSize; // 컵 사이즈(큰거, 중간거, 작은거)
	
	double yourCaffeineIntake = 0;
	
	// 메소드부
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
