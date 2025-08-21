package com.kh.operator;

import java.util.Scanner; // java.utill이 패키지 이름, Scanner가 클래스 이름
	// 스캐너를 사용할 메서드 영역에 가서 2절

public class C_Compound {

	/*
	 * 복합 대입 연산자 : "=" 대입연산자
	 * 
	 * 다른 산술연산자(5개)와 대입연산자가 결합한 것
	 * => 자기 자신의 값과 해당 산술연산을 한 후 그 결과를 자기자신에게 다시 대입하는 용도
	 * 
	 * 딱히 기능이 있거나 그런건 아니고, 대입 연산자 앞에 연산자를 붙임, 짧게 쓸 수 있고 유지보수성과 가독성이 좋아짐
	 * 
	 */
	
	// +=
	// -=
	// *=
	// /=
	// %=
	
	/*
	 * 예시 
	 * 
	 * int endDays = 129;
	 * 
	 * 매일 23시 59분 59초에 실행할 코드 :
	 * 
	 * endDays = endDays - 1;
	 * 현재 내 값을 -1 한 다음에 대입하기
	 * 
	 * ----------
	 * 
	 * endDays -= 1; 가독성, 생산성
	 * 
	 * System.out.println("종강일까지 " + endDays + "일 남았습니다.");
	 * 
	 * long veryBigNumberCount = 100000000000;
	 * 
	 * veryBigNumberCount = veryBigNumberCount - 1000; 이렇게 긴 단어를 두번 쓰려면 실수할 확률이 높음
	 * 
	 * veryBigNumberCount -= 1000; 실수를 줄일 수 있는 합리적인 방법
	 * 
	 */
	
	public void method1() {
		
		// System.out.println("크게 뭐가 없습니다."); // 이걸 출력해보려면 호출해야 하고, 메인 메서드에서 호출해야 함
		// Run 클래스로 가자, 1절 2절 하고 다녀왔음, 이후에 위에 주석처리
		
		// 스캐너 배웠으니까 스캐너 써보자. 사용자에게 값을 입력받기 위해 사용
		// 스캐너 사용하려면 1절 2절 해야함
		// 1절 하러 패키지 선언부랑 클래스 선언부 사이로 가세요
		// 다녀왔으면 2절
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 하나만 입력해주세요 > ");
		// 중간점검 ㄱㄱ! Problems 확인
		// 콘솔창에서 정수값을 입력받을 방법은? 스캐너가 가진 메서드를 호출해서 입력받음
		// 정수를 입력받을 수 있는 스캐너의 메서드는 nextInt()
		// 메서드를 호출하기만 하면 입력은 가능함
		// 입력받은 값을 활용하고 싶으니까 저장할 공간을 만들어야함, 지금은 변수밖에 모름
		// 입력받을 값의 형태가 정수형이므로 int형 공간을 선언함 스캐너의 메서드에 의해 사용자가 입력받은 값을 대입하겠다는 뜻
		int number = sc.nextInt();
		System.out.println(number);
		// number가 잘 받아오는지 확인
		
		// 사용자가 입력한 정수 값은(개발자의 입장에서, 코드 짜는 시점에서) 알 수 없음
		// 사용자가 입력한 값에서 10을 뺀 값을 출력하고싶음
		number = number - 10; // number에 있던 리터럴에 10을 뺀 값을 다시 number로 대입
		System.out.println("10을 감소시킨 정수 값 : " + number);
		
		// 복합대입 연산자를 이용하면 줄일 수 있음
		number -= 10; // number = number - 10; 보다는 간단해짐
		System.out.println("20을 감소시킨 정수 값 : " + number);
		
		// 쓸거 좀 줄어들고 가독성 좋아짐, 기능이 더 좋아지고 나빠지는 그런건 없음
		
	} // 다 해봤으니 메인 메서드에서 주석처리함
	
}
