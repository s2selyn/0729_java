package com.kh.voCaffeine.run;

import java.util.Scanner;

import com.kh.voCaffeine.vo.Caffeine;

public class CaffeineIntakeRun {

	public static void main(String[] args) {
		
		// 사용자에게 커피 레시피를 입력받아서
		// 입력받은 레시피의 정보를 출력해주고
		// 커피를 마시면 섭취하게 될 카페인의 양을 계산해주는 프로그램
		
		System.out.println("카페인 섭취량 예상하기");
		// 스캐너 필요함
		Scanner sc = new Scanner(System.in);
		
		// 입력받아서 저장할 곳 선언하기
		Caffeine caffeineMenu = new Caffeine();
		
		// 5) 직접접근으로 사용하고 있던 실행클래스의 코드들을 전부 다 getter / setter 대체
		
		// 레시피 입력받기
		// 필드 다섯개 순차적으로 입력받는 서비스 메세지 출력하고 입력받기
		System.out.print("메뉴 이름이 무엇인가요? > ");
		caffeineMenu.setRecipeName(sc.nextLine());
		
		System.out.print("우유가 얼마나 들어있나요? (mL 단위) > ");
		caffeineMenu.setMilkContent(sc.nextInt());
		
		System.out.print("카페인은 얼마나 들어있나요? (mg 단위) > ");
		caffeineMenu.setCaffeineContent(sc.nextInt());
		sc.nextLine();
		
		System.out.print("시럽이 들어있나요? (Y/N) > ");
		caffeineMenu.setHasSyrup(sc.nextLine());
		
		System.out.print("어떤 크기의 잔에 제공되나요? > ");
		caffeineMenu.setCupSize(sc.nextLine());
		
		boolean exit = false;
		
		while(!exit) {
			
			// 다 받았으면 레시피 정보 출력해주기
			System.out.println();
			System.out.println("==============================");
			System.out.println("메뉴 이름 : " + caffeineMenu.getRecipeName());
			System.out.println("우유 함량 : " + caffeineMenu.getMilkContent() + " mL");
			System.out.println("카페인 함량 : " + caffeineMenu.getCaffeineContent() + " mg");
			System.out.println("시럽 유무 : " + caffeineMenu.getHasSyrup());
			System.out.println("잔의 크기 : " + caffeineMenu.getCupSize());
			System.out.println("==============================");
			System.out.println();
			
			// 선택하게 하기, 카페인이 많으면 우유를 늘리는 커스텀 추천하기
			System.out.println("이 음료를 마셔볼까요?");
			if(caffeineMenu.getCaffeineContent() > 100) {
				System.out.println("카페인이 많이 들었어요! 우유 추가를 추천드려요 :) ");
			}
			System.out.print("1. 그대로 주문하기 / 2. 우유 추가하기 / 3. 주문 취소하기 > ");
			int orderNo = sc.nextInt();
			
			switch(orderNo) {
			case 1 : caffeineMenu.drink(); break;
			case 2 : caffeineMenu.drinkCustomized(); break;
			case 3 : exit = true; break;
			default : System.out.println("번호를 다시 선택해주세요!");
			}
			
		}
		
	}

}
