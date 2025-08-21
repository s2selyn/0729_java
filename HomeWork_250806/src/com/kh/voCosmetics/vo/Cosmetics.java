package com.kh.voCosmetics.vo;

public class Cosmetics {

	// 필드부
	public String type;
	public String color;
	public String brand;
	public String skinType;
	public int expirationDays;
	
	// 메소드부
	public void tryCosmetics() {
		
		if (expirationDays > 0) {
			
		    System.out.println("테스트해보니 이 제품은 괜찮은 것 같아요~");
		    expirationDays -= 10;
		    System.out.println("사용 가능한 날이 " + expirationDays + "일 남았어요!");

		} else {
			System.out.println("사용하지 않는 것이 좋을 것 같아요~");
		}
		
	}
	
	public void exchangeCosmetics() {
		System.out.println("다른 제품으로 교환하러 갑니다!");
	}
	
}
