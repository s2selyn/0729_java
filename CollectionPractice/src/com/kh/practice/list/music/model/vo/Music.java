package com.kh.practice.list.music.model.vo;

public class Music {
	
	private String title;
	private String singer;
	
	// 기본 생성자
	public Music() {
		
		
	}
	
	// 매개변수가 있는 생성자
	public Music(String title, String singer) {
		
		
	}
	
	// setter() / getter()
	private void setTitle(String title) {
		this.title = title;
	}
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getSinger() {
		return singer;
	}
	
	// 객체의 정보를 리턴하는 메소드
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	// 해시코드 오버라이딩한 메소드
	public int hashCode() {
		
		return 0;
		
	}
	
	// equals 오버라이딩한 메소드
	public boolean equals(Object o) {
		
		return false;
		
	}
	
	// 정렬 기준을 가지고 있는 메소드
	public int compareTo(Object o) {
		
		return 0;
		
	}

}
