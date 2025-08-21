package com.kh.operator;

public class E_Comparison {
	
	/*
	 * 비교 연산자(관계 연산자)
	 * 동등비교연산자 써봤음, 'a' == 'b',  '3' == (int)'3'
	 * 
	 * 두 개의 값을 가지고 비교, 이항 연산자
	 * 비교연산을 한 결과 -> 참인 경우 true, 거짓인 경우 false
	 * 특정 조건을 제시할 수 있는 조건문에서 조건식으로 사용할 예정~~
	 * 
	 * 잘 기억해두자. 연산자 파트에서 가장 중요한 친구라고 생각하신대
	 * 
	 */

	/*
	 * 종류
	 * 의문문으로 받아들이고 그런 의도로 사용할 것
	 * 
	 * 동등비교, 대소비교
	 * 
	 * 1. 동등비교 : 일치함을 비교
	 * 
	 * a == b : a와 b가 일치합니까?
	 * a != b : a와 b가 일치하지 않습니까?
	 * 
	 * 2. 대소비교 : 값의 크고 작음을 비교
	 * 
	 * a < b : 앞에부터(왼쪽부터) 읽기, a가 b보다 작습니까?
	 * a > b : a가 b보다 큽니까?
	 * a <= b : a가 b보다 작거나 같습니까?
	 * a >= b : a가 b보다 크거나 같습니까?
	 * 
	 * 결과값은 true / false, 동등비교든 대소비교든 이렇게 나옴
	 * 
	 */
	
	// 배운거 한번씩은 써먹어보기
	public void method1() {
		
		// System.out.println("호호호");
		// 메서드 호출하려면 메인 메서드로 가야죠~ 다녀오세요
		// 잘되는거 확인했으면 호호호는 주석처리
		
		// 정수형 변수 선언하고 초기화
		int firstNumber = 10;
		int secondNumber = 25;
		// 대부분 개발자의 취향은 number1, number2, ... 이런 것 보다는 firstNumber, secondNumber, ... 이런 쪽이 더 선호됨
		// 회사에 가면 회사의 규칙을 따르세요
		
		System.out.println("firstNumber < secondNumber : " + (firstNumber < secondNumber));
		// firstNumber가 secondNumber보다 작습니까?
		
		System.out.println("두 값이 같나용 : " + (firstNumber == secondNumber));
		// firstNumber가 secondNumber와 같습니까?
		
		// 이제 할 수 있는 일이 어마어마하게 많아졌음!
		
		System.out.println("firstNumber가 짝 수 입니까? : " + ((firstNumber % 2) == 0));
		// 첫번째 생각할 일 : 무슨 값이 필요하지?
		// firstNumber
		// 두번째 생각할 일 : 무슨 연산을 해야하지?
		// 비교연산
		// 2 4 6 8 10, 짝수들의 공통된 특징은? 2로 나눴을 때 나머지가 0임?
		// 모듈러 연산(%, mod), 여기서 (firstNumber % 2) 작성하고 중간점검 한 번 해봄(지금은 firstNum에 10이 대입되어 있으므로 % 2 연산을 수행하면 0이 나와야함)
		// 그리고 0과 같은지 비교하는 부분 작성
		
		System.out.println("secondNumber가 홀 수가 아닙니까?" + ((secondNumber % 2) == 0));
		// 결국 짝수입니까? 를 묻는 문장이므로 이렇게 작성 가능함
		System.out.println("secondNumber가 홀 수가 아닙니까?" + ((secondNumber % 2) != 1));
		// 문장 그대로 작성하면 이렇게 됨
		// 두개는 같은 의미이고 같은 결과가 나옴
		
	} // 다 해봤으면 메인 메서드에서 주석처리
	
}
