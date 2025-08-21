package com.kh.idol.view;

import java.util.Scanner;

import com.kh.idol.controller.IdolController;

public class IdolView {
	
	// 필드부
	// 사용자한테 입력을 받아야함, 모든 메소드에서 받아야 하니 스캐너를 두자
	// 단점 : 반납 못함
	private Scanner sc = new Scanner(System.in);
	private IdolController ic = new IdolController();
	// 아이돌 정보, 회원 정보, 게시글 정보도 저장해야하므로
	
	// 생성자
	
	// 메소드부
	// 프로그램을 실행했을 때 가장 먼저 보여질 화면을 출력해주는 기능 --> 메인 메뉴 만들자는거지
	public void mainMenu() {
		
		System.out.println("\n\n 🎈aespa 커뮤니티에 오신것을 환영합니다🎈");
		
// 12:35 회원가입하고 로그인해야 게시판 서비스를 쓸 수 있음
		
		
	}

}
