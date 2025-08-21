package com.kh.voFamily.run;

import java.util.Scanner;

import com.kh.voFamily.vo.Family;

public class FamilyCareRun {

	public static void main(String[] args) {

		System.out.println("가족이 행복해졌으면 좋겠다!");
		Scanner sc = new Scanner(System.in);
		Family familyMember = new Family();
		
		// 5) 직접접근으로 사용하고 있던 실행클래스의 코드들을 전부 다 getter / setter 대체
		System.out.print("가족 중의 누구인가요? > ");
		familyMember.setName(sc.nextLine());
		System.out.print("몇년도에 태어났나요? > ");
		familyMember.setBirthYear(sc.nextInt());
		sc.nextLine();
		System.out.print("가족의 성별을 알려주세요! > ");
		familyMember.setGender(sc.nextLine());
		System.out.print("가족이 좋아하는 음식을 알려주세요~ > ");
		familyMember.setFavoriteFood(sc.nextLine());
		System.out.print("지금 그분은 얼마나 행복할까요? (1부터 100까지!) > ");
		familyMember.setHappinessLevel(sc.nextInt());
		
		boolean exit = false;
		
		while(!exit) {
		
			// 다 받았으면 가족 정보 출력해주기
			System.out.println("==============================");
			System.out.println("나의 가족 " + familyMember.getName() + " 소개");
			System.out.println(familyMember.getName() + "은/는 " + familyMember.getBirthYear() + "년도에 태어났어요!");
			System.out.println("성별은 " + familyMember.getGender() + "이고요~");
			System.out.println(familyMember.getFavoriteFood() + "을/를 엄청 좋아해요!");
			System.out.println("지금은 아마 100점 만점에 " + familyMember.getHappinessLevel() + "점 정도 행복할거에요~");
			System.out.println("==============================");
			
			// 행복도가 낮다면 행복하게 만들어보기 프로그램
			System.out.println("가족과 무엇을 해보고 싶나요? > ");
			if(familyMember.getHappinessLevel() < 50) {
				System.out.println("가족이 조금 더 행복해지면 좋을 것 같아요!");
			}
			System.out.println("1. 맛있는 것 먹으러 가기 / 2. 생일파티! / 3. 아무것도 안할래요 > ");
			int choiceNo = sc.nextInt();
			sc.nextLine();
		
			switch(choiceNo) {
			case 1 : familyMember.eatFood(); break;
			case 2 : familyMember.celebrateBirthday(); break;
			case 3 : exit = true; break;
			default : System.out.println("다시 골라보아요~!");
			}
		
		}
		
	}

}
