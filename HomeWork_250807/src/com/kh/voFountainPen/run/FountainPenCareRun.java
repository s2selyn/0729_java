package com.kh.voFountainPen.run;

import java.util.Scanner;

import com.kh.voFountainPen.vo.FountainPen;

public class FountainPenCareRun {

	public static void main(String[] args) {

		System.out.println("나의 만년필 모음");
		Scanner sc = new Scanner(System.in);
		FountainPen myPen = new FountainPen();
		
		// 5) 직접접근으로 사용하고 있던 실행클래스의 코드들을 전부 다 getter / setter 대체
		System.out.print("만년필의 제조사를 입력해주세요 > ");
		myPen.setManufacturer(sc.nextLine());
		System.out.print("길이는 몇 cm인가요? > ");
		myPen.setLength(sc.nextInt());
		sc.nextLine();
		System.out.print("펜촉의 재질은 어떤 것인가요? > ");
		myPen.setNibMaterial(sc.nextLine());
		System.out.print("뚜껑은 어떻게 닫나요? > ");
		myPen.setCapType(sc.nextLine());
		System.out.print("잉크는 어떻게 충전하나요? > ");
		myPen.setInkFillingSystem(sc.nextLine());
		
		boolean exit = false;
		
		while(!exit) {
			
			System.out.println("------------------------------");
			System.out.println("나의 만년필 정보~");
			System.out.println(myPen.getManufacturer() + "에서 만들었어요");
			System.out.println("펜의 길이는 " + myPen.getLength() + "cm 입니다.");
			System.out.println("펜촉은 " + myPen.getNibMaterial() + "(으)로 만들었어요.");
			System.out.println("뚜껑을 닫는 방식은 " + myPen.getCapType() + "입니다.");
			System.out.println("잉크를 충전하는 방법은 " + myPen.getInkFillingSystem() + "을/를 사용하게 되어있어요.");
			System.out.println("------------------------------");
			System.out.println();
			
			System.out.println("만년필을 가지고 무엇을 해볼까요? > ");
			
			if(myPen.getInkLevel() < 15) {
				System.out.println("쓰다보면 잉크가 모자랄 것 같아요. 충전하거나 카트리지를 교환하세요!");
			}
			System.out.print("1. 써보기 / 2. 세척하기 / 3. 다른거 하러 갈래요 > ");
			int choiceNo = sc.nextInt();
			sc.nextLine();
			
			switch(choiceNo) {
			case 1 : myPen.writeWithFountainPen(); break;
			case 2 : myPen.washFountainPen(); break;
			case 3 : exit = true; break;
			default : System.out.println("만년필로 하고 싶은 일을 다시 선택해주세요 !");
			}
			
		}
		
	}

}
