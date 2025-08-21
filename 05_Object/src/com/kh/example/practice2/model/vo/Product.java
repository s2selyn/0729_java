package com.kh.example.practice2.model.vo;

public class Product {
	
	// 필드부
	private String pName;
	private int price;
	private String brand;
	
	// 생성자부
	public Product() {}
	
	// 메소드부
	// setter()
	public void setPName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// getter()
	public String getPName() {
		return pName;
	}
	
	public int getPPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	// 출력
	public void information() {
		
		System.out.println("제품 정보를 출력합니다.");
		System.out.println("제품 이름은 " + pName
						 + ", 제품 가격은 "+ price
						 + ", 제품 브랜드는 " + brand + "입니다.");
		
	}

}
