package com.kh.chap03.model.vo;

public class ElectronicBook extends Book {
	
	private String platform;
	
	public ElectronicBook() {}
	
	public ElectronicBook(String title, String publisher,
						  String author, int price,
						  String platform) {
		
		super(title, publisher, author, price); // 부모꺼는 부모 생성자 호출해서 부모꺼에
		this.platform = platform; // 내껀내꺼에
		
	}
	
	// 내건내꺼에
	public String getPlatform() {
		return platform;
	}
	
	public void setPlatform() {
		this.platform = platform;
	}
	
	public String information() {
		return super.information() + ", 플랫폼 : " + platform + "]";
	}
	
	public String toString() {
		return super.information() + ", 플랫폼 : "+ platform + "]";
	}
	
}
