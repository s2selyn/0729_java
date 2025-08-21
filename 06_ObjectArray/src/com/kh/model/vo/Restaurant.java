package com.kh.model.vo;

public class Restaurant {
	
	// 상호, 주소, 메인메뉴 세개의 값을 저장할 세개의 필드 선언
	private String storeName;
	private String address;
	private String mainMenu;
	
	// 기본생성자
	// 모든 필드를 매개변수로 갖는 생성자
	// getter()
	// setter()
	// information()
	// 을 구현해주세요 시~ 작 ~
	
	// 기본생성자
	public Restaurant() {}
	
	// 모든 필드를 매개변수로 갖는 생성자
	public Restaurant(String storeName, String address, String mainMenu) {
		
		this.storeName = storeName;
		this.address = address;
		this.mainMenu = mainMenu;
		
	}
	
	// getter()
	public String getStoreName() {
		return storeName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getMainMenu() {
		return mainMenu;
	}
	
	// setter()
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setMainMenu(String mainMenu) {
		this.mainMenu = mainMenu;
	}
	
	// information()
	public String information() {
		
		return "식당의 정보입니당~ [상호명 : " + storeName 
				+ ", 주소지 : " + address + ", 메인메뉴 : " + mainMenu + "]";
		/*
		String information = "상호 : " + storeName
						   + ", 주소 : " + address
						   + ", 메인메뉴 : " + mainMenu;
		return information;
		*/
		
	}

} // 식당의 정보를 담는 클래스를 만들었음, 이친구로 프로그램을 만들것임
