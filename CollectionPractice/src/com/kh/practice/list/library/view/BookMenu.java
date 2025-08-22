package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;

public class BookMenu {
	
	// BookController 객체 생성
	BookController bc = new BookController();
	
	// Scanner 객체
	Scanner sc = new Scanner(System.in);
	
	// 사용자가 직접 메인 메뉴를 선택할 수 있음. 종료 전까지 반복 실행. 각 메뉴를 누를 시 해당 메소드로 이동.
	public void mainMenu() {
		
		System.out.println("== Welcome KH Library ==");
		
		/*
		******* 메인 메뉴 ******* 
		1. 새 도서 추가   
		2. 도서 전체 조회  
		3. 도서 검색 조회  
		4. 도서 삭제   
		5. 도서 명 오름차순 정렬  
		9. 종료    
		메뉴 번호 선택 : >> 입력 받음 
		// 메뉴 화면 반복 실행 처리 
		// insertBook () 실행 
		// selectList () 
		// searchBook () 
		// deleteBook () 
		// ascBook() 
		// “프로그램을 종료합니다.” 출력 후 main()으로 리턴 
		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
		 */
		
		while(true) {
			
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : >> ");
			int menuNo = sc.nextInt();
			
			switch(menuNo) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : searchBook(); break;
			case 4 : deleteBook(); break;
			case 5 : ascBook(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
			
			
		}
		
	}
	
	// 도서 추가를 위해 정보를 받는 메소드 
	public void insertBook() {
		
		
	}
	
	// 전체 도서 목록 출력 성공을 알리는 메소드 
	public void selectList() {
		
		
	}
	
	// 특정 도서 검색 결과를 보여주는 메소드
	public void searchBook() {
		
		
	}
	
	// 특정 도서 삭제 성공을 알리는 메소드 
	public void deleteBook() {
		
		
	}
	
	// 책 명 오름차순 정렬 성공을 알리는 메소드
	public void ascBook() {
		
		
	}
	
}
