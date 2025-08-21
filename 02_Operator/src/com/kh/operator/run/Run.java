package com.kh.operator.run;

	// 1절 import절 작성하기! 패키지경로(내가 import 하려는 클래스의 패키지 선언부).클래스명;
import com.kh.operator.A_Arithmetic;

import com.kh.operator.B_InDecrease;

import com.kh.operator.C_Compound;

import com.kh.operator.D_LogicalNagation;

import com.kh.operator.E_Comparison;

import com.kh.operator.F_Logical;

import com.kh.operator.G_Triple;

	// 이 클래스를 만든 이유 : 프로그램 실행하려고
public class Run {
	
	// 메인 메서드 선언
	public static void main(String[] args) {
		
		// method(); 만으로는 부를 수 없음, 같은 클래스(같은 클래스의 다른 스코프에서는 안되는것? 은 아닌 것 같음) 내부에 있어야 이름만으로 부를 수 있음
		// 외부에 있는 메서드를 부르기 위해서는 1절, 2절을 해야 함
		// 1절 import
		// 2절 import해온 클래스에다가 별칭 붙이고 new(생성) 해주기
		// 클래스명 별칭 = new 클래스명();
		// 클래스명도 이상하고 별칭도 이상하지만 객체지향 배우지 전까지만 이렇게 쓰자
		// 연산자 - 제어문(조건문, 반복문, 탈출문) - 배열 - 객체지향 순서 예정
		A_Arithmetic a = new A_Arithmetic();
		
		// 별칭이 a인 친구에게 있는 메서드를 부를 것이다
		// a와 .(참조연산자) 그리고 메서드 이름
		// a.method();
		
		// 흐름읽기
		// Run을 누르면 어디로 가나요? 무슨 일이 일어나나요?(누가 가지고 있는 무엇으로 가느냐?)
		// 메인 메서드로 간다
		// 구체적으로 Run 이름의 클래스의 n 행에 존재하는(위치한) 메인 메서드의 (열린)스코프로 진입한다.
		// 실제로 영어를 읽는다는 것은 아님, 컴퓨터가 이해할 수 있는 상태로 변환되어 있음
		// 그 뒤에 한줄씩 읽기 시작, 공백과 주석은 스킵
		// 클래스에 a라고 별칭을 지어주고, 뭔가 했음, 세미콜론으로 끝나서 다음줄로 이동
		// a와 참조연산자가 있음, 참조연산자를 입력하는 순간 a로 접근
		// 실제로 a는 A_Arithmetic
		// a는 method라는 메서드와 test라는 메서드가 있음
		// 우리는 method라는 메서드를 호출했음, n 행에 있는 method 메서드의 (열린)스코프로 진입한다.
		// 그 뒤에 한줄씩 읽기 시작, 공백과 주석은 스킵
		// 변수 선언, 정수 모양의 값을 담을 수 있는 공간을 만들어서 공간을 식별할 수 있는 이름을 num1이라고 달고 10(정수형 리터럴값, 얘도 위치가 다른 어딘가의 메모리에 올라가있음)을 대입, 세미콜론 만났으니 끝
		// 항상 1. 좌항 2. 우항 3. 대입연산자 순서
		// 변수 선언, 정수 모양의 값을 담을 수 있는 공간을 만들어서 공간을 식별할 수 있는 이름을 num2라고 달고 3을 대입, 세미콜론 만났으니 끝
		// 출력하래, 문자열과 변수이름(들어있는 값), 세미콜론 끝
		// 공백 스킵
		// test라는 이름의 메서드를 호출
		// n 행에 있는 test라는 이름의 메서드의 스코프로 진입
		// 공백과 주석은 스킵
		// 출력하래, 세미콜론
		// 스코프가 닫힘, 나를 부른 곳으로 다시 돌아감
		// test로 돌아감, 세미콜론
		// 스코프가 닫힘, 나를 부른 곳으로 다시 돌아감 --> 이 순간 메모리에 있던 num1, num2는 날아감
		// 갔다와서 다시 읽음, a.method();의 세미콜론을 만남, 공백과 주석은 스킵
		// 스코프 닫힘, 프로그램 종료
		// 이후 method 메서드 내부의 test(); 호출은 주석처리했음
		// 따라적기 금지~ 생각하고 공부하는 시간
		
		// a.presentToStudent();
		
		// a.presentToStudent2();
		
		B_InDecrease b = new B_InDecrease(); // 2절 클래스명 별칭 = new 클래스명();
		// b.method1(); 그냥 method1()은 클래스 외부에 있으므로 1절 2절 해야한다!
		// b에 접근(. 참조연산자) 후 메소드 호출
		
		// b.method2();
		
		// b.method3();
		
		// 1절부터 시작~ 위로 올라가세요
		// 2절은 메인 메서드 내부에서 별칭 지어주기와 new
		C_Compound c = new C_Compound();
		
		// 이제 메서드 호출하기, 먼저 메서드가 있는 친구 찾아가기, 별칭과 참조연산자, 메서드 호출 
		// c.method1();
		
		// D_LogicalNagation 클래스의 메서드를 부르고 싶음, 그냥 부를 수는 없음, 사전 절차를 진행해야 함
		// import를 해줘야겠네요, 위에 다녀오세요
		// 별칭을 지어주고 생성이라는 것을 해보겠음
		D_LogicalNagation d = new D_LogicalNagation();
		// 이런다고 해서 메서드를 바로 호출할 수 있는 것은 아니고
		
		// 별칭을 먼저 불러야함, 참조연산자(직접접근연산자 온점) 그리고 호출
		// d.method1();
		
		// 메서드 호출하려면 import 해야겠다, 위에 다녀오세요
		// 다녀왔으면 별칭짓기 또 해야징
		E_Comparison e = new E_Comparison();
		
		// 그리고 메서드 호출
		// e.method1();
		
		// 메서드 호출하려면 import 해야하니 위에 다녀오세요
		F_Logical f = new F_Logical(); // 별칭 만들기
		
		// 별칭 참조연산자 메서드 호출
		// f.method1();
		
		// f.method2();
		
		// f.method3();
		
		// 메서드 호출하려면 import 해야하니 위에 다녀오세요
		G_Triple g = new G_Triple();
		
		// g.method1();
		
		// g.method2();
		
		// g.upOrLow();
		g.메소드명알아서정하기();
		
	}

}
