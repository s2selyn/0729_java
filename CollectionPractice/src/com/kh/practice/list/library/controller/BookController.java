package com.kh.practice.list.library.controller;

import java.util.ArrayList;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	
	// ArrayList 객체 생성
	ArrayList bookList = new ArrayList();
	
	// 초기 값을 넣어줄 기본 생성자
	public BookController() {
		
		// 초기 값 4개 추가 
		/*
		bookList.add(new Book(“자바의 정석”, “남궁 성”, “기타”, 20000)); 
		bookList.add(new Book(“쉽게 배우는 알고리즘”, “문병로”, “기타”, 15000)); 
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500)); 
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
		*/
		
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
		
	}
	
	// 리스트에 값 저장 메소드
	public void insertBook(Book bk) {
		
		//전달 받은 bk를 bookList에 추가
		bookList.add(bk);
		
	}
	
	// 모든 리스트를 출력하는 메소드
	public ArrayList selectList() {
		
		return null;
		
	}
	
	// 키워드로 책을 검색하는 메소드
	public ArrayList searchBook(String keyword) {
		
		return null;
		
	}
	
	// 책 제목과 저자 명으로 책을 삭제하는 메소드
	public Book deleteBook(String title, String author) {
		
		return null;
		
	}
	
	// 책 명 오름차순 정렬하는 메소드
	public int ascBook() {
		
		return 0;
		
	}

}
