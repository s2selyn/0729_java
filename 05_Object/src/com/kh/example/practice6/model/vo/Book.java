package com.kh.example.practice6.model.vo;

public class Book {
	
	// 필드부
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	// 생성자부
	public Book() {}
	
	public Book(String title, String publisher, String author) {
		
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
		
	}
	
	// 메소드부
	public void inform() {
		
		System.out.println("책 정보를 출력합니다.");
		System.out.println("제목 : " + title
						 + ", 출판사 : " + publisher
						 + ", 작가 : " + author
						 + ", 가격 : " + price
						 + ", 할인율 : " + discountRate);
		
	}

}
