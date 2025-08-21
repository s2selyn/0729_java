package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.vo.Plant;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 자바의 컬렉션(Collection Framework)
		 * (컴퓨터에서 여러개의 데이터를 다루는 방법에 대해서)
		 * 
		 * Abstract Data Type(추상적 자료형)에서 시작
		 * 추상적 --> 실체가 존재할 수 없음(공통점) --> 추상메소드(메소드 바디가 없음, 어떻게 동작하는지), 추상클래스와 인터페이스(객체 생성 불가능)
		 * 개념
		 * 자바에서는 이 추상적인 개념을 자바에서 사용하기 위해서 인터페이스로 만들어뒀음
		 * 
		 * Abstract Data Type ==> Interface
		 * 인터페이스이므로 만들어서 사용할수는 없음, 추상적 개념을 실제로 쓰고싶다면? 인터페이스를 사용하고싶다면? --> 자바에서 인터페이스를 실체화시키고싶으면 구현해주는 클래스가 있어야함
		 * 인터페이스는 인터페이스만으로 아무것도 못함 Set set = new Set(); 이런거 불가능, 이 인터페이스를 구현하는 클래스가 있어야함! --> 구현체라고 함
		 * 
		 * 구현체 => Class
* 10:25 밖에서 접근할수없으므로 밖에서 무언가를 하려면 Class 안에는 메소드?
		 * 
		 * 추상적 자료형(ADT) ==> Interface
		 * +
		 * 구현체 => Class
		 * +
		 * 알고리즘 => method
		 * 
* 10:30 개발자들의 여러가지 생각, collection framework의 의미, 중요도
		 * 사용법은 쉬움, 모든 개발자가 똑같이 사용하도록 만들어져있음
		 * 
		 * ==================================================
		 * 
* 10:34 차이점 이야기 도입
* 쭉 배열의 장점에 대해서 이야기했음, 컬렉션을 새롭게 해야하니까, 왜 써야하는지 설명해야하니까 배열의 불편한점을 얘기할텐데, 배열이 나쁘다는것은아님! 배열도 배열이 필요한 상황에서는 써야함
* 뒤에서 배우는게 무조건 좋은것은 아님! 수업시간에 하는 내용은 꼭 한번씩은 쓸 내용, 굳이 안쓸것같은것은 다 빼셨기때문에..
		 * 
		 * 배열과 컬렉션의 차이점
		 * 
		 * - 배열의 아주 쬐끔 불편한 점
		 * 
		 * 1. 배열을 사용하려고 할 때 꼭 크기를 할당을 해야함 => 한 번 지정된 크기는 변경이 불가능
* 10:38 우리가 사용자에게 값을 입력받아서 저장해놔야지 라고 생각했다면? 사용자가 몇개를 입력할지 알수없음. 만약에 기존 배열보다 크기가 더 필요하다면? 코드를 더 짜서 큰 배열을 만든 다음에 깊은 복사를 하고 어쩌고 저쩌고 해야했음
		 * 큰 공간을 미리 만들어두면 공간이 낭비됨
		 * 
		 * 2. 배열 중간 위치에 새로운 요소를 추가하거나 삭제할 때 기존값을 밀어주거나 땡기는 코드를 써야함
* 10:39 배열의 값을 새롭게 추가하거나 기존의 배열값을 제거한다고 했을 때,
		 * 
		 * - 컬렉션
		 * 1. 크기의 제약이 없음
		 * => 처음 컬렉션을 사용할 때 크기를 지정하지 않더라도 사용할 수 있음
		 * => 만약 요소가 추가되면서 크기를 넘어서는 상황이 발생하면 알아서 확장됨
		 * 2. 중간에 값을 추가하거나 삭제하는 경우 기존값을 밀어주거나 땡겨주는 로직이 이미 구현되어 있음
		 * (개발자가 굳이 따로 만들어줄 필요가 없음)
		 * => 그때그때 필요한 메소드들을 호출해서 사용하면 됨
		 * 
		 * -- 중립
		 * - 배열의 경우 하나의 타입의 자료형만 사용할 수 있음(단점일수도 있고 장점일수도 있음)
		 * - 컬렉션의 경우 여러 타입의 데이터들을 관리할 수 있음 : 같은 타입의 데이터만 묶어서도 사용가능
		 * 
		 * 배열과 컬렉션은 용도가 아예 다름
		 * 
		 * 사용할 데이터의 개수가 명확히 정해져있고, 조회의 목적 => 배열(크기가 완벽하게 정해져있다, 절대 안고친다!)
		 * 데이터들의 추가, 수정, 삭제가 많이 일어난다 => 컬렉션
		 * 
		 * 우리는 개수가 모호한 경우가 많음, 배열만으로는 감당이 안됨 --> 웹사이트에 상품 목록에 들어갔다고 가정 --> 상품 내역을 가져와서 보여줘야하는데, 저장되어있는 상품 개수를 알 수 없음, 20개 100개 200개 몇개일지 예측이 안됨
* 10:44 조회를 할때도 컬렉션을 쓸수도 있긴함
		 * 
		 * 개념적인 컬렉션의 종류
		 * 
		 * 자바에서는 크게 세 파트로 나눈다
		 * - List 계열 : 다루고자 하는 값(Value)만 저장 / 저장 시 순서 유지(Index 개념이 있음), 중복값 허용
		 * 					=> LinkedList(근본, 컴퓨터공학이면 이거했을테지만), ArrayList(실무), Vector(구닥다리)
		 * 					-> ArrayList(우리가 공부할 것)
		 * 
* 10:47 (여러개의 값을 다루는건 똑같음, List라는 추상적 자료형!)
* 리스트의 근본은 연결 리스트, LinkedList라는 이름으로 구현되어 있음
		 * 
		 * LinkedList는 값을 다룰 때 객체를 만들어서 두개의 값을 저장 --> 실제로 다루고 싶은 Value값을 저장하고, 다음 객체의 주소를 저장함(separate chain)
		 * 새로운 요소를 추가하거나 삭제할 때 큰 장점 --> 주소만 바꾸면 됨
		 * 
		 * ArrayList는 이름부터 배열, 값을 배열로 저장 --> 추가하거나 삭제할 때 LinkedList에 비해서 귀찮음
		 * 삭제/추가할때는 LinkedList가 ArrayList가 성능적으로 유리함
		 * 
		 * 실무에서 작업하는 경우에는(우리는 웹개발이고, 다른 개발도 그렇다) 모든 개발은 조회작업이 압도적으로 많음
* 11:04 모든 웹 어플리케이션의 용도 --> 조회
* 실제로 접근할 때 바로 접근 가능, LinkedList는 하나씩 따라가서 접근해야함, 하드웨어 최적화(무슨원리?)
* 연속되어있는것이 효율적으로 불러올수있음
* 공간효율성 : ArrayList는 배열 긴거 만들면 끝이지만 LinkedList는 객체가 계속 생겨야함 메모리 사용량비교
		 * 
		 * 거의 모든 상황에 ArrayList를 사용하고 있음
* 11:07 이론적인 내용보다는 성능과 효율성을 판단기준으로 사용
		 * 
		 * - Set 계열 : 다루고자 하는 값(Value)만 저장 / 저장 시 순서 유지 X, 중복값 허용 X
		 * 					=> HashSet, TreeSet
		 * 					-> HashSet
		 * 
* 11:09 설명
		 * - Map 계열 : 키(Key) - 값(Value)세트로 저장 / 저장 시 순서 유지 X, 키 중복X/ 값 중복 O
		 * 					=> HashMap, TreeMap, MultiValueMap...
		 * 					- HashMap, Properties
		 * 
		 */
		
		// ArrayList를 이용해서 Plant들을 다뤄보자
		// ArrayList 생성 방법
		// 클래스명이니까 클래스명, 식별자, new, 기본생성자 호출
		// ArrayList 식별자 = new ArrayList();
		// 1. 기본생성자 호출로 만들기 => 기본 크기 10칸
		// 생성자를 호출할 때 인자값을 정수로 전달할 수 있음, 인자로 전달한 정수값만큼의 크기를 가진 리스트를 만들겠다는 의미
		// ArrayList 식별자 = new ArrayList(정수);
		// 2. 인자로 전달한 정수값만큼의 크기를 가진 리스트를 만들겠다.
		
		ArrayList plants = new ArrayList(3); // 3칸짜리 리스트를 만들겠다는 의미
		// 내부적으로 크기가 3칸짜리인 List를 만들겠다.
		// 배열타입[] arr = new 배열타입[3];과 같은 것!
		
		System.out.println(plants); // [] 출력됨
		// 원래 배열이었다면 인덱스마다 생성자 호출했을것
		/*
		arr[0] = new Plant();
		arr[1] = new Plant();
		 */
// 11:15 자료구조 이야기
		// 1. 비어있는 List에 요소를 추가 --> add 메소드 호출
		// add(E e) : 해당 리스트 마지막에 인자로 전달된 요소를 추가해주는 메소드
		// E -> element : 제네릭
		plants.add(new Plant("서양란", "호접란"));
		plants.add(new Plant("동양란", "황룡관"));		
		plants.add(new Plant("관엽", "금전수"));
		// 세칸짜리에 넣어보았다!
		plants.add("식물 끝!"); // 한번 더 추가하면? 출력하면 제일 뒤의 요소로 들어가서 출력됨!
// 11:25 배열이었다면 안되는 현상 2가지
// 하나의 배열에 둘 다 들어갈 수 있는 방법은? 둘의 공통점은 참조자료형 --> 부모타입은 Object --> Object형 배열에 담는...방법..!
		
		System.out.println(plants.toString());
		// 나온 결과가 의미하는 것은? plants의 toString 메소드 호출 결과가 나온 것, 앞뒤로 대괄호가 열고닫혀있고, 각각의 요소들은 중간에 쉼표가 출력되어있음
		/*
		// 어떤거 했을때 이렇게 나왔더라?
		Plant[] p = new Plant[3];
		p[0] = new Plant("서양란", "호접란");
		p[1] = new Plant("동양란", "황룡관");
		p[2] = new Plant("관엽", "금전수");
		System.out.println(Arrays.toString(p));
		// 똑같이 나온다!
		*/
// 참조자료형변수가 출력문 안에 들어갔다면 뒤에 toString 메소드가 붙어있다는 것
// ArrayList는 데이터를 어떻게 관리하나? 배열로!
// 지금 plant를 넣었는데, 
		
// 11:35 List를 쓰는데, Array.. 배열을 부모타입으로
		
		// 기존 Object[]의 크기를 넘어서는 요소가 추가될 경우
		// Arrays.copyOf메소드를 이용하여 깊은 복사로 더 큰 배열로 할당함
		// Object타입으로 요소를 관리하기 때문에 여러 자료형의 요소를 하나의 리스트에 담을 수 있음
		
		// add메소드 호출 시 오버로딩된 형태의 메소드를 사용
		// 첫번째 인자로 index, 두번째 인자로 요소
		// add(int index, E e) : List의 index에 전달한 요소를 추가
		plants.add(0, "식물 시작~");
		plants.add(3, new Plant("관엽", "홍콩야자"));
		
		System.out.println(plants);
		
// 11:38 기존에 있던 것에...!
		// 중간위치에 요소를 추가했을 때 기존의 요소들을 한칸씩 밀어주는 작업이 내부적으로 구현되어있음
		// 우리가 짜야하는 게 아니라 만들어진것을 사용하면 됨
		
		// 2. 요소를 수정하는 메소드
		// (add는 추가) 수정은 기존의 것을 바꾸는것 --> set 메소드 호출
		// set(int index, E e) : List의 index위치에 값을 전달된 요소(e)로 set해주는 메소드
		plants.set(0, "시~~작~");
		
		System.out.println(plants);
		
		// 배열이었다면 했을 일들과 비교! --> 메소드로 구현되어 있으니까 사용방법을 학습해서 이렇게 써야한다! 이친구들은 모든 자바개바자들이 똑같이 사용하는 Collection Framework
		
		// 3. 요소 삭제
		// remove 메소드 호출, 인자값으로 index 전달
		// remove(int index) : List의 index위치에 담긴 요소를 삭제하는 메소드
		plants.remove(0);
		
		// remove 할 때 조심해야 할 점
		// plants.remove(5); // --> 터짐, 0번을 지우면서 5번까지 있던게 4번까지로 바뀜
		// IndexOutOfBoundsException == index값을 잘 고려해서 인자값을 전달해야함
		
		// remove 메소드를 호출 할 때, 4번이 마지막임
		// "식물 끝!" --> 삭제할때 얘가 반환됨 --> 변수로 받아서 쓰려면 String을 써야하는데 안됨 --> String을 뽑았지만 이것을 Object로 관리하고 있었으므로 나오는 시점에 Object로 나옴
		// 부모는 자식이 누군지 모르므로, 그렇지만 우리는 String으로 나올것을 알고있음 --> 다운캐스팅
		String str = (String)plants.remove(4); // 그냥 날리기만 하는 메소드가 아니라 반환값이 있음 --> 열어보면 E 타입으로 반환함(요소를 반환하는 것)
		System.out.println(str);
		System.out.println(plants);
		
// 11:49 1번 index를 remove 해보자
		Plant goldDragonCrown = (Plant)plants.remove(1);
		
		System.out.println(goldDragonCrown.getType() + "류의 " +
						   goldDragonCrown.getName() + "이 삭제되었습니다.");
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		
		// 개념적으로는 List이므로 다 구현되어 있음
		// 4. 리스트의 크기를 반환받기(배열이었으면 length field)
		// size() : 리스트에 담겨있는 요소의 개수
		System.out.println(plants.size());
// 12:04 설명
		System.out.println("마지막 인덱스 : " + (plants.size() - 1));
		
		// 리스트의 요소를 뽑아서 활용(보통은 출력이겠지!)
		// 5. List의 해당 index 위치에 담긴 요소를 반환받는 메소드
		// get(int index) : E
		System.out.println(plants);
// 12:07 설명
		Plant plant = (Plant)plants.get(0); 
		System.out.println(plant);
		
		// 1번 인덱스에 위치한 식물의 이름을 변수로 대입해서 활용하고 싶음
		// 홍콩야자를 변수에 담아서 쓰고싶은 것 --> 타입이 일단 String
		String hongkongTree = ((Plant)plants.get(1)).getName(); // 리스트의 1번요소의 name 필드에 있는 값이므로 제일 처음에 가야 할 곳은?
// 12:10 그림그리기 설명
		// 부모를 확장하는 자식, 자식은 부모것을 쓸 수 있음, 부모는 자식것을 못씀, 나는 자식이 있는지도 모름
		// Plant를 다루는데, Plant 자료형을 Object로 다루겠다고 해두었음 --> Object에는 getName이 없음, getName을 쓰고싶으면 Plant모양이 되어야 쓸 수 있음
// 12:20 Plant 모양으로 바꿔야 Plant가 가진 메소드를 호출할 수 있음 --> 괄호로 순서조정!
		System.out.println(hongkongTree);
		
// 12:21 반복문 설명, size 메소드
		for(int i = 0; i < plants.size(); i++) {
			System.out.println("식물 종류 : " + ((Plant)plants.get(i)).getType());
		}
		
		// 향상된 for문 => 값을 조회하는 목적으로 사용가능
		// for(값을 받아줄 변수 : 순차적으로 요소에 접근할 배열 또는 컬렉션) {		}
// 12:25 앞에 인덱스부터 차곡차곡~
		for(Object p : plants) { // Plant p로 작성하면 --> Type mismatch: cannot convert from element type Object to Plant --> 타입이 안맞을때 나오는거! --> Object로 뽑을 수 있음
			
			System.out.println(p);
// 12:29 --> p.toString() 동적바인딩 --> 런타임 시
			
		}
		
		// 6. 리스트 자르기
		// 문자열 자르기 했음! 문자열도 배열, 얘도 배열이니까 가능!
		// subList(int indx1, int index2) : List
		// index1부터 index2까지의 요소를 추출해서 새로운 리스트를 반환
		List sub = plants.subList(0, 1);
		System.out.println(sub);
		
		// 7. 리스트에 요소를 왕창 추가하기
		// add는 요소를 하나씩 넣는거, addAll은 컬렉션 타입의 모든것을 받을 수 있음
		// addAll(Collection c) : 해당 리스트에 다른 컬렉션에 있는 요소들을 몽땅 추가해주는 메소드
// 12:39 Collection은 Collection들의 대장! ArrayList를 하고 있는데 얘네는 구현체(Class) 추상자료형을???
// list 계열 --> 클래스, 구현체, 인터페이스를 구현한것 --> 추상메소드를 갖고있음
		/*
		ArrayList l;
		LinkedList i;
		Vector v;
		// set 계열
		HashSet h;
		TreeSet t;
		*/
		// List와 Set 모두 Collection을 extends 하고있음 --> 사용법이 같음
		// Map은 Collection이 아니고 다른 친구
		// 모든 리스트와 셋은 addAll메소드에 인자로 쓸 수 있음
		plants.addAll(sub);
		System.out.println(plants); // 리스트는 데이터 값(Value)이 중복되 수 있음
		// 0번 인덱스와 3번 인덱스의 요소가 같음
// 12:44 Plant객체....?
		
		// 8. 리스트에 현재 요소가 있는지 없는지 판별하는 메소드
// 12:45 ADT에 있어야 할 것들
		// isEmpty() : 리스트에 요소가 존재하지 않다면 true / 요소가 하나라도 있다면 false
		System.out.println(plants.isEmpty()); // false
		
		plants.clear(); // 요소 싹 날림
		System.out.println(plants.isEmpty()); // true
		
	}

}
