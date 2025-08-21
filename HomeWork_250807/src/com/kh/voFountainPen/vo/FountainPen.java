package com.kh.voFountainPen.vo;

public class FountainPen {

	// 필드부
	// 1) 모든 필드의 접근제한자를 private 으로 변경
	private String manufacturer;
	private int length;
	private String nibMaterial;
	private String capType;
	private String inkFillingSystem;
	
	private int inkLevel = 100;
	
	// 생성자부
	// 4) 기본생성자 및 모든 필드를 매개변수로 가지고 있는 생성자 생성
	// 기본생성자 생성
	public FountainPen() {}
	
	// 모든 필드를 매개변수로 가지고 있는 생성자 생성
	public FountainPen(String menufacturer, int length, String nibMaterial, String capType, String inkFillingSystem, int inkLevel) {
		
		this.manufacturer = menufacturer;
		this.length = length;
		this.nibMaterial = nibMaterial;
		this.capType = capType;
		this.inkFillingSystem = inkFillingSystem;
		this.inkLevel = inkLevel;
		
	}
	
	// 메소드부
	// 2) 필드에 간접적으로 접근할 수 있도록 getter() / setter() 생성
	// getter() 생성
	public String getManufacturer() {
		return manufacturer;
	}

	public int getLength() {
		return length;
	}
	
	public String getNibMaterial() {
		return nibMaterial;
	}

	public String getCapType() {
		return capType;
	}

	public String getInkFillingSystem() {
		return inkFillingSystem;
	}

	public int getInkLevel() {
		return inkLevel;
	}

	// setter() 생성
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	public void setNibMaterial(String nibMaterial) {
		this.nibMaterial = nibMaterial;
	}
	
	public void setCapType(String capType) {
		this.capType = capType;
	}
	
	public void setInkFillingSystem(String inkFillingSystem) {
		this.inkFillingSystem = inkFillingSystem;
	}
	
	public void setInkLevel(int inkLevel) {
		this.inkLevel = inkLevel;
	}
	
	// 3) 모든 필드의 정보를 합쳐서 문자열의 형태로 반환해주는 info() 생성
	public String info(String manufacturer, int length, String nibMaterial, String capType, String inkRillingSystem, int inkLevel) {
		
		String info = "만년필의 제조사 : " + manufacturer
					+ ", 만년필의 전체 길이 : " + length
					+ ", 펜촉의 재질 : " + nibMaterial
					+ ", 뚜껑 닫는 방식 : " + capType
					+ ", 잉크 채우는 방식 : " + inkRillingSystem
					+ ", 현재 잉크 잔량 : " + inkLevel;
		return info;
		
	}
	
	public void writeWithFountainPen() {
		
		System.out.println("만년필을 사용해서 글씨를 써봅니다!");
		
		if(inkLevel > 10) {
			
			System.out.println("사각사각 소리가 좋네요!");
			inkLevel = inkLevel - 15;
			System.out.println("잉크가 " + inkLevel +"% 정도 남았어요!");
			
		} else {
			System.out.println("잉크 충전이 필요한 것 같아요!");
		}
		
	}
	
	public void washFountainPen() {
		System.out.println("만년필을 세척해야 할 것 같아요~");
	}
	
}
