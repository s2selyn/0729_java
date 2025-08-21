package com.kh.operator;

public class B_InDecrease {

	// 증가하면 커짐, 감소하면 줄어듦
	
	/*
	 * 증감연산자 : 단항연산자로 한 번에 1씩 증가(더하거나) / 감소(빼거나)하는 연산을 함 
	 * 정수가 1씩 커지고(2 -> 3) 1씩 감소함(3 -> 2), 단항연산자(하나만 있으면 됨)
	 * 
	 * [ 표현법 ]
	 * ++ : 값을 1증가 시키는 연산자
	 * -- : 값을 1감소 시키는 연산자
	 * 
	 * => 증감을 먼저 할건지, 나중에 할건지에 따라 연산자의 위치가 달라짐
	 * 
	 * 연산자의 위치
	 * 전위 연산 : ++값, --값     --> 먼저 값을 증가 또는 감소시키고 나서 작업을 처리
	 * 후위 연산 : 값++, 값--     --> 먼저 값을 처리하고 나서 증가하거나 감소
	 * 
	 */
	
	// 후위연산 첫 번째 메소드
	public void method1()  {
		
		// System.out.println("중간 점검");
		// Console 탭 보다는 Problems 탭을 열어두는 것이 낫다. errors 알려줌
		// 평소에는 Problems 탭을 열어두고, Console 탭은 결과를 확인할때만
		// Warnings는 지금은 무시
		
		int num = 10; // 정수형 변수 하나 선언과 동시에 초기화
		System.out.println("num : " + num);   // "num : 10"
		// 리터럴 10이니까 문자열과 더해짐
		
		num++; // num에 있던 10이 11이 되었음
		System.out.println("num : " + num);   // "num : 11"
		
		num--; // num에 있던 11이 10이 되었음
		System.out.println("num : " + num);   // "num : 10"
		
		System.out.println("num : " + num++); // "num : 10"
		// ++는 리터럴 값을 처리한 후에 연산함, 일단 10이 들어있음, 출력을 먼저 하고, 그다음에 증가시켜서 11이 됨
		
		System.out.println("num : " + num++); // "num : 11"
		// 여기서 다시 리터럴값을 보니 11이라서 11을 출력하고, ++가 처리됨, 변수에 들어있는 값은 12
		
		System.out.println(num); // 12
		// 변수에 들어있는 값은 12
		
	}
	
	// 두 번째 메소드
	public void method2() {
		
		int a = 10;
		int b = a++; // 이렇게 극단적으로 잘 사용하지는 않는다, 주로 한 줄에 num++; 와 같이 작성하여 사용
		
		// 1번 int a = 10;
		// 1. a라는 식별자를 가진 int형 변수공간을 할당받고
		// 2. 정수형 리터럴 값 10을
		// 3. 대입해버림
		
		// 2번 int b = a++;
		// 좌항(int b) :
		// b라는 식별자를 가진 int형 변수공간을 할당받음
		
		// 3번 int b = a++; 우항_1(a++) : 
		// a라는 변수 공간에 대입된 정수형 리터럴값을 가져옴(어딘가에 뒀음)
		
		// 4번 int b = a++; 우항_2(a++) :
		// a라는 공간의 값을 1증가 --> a에 들어있는 10이 11로 바뀜
		
		// 5번 가운데 : 
		// 가져온 리터럴값을 b공간에 초기화(3번과 4번은 따로 일어나는 일)
		
		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 10
		
		int c = 20;
		int d = c--;
		
		System.out.println("c : " + c); // c : ??
		System.out.println("d : " + d); // d : ??
		// d에는 감소시키기 전에 c의 값이 들어가므로 20
		// 감소한 값은 c의 값
		
		int num = 20;
		int result = num++ * 3;
		
		System.out.println(num);    // 21
		System.out.println(result); // 60
		
		// 정수를 담는 num에 20이 담겼음
		// 정수를 담는 result에 num의 리터럴 값이 뭔지 본다(20, 후위연산이니까 일단 빼옴)
		// num에 있는 수를 더하래(num에 들어있는 20이 증가함)
		// 그 뒤에서 곱하기 3을 하래 --> 빼온 20에 곱하기 3을 함, 오른쪽이 끝남
		// 대입 연산자로 위에서 곱하기 3이 끝나서 나온 값을 대입했음
		
	}
	
	// 전위연산
	public void method3() {
		
		int a = 10; // 안녕 나 a라고 해, 10 넣을게
		int b = ++a; // 안녕 나 b라고 해, 근데 a값 1 증가시켜줘, 거기에 있는 리터럴 값 대입할게
		// 값을 빼오기 전에 이미 a값이 증가함
		// a가 증가하고 난 다음에 작업이 처리됨(선행됨), 헷갈릴 염려가 없다~

		// 값 앞에 연산자가 붙음
		// 먼저 연산을 한 이후에 작업이 처리됨
		// 값을 빼오기 전에 연산 수행
		
		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 11
		
		int num = 20;
		int result = ++num * 3; // 전위연산하면 num을 1 증가시킨 것에 곱하기 3을 연산하고 대입함
		// 전위연산을 하느냐(앞에 붙이냐) 후위연산을 하느냐(뒤에 붙이냐)에 따라서 변수에 대입되어 있는 값(최종적인 값)이 달라짐
		
		System.out.println(num); // 21
		System.out.println(result); // 63
		
	}
	
}
