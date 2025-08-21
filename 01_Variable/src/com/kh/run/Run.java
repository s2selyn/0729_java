package com.kh.run;

// import com.kh.variable.B_KeyboardInput;
import com.kh.variable.Casting; // 1절. import 하고 싶은 클래스의 풀클래스명을 적어줌

	// 아래에서 사용하고자 하는 클래스의 풀클래스명을 작성
	// 풀클래스명으로 생성하는 것과, import를 사용하는 것 중에서... 후자가 나은 이유
	// 실수의 확률이 줄어듦, 작업량이 줄어들고 고치는 시간이 절약되어 효율과 생산성을 확보할 수 있음(인건비)
	// 개발자들은 중복코드를 없애고 싶어 함, 중복코드는 실수할 확률을 높이고 유지보수를 힘들게 함

// import com.kh.variable.A_Variable;

	// import를 사용하여 수정

public class Run {

	public static void main(String[] args) {

		// A_Variable이라는 Class에 있는 fineSeasonMenu 메서드를 호출하고 싶다.
		// 호출하고 싶은 메서드가 클래스의 외부에 있음
		// 클래스를 기준으로 스코프 안쪽은 내부, 바깥쪽은 외부(자바에서 중요한 개념)
		// 외부 클래스에 존재하는 메소드를 호출하고 싶다. 먼저 클래스를 별칭을 지어주고 생성해야 한다.
		
		// 클래스이름 클래스별칭 = new 클래스이름();
		
		// 패키지가 다르다면 같은 이름의 클래스가 존재할 수 있음
		// 같은 패키지에 있는 다른 클래스
		// 다른 패키지에 있는 다른 클래스(패키지 선언부가 다름)
		
		// com.kh.variable.A_Variable a = new com.kh.variable.A_Variable();
		// 그냥 A_Variable a = new A_Variable(); 은 뭔가 문제가 있음, 이 패키지 안에서 못찾았다는 뜻
		// 클래스이름 앞에 패키지 경로를 적어줘야함
		// 패키지이름부터 클래스이름까지를 풀클래스명이라고함, 명확히 이 클래스를 구분할 수 있는 식별자
		// com.kh.variable 패키지에 도달하기 위해서는 a와 참조연산자를 사용해야 함
		
		// import를 사용하여 수정 후에는 아래와 같이 작성할 수 있음
		// A_Variable a = new A_Variable(); 
		
		// a.findSeasonMenu();
		
		// a.declareVariable(); // 코드는 항상 위에서 아래로 한줄씩 먼저, 왼쪽에서 오른쪽으로
		// 외부 클래스에 존재하는 메서드를 부르려고 하는 것이므로 일단 그 메서드가 존재하는 클래스를 생성해야 함
		// new로 클래스를 생성하여 a라는 이름으로 부른다고 정의했음
		
		// a를 불러서 .을 통해 메서드로 접근하고 그 메서드의 스코프부터 읽기 시작함
		
		// 메인 메서드에서 호출하고 싶은 메서드가 Run 클래스 내부에 있는 것이 아니라 Run 클래스 외부에 있는 상황
		// 클래스를 기준으로 클래스 스코프 안쪽은 내부, 바깥쪽은 외부(자바에서 중요한 개념)
		
		// inputTest();를 호출하려면 선행되어야 하는 작업은?
		// 클래스를 별칭 지어주고 생성을 해야 호출할 수 있음
		// com.kh.variable.B_KeyboardInput b = new com.kh.variable.B_KeyboardInput(); 라고 하는 게 정석이지만 번거로움
		// 패키지 경로와 클래스명을 가지고 위로 올라가면 됨, 패키지 선언부와 클래스 선언부 사이로 가서 import 작성하자!
		
		// B_KeyboardInput b = new B_KeyboardInput(); // 풀클래스명이 아닌 클래스명만 사용 가능 
		// b.inputTest();
		
		Casting c = new Casting(); // 2절. 별칭 짓고 생성
		// c.autoCasting(); // 메서드 호출
		
		c.forceCasting();
		
	}
	
}
