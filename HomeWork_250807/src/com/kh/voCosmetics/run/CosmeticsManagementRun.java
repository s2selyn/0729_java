package com.kh.voCosmetics.run;

import java.util.Scanner;

import com.kh.voCosmetics.vo.Cosmetics;

public class CosmeticsManagementRun {
	
	public static void main(String[] args) {

		// 사용자에게 화장품 정보를 입력받아서
		// 입력받은 화장품의 정보를 출력해주고
		// 화장품의 사용기한에 따라 쓸 지 말 지 알려주는 프로그램
		
		System.out.println("써보고싶은 화장품에 대해 알려주세요!");
		// 스캐너 필요함
		Scanner sc = new Scanner(System.in);
		
		// 입력받아서 저장할 곳 선언하기
		Cosmetics cosmeticItem = new Cosmetics();
		
		// 5) 직접접근으로 사용하고 있던 실행클래스의 코드들을 전부 다 getter / setter 대체
		
		// 화장품 정보 입력받기
		// 필드 다섯개 순차적으로 입력받는 서비스 메세지 출력하고 입력받기
		System.out.print("화장품의 종류를 입력해주세요 > ");
		cosmeticItem.setType(sc.nextLine());
		
		System.out.print("화장품의 색상은 무엇인가요? > ");
		cosmeticItem.setColor(sc.nextLine());
		
		System.out.print("브랜드 또는 제조사를 알려주세요 > ");
		cosmeticItem.setBrand(sc.nextLine());
		
		System.out.print("어떤 피부 타입에 추천하나요? > ");
		cosmeticItem.setSkinType(sc.nextLine());
		
		System.out.print("남은 사용기간은 며칠인가요? > ");
		cosmeticItem.setExpirationDays(sc.nextInt());
		
		boolean exit = false;
		
		while(!exit) {
			
			// 다 받았으면 화장품 정보 출력해주기
			System.out.println();
			System.out.println("==============================");
			System.out.println("종류 : " + cosmeticItem.getType());
			System.out.println("색상 : " + cosmeticItem.getColor());
			System.out.println(cosmeticItem.getBrand() + "의 제품입니다.");
			System.out.println(cosmeticItem.getSkinType() + " 타입의 피부에 추천하는 제품입니다!");
			System.out.println(cosmeticItem.getExpirationDays() + "일이 지나기 전에 사용하세요.");
			System.out.println("==============================");
			System.out.println();
			
			System.out.println("한 번 써볼까요?");
			System.out.print("1. 써보기 / 2. 교환하기 / 3. 포기하기 > ");
			int choiceNo = sc.nextInt();
			
			switch(choiceNo) {
			case 1 : cosmeticItem.tryCosmetics(); break;
			case 2 : cosmeticItem.exchangeCosmetics(); break;
			case 3 : exit = true; break;
			default : System.out.println("다시 고민해보시겠어요?");
			}
			
		}
		
	}
	
}
