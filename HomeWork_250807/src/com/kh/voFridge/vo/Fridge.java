package com.kh.voFridge.vo;

public class Fridge {

	// 필드부
	// 1) 모든 필드의 접근제한자를 private 으로 변경
	private String brand;
	private int capacity;
	private int numberOfShelves;
	private int powerConsumption;
	private int currentStorage;

	// 생성자부
	// 4) 기본생성자 및 모든 필드를 매개변수로 가지고 있는 생성자 생성
	// 기본생성자 생성
	public Fridge() {}
	
	// 모든 필드를 매개변수로 가지고 있는 생성자 생성
	public Fridge(String brand, int capacity, int numberOfShelves, int powerConsumption, int currentStorage) {
		
		this.brand = brand;
		this.capacity = capacity;
		this.numberOfShelves = numberOfShelves;
		this.powerConsumption = powerConsumption;
		this.currentStorage = currentStorage;
		
	}
	
	// 메소드부
	// 2) 필드에 간접적으로 접근할 수 있도록 getter() / setter() 생성
	// getter() 생성
	public String getBrand() {
		return brand;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int getNumberOfShelves() {
		return numberOfShelves;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public int getCurrentStorage() {
		return currentStorage;
	}
	
	// setter() 생성
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void setNumberOfShelves(int numberOfShelves) {
		this.numberOfShelves = numberOfShelves;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public void setCurrentStorage(int currentStorage) {
		this.currentStorage = currentStorage;
	}
	
	// 3) 모든 필드의 정보를 합쳐서 문자열의 형태로 반환해주는 info() 생성
	public String info() {
		
		String info = "냉장고의 브랜드 : " + brand
					+ ", 냉장고 최대 용량 : " + capacity
					+ ", 선반 개수 : " + numberOfShelves
					+ ", 소비전력 : " + powerConsumption
					+ ", 현재 보관 용량 : " + currentStorage;
		return info;
		
	}
	
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
