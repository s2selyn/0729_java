package com.kh.chap04_assist.model.vo;

import java.io.Serializable;

public class Plant implements Serializable {
	
	// VO 졸업했다! 기본생성자, 매개변수생성자, getter/setter, toString
// 12:35 이번에는 객체 형태의 데이터를 내보내고 싶음
	
	private String name;
	private String type;
	
	public Plant() {
		super();
	}
	
	public Plant(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Plant [name=" + name + ", type=" + type + "]";
	}
	
}
