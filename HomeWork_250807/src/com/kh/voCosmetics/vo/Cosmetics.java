package com.kh.voCosmetics.vo;

public class Cosmetics {

	// 필드부
	// 1) 모든 필드의 접근제한자를 private 으로 변경
	private String type;
	private String color;
	private String brand;
	private String skinType;
	private int expirationDays;
	
	// 생성자부
	// 4) 기본생성자 및 모든 필드를 매개변수로 가지고 있는 생성자 생성
	// 기본생성자 생성
	public Cosmetics() {}
	
	// 모든 필드를 매개변수로 가지고 있는 생성자 생성
	public Cosmetics(String type, String color, String brand, String skinType, int expirationDays) {
		
		this.type = type;
		this.color = color;
		this.brand = brand;
		this.skinType = skinType;
		this.expirationDays = expirationDays;
		
	}
	
	// 메소드부
	// 2) 필드에 간접적으로 접근할 수 있도록 getter() / setter() 생성
	// getter() 생성
	public String getType() {
		return type;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getSkinType() {
		return skinType;
	}
	
	public int getExpirationDays() {
		return expirationDays;
	}
	
	// setter() 생성
	public void setType(String type) {
		this.type = type;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setSkinType(String skinType) {
		this.skinType = skinType;
	}

	public void setExpirationDays(int expirationDays) {
		this.expirationDays = expirationDays;
	}
	
	// 3) 모든 필드의 정보를 합쳐서 문자열의 형태로 반환해주는 info() 생성
	public String info() {
		
		String info = "화장품의 종류 : " + type
					+ ", 화장품의 색상 : " + color
					+ ", 제조사 또는 브랜드 : " + brand
					+ ", 피부 타입 : " + skinType
					+ ", 남은 사용 기한 : " + expirationDays;
		return info;
		
	}
	
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
