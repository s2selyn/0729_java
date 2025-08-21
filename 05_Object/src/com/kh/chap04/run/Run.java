package com.kh.chap04.run;

import java.util.Scanner;

import com.kh.chap04.controller.FieldController;
import com.kh.chap04.controller.StaticController;

public class Run {

	public static void main(String[] args) {
		
		System.out.println(StaticController.str); // 잘 실행됨
		// static이 붙으면(변수든 메소드든) 프로그램이 시작될 때부터 사용가능, 처음부터 메모리의 static이 올라감
		// 따로 객체를 생성하거나 할 필요없이 바로 참조 가능
		// 어느 클래스의 스태틱 필드를 호출하는지는 써져있어야함(동일한 이름의 static이 같은 패키지의 다른 클래스에 존재 할수도 있음)
		// 프로그램이 종료될때까지 스태틱영역에서 계속 살아있음, 아까 메인 설명한거랑 똑같음
		// 변수든 메소드든 static이 붙어있다 --> static에 올라서 프로그램 시작부터 끝까지 살아남음(객체생성 안함)
		
		// FieldController 용도는 자료형, 클래스 --> 타입으로 쓰기 위해서 쓰는 것
		// fc가 저장공간
		// 대입연산자
		// new FieldController(); <-- 객체 생성
		FieldController fc = new FieldController();
		// 1. FieldController 자료형으로 fc라는 이름의 지역변수를 선언
		// 2. (대입연산자 기준 오른쪽) 객체 생성 (new키워드를 만났을 때) global 멤버변수(공간) 할당
		/*
		 * 2번 시점이 중요
		 * 2번을 하면 heap 영역에 객체의 공간이 올라가면서 global 공간도 같이 생성, 주소도 가지게 됨
		 * heap에 생겼으므로 안에 0이 들어있음
		 * 
		 */
		
		// 3. (FieldController 타입의) 주소값을 대입
		/*
		 * 2번 시점에서 이미 global은 생성되어 있음 --> 사용 가능! --> heap에 생겼으니까 0이 들어있음
		 * 
		 */
		System.out.println(fc.global); // 0이 출력됨
		
		// FC에 만들어둔 메소드 호출하기 --> 일단 주소를 찾아서 가야함 --> 주소값이 들어있는 변수를 참조 --> fc.
		// fc.checkVariable(); <-- 이렇게 불렀는데 안불러짐
		// fc에는 저렇게 생긴 메소드가 없음
		// 우리가 선언한 메소드는 매개변수가 있음(int parameter)! 다르게 생김, 색으로 구분 가능
		// 메소드 스코프 안에서 선언된 것은 지역변수이고 색은 황토색, 필드(클래스가 가지고 있음)는 파란색
		// 출력문 할 때 보면 out이 파란색임 --> 얘는 정체가 뭐임? System.으로 클래스에 직접 접근했음 --> public이어야 직접 접근할 수 있음 --> ?
		// parameter는 지역변수인데 초기화 안해도 빨간줄 없음 --> FC에서 만든 메소드의 매개변수 자리에 타입과 매개변수를 넣어뒀음, 강제성이 생김(반드시 이 자료형의 인자값을 전달해야 메소드를 호출할 수 있음) --> checkVariable() 호출하려면 무조건 정수값을 전달해야함
		// 그러니까 부르고싶으면 안에 아무거나 넣으면 됨 --> 50 입력
		fc.checkVariable(50); // --> 이러면 빨간줄 없어짐
		// 메소드를 호출하면 어떻게 되나요? 기본적으로 메소드가 stack 영역(메인 메소드는 여기아님, 예약어가 static이 붙은 메소드는 경우가 달라짐)
		// 기본적으로 메소드를 호출하기 위한 선행작업(전제조건)은? --> 반드시 객체가 메모리에 올라가 있어야 함 --> new로 생성하고, 그래야 점찍어서 부를 수 있음
		// 메인을 호출하기 위해서 Run 객체를 생성안했는데 어떻게 부를 수 있었나? 메인은 혼자 다른 영역(static)에 올라감
		
		// 메모리 영역을 3개로 나누었다! (static-stack-heap)
		// checkVariable()은 stack영역에 올라감 --> 올라가면서 메소드 호출하면서 넣은 인자값으로 매개변수가 초기화됨
		// 스코프 안에서 정수형 변수를 선언하고 초기화하고 있음 --> static 안에 생성된 자기자신의 영역 안의 parameter 영역 위에 local영역을 만들고 1을 대입함
		// global은 0, parameter는 50, local은 1로 출력됨
		// 정리하면 checkVariable호출 == parameter(매개변수) 할당 및 초기화
		
		// checkVariable()이 메모리에 올라가면서, 메소드 안에 있는 지역변수의 할당 및 초기화, 얘가 나중에 일어났으니까 매개변수 위에쌓임(밑에서 위로 올라가니까)
		// 그리고 메소드가 끝남, checkVariable 호출 종료시 (stack 메모리에 올라가있던것들이 사라짐)
		// parameter, local 지역변수 소멸
		// 지역변수는 호출됐을때, 메모리에 올라가있을때만 사용할수있음
		
		// global은 살아있음! 여전히 출력문이 동작함
		System.out.println(fc.global);
		
		// global도 죽여야겠다면? --> 나를 가리키는 것이 없으면 됨 --> fc가 지금 가리키고 있으니까 유지되고 있음
		// fc = new FieldController(); 이렇게 하는 방법도 있음, 기존 주소말고 새로운 주소가 들어올것임 --> 근데 global은 존재하고있음
		fc = null; // 널값을 대입하면 됨, 주소가 없다는 뜻, 글로벌이 들어있는 공간을 가리키고 있었는데 안가리키게됨
		// 이시점부터 global 사용 불가능, 아래의 출력문 수행 안됨
		// System.out.println(fc.global);
		
		// 변수가 필드냐 변수냐, 지역변수냐에 따라서 쓸 수 있는 범위가 다름
		
		// 목표 : str 출력하기(접근제한자는 public임)
		/*
		// 출력하려면? 불러야함 --> 호출하려면? 객체가 있어야하므로 생성
		StaticController staticController = new StaticController();
		
		// 출력하려면 출력문 써야함
		System.out.println(sc.str); // public이니까 직접 참조해서 필드명 부르기 가능 --> 동작은 하는데 노란줄 생김
		 */ // Static 필드는 이렇게 호출 안함
		
		System.out.println(StaticController.str); // 직접 접근해서 바로 불러버림
		// 메인메소드 스코프 안의 맨 위로 올라감
		
		// 객체생성 안하고 직접접근가능
		System.out.println(StaticController.JAVA_VERSION); // 바로 보이니까 상수필드라고 인식할수있음
		// 스태틱 붙으면 스태틱에 올라감 --> 객체생성 없이 쓸 수 있음, 메모리 영역이 다르니까
		// 이런거 써봄
		// System.out.println(Arrays.toString(new int[2])); // Arrays는 대문자니까 클래스, 메소드를 직접 호출함, 객체생성을 안했음, toString 메소드가 누워있음 --> static이라는 뜻
		// out 왜 static final인데 소문자임? 시대상을 생각~ 1994년도에 만들어짐^^!
		// System.out.println(Math.random()); // 결과값이 double형의 0.0 ~ 0.99999~로 돌아옴
		// 메소드 호출하는데 객체생성 안하고도 가능했음, random 누워있네? --> static 특! 이렇게 불렀다는 것 자체가 static에 올라갔다는 뜻
		// double형이 돌아왔다는 것은? 메소드의 반환타입이 double이라는 뜻, double 타입이므로 랜덤을 double 변수에 담을 수 있음
		System.out.println(Math.PI); // 파이는 고정값, 자바가 실수를 표현하는 최대범위까지 표현했겠지
		// Math 클래스에는 잘 만든 상수필드 PI가있음 
		// 파이를 객체생성 없이 어디서든 사용할수있음 --> 이탤릭이고 볼드다 객체생성 안했다 --> static final이겠다
		// 밖에서 바로 부를수있음 -> 접근제한자 public
		// 파란색이다 --> 필드 , 두껍다 --> final, 누워있다 -- static
		
		// 입력받으려고 스캐너를 쓴단말이야
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // nextInt()는 변수에 담을때 int에 담고
		String str = sc.nextLine(); // nextLine()은 변수에 담을때 String에 담음
		// 메소드의 반환값으로 정해진 타입이 정수형 / 스트링이라서
		// 바깥에서 불렀네? 스캐너 클래스 외부에서 불렀네? 접근제한자가 public이겠다, int형으로 값을 돌려주네 --> 반환타입은 int겠다, 메소드이름은 nextInt겠다, 하면서 인자는 따로 전달 안하네? --> 매개변수는 없겠거니
		// 이렇게 유추 가능
		
		/*
		 * AccessModifier(접근제어자 / 접근제한자)
		 * 
		 * 4가지 종류가 있음, 아마 public, private 두가지만 쓸것같지만 알고는 있자, 위에서부터 넓고 아래로 갈수록 좁은걸로봄
		 * (+)public => 접근을 누구나 어디서든(같은 패키지, 다른 패키지, 클래스 내/외부 포함 전부) 접근 가능
		 * 
		 * (#)protected => 같은 패키지라면 무조건 접근 가능!
		 * 			 => 다른 패키지라면 상속구조인 클래스에서만 접근 가능
		 * 			 => 상속이라는 개념은 05_Object / 06_ObjectArray 끝나고 07번에서 배울 것
		 * 
		 * (~)default(우리나라에서는 보통 default, 영어권 국가에서는 package friendly라는 표현을 선호함) => 오로지 같은 패키지에서만 접근 가능
		 * package라고도 하고 friendly라고도 하고..
		 * 
		 * (-)private => 오직 클래스 내부에서만 접근 가능(밖으로 벗어나면 못들어오는곳)
		 * 
		 * 클래스 만들 때 Modifier 고를 수 있게 되어있는거 봤음
		 * 필드나 메소드에는 private protected 붙일수있지만 클래스에는 안됨
		 * 
		 */
		
	}
	
	// protected int num;
	// 아무것도 안붙이고 int num; 하면 default로 인식
	// 자바에서의 default 키워드는 다른 목적으로 쓰임(인터페이스에서 이야기할것임)
	
	// 클래스 다이어그램(개발자들끼리 말로 하면 오해가 생길 수 있으니까)
	// 클래스 안에 필드, 메소드 선언 등 만들어내고싶은 결과물이 있다 --> 그림을 그림
	// 영역을 나눠서 그림 --> 위에서부터 첫칸은 클래스명(예 ) Puppy)
	// 두번째칸은 필드, 접근제한자는 private의 경우에 마이너스로 표현, 필드명을 쓰고, 자료형은 콜론하고 뒤에붙임
	// 예 ) - name : String, - age : int
	// 세번째칸은 메소드, 접근제한자 public의 경우에 +로 표현, 메소드명을 쓰고, 괄호안에 매개변수 타입을 씀, 세미콜론하고 반환타입을 써줌
	// 예 ) + setName(String) : void, + getName() : String, + information() : String
	// 중요한건 클래스다이어그램에서 접근제한자를 표현하는 방식, private의 경우에 마이너스로, public의 경우에 +로
	// 내일부터는 다이어그램보고 클래스만들기가 숙제가 될 것 같다!
	
}
