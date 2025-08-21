package com.kh.controller;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.run.Run;

public class StringController {
	
	// String 클래스 => 불변(Immutable, 변하지 않음을 의미)
	// 오늘의 주인공, 배우는 것 중에 제일 중요한 내용, 진짜많이쓰고 진짜많이쓸것, 제일 많이 활용하게 될 자료형
	// 우리 웹개발인데 웹에서 제일 많이 쓰는 것 String
	// 웹에서 보이는것은 이미지아니면 문자열 두개뿐, 그이외에 없음 --> String이 제일 만만하지~ 쌍따옴표만 달면 다 문자열로 쓸 수 있어서 편하고 좋다
	// 누군가 우리에게 문자열의 특징이 뭐냐고 묻는다면? 불변!
	
	// String도 클래스이므로 사용법이 있는데 두개
	/*
	 * String 클래스 사용방법
	 * 
	 * 1. new 연산자를 사용해서 String클래스의 생성자를 호출하는 방법(해본적없음, 근데 회사에서 쓰면 등짝스매싱각)
	 * 2. 대입연산자를 이용해서 문자열 리터럴값을 대입하는 방법(우리는 매번 이거했음)
	 * 
	 * 오늘은 둘 다 해보자!
	 * 
	 */
	
	// 1번 방법! 생성자를 호출해서 문자열 객체를 생성하는 방법
	// 팀장님이 왜 나의 등짝을 때리게 될 지 이유를 알아보자^^!
	public void method1() {
		
		// 스트링 변수를 선언하고 스트링 생성자를 호출
		String str1 = new String("hello");
		String str2 = new String("hello"); // 똑같은걸 새로운 변수 선언해서 매개변수 생성자로 만들어봄
		Run run = new Run(); // Run도 객체생성 한번 해보자!
		// 이렇게는 완전 처음해봄...
		// 원래는 String str3 = "hello"; 이렇게했음
		
		// 여기부터 toString 이야기
		// 이렇게 해도 잘 만들어지나 확인해보자 --> 출력!
		System.out.println(str1.toString()); // 실행클래스에 가서 출력해보고옴 --> hello
		System.out.println(str2); // --> hello
		// 어떻게 이렇게 잘 나왔을까? 말이 되는 일이냐?
		System.out.println(run.toString()); // --> com.kh.run.Run@6a6824be
		// 이거해보면 알수있음! 이렇게 나오는게 정상임. 참조자료형 변수를 출력문안에 넣었다면 이렇게 나와야하잖아~
		// --> 주소 아님! Run 클래스의 부모클래스인 Object가 가지고있는 toString 메소드 호출의 반환값이 나온 것
		// 참조자료형 객체를 이 안에 넣으면 얘가 이렇게 나옴 --> com.kh.run.Run@6a6824be -->  Run 클래스에는 toString 이라는 메소드가 없으니 부모클래스인 Object에 가서 부모가 가지고 있는 toString 메소드를 호출해서 찍어준것!
		// run 처럼 나와야 정상인데, str1, str2는 hello가 나옴 --> 얘네가 이렇게 나온다는건 무슨 의미?
		// 생각하는 방법 머리속에 논리회로가? --> String 클래스는 똑같이 Object를 상속받겠지만 리터럴 값을 출력해줄수 있도록 toString 메소드를 오버라이딩 해놨구나!
		// 개발자니까 결과를 보고 아 이게 이렇게 되어있겠구나, 내가 생각한바로는 원래 이렇게 나와야할텐데, 얘는 이렇게 찍히네? 그럼 toString이 오버라이딩 되어있겠네? 이렇게 논리적인 접근!
		
		// toString
		// 1. String 클래스의 toString()의 경우
		// 실제 담겨있는 문자열 리터럴 value값을 반환하게끔 오버라이딩 되어있다
		// 여기까지 toString 이야기
		
		// Run 클래스를 객체 생성 했으니 run 클래스를 참조해보면 메소드가 많이 있음, 익숙한 친구들이 보임 toString, hashCode, equals 등.. Object꺼래
		Run run2 = new Run();
		
		System.out.println(run.equals(run2)); // run이랑 run2랑 같은지 비교해보자 --> false
		// equals 까보러감, 내거 주소랑 인자로 전달받은 친구의 주소값을 동등비교함 --> 결국 run이랑 run2는 다른 객체이므로 주소비교하니 다르다고 나옴
		
		// equals() 자주 썼음, 문자열가지고 동등비교 할 때
		System.out.println(str1.equals(str2)); // 얘는 같다고 나옴, 근데 String 만들때 각자 new로 만들었음, 주소는 다를것임, 근데 왜 true로 나와?
		// true ==> 같다
		// 방금 equals 까봤을때 이건 있을수 없는 일이잖아, 개발자마인드로 어떻게 접근할까? 원래 Object 클래스가 가진 equals 메소드는 주소값을 가지고 동등비교 연산을 하기 때문에 주소비교를 하지만
		// str1과 str2는 값이 같으면 똑같다고 나와버리네? 그러면 String 클래스에서 이 equals 메소드를 값이 같은지를 비교할 수 있도록 오버라이딩을 해놨겠네!
		// 주소가 같으면 당연히 같은거니까 비교할 가치도 없는거고, 실제 value가 같을 때 value가 같은지도 비교해서 돌리도록 오버라이딩해놨구나~
		// 주소값 비교는 물론이고 문자열 값도 비교하도록 오버라이딩
		
		// 실제로 그런지 확인해보고싶다, 우리 주소값 toString말고 찍어서 바꿀 수 있는 메소드 배웠음~
		// toString으로는 @어쩌고가 안나오니까 같은지 아닌지 확실히 봐야겠다! --> hashCode 배웠으니 확인해보자
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// 근데 얘네도 같게 나옴, 우리가 생각하기로는 얘네가 달라야하는데, 얘네 똑같은 객체인가?
		System.out.println("hello".hashCode()); // 문자열 객체 리터럴에 해시코드 해도
		// 이렇게 해도 똑같이 나옴
		// 이 해시코드도 오브젝트의 해시코드를 찍는게 아니라 스트링 클래스가 자신의 value값을 이용해서 해시코드를 만들어내도록 오버라이딩을 해놨기 때문
		
		// 3. String클래스의 hashCode()
		// 주소값을 해싱하는 것이 아니라 실제 담긴 문자열값을 기반으로 해시코드 값을 만들도록 오버라이딩
		
		// 그럼 str1과 str2가 진짜 같은지 다른지 구분할 방법이 없나? --> 또다른 방법이 있음!
		// 진짜 저 참조형 변수들을 식별할 수 있는 값을 알아내는법, 이번엔 오버라이딩 택도없다~
		// System 클래스의 static 메소드 중에 이런게 있음 --> System.identityHashCode(참조형변수) --> 진짜 식별해줄수있음!
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// 이 결과는 str1과 str2의 결과값이 다르게 나온다
		// 같은지 다른지 비교하기 위한 방법들을 써봤는데, Object의 equals도 오버라이딩 되어있고, Object의 hashCode도 오버라이딩 되어있고, equals랑 hashCode는 결국 값만 가지고 비교를 해버리기 때문에 비교가 안됨
		// identityHashCode로는 고유한 해시값이 만들어지므로 str1과 str2가 다른 객체임을 확인할 수 있음
		// 좀더 같은지 아닌지만 단순하게, 같은 객체인지 다른 객체인지 구분할 수 있는 방법 더 없을까? 있지.. 이미 정답을 보고 왔지..
		System.out.println(str1 == str2); // false 나옴, Object가 가진 equals가 보여줬음. 객체와 객체가 같은지 다른지 비교하는 법
		// 얘네는 주소값으로 비교하니 다르구나!
		
	}
	
	// 2번 방법을 해보자! 문자열 리터럴 대입 방식
	public void method2() {
		
		String str1 = "hello";
		String str2 = "hello";
		
		// toString()
		System.out.println(str1); // --> hello
		System.out.println(str2); // --> hello
		// 맨날 쓰던 무지성방식, 오버라이딩 되어있으니까 toString은 이렇게 나오는게 당연
		
		// equals()도 마찬가지, 같아야 해, 왜냐면 value값을 비교하는거니까, value값을 equals로 챙기는거니까
		System.out.println(str1.equals(str2)); // --> true
		
		// hashCode()도 방금 위의 메소드에서 확인함, 얘도 문자열 리터럴 값을 가지고 해시코드값을 만들어내기 때문에 두개가 같아야함
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// 이거말고 진짜로 식별할 수 있는값 있잖아! 진짜로 얘네를 식별할 수 있는 해시코드를 만드려면? 시스템에 있는 거 써야함
		// System.identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// 이건 str1, str2의 고유한 식별값을 해싱값으로 뽑아주는건데 어떻게 나옴?
		// ? 이것까지 똑같이 나옴
		
		// 진짜 단순하게 얘네가 같은지 다른지 보고싶으면 어떻게 하면 됨?
		System.out.println(str1 == str2);
		// 이것도 두개가 같음! true가 나옴!
		
		// 헐... 처음에 얘기했던것... 이렇기 때문에 1번 방법을 쓰면 안된다!
		// 무조건 String 클래스를 쓸때는 2번 방법으로만 써야함!
		
	}
	
	// 왜 String은 이렇게 동작하는가? String도 중요하지만 이번 클래스의 주인공은 String Constant Pool, 스트링 상수 풀
	// String Constant Pool(Constant를 생략하기도 하는데, 둘은 구분해야함)
	// Constant Pool(상수 영역) 안에 String이 들어가는 것이기 때문에 constant라는 표현이 빠지면 안됨.. 근데 보편적으로 생략하고 일반적으로는 생략하는 경우가 많다네요
	// 메모리 얘기 많이 했는데, heap은 자바가 관리하는 영역이 아님, heap 영역도 안에서 나눠지고 쪼개짐
	// heap 안에도 상수값들이 들어가는 영역이 있음
	
	/*
	int num = 2; // 이건 지금 필드니 heap에 생길것임, 그럼 얘가 공간에 정수형 리터럴값 2가 대입될텐데, 2는 어디서 뚝떨어진거야? 컴퓨터는 그냥 하늘에서 뚝떨어뜨리기 못함, 2라는 정수값도 메모리공간의 어딘가에 올라가있어야함, 그래야 활용할수있음
	// 일반적으로 2가 올라간 곳에 접근할수는 없음(가능한 언어가 있지만 자바는안됨) --> 이런상수들이 올라가는 영역을 Constant Pool이라고 함, 그 영역 안에서도 String들(문자열들)만 들어가는 영역이 있음, 그게 String Constant Pool
	*/
	
	// 일반적으로 String도 String클래스로 만드는 객체, 객체니까 heap에 올라감(자바7이후부터 heap메모리에 저장되도록 바뀜, 7이전에는 Permenatnt Generation영역에 있었음)
	// heap 영역도 쪼개고 나눠져있음, 이친구를 String을 쓸 때 어떤 방식으로 만드냐에 따라서 heap 안에서도 올라가는 곳이 달라짐!
	// 항상 우리가 배운 문법상 동작하는 로직은 예외 없이 일어남
	// 예를 들어서 String str1 = new String("hello"); String str2 = new String("hello"); --> 이건 무조건 스택에 str1 변수가 생겨야하고 new를 두번 만났으니까(생성자 호출 두번) heap에 객체가 두개 올라감
	// 이게 일반적으로 클래스를 이용해서 객체를 생성하는 방법
	
	// String은 String str1 = new String("hello"); String str2 = new String("hello"); --> 근데 String은 이렇게도 쓸 수 있음
	// 자바 이야기를 할 때 String은 원래 자바에서도 자바8버전까지는 char형 배열로 만들었고 자바9버전부터는 byte형 배열로 만들게됨
	// 1Byte --> 영어, 숫자 얘네는 이렇게 처리 가능, 공간을 아끼려고 이렇게 사용한다네요, String은 길이만큼의 공간이 heap 영역에 할당되어야함(단일문자의 길이만큼), hello는 byte형 다섯칸짜리가 생기겠지(벌써 10Byte)
	// 우리가 문자열을 쓸 때 생각보다 큰 문자열을 사용하는데, 문자열을 사용할때마다 필요할때마다 전부 heap에 올라가면? 음... 쉽지않네
	// 네이버블로거가 블로그를 작성한다고 치자, 제목쓰고 내용쓰고 할텐데 쓸내용이 엄청 많다면? 그럼 문자열로 받을텐데 엄청 많을텐데.. 한명이 쓴다면 또 문제없겠지만 프로그램은 한명이 쓰지않고 수십수백수천이 쓰겠지
	// 메모리 부족 너무 당연한 이야기.. 아낄 수 있는 방법이 뭔지 생각해봄 --> 상수들이 들어가는 공간은 상수들이 들어갈 수 있는 상수풀을 heap 영역 안 구석에 만들어두자
	// 상수 풀은 상수들끼리 들어가서 노는 곳^^
	// 문자열 리터럴로 값을 대입하면? 객체가 생성되어 올라가는 것이 아니라 상수 풀로 들어감, 어쨌든 heap 내부니 들어간 주소가 있을것임, 이 주소가 stack의 변수로 들어감
	// String str2 = new String("hello"); 이걸 또 선언하고 문자열 리터럴로 대입함, 얘는 어디로? 상수풀로 가야함
	// 상수풀에는 똑같은 문자형 리터럴은 들어갈수없음. 이미 hello가 풀에 있는데 또들어갈수는 없음, 들어가려고 보니 이미 상수풀에 있네? 이미 풀에 있으니까 나는 요거 쓰면 되겠다! 해서 같은 주소를 참조하게 됨 --> 똑같은 문자열 리터럴을 쓸때는 메모리가 더이상 낭비되지않음! 
	// String은 힙에 들어가는게 맞는데, 생성방식에 따라서 객체로 올라가는지 상수풀에 올라가는지 달라지게됨 --> 그러므로 문자열은 무조건 대입연산자를 써서 사용
	
	// String Constant Pool
	public void method3() {
		
		String exam = new String("hello");
		String str = "hello";
		// 위의 두개가 올라가는 영역이 다름
		
		// 문자열 리터럴은 대입 연산자를 사용해 대입할 때
		// String Constant Pool영역에 등록됨
		
		// 특 : 동일한 내용의 문자열 리터럴이 존재할 수 없음
		
		// 상수풀에는 상수들이 들어간다! 리터럴값도 작은 단위의 리터럴은 상수풀에 저장됨(정수 100 이런거, byte크기(-128~127), true, false 등은 계속 만들어질 필요가 없음)
		// 127을 넘어가는 정수값과 소수점값 들은 동일한 값들이 들어오기 쉽지않겠죠? 얘네는 값 그자체로 사용됨
		// 문자열은 동일한 문자열은 무조건 String str = "hello"; 이런식으로 사용했을때는 상수풀에 들어감
		
		// 중요한게 String의 특징은 불변! 바이트형 배열이니 바뀌기 쉽지않다
		System.out.println(System.identityHashCode(str)); // identityHashCode 한번 찍고
		
		str = "bye"; // 원래 변수에 이렇게 해보자! 그리고 다시 identityHashCode 찍어보기
		System.out.println(System.identityHashCode(str)); // 이러면 위와 다른 주소값이 나옴
		// 대입을 했는데, 상수풀에 올라감, hello의 정체는 다섯칸짜리 배열임
		// str = "bye"; 이렇게 대입으로 세칸짜리 배열로 바꿀거야 했다고 원래 상수풀에 있던 hello가 bye로 바뀌어서 들어가는게 아님
		// 상수풀에 새로운 bye가 올라가야함 hello(String 자체)가 바뀔 수는 없음
		
		str += "!!"; // 이런건 어떻게됨?
		System.out.println(System.identityHashCode(str)); // 얘도 다른 주소가 나옴
		// 얘도 더해서 다시 대입하는거니까 동일한곳에 올라가는게 아니라 상수풀에 새로운 스트링으로 올라감
		// 배열이라고 생각하고 보면 바뀔수가 없음, 똑같은 주소일 수 없지!
		
		String a = "a";
		String b = "a";
		
		// 이건 결과가 어떻게 나올까? a랑 b랑 같니? 라고 하고 대입연산자를 이용해서 a에 "a"를 넣고, b에 "b"를 넣음
		System.out.println("결과 : " + a == b); // 이건 false, 수학익힘책!!!에 따르면 결과랑 a를 먼저 더해서 "결과 : a"라는 문자열이 만들어지고, 이것을 그냥 a와 비교하는것
		// 많이 하는 실수
		
		// 그렇게 따지면 이거 되게 비효율적임
		System.out.println("이름 : " + a + ", 나이 : " + b); // 문자열로 더하기연산 할때마다 메모리 공간이 새로생김
		// 보통 문자열로 더하기 연산은 잘 하지 않고 다른 방법을 사용함
		
	}
	
	public void method4() {
		// 다른 방법 이미 우리 봤음!
		// Arrays.toString(new int[2]); <-- 이거 설명할 때 했음, 문자열을 더해줘야함, 안에 까보면 StringBuilder 있음, 얘가 문자열 만들어주는 친구
		
		// StringBuilder는 쌍둥이 친구가 있음, 쌍둥이 친구 먼저 ㄱㄱ
		// StringBuffer
		// Buffer == 임시저장공간
		// 스캐너 할때 버퍼얘기 했음, Buffer라는 단어를 보면 무슨 생각을 함? 대부분 이런 의미로 쓰임
		// 문자열은 불변객체라서 내용물이 변경될 때 마다 새로운 공간을 할당해서 집어넣는다.
		// 이를 해결하기 위해서 임시공간(Buffer)을 준비해서
		// 임시공간에 차곡차곡 담았다가 한번에 처리해주는 클래스
		StringBuffer sb = new StringBuffer();
		
		// System.out.println("Hello" + "World!"); 이렇게 안하고 스트링버퍼의 메소드를 사용
		
		sb.append("Hello "); // 더하기 하는데 append로 뒤에 붙이는 것
		sb.append("World!");
		
		System.out.println(sb);
		// 더하기 대신 쓰는것, 더하기는 메모리 낭비가 심하니까, 메모리 낭비를 하지 말기 위해 쓰는 친구(더하기 대신, 문자열 + 대신)
		
		// 쌍둥이 동생, 얘가 나중에 나옴, 쌍둥이라 사용법이 똑같음
		// StringBuilder
		StringBuilder sr = new StringBuilder();
		
		sr.append("Hello ");
		sr.append("World!");
		System.out.println(sr);
		
		// 고민, 똑같은데 뭘 써야할까? 보편적으로는 우리 상황에서는 스트링빌더를 쓰면 됨
		// 버퍼는 스레드 세이프가 들어있고 빌더는 안들어있음
		// 동시제어기능
		// 인터넷 쇼핑을 한다고 가정, 칫솔을 산다면? 겁나좋은인기많은칫솔!! 재고가 딱 한개 남았다. 홍길동이랑 고길동이랑 둘이서 사야겠다! 해서 같은 년월일시분초에 정확히 똑같은 시간에 사려고 딸깍
		// 그러면 어떻게 해야할까? 사람이면 제비뽑기라도 시킬텐데 컴퓨터는 어떻게 해줄까?
		// 컴퓨터로 해결해야 하는 문제는 전부 객관식
		// 1. 홍길동에게 준다 2. 고길동에게 준다 3. 둘 다 안준다 --> 이걸 골라서 개발자가 해주는것, 이런 상황에 어떻게 하지?
		// 이런걸 처리해주는 무언가 추가적인 기능이 있는 친구들이 또 있다~ --> 이런걸 동시제어기능이라고 함
		// 버퍼는 이걸 판단하는 동시제어기능이 있음 문자열을 더하는데 여기저기서 더하려고 동일한 시간에 append가 두개 붙어야하는 상황이 있을 수 있음, 두개중에 뭘 붙이냐를 알아서 판단해서(랜덤같은거 돌려서) 처리하는 기능이 내장
		// 빌더는 동시제어기능이 빠짐, 일반적으로 속도는 빌더가 더 빠르다고 이야기함(유의미한 속도차이가 나려면 append 만번쯤은 해야하지만ㅋㅋ)
		// 이론적으로는 빌더가 동시제어기능이 빠졌기때문에 속도가 더 빠르다고 이야기함, 우리는 동시제어가 굳이 우리가 처리하지 않아도 앞으로 배우고 사용하게 될 많은 도구들에 엄청 붙어있음, 굳이 문자열을 합치는데까지 이걸 쓸 필요가 없음
		// 다른데서 이미 많이 지원되고 있어서 굳이 문자열을 더하는데 얘까지 쓸 필요가 없고, 차라리 조금더 연산속도를 빠르게 하는 쪽에 집중하는게 괜찮다!
		// 일반적인 상황에서는 빌더, 특정 상황에서는 버퍼(아마 파이널 프로젝트까지 가서 우리반에서 한명정도? 쓰게될지도?)를 써야하는 경우가 생길수도 있음
		
		// 동시제어기능(Thread-Safe)이
		// 외부에서 제공이 많이 되고 있기 때문에
		// 충돌환경이 아니라면 굳이 구현할 필요가 없음
		
	}
	
	// 문자열과 관련된 메소드들(아까 Math 클래스에서 써본것처럼)
	// 회사에서 기술면접으로 기술적인걸 물어보거나 코딩테스트를 할 수 있음
	// 자바로 코딩테스트 문제를 낸다면? 뭐 딱히 없다네요.. 문자열 배열 컬렉션 안에서 나온다네요, 그래서 문자열 다루는 메소드들을 알아두는게 좋겠다
	
	public void stringMethod() {
		
		String str1 = "경실련하이텔 아카데미";
		
		// 1. 문자열.length() : int
		// 문자열의 길이를 반환
		System.out.println("str1의 길이 : " + str1.length());
		// 문자열은 바이트형 배열로 byte[] 이렇게 선언되어있음. 근본이 사라지지 않는다! 자바에서 여러가지 값을 저장할 수 있는 저장소는 배열뿐!
		// 결국 배열의 길이를 반환받는것
		
		// 2. 문자열.charAt(int index) : char
		char ch = str1.charAt(3);
		System.out.println("하 : " + ch); // 이러면 안되지만 빌더 쓰기 귀찮네 ㅎ
		// 이것도 배열의 인덱스를 이용해서 가져오는것!
		
		// 문자열 자르기 많이씀
		String phoneNumber = "010-1234-5678";
		// 010-은 필요없고 뒤에만 쓰고싶다면?
		// 3. 문자열.substring(int beginindex) : String
		// => 문자열의 beginindex위치에서 문자열 끝까지의 문자열을 추출해서 반환
		System.out.println(phoneNumber.substring(4));
		// 얘도 오버로딩이 잘 되어있음, 인자값을 넣어서 필요한 부분만!
		System.out.println(phoneNumber.substring(4, 8));
		// 인덱스는 메모리 공간의 앞(시작점)에 붙음! 그래서 4번부터 8번까지 해야 1234 이렇게 나옴
		
		// 특정 글자의 인덱스가 궁금한 경우
		// 4. 문자열.indexOf(str) : int
		System.out.println(str1.indexOf("텔"));
		
		// 이런것들을 합쳐서 쓰면 활용도가 높아진다
		// 사람들의 메일주소를 보관하는 배열
		String[] emails = {"hong@kh.com", "kim@kh.com", "hitel@kh.com", "hhaahhoo@kh.com"};
		// 메일 주소가 많이 있는데 골뱅이 뒤는 필요없고~ @ 문자 앞에 있는 아이디값만 뽑아서 활용하고싶다면? 이런 상황에 앞에 배운걸 활용할 수 있음
		
		for(int i = 0; i < emails.length; i++) {
			
			System.out.println(emails[i].substring(0, emails[i].indexOf("@")));
			// emails의 각각의 요소를 substring한 결과를 얻고싶은데, 시작 0번 인덱스부터 @인덱스 위치까지 알고싶음
			
		}
		// 각각의 아이디 길이가 다르기 때문에 자르기 애매하지만 indexOf가 @글자의 인덱스를 반환하기 때문에 여기까지 쏙 잘라서 가져다가 쓸 수 있음
		// 문자열 메소드가 단순하게 하나하나 써서 끝나는게 아니라 여러개 묶어서 잘 활용해서 여러가지 용도로 쓸 수 있음
		
		// 5. 문자열.toCharArray() : char[], 문자열을 char형 배열로 반환
		// 문자열의 각 문자들을 char[]로 반환해주는 메소드
		char[] chArr = emails[0].toCharArray();
		
		// 배열의 요소를 한행씩 출력하고싶다면? --> 반복문, for --> 소괄호 안에서 변수 선언으로 초기식 --> 조건식 --> 증감식
		for(int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		} // 이건 for 루프문
		
		// 갈길이 멀다.. 비록 지금은 반복문을 이렇게 사용하고 있지만, 조금있으면 다르게 씀
		for(char c : chArr) {
			System.out.println(c);
		} // 향상된 for문
		
		// 또 조금있으면 반복문을 이렇게 씀
		// Arrays.stream((int[])chArr).forEach(System.out::println);
		
		// 자바가 시대가 발전해서 여러가지가 있습니다~ 이런거 써서 또 해야함
		new String(chArr).chars().mapToObj(c -> (char)c).forEach(System.out::println);
		// char형이라 어쩔수없이 이렇게 쓰려고요~
		
		// int로 바꿉시다 해서
		// IntStream.range(0, chArr.length). --> 얘는 없나? 하여튼!
		
		// 뭔가 앞으로도 새로운 반복하는 방법들을 배워야함. 하루 빨리 익숙해지자! 여러가지 해야함. for문이 for문하고 끝이 아니고 사실 많다! 근데 문법만 다르고 돌아가는건 똑같음
		
		// char[] -> String
		// char형 배열을 다시 문자열로 돌리고싶음
		System.out.println(String.valueOf(chArr));
		
		// 문자열을 치환하고 싶은 경우가 있다. 메일 뒤에 도메인이나 상호가 바뀌어서.. 이런경우가 있을수있지!
		// 6. 문자열.replace(char old, char new) : String
		System.out.println(emails[0].replace("kh", "naver"));
		
		// 웹에서 문자열을 따오다보면 이런 경우가 있을수있음, 공백이 앞뒤로 붙어있는데 실제 필요한것은 Java만!
		String str3 = "          Java                    ";
		// 7. 문자열.trim() : String
		System.out.println(str3.trim());
		
		// 8. 문자열.toUpperCase() : String -> 싹다 대문자로 바꾸기
		// 	  문자열.toLowerCase() : String -> 싹다 소문자로 바꾸기
		Scanner sc = new Scanner(System.in);
		
		// 앞에서 이런 경우가 있었음
		System.out.println("정말 하시겠어요(Y/N) > "); // 사용자에게 이런걸 띄워줌, 입력받고 하는거~ 근데 얘를 검증하려고 어떻게함?
		String answer = sc.nextLine();//.toUpperCase(); // 입력을 받았다고 가정
		// String upperAnswer = answer.toUpperCase();
		
		// Y, N 소문자로 쓸수도 있음, 나 대소문자도 다 해줘야지~ 하면 대문자 Y거나 소문자 y거나 이렇게 if 안에 써줌, 두번 대소문자 체크함
		// 검증하려고 
		if(answer.toUpperCase().equals("Y") || answer.equals("y")) {
			System.out.println("나 찐으로 해야겠다 참을 수가 없다.");
		} // 여태까지 입력받을 때 대소문자 검증하는 방법을 추가했음, 두번 검증하기 귀찮은 상황이 됨 --> answer.equals("y") 이게 귀찮음
		
		// 1. String upperAnswer = answer.toUpperCase(); 이렇게 하면 대문자로 무조건 바뀌는거니까 answer.equals("y") 생략가능
		
		// 문자열 value를 대문자로 바꾼거니까 sc.nextLine()이게 실제 문자열 value값이므로
		// 2. String answer = sc.nextLine().toUpperCase(); 처음부터 대문자로 바꿔서 대입해도 됨
		
		// 3. 아니면 검증하는 시점에 대문자로 바꾼것을 비교해도 되고 --> answer.toUpperCase().equals("Y")
		
		// 메소드 체이닝, 콜백함수라고도 표현 --> 메소드 수행결과를 가지고 또 메소드를 호출하는것(항상 왼쪽, 왼쪽 수행 결과로 돌아오는 걸로 메소드 호출, 더 붙을수도 있음, 왼쪽에서 오른쪽으로!)
		
	}
	
	// 메소드 외우는 거 아님!!! 이렇게 쓰는구나 하고~ 참조하면 다 나온다! 이렇게 도는구나 이렇게 쓰는구나~
	
	public void split() {
		
		// 문자열 분리시키기
		String str = "배고파요,졸려요,하기싫어요,즐거워요";
		// 여러개 붙어있는 문자열을 따로 나눠서 사용하고싶음
		
		// 1. 문자열.split(String 구분자) : String[], 하나의 문자열이 여러개의 문자열로 구분이 되는거니까 뭘로 돌아옴? 문자열의 배열
		// 인자로 뭘로 구분할건지를 전달, 구분자는 뭘로 구분할건지를 의미하는 것
		String[] arr = str.split(","); // 스플릿 하면서 인자로는 정규표현식을 넣어도 되고 문자열로 넣어도 됨, 근데 나 쉼표로 구분할래! 나눌래!
		// 하면 0부터 3인덱스까지 4개의 요소를 가진 배열이 반환됨
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// for문 이제 이렇게 쓰기 싫당ㅎㅎ 앞에서 봤으니까 딴거 쓰자. 이정도면 많이 썼당
		
		System.out.println();
		
		// 향상된 for문, 일반 for문보다 적어야 할 게 줄었음
		for(String s : arr) {
			System.out.println(s);
		}
		// 초기식, 조건식, 증감식 안씀
		// for(값을 받아줄 변수 선언(초기화를 진행하지는 않는다) : 순차적으로 요소에 접근할 배열 || 컬렉션) {		}
		// 얘는 어떻게 동작하느냐? 지금은 배열의 요소가 네개임 --> 배열식별자를 : 뒤에 배치했으니, for문에 오면 이 배열의 첫번째 요소를 s변수에 대입함, s로 출력함, for블럭 끝나고 다시 돌아옴
		// 두번째 요소를 s 변수에 대입하고 출력, 끝나고 ektl 돌아와서 세번째 요소를 변수에 대입하고 출력, 끝나고 돌아와서 네번째 요소를 대입하고 출력
		// 배열이 가진 요소를 앞에서부터 끝날때까지 하나씩 순차적으로 하나씩 접근해서 사용하는 방법
		// 이 방법은 출력할때는 이렇게 쓸 수 있음
		// 배열의 요소를 수정할 순 없음
		// 인덱스에 직접 접근하는게 아니라 변수로 받아서 쓰는거라서 여기에 뭘 대입하고 이래봤자 아무 의미가 없음. 보통 출력하거나 옮겨담을때 씀
		
		// 2. java.util.StringTokenizer 클래스를 이용하는 방법
		// StringTokenizer 객체를 생성하고, 생성할때 기본생성자로 안됨, 첫번째 인자로는 쪼개고싶은거! 두번째는 쪼갤 요소(딜리미터(delimiter), 구분할거)
		StringTokenizer stn = new StringTokenizer(str, ","); // 스플릿 메소드 부르는것처럼 두개의 인자를 넘겨줌
		
		// 요소가 쪼개져서 토크나이저 객체안에 보관됨 --> 그냥 출력하면 아무 의미 없고 toString 호출 결과가 나오는것이고
		// System.out.prinlnt(stn);
		
		// 아 나 토큰 뽑아야지~ 토큰 뽑아야겠다~ 하면 스트링토크나이저에 있는 메소드 중에 nextToken()이라는 메소드를 호출함
		// 요소가 네개 있었는데~ 넥스트 토큰~ 하면 제일 위에것이 뽑혀나옴
		/*
		System.out.println("토크나이저로 뽑아야지~");
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken()); // 두번째 토큰 나옴
		System.out.println(stn.nextToken()); // 세번째 토큰 나옴
		System.out.println(stn.nextToken()); // 네번째 토큰 나옴! 만들어진 토큰이 다 뽑힘. 여기까지 하고나서
		System.out.println(stn.nextToken()); // 또뽑으려면 예외발생함 --> NoSuchElementException, 찾을 수 없음! 요소를! 토큰 다 썼음!
		*/
		
		// 모든 토큰을 다 출력하고 싶을때는 일반적으로 따로 쓰지 않고(요소가 몇개일지 모르니까) 반복문을 씀
		while(stn.hasMoreTokens()) {
			// 조건문에 토크나이저 객체가 가진 메소드 중에 hasMoreTokens()를 호출함
			
			// 남아있는 토큰이 있다면 true / 토큰 다뽑혔다면 false값을 반환해서, 토큰이 남아있을때에만 반복을 수행할 수 있게 됨
			System.out.println(stn.nextToken());
			
		}
		
	}
	
}
