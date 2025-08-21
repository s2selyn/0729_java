package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * (단일) if문
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식) {
	 * 
	 * 		조건식이 true일 경우 실행하고자 하는 코드;
	 * 
	 * }
	 * 만약에(if)는 시작하는 역할이고 실질적으로는 뒤에 붙는 다음 내용(조건식)이 중요함
	 * 있을수도 있고 없을수도 있지만 if문의 블럭이 영역을 차지함
	 * if 블럭의 안에는 조건식이 true일 경우 실행하고자 하는 코드를 작성함
	 * 
	 * => 조건식의 결과가 true일 경우 : if문 Scope({})안의 코드가 수행
	 * => 조건식의 결과가 false일 경우 if문 Scope({})를 건너뜀!
	 * 
	 */
	
	public void method1() {
	
		// 중간점검
		// System.out.println("모범시민맞다~");
		// 이거 하려면 메인 메서드에서 호출해야함, 이 프로젝트에서 아직 안만들었으니까 만들러 다녀오시게
		// 중간점검 해봤으면 주석처리
		
		// ~~문 하면 ~~가 주인공, if문은 if가 주인공, if로 시작하고 소괄호()
		if(0 < 1) {
			
			System.out.println("0이 1보다 작아용"); // 출력 되는지 확인해보기
			
		} // if문(만약에)을 만나면 무조건!!! () <- 여기를 봄
		// 만약에 (0 < 1) 이니? -> 참(true)이다! {} 안으로 이동!
		// 들어가니 출력문이 있음, 출력함x
		// }에 도달하면 끝!
		
		// if문부터 코드로 흐름제어를 할 수 있는 부분
		// if문을 처음 접하면 조건식 부분을 부담스러워 할 수도 있지만
		// if문의 조건식자리에는 결론적으로 true 아니면 false값이 들어가도록 만들어야함!
		// 괄호안은 값이 들어가는 자리! true나 false값을 만들기 위해서 무슨 연산을 해야 할 지 생각하기
		if(false) {
			
			// 참이었어야 여기로 들어옴
			System.out.println("얘는 죽었다 깨나도 안나옴");
			
		} // 거짓이므로 여기로 옴
		
		if(true) {
			
			// 참이므로 여기로 들어옴
			System.out.println("조건식 자리에는 최종적으로 true가 와야함");
			
		} // 수행하고 나옴
		
	}
	
	// 변수, 연산자, if문으로 80%정도의 프로그램을 구현할 수 있다
	
	// 웹을 사용할때의 if문 예시 : 네이버의 로그인파트
	// 전부 문자열
	// 여기까진 로그인하기 전의 이야기...
	// 로그인을 하려고 로그인을 하고 나면
	// 로그인된 사용자의 정보, 로그아웃, 메일, 카페 등 화면에 출력된 값이 바뀌었음
	// 로그인 상태에 따라서 화면에 나오는 출력물이 바뀜
	public void method2() {
		
		boolean loginCheck = false; // 로그인 상태를 저장해둔 변수
		
		if(!loginCheck) { // 조건식을 loginCheck == false로 쓸 수도 있지만 !가 편하겠죠
			
			// 만약에 loginCheck가 false와 일치하다면?(loginCheck == false)
			System.out.println("네이버를 더 안전하고 편리하게 이용해보세요.");
			System.out.println("NAVER 로그인");
			System.out.println("아이디 찾기 | 비밀번호 찾기 | 회원가입");
			
		}
		
		if(loginCheck) {
			
			System.out.println("홍길동님 환영합니다 :)");
			System.out.println("메일 | 카페 | 블로그 | 쇼핑 | 예약");
			
		}
		
	} // 불러보고싶으니 실행 클래스의 메인 메서드로 다녀오세요
	
	public void lunchMenu() {
		
		// 오늘의 날씨를 입력받아서
		// 날씨를 입력받으려면 스캐너가 있어야 할 것 같다
		Scanner sc = new Scanner(System.in); // import는 졸업했음, Ctrl + Shift + o
		
		// 더움 / 맑음 / 비옴
		// 이거 세개만 입력받고 싶다
		System.out.print("오늘의 날씨는 어떤가요(더움 / 맑음 / 비옴) > ");
		
		// 변수선언 + 입력할 수 있는 환경
		String weather = sc.nextLine();
		// System.out.println(weather);
		// weather 변수가 잘 받아왔는지 확인하는 모범시민, 했으면 출력문 주석처리
		
		// 점심 메뉴를 추천해주는 프로그램
		// 비오면 멀리가기싫잖아요
		// 비옴을 입력했다면 김밥천국을 가라고하자
		// 우리가 해야 될 일이 뭐에요?
		// 비옴을 입력했다면 ==> 우리 식으로 바꾸자!
		// 사용자가 입력한 값과 "비옴"이라는 문자열값을 동등비교해서 일치하는지 비교
		// 사용자가 입력한 값은 어딨어요? 뭔지는 모르지만 weather 변수에 대입해뒀음
		// weather 동등비교 "비옴"
		// System.out.println(weather == "비옴"); // 이렇게 하면 비옴을 입력해도 false로 나옴
		// 동등비교 연산자로 비교 가능한 자료형은 기본 자료형 8개뿐, 문자열은 동등비교 연산자로 비교할 수 없음
		// 정확한 이유는 2주 후에 뵙겠습니다.
		// 문자열값 비교
		// 동등비교연산자(==)를 사용할 수 없음
		// 그 대신 문자열 값이 일치하는지 비교해주는 메서드를 호출해줘야함
		// .equals()를 호출해야함
		// weather에서 .equals()를 호출하고 괄호안에 비교할 문자열 입력
		// System.out.println(weather.equals("비옴"));
		// equals 메서드는 같으면 true, 같지 않으면 false를 반환해주는 메서드이므로 if문에 조건식으로 사용할 수 있음
		
		// 조건
		// 만약에  사용자가 입력한 문자열  이 "비옴"과  일치하다면 => 조건
		// if	 weather			  "비옴"	   .equals()
		// 사용자가 입력한 문자열은 weather라는 변수에 저장해뒀음
		// "비옴"은 "비옴"이라는 리터럴
		// 김밥천국을 추천해줍시다
		if(weather.equals("비옴")) {
			
			System.out.println("김밥천국에서 스페셜정식드세요~");
			// 의도대로 동작하는지 실행해보기
			
		} // if를 만나면 무조건 조건검사!
		// weather는 지금 입력받은 값
		// equals가 호출되었으므로 비교함
		// "비옴"과 비교함
		// 비교해서 다른 값이면 false, 스코프 밖으로 이동
		// 비교해서 "비옴"이랑 같은 값이면 true, 스코프 안으로 이동, 출력문 수행
		
		// 만약에 사용자가 입력한 문자열이 "더움"과 일치하다면 => 조건
		// if	weather				"더움"	.equals()
		if(/*조건식 자리*/weather.equals("더움")) {
			// 조건식은 항상 연산이다
			// 직접 만드는 연산인 경우 다 비교연산
			// 비교 대상은 사용자가 입력한 문자열과 "더움"이라는 문자열
			// 문자열은 동등비교를 사용할 수 없으므로 equals()를 사용함
			
			System.out.println("김밥일번가에서 냉모밀 드세요~");
			// 의도대로 동작하는지 실행해보기
			
		}
		
		// 만약에 사용자가 입력한 문자열이 "맑음"과 일치하다면 => 조건
		if(weather.equals("맑음")) {
			
			System.out.println("서브웨이가서 아무거나 드세요~");
			// 의도대로 동작하는지 실행해보기
			
		}
		
	} // 다 해봤으니 메인 메서드에서 주석처리
	
	public void method3() {
		
		// 사용자에게 정수값을 입력받아서 홀 / 짝을 판별 => 출력(이전에 삼항연산자 써서 해봤음)
		// if문을 이용해서 출력!
		// 단, 입력받은 정수가 0보다 클경우에만 조건문을 실행!
		
		// 사용자에게 정수값을 입력받으려면 스캐너가 있어야함
		Scanner sc = new Scanner(System.in); // 계속 똑같은 방법으로 사용하고 있음
		
		// 서비스 메세지 출력
		System.out.print("0보다 큰 정수주세요 > ");
		
		// 정수 받아야지~ 하면 우리가 하는거
		int number = sc.nextInt();
		// 스캐너부터 여기까지는 사용자에게 정수값을 입력받으려면 계속 똑같이 쓰고 있음, 다른 것은 변수이름정도
		
		
		// 모범시민 해봐야지요
		// System.out.println(number);
		// 해봤으면 주석 처리
		
		// 단, 입력받은 정수가 0보다 클경우에만 => 이것을 다르게 표현하면? 추상화하면?
		// 조건이라고 이름붙일 수 있음
		// 이거 조건이다! 조건인데? 그럼 if 쓰고 ()안에 어떻게 만들 지 생각하기
		// if
		// 조건식
		//
		// 조건식은 뭘 가지고 만드나요? 비교연산을 해서 만든다, 비교연산을 하려면 값과 비교연산자가 있어야함
		// if(요거 어떻게 만들지?) {  }
		// 비교연산
		// 1. 입력받은 정수가 0보다 클경우에만
		// 입력받은 정수는 스캐너로 입력받은 int형 정수로 number에 대입되어 있음
		// 	number > 0
		//
		// 중간다리, 1이 true이고 2가 true일때를 구현하고 싶으니까 && 필요
		//
		// 2. 홀/짝
		// 입력받은 정수를 2로 나눈 나머지를 0과 동등비교해서
		// 		number % 2			 0		==
		// number % 2 == 0 짝수(true 일 때)
		// !number % 2 == 0 홀수(true 일 때)
		// 출력하고 싶은 내용이 다르니까 if문이 두개 필요함
		
		if(number % 2 == 0 && number > 0) { System.out.println("짝수"); }
		// 이렇게 쓸 수도 있음
		if(number % 2 != 0 && number > 0) System.out.println("홀수");
		// 스코프를 처음 얘기한 것은 FirstClass에 있음
		// Scope(블록) {  } 은 중괄호로 묶은 부분을 이야기하며, 복합문을 구성하는 요소이다!
		// 즉, 종속된 문장이 다수 개일 때 '{' 로 시작하고 '}' 로 닫습니다.
		// if가 가져야할 문장이 다수가 아니라면(복합문이 아니라면) 묶을 필요가 없음, 그런 경우에는 안 쓸 수도 있지만 권장사항은 아님
		// 일단 얘네는 개선할 부분이 있음
		
		// 의도하는 대로 동작하는지 확인
		
		// -10을 입력한 경우에 위와 같은 코드에서 연산은 세번함
		// 1. 첫번째 if문 조건식의 number % 2 == 0
		// 2. 첫번째 if문 조건식의 number > 0
		// 3. 두번째 if문 조건식의 number % 2 != 0
		
		if(number > 0 && number % 2 == 0) { System.out.println("짝수"); }
		if(number > 0 && number % 2 != 0 ) System.out.println("홀수");
		// (num > 0)을 앞으로 빼서 작성한 코드에 -10을 입력한 경우에는 연산을 두번 하고 끝남
		// 1. 첫번째 if문 조건식의 (num > 0)
		// 2. 두번째 if문 조건식의 (num > 0)
		
		boolean flag = number > 0;
		
		if(flag && number % 2 == 0) { System.out.println("짝수"); }
		if(flag && number % 2 != 0) System.out.println("홀수");
		// if문에서는 연산이 일어나지 않음
		
		// 첫번째는 기능의 구현, 돌아가는것이 최우선, 의도한대로 동작이 되어야 함
		// 그리고 나서 수정할 수 있는 부분들을 고치는 것, 개선할 수 없을까? --> 유지보수
		
		// if문 중첩
		if(number > 0) {
			
			if(number % 2 == 0) System.out.println("짝수");
			if(number % 2 == 1) System.out.println("홀수");
			
		} // 이쪽이 낫겠네요, && 연산자 안 써도 되니까
				
		// 컴퓨터처럼 생각하는 연습, 코드를 읽는 연습, 타이핑 많이 해보기
		// 문법은 중요하지 않음, 외우면 되고, 못외우면 보고 쓰면 됨
		
	}
	
	// 원섬 후레이스...? 카페의 정체성을 잃어버림ㅋ
	public void method4() {
		
		// 1. 메뉴판 보여주기
		// 출력문 == System.out.println()
		System.out.println("술집술집 메뉴판");
		System.out.println("1. 맥주 (5000)");
		System.out.println("2. 소주 (3000)");
		System.out.print("메뉴를 선택해주세요 > ");
		// 잘 되는지 확인
		
		// 2. 메뉴번호로 메뉴 입력받기
		// Scanner사용해서 nextInt()
		Scanner sc = new Scanner(System.in); // Scanner는 값을 입력받을 때 사용하는 클래스
		int menuNo = sc.nextInt(); // 정수형 변수 담을수있는 공간 선언, 입력값 대입
		// System.out.println("선택한 메뉴 번호 : " + menuNo);	// 잘 되는지 확인
		// 확인했으면 주석처리
		
		// 3. 수량 입력받기
		// Scanner사용해서 nextInt()
		System.out.print("몇 잔 주문하실건가요 > "); // 출력
		int cup = sc.nextInt(); // 정수값 받기
		// System.out.println("입력한 잔 개수 : " + cup); // 잘 되는지 확인
		// 확인했으면 주석처리
		
		// 4. 조건문
		// if문을 이용해서 입력한 메뉴번호에 따라 메뉴명 대입하기
		// 혹시 없는 메뉴 번호를 입력했다면 없는 메뉴라고 대입하기
		// 만약에 사용자가 입력한 메뉴번호가 1번이라면
		// if	menuNo(사용자가 입력한 메뉴번호가 저장되어 있는 변수)	1(비교대상값)	비교하는 방법은 ==
		// if menuNo == 1
		
		String menuName = ""; // 문자열을 담을 변수 선언
		if(menuNo == 1) menuName = "맥주"; // 사용자가 입력한 값을 비교해서 메뉴명을 출력하고 싶으므로 대입
		// 이 행에 도달하면 if를 만났으니, 만약에 로 시작해서 소괄호 안으로 무조건 들어감
		// 변수 공간의 리터럴 값과 정수형 리터럴 1을 동등비교(일치하다면)
		// 변수에 맥주라는 스트링 리터럴을 대입
		
		if(menuNo == 2) menuName = "소주";
		// 만약에~ 그리고나서 무조건 소괄호
		// 1이면 수행못함
		if(!(menuNo == 1) && !(menuNo == 2)) menuName = "없는메뉴";
		
		// 5. XXXX메뉴를 XXX잔 주문하셨습니다. 출력해주기 print()
		System.out.println("========== 주문내역 ===========");
		System.out.println();
		System.out.println(menuName + "를 " + cup + "잔 주문하셨습니다.");
		// 확인해보기
		System.out.println();
		System.out.println("=============================");
		
		// 6. 진짜 주문할건지 물어보기
		// Y / N 입력받아서 확인하기
		System.out.print("\n위 주문내역으로 주문하시겠습니까 (Y / N) > ");
		sc.nextLine(); // nextInt다음에 nextLine만날때는 입력버퍼 비워주기
		char answer = sc.nextLine().charAt(0);
		// nextLine 메서드로는 한글자만 가져올 수 없으므로 charAt 메서드 사용
		// System.out.println(answer); // 확인해보고 확인했으면 주석처리
		
		// 7. 6번에서 입력받은 단일 문자가 'Y'또는 'y'와 일치하다면
		// 메뉴명과 수량과 가격 출력하기 if문 + 중첩 if문 + 출력문
		if(answer == 'Y' || answer == 'y') {
			int price = 0;
			if(menuNo == 1) price = 5000;
			if(menuNo == 2) price = 3000;
			System.out.println("총 결제 금액은 " + (price * cup) + "원 입니다.");
		}
		
	} // 미리 메인 메서드에서 호출해뒀음
	// 지금은 메뉴가 두개밖에 없음
	// 인간의 시선으로 봤을때는 메뉴를 1을 선택했다면, 2를 선택했을 경우는 필요가 없음, 비교를 두번 수행할 필요가 없음
	// 컴퓨터는 그게 안됨
	// 인간의 입장에서 답답하니까 새로운 문법을 배워보자
	
	public void myKiosk() {
		
		String firstMenuName = "소화가 잘 될 것만 같은 우유";
		String secondMenuName = "꾸덕꾸덕 달콤 요거트";
		
		int firstMenuPrice = 3000;
		int secondMenuPrice = 5000;
		
		System.out.println("=========== 마이 키오스크 메뉴판 ===========");
		System.out.printf("1. %s, %d원\n", firstMenuName, firstMenuPrice);
		System.out.printf("2. %s, %d원\n", secondMenuName, secondMenuPrice);
		System.out.println("=======================================");
		
		System.out.print("메뉴를 선택해주세요 > ");
		Scanner sc = new Scanner(System.in);
		int selectedMenuNo = sc.nextInt();
		
		System.out.print("주문하실 수량을 입력해주세요 > ");
		int selectedMenuCount = sc.nextInt();
		
		String selectedMenuName = "";
		if(selectedMenuNo == 1) {
			selectedMenuName = firstMenuName;
		}
		
		if(selectedMenuNo == 2) {
			selectedMenuName = secondMenuName;
		}
		
		if(!(selectedMenuNo == 1) && !(selectedMenuNo == 2)) {
			selectedMenuName = "없는 메뉴";
		}
		
		System.out.println(selectedMenuName + "를 " + selectedMenuCount + "개 선택하셨습니다.");
		System.out.println("=======================================");
		
		System.out.print("\n위 주문내역으로 주문하시겠습니까 (Y / N) > ");
		sc.nextLine();
		char answer = sc.nextLine().charAt(0);
		
		if(answer == 'Y' || answer == 'y') {
			
			int price = 0;
			if(selectedMenuNo == 1) price = firstMenuPrice;
			if(selectedMenuNo == 2) price = secondMenuPrice;
			System.out.println(selectedMenuName + " " + selectedMenuCount + "개, ");
			System.out.println("결제하실 금액은 " + (price * selectedMenuCount) + "원 입니다.");
			
		}
		
		if(!(answer == 'Y') && !(answer == 'y')) {
			System.out.println("주문을 취소합니다.");
		}
	
	}
	
}
