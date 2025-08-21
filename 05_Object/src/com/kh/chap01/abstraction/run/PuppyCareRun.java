package com.kh.chap01.abstraction.run;

import java.util.Scanner;

import com.kh.chap01.abstraction.vo.Puppy;

public class PuppyCareRun {

	public static void main(String[] args) {
		
		// 사용자에게 강아지의 정보를 입력받아서
		// 입력받은 강아지의 정보를 출력해주고
		// 강아지와 함께 놀아줄 수 있는 프로그램
		
		System.out.println("🐶 귀여운 강아지 키우기 🐶");
		
		// 사용자에게 강아지의 정보를 입력받아서 <-- 이거 하려면 스캐너 필요
		/* 스캐너 타입의 변수 선언 */Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
		// 왼쪽은 공간, 오른쪽은 값, 특히 자바는 예외 없음, 이게 아니면 돌아갈 수 없음
		// 스캐너 타입의 변수를 선언하고, 스캐너 객체를 생성해서, 스캐너 객체의 주소값을 변수에 대입함
		
		// 강아지의 정보를 입력받으려면?
		/*
		System.out.print("강아지의 이름을 입력해주세요 > ");
		String puppyName = sc.nextLine(); // 입력을 받아서 String 타입의 변수에
		System.out.print("어떤 종류 인가요 > ");
		String puppySpecies = sc.nextLine();
		// 그동안은 항상 이렇게 했음
		*/
		
		// 강아지가 가질 수 있는 정보를 저장하기 위해서 강아지 형태의 자료형을 만들었음 --> Puppy 클래스
		// 강아지의 데이터를 heap에 올려서 사용하려고 함
		
		// Puppy가 import 되었음
		Puppy puppy = new Puppy(); // 강아지 속성 저장소
		System.out.print("강아지의 이름을 입력해주세요 > ");
		// 입력받은 것을 대입하려면?
		// puppy에는 주소만 담겨있음, 주소를 참조해야함 --> 주소를 가리켜야함 --> 참조연산자
		puppy.name = sc.nextLine();
		
		// 그림그리기
		// stack 영역에 메소드가 올라감! 강아지 키우기 출력함
		// Scanner sc = new Scanner(System.in); 의 왼쪽을 보니 Scanner sc <-- 변수 선언, Scanner 모양 공간(주소값만 받을 것임)을 이름을 sc라고 지었음
		// Scanner sc = new Scanner(System.in); 오른쪽을 보니 객체 생성(괄호안은 아직 모르겠음), new를 만나면 heap에 공간을 할당받음, 얼마만큼? 스캐너만큼의 공간, 주소도 생김(0x1111) --> 주소값을 sc의 공간에 대입해줌
		// sc는 heap에 올라가있는 0x1111의 모서리를 가리키고 있음
		// Puppy puppy = new Puppy(); 은 변수 선언하고 있음, Puppy 모양임, 이름을 puppy라고 붙임
		// 객체 생성하고 있음, new 하면 heap으로 감, Puppy만큼의 공간을 만든다 --> Puppy의 공간은 우리가 만들었으니 알고 있음 --> 정보용 공간 6개(각각 이름이 있음), 기능 2개 --> 기본값이 들어가있음(참조자료형은 null, 정수형은 0)
		// Puppy의 공간도 주소가 있을것임(0xff23) --> 이 주소를 puppy 공간에 대입 --> heap에 있는 0xff23 공간의 모서리를 가리킴
		// 출력문 수행함
		// puppy.name = sc.nextLine();의 puppy.name <-- 주소값을 참조함, 주소로 이동 name으로 가라고 함
		// puppy.name = sc.nextLine();의 sc는 주소값 .는 참조연산자 nextLine()은 뭔지 모르겠지만 sc에게 있나보다 <-- heap에 생성된 0x1111 공간 안에 있음
		// puppy.name = sc.nextLine();의 sc.nextLine() <-- heap 영역에 올라가있는 스캐너객체를 참조해서 메소드를 호출하는 것
		// sc.nextLine()는 사용자가 입력한 문자열을 반환받음 --> puppy를 참조해서 name 필드에 대입
		
		// 강아지의 정보를 받아서 메모리상에 올릴거임 --> 강아지의 정보를 전부 받아서 Puppy 타입 객체가 가지고 있는 필드에 대입하면 됨
		
		// 메모리상에 저장되는 위치만 바뀌고 근본적으로는 같음~(stack에 변수로 쌓이던게 heap으로 옮겨간것)
		// 메모리 어딘가에 값을 올리고 메모리 어딘가에 있는 값 빼오기가 웹 개발자의 일
		
		System.out.print("어떤 종류 인가요 > ");
		puppy.species = sc.nextLine();
		System.out.print("나이는 몇 살 인가요 > ");
		puppy.age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별은 무엇인가요 > ");
		puppy.gender = sc.nextLine();
		System.out.print("몸무게는 몇 kg인가요 > ");
		puppy.weight = sc.nextInt();
		sc.nextLine();
		System.out.print("무슨 색 인가요 > ");
		puppy.color = sc.nextLine();
		
		boolean exit = false; // 반복 중지 여부 판별의 용도로 쓸 것임
		
		while(!exit) { // 안나간 상태에서는 계속 while문이 반복하도록 만들것임
			
			// 위에서 입력한 강아지의 정보들을 출력할것임
			System.out.println("🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮");
			// 이름은 어디에 저장되어 있나? name 필드 --> name에 가려면 Puppy모양 객체에 먼저 가야함 --> 주소를 봐야 갈 수 있음 --> 주소는 puppy라는 이름의 변수 공간에 대입되어 있음
			System.out.println(puppy.name + "의 정보!");
			System.out.println("나이 : " + puppy.age);
			System.out.println("성별 : " + puppy.gender);
			System.out.println("종: " + puppy.species);
			System.out.println("색 : " + puppy.color);
			System.out.println("무게 : " + puppy.weight);
			System.out.println("🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮🦮");
			System.out.println();
			
			System.out.println("메뉴를 선택해주세요 > ");
			
			// 강아지 몸무게가 많이 나가면 추천하고 싶은 메소드가 있다
			if(puppy.weight > 40) {
				System.out.println("※ 다이어트를 위해 짖기를 추천드려요.");
			}
			System.out.print("1. 냄새맡기 / 2. 짖기 / 3. 프로그램 종료 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : puppy.sniff(); break; // puppy가 가진 sniff 호출
			case 2 : puppy.bark(); break; // puppy가 가진 bark 호출
			case 3 : exit = true; break; // while문을 멈추기 위해 exit에 true 대입
			default : System.out.println("메뉴를 다시 선택해주세요 !");
			}
			
		}
		
	} // 그동안은 변수 6개와 메소드 2개를 만들어서 해야했지만 클래스를 만들어서 해냄!
	// 객체 만들어서 프로그래밍 하면 객체 지향이지...
	// 여기에 살이 붙음

}
