package com.kh.voFridge.run;

import java.util.Scanner;

import com.kh.voFridge.vo.Fridge;

public class FridgeManagementRun {

	public static void main(String[] args) {
		
		System.out.println("나만의 냉장고에 맛있는 것 채우기");
		Scanner sc = new Scanner(System.in);
		Fridge myFridge = new Fridge();
		
		System.out.print("나만의 냉장고의 브랜드는? > ");
		myFridge.brand = sc.nextLine();
		
		System.out.print("냉장고의 최대 용량은 얼마인가요? (L 단위) > ");
		myFridge.capacity = sc.nextInt();
		
		System.out.print("선반이 몇 개 있나요? > ");
		myFridge.numberOfShelves = sc.nextInt();
		
		System.out.print("소비 전력은 얼마인가요? (kW) > ");
		myFridge.powerConsumption = sc.nextInt();
		
		System.out.print("지금 냉장고는 얼마나 차있나요? (1 ~ 100) > ");
		myFridge.currentStorage = sc.nextInt();
		
		// 나만의 냉장고 출력
		boolean exit = false;
		
		while(!exit) {
			
			System.out.println("~~~~~~~~~~ 아 시원한 나의 냉장고 ~~~~~~~~~~");
			System.out.println("나의 냉장고는 " + myFridge.brand + "에서 만들었어요.");
			System.out.println("최대 "+ myFridge.capacity + "L의 공간에 보관할 수 있어요!");
			System.out.println("선반은 " + myFridge.numberOfShelves + "개 있어요.");
			System.out.println("소비 전력은 " + myFridge.powerConsumption + "kW 입니다.");
			System.out.println("지금 냉장고는 " + myFridge.currentStorage + "% 정도 음식이 들어있어요!");
			System.out.println("~~~~~~~~~~ 아 시원한 나의 냉장고 ~~~~~~~~~~");
			System.out.println();
			
			System.out.println("냉장고에 음식을 보관할까요? > ");
			
			if(myFridge.currentStorage > 70) {
				System.out.println("냉장고가 거의 다 찼어요.");
			}
			System.out.print("1. 음식 보관하기 / 2. 꺼내서 요리하기 / 3. 아무것도 하기 싫음 > ");
			int choiceNo = sc.nextInt();
			sc.nextLine();
			
			switch(choiceNo) {
			case 1 : myFridge.storeFood(); break;
			case 2 : myFridge.cookFood(); break;
			case 3 : exit = true; break;
			default : System.out.println("다시 골라주세요~");
			}
			
		}
		
	}

}
