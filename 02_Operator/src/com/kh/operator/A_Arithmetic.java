package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
	// 자바에서 사용하는 연산자
	// 산술연산자 -> 이항연산자(항이 두 개 있어야 함), 우선순위가 수학익힘책이랑 똑같음(곱셈/나눗셈 먼저, 그다음 덧셈/뺄셈, 왼쪽에서 오른쪽으로)
	// + : 덧셈
	// - : 뺄셈
	// * : 곱셈
	// / : 나눗셈
	// % : 모듈러(Modular) => 나눗셈에서의 나머지를 구함
	
	// 보통의 책들은 처음에 메인 메서드 안에 메서드를 다 때려넣는데 어차피 나중에는 다 따로 만들어야 함, 지금부터 습관 만들기
	public void method() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// test();
		
		System.out.println("num1 + num2 : " + (num1 + num2));
		// "num1 + num2 : 13" <-- 이거 수학익힘책임?????
		// System.out.println("num1 + num2 : " + num1 + num2); 의 경우에는
		// 더하기가 두번, 문자열과 정수의 더하기가 먼저 수행
		// 1단계 "num1 + num2 : 10", 문자열과 정수를 더해서 문자열이 됨
		// 2단계 "num1 + num2 : 103", 1단계의 문자열과 정수를 더해서 문자열이 됨
		// 결과값이 "num1 + num2 : 103", 최종적으로 문자열
		// 문자열과 더하면 연산이 되지 않고 붙어버림
		// 보편적으로 생각했을 때 우리가 원하는 결과는 아님
		// 뒤쪽의 연산 순위를 높여주고 싶음
		// 연산 우선순위를 지정하고 싶다면 ()를 이용해서 묶어주어야함 의도한 결과를
		// 출력할 수 있음
		// 괄호로 묶으면 먼저 연산이 끝났으니까 문자열과 더해줘도 상관없음
		
		// 산술연산에서는 문자열과 같이 사용할 때 주의할 것
		
		// 명확하게 이런 문제의 원인 자체를 만들고 싶지 않다면(출력문을 넣기 전에 해결하고 가고싶다면) 출력하기 전에 덧셈을 먼저 하면 됨
		int sum = num1 + num2;
		System.out.println("두 수의 합계 : " + sum);
		
		// 변수는 개발자가 값을 다루는 가장 기초적이고 가장 많이 사용하는 방법
		
		// 또는 printf를 사용하는 방법
		System.out.printf("num1 + num2 : %d\n", num1 + num2); // <-- 이게 제일 좋다고는 하는데 뭐 상관없음
		
		// System.out.println("num1 - num2 : " + num1 - num2); 애초에 안됨
		// 1단계 : 앞에 있는 더하기부터 수행, "num1 - num2 : 10"(문자열)
		// 2단계 : 1단계에서 만들어진 문자열에서 - 3(정수) 불가능
		// 뺄셈의 경우 괄호로 묶어주지 않으면
		// 문자열과 num1을 하나로 합친 뒤 정수를 빼기 때문에 연산이 불가능함!
		System.out.println("num1 - num2 : " + (num1 - num2));
		
		System.out.println("num1 X num2 : " + (num1 * num2));
		// 수학익힘책에 따르면 곱셈이 먼저 수행되므로
		// *, /, % 요 친구들은 우선순위가 +, -보다 높기 때문에 묶어주지 않더라도
		// 먼저 연산을 수행해서 결과를 얻을 수 있음
		// (코드는 항상 누구를 위해서? 남에게 보여주기 위한 용도로 적는 것이기 때문에) 가독성 향상을 위해 괄호를 사용하는 것을 권장
		// 써도 그만 안써도 그만이면 보기 좋게 쓰기, 쓸데없는 연산을 하는 것은 안됨
		// 보기 좋은 용도로 괄호로 묶어주는 것은 훌륭한 개발자의 자세
		
		System.out.println("num1 ÷ num2 : " + (num1 / num2));
		System.out.println("num1 mod num2 : " + (num1 % num2));
		
		// 조심조심해야할 부분
		// 나누기 할 때
		// System.out.println(10 / 0); // 10을 0으로 나누는 것? 실행하면?
		// 문법 자체를 잘못 쓰면 실행을 못함
		// 실행은 했는데 모듈러 연산까지는 잘 나오고 그 다음에 뭐라고 나왔음
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// 0으로 어떻게 나눔? 수학적인 모순을 프로그래밍 언어로 표현해줌
		
	} // 메서드를 호출해야 실행할 수 있음
	// 우리는 메인 메서드에서 호출했다. 메서드를 반드시 메인 메서드에서 호출해야 하는 것은 아님.
	// 같은 프로젝트에 있는 메인 메서드를 불러야함

	public void test() {
		
		System.out.println("꼭 메인메서드에서 호출해야하는것은 아님!");
		
	}
	
	// 사탕 개수 구하기 프로그램을 구현하시오.

	// 메소드 : presentToStudent ()                    <== 메소드 선언
	
	// 사용자에게 값을 입력받으세용.                        <== Scanner
	// 1. 나눠줄 학생의 수                               <== nextInt();
	// 2. 사탕 개수                                    <== nextInt();
	
	// 1인당 받을 수 있는 사탕의 개수 : 사탕 개수 / 학생의 수
	// 남은 사탕의 개수 : 사탕 개수 % 학생의 수              <== 산술연산자
	
	// 출력형식
	// 학생 한 명당 받을 수 있는 사탕의 개수 : X개            <== 출력문
	// 남은 사탕 개수 : X개                              <== 출력문

	public void presentToStudent() {
		
		System.out.println("사탕 개수 구하기 프로그램");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나눠줄 학생의 수를 입력하세요 > ");
		int studentNum = sc.nextInt();
		System.out.printf("나눠줄 학생의 수는 : %d명 입니다.\n", studentNum);
		
		System.out.print("사탕 개수를 입력하세요 > ");
		int candyNum = sc.nextInt();
		System.out.printf("사탕 개수는 : %d개 입니다.\n", candyNum);
		
		int candyPerStudent = (candyNum / studentNum);
		System.out.printf("학생 한 명당 받을 수 있는 사탕의 개수 : %d개\n", candyPerStudent);
		
		int remainCandy = (candyNum % studentNum);
		System.out.printf("남은 사탕 개수 : %d개\n", remainCandy);
		
	}
	
	// 메서드 선언, 메서드 시그니처, 배우기 전까지는 public void로 쓰자, 지금은 선택지가 없음
	public void presentToStudent2() {
		// 메소드 : presentToStudent ()                    <== 메소드 선언
		
		// 사용자에게 값을 입력받으세용.                        <== Scanner
		// 1절 Scanner import 하기
		// 위에서(패키지 선언부와 클래스 영역 사이에서) import java.util.Scanner
		
		// 2절 클래스의 별칭을 지어주면서 new(생성?)를 해줌!
		// 1절(import java.util.Scanner)과 2절(Scanner sc = new Scanner(System.in);) 두개는 스캐너 그만 쓸 때 까지 똑같이 써도 됨
		Scanner sc = new Scanner(System.in);
		
		// System.out.println("중간점검"); 한줄씩 해보는게 좋긴 함, 해보고 주석처리, 메인 메서드로 가서 presentToStudent2() 메서드를 불러서 실행해보고 중간점검이 출력되는지 확인
		
		// 1. 나눠줄 학생의 수                               <== nextInt();
		System.out.println("몇 명이세요?");
		int students = sc.nextInt(); // 이것만 작성하고 실행하면 입력할 수 있는 상태로 전환, 아무것도 출력되어 있지는 않음, 위의 서비스 메세지 작성
		// System.out.println("학생 수 : " + students); // 중간점검, students에 입력된 값이 잘 받아졌는지 확인
		
		// 2. 사탕 개수                                    <== nextInt();
		// 문제가 똑같으면 해결 방법도 똑같다! 나눠줄 학생의 수와 같은 형식
		System.out.println("사탕 몇 개임?");
		int candies = sc.nextInt();
		// System.out.println("사탕 수 : " + candies); // 중간점검, candies에 입력된 값이 잘 받아졌는지 확인
		
		// 1인당 받을 수 있는 사탕의 개수 : 사탕 개수 / 학생의 수
		int result = candies / students;
		// System.out.println(result); // 중간점검
		
		// 남은 사탕의 개수 : 사탕 개수 % 학생의 수              <== 산술연산자
		int mod = candies % students;
		// System.out.println(mod); // 중간점검

		// 출력형식
		// 학생 한 명당 받을 수 있는 사탕의 개수 : X개            <== 출력문
		// 남은 사탕 개수 : X개                              <== 출력문
		System.out.println("==========");
		System.out.println("한 명 당 몇 개 가 질 수 있 음???");
		System.out.println("정답 : " + result + "개");
		System.out.println();
		System.out.println("사 탕 몇 개 남 음 ?");
		System.out.println("정답 : " + mod + "개");
		System.out.println("==========");
		
	}
	
}
