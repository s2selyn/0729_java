package com.kh.voFountainPen.vo;

public class FountainPen {

	//  필드부
	public String manufacturer;
	public int length;
	public String nibMaterial;
	public String capType;
	public String inkFillingSystem;
	
	public int inkLevel = 100;
	
	// 메소드부
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
