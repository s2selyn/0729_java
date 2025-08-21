package com.kh.chap03.model.vo;

public class PaperBook extends Book {
	
	private int lostPage; // 아날로그 책의 단점 : 분실될 수 있음
	// 보다가 커피흘리거나 비오는데 머리에 쓰고가다가 물에젖어서 없어지고...? ㅋㅎㅎ
	
	public PaperBook() {}
	public PaperBook(String title, String publisher,
					 String author, int price,
					 int lostPage) {
		
		super(title, publisher, author, price);
		this.lostPage = lostPage;
		
	} // 깨달음을 얻음! Class를 생성할 때 Superclass를 지정할 수 있다! Constructors from superclass 옵션도 뭔지 알겠다!
	// 클래스 만들때부터 생성되도록 구현 가능
	
	public int getLostPage() {
		return lostPage;
	}
	
	public void setLostPage(int lostPage) {
		this.lostPage = lostPage;
	}
	
	public String information() {
		return super.information() + ", 잃어버린 페이지 : " + lostPage + "]";
	}
	
	public String toString() {
		return super.information() + ", 잃어버린 페이지 : " + lostPage + "]";
	}
	
}
