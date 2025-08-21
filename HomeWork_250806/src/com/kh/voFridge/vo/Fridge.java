package com.kh.voFridge.vo;

public class Fridge {

	//  필드부
	public String brand;
	public int capacity;
	public int numberOfShelves;
	public int powerConsumption;
	public int currentStorage;
	
	// 메소드부
	public void storeFood() {
		
		if(capacity > currentStorage) {
			
			currentStorage = currentStorage + 15;
			System.out.println("냉장고에 잘 정리해서 넣었어요! 현재 보관량 : " + currentStorage + "%");
			
		} else {
			System.out.println("냉장고에 들어갈 자리가 없어요ㅠㅠ");
		}
		
	}
	
	public void cookFood() {
		
		if(currentStorage >= 15) {
			
	        currentStorage -= 15;
	        System.out.println("냉장고에서 식재료를 꺼냈습니다. 현재 보관량 : " + currentStorage + "%");
	        
	    } else if(currentStorage > 0) {
	    	
	        System.out.println("일단 전부 꺼냈어요. 이제 아무것도 없어요 ㅠㅠ");
	        currentStorage = 0;
	        
	    } else {
	        System.out.println("냉장고에 아무것도 없어요ㅠㅠ");
	    }
		
	}
	
}
