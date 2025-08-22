package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;

public class MusicView {
	
	// 스캐너 객체 생성
	private Scanner sc = new Scanner(System.in);
	
	// MusicController 객체 생성
	private MusicController mc = new MusicController();
	
	// 사용자가 직접 메인 메뉴를 선택 할 수 있음. 종료 전까지 반복 실행. 각 메뉴를 누를 시 해당 메소드로 이동.
	public void mainMenu() {
		
		/*
		******* 메인 메뉴 ******* 
		1. 마지막 위치에 곡 추가  // addList() 실행
		2. 첫 위치에 곡 추가  // addAtZero()
		3. 전체 곡 목록 출력  // printAll()
		4. 특정 곡 검색   // searchMusic()
		5. 특정 곡 삭제   // removeMusic()
		6. 특정 곡 정보 수정  // setMusic()
		7. 곡명 오름차순 정렬  // ascTitle()
		8. 가수명 내림차순 정렬  // descSinger()
		9. 종료    // “종료” 출력 후 main()으로 리턴
		메뉴 번호 선택 : >> 입력 받음 
		// 메뉴 화면 반복 실행 처리
		*/
		
		while(true) {
			
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : >> ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : addList(); break;
			case 2 : addAtZero(); break;
			case 3 : printAll(); break;
			case 4 : searchMusic(); break;
			case 5 : removeMusic(); break;
			case 6 : setMusic(); break;
			case 7 : ascTitle(); break;
			case 8 : descSinger(); break;
			case 9 : System.out.println("종료"); return;
			}
			
		}
		
	}
	
	// 마지막 위치에 곡 추가 성공을 알리는 메소드
	public void addList() {
		
		
	}
	
	// 첫 위치에 곡 추가 성공을 알리는 하는 메소드
	public void addAtZero() {
		
		
	}
	
	// 전체 곡 목록을 출력 성공을 알리는 메소드
	public void printAll() {
		
		
	}
	
	// 특정 곡 검색의 결과를 보여주는 메소드
	public void searchMusic() {
		
		
	}
	
	// 특정 곡 삭제 결과를 보여주는 메소드
	public void removeMusic() {
		
		
	}
	
	// 특정 곡 정보 수정 결과를 보여주는 메소드
	public void setMusic() {
		
		
	}
	
	// 곡 명 오름차순 정렬 성공을 알리는 메소드
	public void ascTitle() {
		
		
	}
	
	// 가수 명 내림차순 정렬 성공을 알리는 메소드
	public void descSinger() {
		
		
	}

}
