package com.kh.chap02.model.vo;

public class Plant { // 식물을 저장할 자료형을 만들었음!
	// 식물의 종류가 하나는 아님. 실제로 객체로 만들어서 관리해보자. --> Collection!
	
	private String type;
	private String name;
	
	public Plant() {}
	
	public Plant(String type, String name) {
		
		this.type = type;
		this.name = name;
		
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "식물정보 [이름 = " + name + ", 종류 = " + type + "]";
	}
	
}
