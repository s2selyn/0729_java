package com.kh.variable;

public class Casting {
	
	/*
	 * Type Casting(자료형변환) : 자료형을 바꾸는 개념
	 * 
	 * ☆★☆★☆★☆★☆★☆★☆★ 매우 중요 ☆★☆★☆★☆★☆★☆★☆★
	 * 
	 * 여러 분들이 과정 끝날때까지 까먹으면 큰일나는!!!(세가지)
	 * 자바에서 값을 처리하는 규칙
	 * 
	 * 1. =(대입 연산자)를 기준으로 왼쪽 / 오른쪽이 같은 자료형이어야 한다.
	 * => 같은 자료형에 해당하는(경우에만) 리터럴값만 대입할 수 있음
	 * => 자료형이 다를 경우? == 값을 바꿔서 대입해야 함.(대입하고 싶으면, 좌항의 자료형을 바꾸거나, 우항의 자료형을 바꾸거나, 둘 다 바꾸거나)
	 * (특히 자바에서 매우 중요, 선생님 기준 제일 중요한 한 줄, 다형성을 이해하는 데 필요)
	 * 
	 * 2. 같은 자료형들끼리만 연산이 가능함
	 * => 자료형이 다른데 연산이 하고싶다?? 둘 중에 하나를 "형변환"해서 나머지 하나와 동일하게 맞춤(보통)
	 * (연산하고 싶으면, 좌항의 자료형을 바꾸거나, 우항의 자료형을 바꾸거나, 둘 다 바꾸거나)
	 * 
	 * 3. 연산의 결과물도 동일한 자료형이어야 한다.
	 * => 1 + 1 = 2(정수 + 정수 = 정수), 1.1 + 1.1 = 2.2(실수 + 실수 = 실수)
	 * 
	 * [ 표현법 ] (바꾸고싶은자료형)값 <-- 이러면 형변환 끝
	 * 형변환연산자 / cast연산자
	 * 
	 * 형변환의 종류
	 * 
	 * 1. 자동형변환(Promotion) : 자동으로 형변환이 진행됨
	 * 
	 * 		작은 크기의 자료형 -> 큰 크기의 자료형
	 * 		직접 형변환을 할 필요가 없음
	 * 		원래 값은 작은 공간을 차지하고 있었으므로 큰 크기의 자료형에 그냥 들어갈 수 있음 
	 * 
	 * 2. 강제형변환(Type Casting) : 자동형변환이 이루어지지 않는 경우 진행
	 * 
	 * 		원래 값이 큰 공간을 차지하고 있었다면 작은 크기의 자료형에 그냥 들어갈 수 없음
	 * 		직접 형변환을 해야 할 때 => () 을 통해서 진행
	 * 
	 */
	
	/*
	 * 1 Byte = 8 bit
	 * 1 bit는 하나의 공간, 0 또는 1을 저장할 수 있음
	 * 1 Byte는 8개의 공간을 가지고 있음, 00000000 부터 11111111 까지(0 ~ 255, 256가지)
	 * boolean : 1Byte
	 * char    : 2Byte
	 * byte    : 1Byte
	 * short   : 2Byte
	 * int     : 4Byte
	 * long    : 8Byte
	 * float   : 4Byte
	 * double  : 8Byte
	 * 
	 */
	
	// 자동형변환(Promotion) : 작은 자료형 -> 큰 자료형
	public void autoCasting() {
		
		// System.out.println("이 내요을 콘솔창에 출력해보세요 실습 시작!");
		
		// 1. int(정수, 4Byte) => double(실수, 8Byte)
		
		// 변수 선언!과 동시에 초기화
		int intNum = 10; // 자료형 변수이름 = 초기값;, 10이라는 리터럴 값을 입력함
		System.out.println(intNum); 
		
		double doubleNum = intNum; // double 타입의 doubleNum에 intNum을 대입
		// 원래는 말이 안되는 일이, 일어나서는 안되는 일이 일어남
		// 좌항과 우항의 자료형이 다른 상태
		// 8바이트 = 4바이트이므로 들어가는데에는 문제가 없음
		// double doubleNum = (double)intNum; 으로 JVM에 의해 수행되었음
		// 대입은 우항이 double형으로 바뀌어야 일어남
		// 왼쪽은 공간, 오른쪽은 값, 변수는 공간
		// 이 식에서 우항의 intNum은 intNum 공간에 있는 값을 의미함
		// int 형으로 선언된 변수이므로 10.0 자체가 들어갈 수 있는 형태가 아님
		// 보편적으로는 이 경우에 (double)을 붙이지는 않음
		
		System.out.println(doubleNum); // 잘 대입되었는지 출력
		System.out.println(intNum); // 10으로 출력됨, 변수에 대한 이야기
		
		// 3. int(정수, 4Byte) -> long(8Byte, 정수)
		int bigInteger = 120;
		long smallLong = /*(long)*/bigInteger;
		// 원래는 일어날 수 없는 일
		// 다른 자료형인데 대입될 수 없음!
		// 반드시 형변환이 일어나야 함
		// long smallLong = (long)bigInteger;이어야 하지만 (long) 생략가능
		
		System.out.println(smallLong);
		
		// 3. long(정수, 8Byte) -> float(실수, 4Byte) ** 특이케이스
		
		long longNumber = 1000L;
		// int num = longNumber; // 빨간줄생김, 안해줌, 8Byte를 4Byte로 변환할 수 없음(정상)
		float floatNumber = longNumber; // 똑같이 8Byte를 4Byte로 변환하는데 빨간줄안생김
			// promotion XXXXX
			// type casting / type conversion OOO
			// Promotion이 아닌데 왜 해줌?
		System.out.println(floatNumber); // 출력이 됨, longNumber 값(1000L)이 실수형 타입으로 변환이 됐다는 뜻
		// 엄밀히 말하면 Promotion이 일어난 것이 아님
		// 정수가 실수로 변환될 때 큰사이즈의 정수타입이 작은 사이즈 실수타입으로 형변환
		// 4Byte float형이 long형보다 표현할 수 있는 값의 범위가 더 넓기 때문
		// 일반적으로는 long을 실수 타입으로 바꿀 때에는 double로 형변환
		
		// 정수는 1, 2, 3
		// 1, 2, 3을 실수로 표현하려면 정수보다 훨씬 넓음 1.00000001, 1.00000002, 1.0000~~~
		// 8Byte에서 4Byte로 변환하는 것이라 너무 큰 정수를 변환하려고 할 때는 명확히 내가 원하는 값으로 변환이 안될수도 있음
		
		System.out.println("----------");
		
		// 4. char(2Byte, 문자) -> int(4Byte, 정수)
		// 2Byte : 0 ~ 65535(66536범위)
		// 거꾸로는 int가 66536범위를 넘어가면 문제가 생길 수 있음
		// 옛한글은 넘어간 범위에 지정되어있음 --> 글자 깨짐, 원하지 않는 값으로 바뀔 수 있음
		
		char ch = 'a';
		System.out.println(ch);
		int num = ch; // 문자를 정수를 넣을 공간에 대입
		System.out.println(num);
		char ch2 = 97;
		System.out.println(ch2);
		
		// 사람과 컴퓨터의 인식 차이(8, '8', "8"의 차이)
		// 컴퓨터는 지금 a랑 97을 똑같다고 생각하고 있음
		// 글자는 유니코드를 부여함, 전세계의 모든 문자들을 일관되게 표현하기 위한 국제표준문자, 고유번호(인코딩 셋에 따라서 달라지기도 함)
		// 아스키코드표(ASCII코드표)
		// 소문자 a를 정수의 형태(10진수)로 표현했을 때 97(영어 알파벳은 +-32로 대소문자 변경)
		
		// 자바에서 제일 중요한 것은 자료형(Data Type)
		
		// 퀴즈퀴즈
		System.out.println("퀴즈퀴즈시간~");
		System.out.println('a');       // a
		System.out.println((int)'a');  // 97, a라는 문자를 (int)로 씀
		System.out.println('a' + 3);   // 100
		// 자바에서 문자"열" 값과 다른 형태의 값을 붙여서 사용하고 싶은 경우
		// + 기호를 사용합니다.
		// 'a'는 문자열이 아니고 단일문자이고, 자료형이 다르므로 규칙 2, 3번을 생각해야 함, 두개의 자료형이 같아야 연산이 됨(char형과 int형은 연산이 안됨, 둘 중에 하나가 바뀌어야 함)
		// char형으로 int형과 연산을 하려고 하면 char형이 int로 바뀌어버림
		// int는 char형으로 바뀌면 66535가 넘을 경우 데이터 손실 가능성이 있음, char형이 int형으로 바뀜
		// 100은 정수로 나온 결과, 정수와 정수의 연산이 일어났다는 뜻, char형이 int형으로 바뀌었다는 것을 유추할 수 있음
		System.out.println('a' + '3'); // 148, '3'은 정수 51로 치환됨
		System.out.println((int)'3');  // 51, 문자 3을 정수형으로 변환하겠다
		System.out.println('a' + "3"); // a3
		
		// ----------
		
		System.out.println("----------");
		
		System.out.println('3'); // 3, 컴퓨터는 '3'을 00110011로 생각함
		System.out.println((char)3); // , 우리가 쓴 것은 3, ETX로 바뀌었음, 컴퓨터에서 기능을 하는 문자, 깨진 형태의 글자로 나온 것
		// 컴퓨터가 봤을 때 00000011
		System.out.println((char)'3' + (char)3); // 54, char라고 써도 + 하는 순간 정수가 됨, 51 + 3의 결과
		
		System.out.println("----------");
		
		System.out.println(3);
		System.out.println('3');
		System.out.println("3");
		// 여기에서 3, '3', "3" --> 우리가 생각하는 것과 컴퓨터가 생각하는 것은 자료형에 의해 완전히 다름 
		
		// 번외. byte 또는 short형간의 연산
		
		// -128 ~ 127 : byte의 범위, 0이 포함되어있음
		
		byte byteNum = (byte)128; // 128은 4Byte 정수, int 에서 byte로 자동으로는 바뀌지 않음
		System.out.println(byteNum);
		// 양수 128은 10000000
		// 부호비트가 있으므로 01111111이 가장 큰 양수(127)
		
		byte b2 = 126;
		byte b3 = 3;
		System.out.println((int)b2 + (int)b3); // 129, (int) 없으면 byte와 byte를 연산했으므로 byte로 나와야 함, 129는 byte로 나올 수 있는 값이 아님
		// 129는 byte가 아니라는 뜻
		// 결과값은 int형 => 연산장치가 값을처리하는 크기가 int형크기(4Byte)
		// 연산장치가 4Byte씩 끊어서 연산함
		
		// 비교연산자( == )
		// 좌항과 우항의 값을 비교해서 결과값을 반환(동등비교 or 대소비교)
		// 자바에서 = 는 왼쪽의 변수 공간에 오른쪽의 값을 대입하겠다는 뜻
		// 비교연산자는 동등비교(같다 or 같지 않다)
		// true / false로 결과가 나옴
		System.out.println("비교 연산자를 사용해보자~");
		System.out.println(1 == 2);          // 1과 2가 같나요? --> 아니오(false)
		System.out.println('a' == 'b');      // false
		System.out.println(2 == (int)'2');   // false, 2와 50임
		System.out.println((char)2 == '2');  // false, --> ???
		System.out.println((int)'2');        // 50
		System.out.println((int)'2' == '2'); // true, 이미 같은데 왜 하느냐고 노란줄
		// 값에 집중할 것, 다른 것에 현혹되지 말고!
		
	}
	
	// 강제 형 변환 : 큰 크기의 자료형 -> 작은 크기의 자료형
	public void forceCasting() {
		
		// 명시적 형변환이라고도 함
		// (바꿀 자료형)값
		
		// double(8Byte) -> int(4Byte)
		double doubleNum = 10.123123; // double 타입의 변수를 선언하고 double형 리터럴을 하나 대입, 이것을 int형 변수에 대입하고싶음
		int intNum = (int)doubleNum; // int intNum = doubleNum; 은 빨간줄, double이 int로 바뀌어야 대입을 할 수 있음, doubleNum의 자료형이 더 크기때문에 자료의 손실이 일어날 수 있음, 자동 형변환을 해주지 않음
		// 꼭 형변환을 해야겠다면 개발자의 판단 하에 (int)를 사용해서 정수 타입으로 강제로 변환, 대입 연산자의 오른쪽이 완료되어야 대입을 할 수 있으니까!
		
		System.out.println(intNum); // 10
		
		// (int)로 강제로 변환했더니 0.123123 요 부분이 절삭 -> 데이터의 손실
		
		double dNum = intNum; // 위의 intNum을 다시 double형으로 형변환
		System.out.println(dNum);
		// 이렇게 되돌려보려고 해도 데이터가 돌아오지 않음
		// 데이터가 손실되므로 개발자가 강제로 형변환을 하지 않는 이상 자동으로 해주지않음
		
	}

}
