package com.kh.last;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
	
	/*
	 * 스트림의 주요 중간 연산
	 * 
	 * 1. filter() : 조건에 맞는 요소만 필터링
	 * 2. map() : 요소를 반환할 때 사용하는 연산
	 * 3. distinct() : 요소의 중복을 제거할 때
	 * 
	 * 스트림의 주요 최종 연산
	 * 
	 * 1. collect() : 결과를 컬렉션으로 변환
	 * 2. forEach() : 모든 요소에대한 작업 수행
	 * 3. count() : 요소 개수 반환(필터링 한 게 몇개 나왔는지 등)
	 * 4. reduce() : (정수같은거 쓸 때)요소를 결합해서 단일 결과 만들어낼때
	 * 
	 * 종류가 어마어마하게 많은데 이정도만 기억~
	 * 
	 */
	
	// 나중에 자바스크립트랑 스프링 시큐리티에서 다시 만나요!

	public static void main(String[] args) {
		
		/*
		List<String> names = new ArrayList();
		names.add(null); // 이 방법도 있고
		*/
		
		// 생성하면서 넣는 방법도 있음
		List<String> names = Arrays.asList("홍길동", "고길동", "짱구");
		
		// 이 리스트 안의 요소를 다룰 때 이런식으로 다룬다
		for(String name : names) {
			System.out.println(name + "은(는) 정말 못말려~~");
		}
		
		// 오늘은 이걸 문법적으로 다른 방식으로 다룰 수 있는 방법!
		// 컬렉션을 상속받고 있는 모든 친구들은 stream이라는 메소드를 호출할 수 있음
		// names.stream(); // 스트림은 데이터의 흐름, 흐른다는 의미
		// 얘를 이용하면 반복문을 돌릴 때 저렇게 굳이 for문을 사용하지 않고 데이터를 동일한 방법으로 사용할 수 있음
		System.out.println("==============================");
		names.stream()
			 .map(name -> name + "은(는) 못말려~~")
			 .forEach(System.out::println);
		// stream API + 람다 문법을 이용해서 출력해봄
		
		// 스트림(Stream)
		// 컬렉션, 배열 등(데이터를 여러개 다루는 자료형들)의 데이터를 선언적으로 처리해주는 API
		// 함수형 프로그래밍 방식 이라고도 표현
		// 기본적으로 반복할때 for문을 사용함, 얘는 문법적으로 놓고 봤을 때 되게 잘 만들어진 문법(명확하게 만들어짐)
		// for(int i = 0; i < 10; i++)
		// 함수형은 무조건 반복 돌릴거야 이런 의미로 사용함(시작, 반복횟수, 증가 관심없음) --> 반복하면서 뭘 하겠다에만 관심있음
		// for문 -> 어떻게 반복하는지가 구체적
		// 함수형 -> 무엇을 할지 행위에 집중
		// 파이프라이닝 -> 여러 연산을 연결해서 데이터를 다룸
		
		// 기존의 반복문과 스트림을 사용하는 것은 차이가 있음
		System.out.println("==============================");
		
		// 60점 이상인 점수의 평균을 구해봐야겠다.
		// 인원수, 점수는 갯수가 정해져있을테니 배열
		int[] scores = {88, 50, 72, 90, 100, 20, 40};
		
		// 1. 더한것을 저장해둘 변수 선언(60점 넘는 것들만 더할 예정)
		int sum = 0;
		
		// 2. 몇명인지 저장해둘 변수 선언(60점 넘는 것들이 몇개일지 세야함)
		int count = 0;
		
		// 3. 반복문을 돌려보자, 그러면서 조건을 써야함! 60점 이상인지 아닌지 비교연산
		for(int score : scores) {
			if(score >= 60) {
				
				sum += score; // sum + score를 다시 sum에 대입해주기
				count++; // 몇명인지 세는걸 증가시켜주기
				
			}
			
		}
		
		// 4. 평균을 구하는게 목적임(더하는게 목적이 아니고)
		double average = (double)sum / count; // 더한걸 갯수센걸로 나눠줘야함
		// 소수점 보고싶어서 double로 받는건데 이렇게하면 소수점 안나옴
		System.out.println(average); // 소수점 뒷자리도 보고싶다면?
		// 항상 좌항이 1번, 우항이 2번, 대입이 3번
		// 좌항은 실수의 변수 선언, 우항은 정수와 정수의 연산이므로 결과가 정수
		// 정수형이 실수로 대입되기 전에 double형으로 변환됨
		// 각각 double형으로 연산해야됨
		// sum을 double로 변환하면 count는 자동으로 double로 바뀌므로 sum에만 double 붙여도됨
		
		double streamAvg = Arrays.stream(scores)
								 .filter(score -> score >= 60) // 원래 조건문 써서 했던 작업을 이 메소드로 수행함, 이러면 60점 넘는 애들만 스트림에 남음
								 .average() // 이걸로 평균을 구할 수 있음, 최종연산이 아님
								 .orElse(0.0); // 필터로 걸렀는데 전부 60이 안넘으면 나누기 평균연산을 할수없음, 필터했을때의 결과가 없으면 더블형 변수에 무슨 값을 대입할 지 메소드로적어주는것
		System.out.println(streamAvg);
		// 이렇게 기존의 변수선언, 반복문, 조건문, 평균연산 네개를 한번에 퉁치기 가능!
		
// 9:36 API를 이용해서 메소드 호출만으로 단순화해주는 문법
		
		// 낯선 친구(score -> score >= 60)
		// 람다식, 애로우펑션 등으로 표현
		/*
		 * 원래 우리 메소드는 메소드 식별자와 매개변수로 이루어짐
		 * 메소드식별자(매개변수) {
		 * 		return 값;
		 * }
		 * 
		 * print(int a) {
		 * 		return a;
		 * }
		 * 
		 * 이런 함수가 있다고 치자, 얘를 이런 식으로 바꿔서 쓸 수 있음
		 * 
		 * (int a) -> {
		 * 		return a;
		 * }
		 * 
		 * 익명함수라는것이있음, 이름이 없는 함수를 쓸 때 이렇게 쓸 수 있고
		 * 
		 * 중괄호 생략가능
		 * (int a) -> return a;
		 * 
		 * return문 생략 가능
		 * (int a) -> a;
		 * 
		 * 매개변수 타입을 또 생략할 수 있음
		 * (a) -> a;
		 * 
		 * 매개변수가 하나밖에 없다? 괄호 생략 할 수 있음
		 * a -> a;
		 * 
		 * 문법적으로 축약해서 이렇게 바꿀 수 있음, 성능상의 이득이 좋다거나 좋아진다거나 그런건 없음, 단순히 쓸 게 줄어들고 보기 편해짐
		 * 어려우면 지금은 스킵, 나중에 자바스크립트 가서 다시 할 것
		 * 
		 * 직접 호출하기 보다는 안쪽에서 API로 호출
		 * 
		 */
		
		// 익명클래스 -> 선언과 동시에 객체를 생성하는 것이 목적(근데 솔직히 구닥다리 방법임)
		// 원래라면 클래스를 새로 만들어서 작업했겠지, 근데 얘는 이름부터 익명?
		// 정말 단순한 구조로 더하기 해주는 익명클래스를 하나 만들어보자
		SimpleCal adder = new SimpleCal() { // 이거 지금 만든 적이 없는 클래스이므로 생성자가 없고 클래스가 없어서 객체생성이 불가능, 말이 안됨, 뒤에 코드블럭을 만들어줌
		// 인터페이스를 만들고 나면 이 클래스는 아래에서 만든 인터페이스를 이용해서 객체를 생성할 수 있음
			
			@Override
			public int cal(int a, int b) {
				return a + b;
			}
			
		}; // 이러면 여기서만 사용하는 일회용 객체가 됨
		
		SimpleCal minuser = new SimpleCal() { // minuser 맞아? ㅡㅡ 이상한데...
			
			@Override
			public int cal(int a, int b) {
				return a - b;
			}
			
		};
		
		System.out.println("5 + 3 = " + adder.cal(5, 3));
		System.out.println("5 - 3 = " + minuser.cal(5, 3));
		
// 9:50 람다식을 이용하면 어차피 인터페이스에 메소드가 하나밖에 없기 때문에 무조건 인터페이스의 메소드를 호출하게 만들 수 있음
		SimpleCal adder2 = (a, b) -> a + b;
		SimpleCal minuser2 = (a, b) -> a - b;
		System.out.println("2 + 4 = " + adder2.cal(2, 4));
		System.out.println("2 - 4 = " + minuser2.cal(2, 4));
		
		// 람다형 이런거 만들 때 사용할 용도로 만드는 인터페이스를 함수형 인터페이스라고 함
		// 람다가 저렇게만 쓰기 때문에 가져야하는 추상 메소드가 하나 넘어가면 안됨, 하나만 가져야함!
		// 람다 쓸 때 누구를 부르는지 알 수 없으므로 하나만
		
		// 자바스크립트랑 중복되는 친구들을 몇개 써보자, 맛보기 느낌
		// map(), filter()
		// 얘네는 두고두고 많이 쓰는 친구들
		
		// filter(말 그대로 필터링 할 때 쓰는 친구) => 조건에 맞는것만 필터링할 수 있음(if문의 역할)
		// 앞에서 배웠던 전통적인 방식
		List<String> coffee = Arrays.asList("아메리카노", "라떼", "콜드브루", "에스프레소", "헤이즐넛");
		// 글자수가 다섯글자인 커피만 걸러서 리스트에 옮겨담고싶음
		List<String> longNameCoffee = new ArrayList();
		// 하나하나 접근해서 확인하고 추가해줘야함
		for(String c : coffee) {
			
			if(c.length() == 5) {
				longNameCoffee.add(c);
			}
			
		}
		
		System.out.println(longNameCoffee);
		
		// 이것을 filter를 이용하면 아주 간단하게 바꿀 수 있음!
		List<String> coffeeList = coffee.stream() // stream 만드는 방법 : stream 메소드를 호출한다!
										.filter(c -> c.length() == 5) // 글자수가 5개인 친구들을 필터링 하고싶다 --> 필터 메소드를 호출, 안에 있는 친구들을 요소로 전달(아무거나 써도 상관없지만 의미론적으로!)
										.collect(Collectors.toList()); // 반환받아서 collect 메소드를 호출하면서 Collectors의 toList 메소드 호출
		System.out.println(coffeeList);
// 10:13 어떻게 된다고요?
		
		// collect도 많이 쓰고, 일반적으로 출력을 많이 하는데, 필터한 결과물을 가지고 forEach라는 메소드를 써서 요소들을 반복시킬 수 있음(나중에 써보자)
		
		// map -> 스트림을 이용해서 데이터 변환하는 용도
		// 지금 커피 5개가 들어있음, 이걸 글자수로 변환해서 또다른 리스트로 보관하겠다면?
		// 정수를 담는 리스트를 하나 만들어
		List<Integer> nameLength = new ArrayList();
		for(String name : coffee) {
			
			nameLength.add(name.length());
			// 길이만 뽑아서 요소로 추가
			
		}
		
		System.out.println(nameLength); // 이렇게 글자 수를 반환받음
		
		// 이것을 한큐에! stream을 만들어서 map을 호출, 이 안에서 전달받은 coffee를 coffee의 길이로 바꿔서 변환
		List<Integer> lengths = coffee.stream()
									  // .map(c -> c.length())
									  .map(String::length)
									  .collect(Collectors.toList());
		System.out.println(lengths);
		
		// 이걸 단순출력하는거라면 아까처럼 반환받지 않고
		coffee.stream().map(c -> c + "의 길이 : " + c.length())
					   // .forEach(l -> System.out.println(l));
					   .forEach(System.out::println);
// 10:19 할 수 있는 일
		// 람다 쓸 때 이걸 더 줄이고 싶음 --> 메소드 참조라는 문법
		// 어차피 모든 요소를 반복할건데 쟤를 람다써서 반복할 필요가 있느냐?
		// .forEach(System.out::println);
		// .map(String::length)
		
		// 당장 필요한 것은 아니고 스프링 시큐리티를 배울텐데, 이걸 쓸 때는 기존에 만들어진것을 호출해서 써야하는데, 이것 특정버전 이상부터는 람다가 아니면 아예 안돌아가게 만들어져있음
		// 반복문도 for문이 돌아가지 않게 되어있는 구조.. 전부 람다문법을 이용해서 돌리게 되어있는 구조
		
		System.out.println("==================================================");
		
		List<Person> people = Arrays.asList(
											new Person("홍길동", "한양", 15),
											new Person("고길동", "서울", 40),
											new Person("춘향이", "남원", 20),
											new Person("콩쥐", "서울", 23)
											);
		// 이런 사람들이 들어간 리스트가 있다고 치자~
		
		// 이 상태에서 서울 사람만 출력하기를 해보자
		System.out.println("서울 사람만 출력하기");
		
		// 원래 해야 하는 일
		System.out.println("원래 우리의 방식");
		// 반복문을 돌린다
		for(Person person : people) {
			
			// if문을 쓴다! equals를 써서 person의 getAddress
			if("서울".equals(person.getAddress())) {
				System.out.println(person);
			}
			
		}
// 10:29 어떻게 했다고요?
		
		// 이걸 스트림 방식으로 바꾸면 어떻게 되느냐?
		System.out.println("스트림 방식");
		// people이라는 리스트를 이용해서 스트림을 만듦 --> filter를 이용해서 걸러냄 --> 데이터들을 매개변수로 받음 --> 서울과 person의 getAddress가 같은 친구들만 필터링
		people.stream().filter(person -> "서울".equals(person.getAddress()))
// 10:30 필터링이 끝난 친구들은 어떻게?
					   .forEach(System.out::println);
		
		// 문법만 다르고 결과는 동일함
		
		// map도 써봐야징~
		// 이름과 주소 출력하기
		System.out.println("전통적인 방식");
		// 리스트의 사람들의 이름과 주소만 출력하겠다면? 또 반복문을 돌려 --> 출력문을 이용해 --> person의 getName 님은~ 어쩌구저쩌구
		for(Person person : people) {
			System.out.println(person.getName() + "님은 " + person.getAddress() + "에 삽니다.");
		}

		System.out.println("스트림 방식"); 
// 10:33 내가 출력하고 싶은 형태로 map을 이용해서 변환 --> 변환이 끝나면 메소드 참조 방식을 써서 출력?
		people.stream().map(person -> person.getName() + "님은 " + person.getAddress() + "에 삽니다")
					   .forEach(System.out::println);
		
		// 스트림 방식을 쓴다고 해서 무조건 짧아지는 것은 아님
		// 나중에 사용하게 될 기술은 이런 문법들이 강제되므로 어쩔 수 없이 이렇게 써야하는 상황들이 생김
		// 스트림 문법이 아니면 돌아가지 않음, 강제로 이렇게 써야하는 상황이 생기므로 알아는 둬야 한다!
		// 무조건 스트림을 써야한다! 이건 아님! 자바에서는 이런 문법도 있구나 하고 이정도는 알아둬야함
		
		// 필터랑 맵은 자바스크립트 가서도 만날것임
		// 스트림 쓸때는 얘네가 중간 연산 역할을 함
		// 마지막에 끝날 때는 최종 연산(결과 반환)하는 친구들이 있음
		// --> 맨 위에 정리
		
	}
	
	// 함수형 인터페이스 선언
	@FunctionalInterface // 애노테이션 달아야함, 이거 인터페이스 함수형이야~ 컴파일러가 아 이거 함수형 인터페이스구나!
// 10:03 그럼 컴파일러가 알아서 람다를 이용해서 호출해서 사용함!
	interface SimpleCal {
		int cal(int a, int b); // 이 인터페이스로 구현해야 하는 추상메소드 하나, 하나의 추상메소드만 가지고 있어야함
	} // 클래스 내부에 인터페이스를 하나 만들었음
	
}
