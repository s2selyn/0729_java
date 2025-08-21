package com.kh.chap06.run;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		// 더하기 퀴즈 게임
		// 입력받아서
		Scanner sc = new Scanner(System.in);
		
		// 정수를 두개 입력받아서 두개 합이 얼마인지 물어봐서
		// 정수형 변수 2개 선언
		int cnt1 = 0;
		int cnt2 = 0;
		
		// while문!
		while(true) {
			
			System.out.println("더하기 퀴즈퀴즈(그만하고싶으면 그만하고싶어요를 입력하세요)");
			System.out.println("난이도를 선택해주세요(상/중/하) > ");
			
			// 고민, 입력을 받을까? 랜덤으로 만들까? --> 랜덤으로 만들게요~
			// 난이도를 선택받아서 하자. 입력받으면 쉬울것같음
			String level = sc.nextLine();
			
			int bound = 0; // 범위
			int quizCount = 1; // 왠지 더 하고싶어서 변수 하나 더 선언
			
			// if문으로 해보자
			// 사용자의 입력에 따라 문제 난이도 바꿔주기
			if(level.equals("상")) {
				
				System.out.println("난이도 (상)을 선택하셨습니다. 1 ~ 3000 사이의 범위로 출제됩니다.");
				bound = 3000;
				
			} else if(level.equals("중")) {
				
				System.out.println("난이도 (중)을 선택하셨습니다. 1 ~ 200 사이의 범위로 출제됩니다.");
				bound = 200;
				
			} else if(level.equals("하")) {
				
				System.out.println("난이도 (하)를 선택하셨습니다. 1 ~ 10 사이의 범위로 출제됩니다.");
				bound = 10;
				
			} else if(level.equals("그만하고싶어요")) {
				
				System.out.println("안녕히가세요~ 빠이~");
				break;
				
			} else { // 상중하 다 아니면
				
				System.out.println("이상한 난이도를 선택하셨습니다.");
				System.out.println("처음부터 다시 시도해주세요.");
				continue; // 올려보내기, 더하기 퀴즈퀴즈부터 시작하게 됨
				
			}
			
			// 랜덤 사용해보기, 두개의 정수값을 사용자가 선택한 난이도의 범위에 따라서
			int firstNumber = (int)(Math.random() * bound) + 1;
			int secondNumber = (int)(Math.random() * bound) + 1;
			
			System.out.println(quizCount + "번 문제 ★"); // 변수 하나 더 선언한걸로 몇 번 문제인지 출력해주고싶음
			System.out.println(firstNumber + " + " + secondNumber + " = ?");
			System.out.print("정답을 입력해주세요 > ");
			int answer = sc.nextInt();
			sc.nextLine();
			
			// 왠지 하나 더 하고싶다
			// 또 조건문 써서
			if(answer == (firstNumber + secondNumber)) {
				System.out.println("딩동댕 정답입니다!");
				cnt1++;
			} else {
				System.out.println("땡 ~ 오답입니다...ㅠ");
				cnt2++;
			}
			
			System.out.println("총 문제 수 : " + quizCount + "회 ☆"); // 하다보니 이것도 추가하고싶다
			System.out.println("※ 정답횟수 : " + cnt1 + "번 / 오답횟수 : " + cnt2 + "번"); // 반복 끝날때마다 출력문 이용해서
			System.out.println();
			
			// 종료하는 것도 만들고싶다. 그만하고싶을수도있으니까
			
		}
		
	}

	// 사칙연산 게임 아이디어(옵션에 따라 연산)
	
}
