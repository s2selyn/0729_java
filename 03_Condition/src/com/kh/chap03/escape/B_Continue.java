package com.kh.chap03.escape;

import java.util.Scanner;

public class B_Continue {
	
	/*
	 * continue : 반복문안에서 사용하는 문법
	 * 
	 * continue문을 만나면 continue이후에 어떤 코드가 존재하던 실행하지않고 pass
	 * 반복문 scope 최상단으로 올라가는 것을 의미
	 * 
	 */
	
	public void method1() {
		
		// 1부터 10까지 반복을 하면서 정수값을 출력하는데
		// 반복할건데 --> for or while
		// 1부터 10까지(10번) --> 반복횟수가 명확함 --> for
		
		// 홀 수 일때만 출력 --> if
		for(int i = 1; i <= 10; i++) {
			// for문의 증감식을 2씩 증가하도록 할 수도 있음 --> int +=2 --> 홀수일때만 출력
			
			// if(i % 2 == 1) System.out.println(i); --> 홀수일때만 출력! // 홀수는 2로 나눈 나머지가 1
			if(i % 2 == 0) { // i를 2로 나눈 나머지가 0과 일치하다면 continue
				continue; // 짝수인 경우에는 continue를 만나게 됨
			}
			System.out.println(i);
			
		}
		// 흐름읽기 설명추가
		// i를 1로 대입하는 것 부터 시작, if문의 조건식 확인, false이므로 못들어가고 출력문을 만남 --> 1 출력
		// 증감식(4번)에 의해서 i가 2로 증가함 --> 조건식으로 감 --> 2는 10보다 작으므로 for문 스코프 안으로 들어옴
		// if를 만나고 조건식 확인 --> 2를 2로 나눈 나머지는 0이어서 true이므로 스코프 안으로 들어감 --> continue를 만남(break였으면 for문 블럭 바깥으로 나감)
		// --> continue는 for문 블럭 끝으로 나가는데, 그 사이에 있는 것을 무시하고 증감식(4번)으로 감 --> i는 2에서 3으로 증가함
		// 3은 for문의 조건식 확인, 10보다 작거나 같으므로 for문 안으로 들어감, if를 만남 --> 거짓이므로 if 스코프 안으로 들어가지 못하고 출력문을 만남 --> 3 출력
		// 증감식으로 감 --> 3이 1 증가해서 4가 됨 --> 4는 2로 나눈 나머지가 0 --> continue 만남 --> 4번(증감식)으로 감
		// break는 반복문 스코프 밖으로 빠져나간다면, continue는 반복문 처음으로 다시 올라감
		
	} // 메소드 선언했으면 메인 메소드에서 호출해서 결과 확인해보기
	// 해봤으면 메인 메소드에서 주석처리
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		// do-while로도 가능하지만 보통 이런 경우에는 continue를 쓰게 됨
		System.out.println("회원가입 서비스입니다.");
		
		while(true) { // continue에 의해 돌아오는 곳
			System.out.print("아이디를 입력해주세요(10자 이하) > ");
			String userId = sc.nextLine(); // 아이디 입력받기
			// 나는 10자 이하로 받고싶은데 사용자가 10자 넘게 입력할수도 있잖아요 --> 다시 입력을 받아야함
			
			if(userId.length() > 10) { // 아이디가 10자를 넘어간다면
				
				System.out.println("아이디는 10자 이하만 사용 가능합니다.");
				continue; // continue에 의해 다시 입력받기로 돌아감
				
			} else { // 그게 아니라면
				
				System.out.println("사용 가능한 아이디 입니다.");
				break; // 이걸 써서 반복문을 나감
				
			}
			
		} // break에 의해 나오는 곳
		System.out.println("어쩌고저쩌고~~"); // 그 이후의 작업
		
	}

}
