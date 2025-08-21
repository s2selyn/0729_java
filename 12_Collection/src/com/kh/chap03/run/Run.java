package com.kh.chap03.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.chap03.model.vo.MBTI;

public class Run {
	
	public static void main(String[] args) {
		
		// 지금같은 경우에는 숫자가 정해져있으니 set보다는 배열이 맞음
		
		// HashSet
		// set은 집합, 수학할때! 중괄호 안에 넣는거
		// List와 같은건 값저장, 차이는 인덱스 없음
		// Value값만 저장, index개념 없음 == 순서보장 X, 중복 X
		// 중복저장하기 싫으면 쓰면됨
		// [ 표현법 ]
		// HashSet 객체명 =  new HashSet(); // 빈 HashSet이 만들어짐
		// List와는 컬렉션이라는 공통분모를 가지고 있기 때문에 리스트를 하고 와서는 크게 어렵지 않음, 아무 문제가 없음
		
		// 문자열만 담을 수 있는 HashSet을 선언해봄(똑같이 제네릭을 쓸 수 있음)
		// 리스트와 마찬가지로 부모자료형, 다형성을 적용해서 받아주자
		Set<String> set = new HashSet();
		
		// 리스트에 요소 추가할 때 add 써서 추가했음, 얘도
		// 요소추가
		// add(추가할요소)
		set.add("안녕하세요");
		set.add("반갑습니다");
		set.add("점심 맛있게 드셨나요?");
		set.add("안녕하세요");
		set.add(new String("반갑습니다"));
		set.add(new String("안녕하세요"));
		set.add("순서 언제 고장남?");
		set.add("왜 계속 넣은대로 나옴?");
		
		// toString도 abstract것 쓰니까 똑같이 나옴
		
		System.out.println(set); // 저장 순서 보장 X, 중복 허용 X --> Set의 특징
		// 중복은 출력이 안되고 넣은 순서대로 나오지도 않음
		
		// List와 Set의 활용 용도
		// 배열, List, Set
		// 배열은 갯수가 정해져있을때, mbti 열여섯개, 로또 번호 45개
		// List는 가변 크기가 매력적임! 배민에서 뭘 주문했는데 리뷰이벤트 쓰려고 함, 사진도 넣고싶음, 여러개 넣을수도 있고, 사진을 넣을건데 하나를 넣을건지 여러개를 넣을건지 모르니까 리스트에 하나씩 넣어주면 좋겠따, 내가 넣은 순서대로 올라가고 실수로 똑같은 사진 올릴수도 있음
		// Set은 특징이? 어떨때 쓰면 좋을까? 일단 가변 크기를 가짐, 여러개의 데이터를 담을 수 있음, mbti 보관! 순서는 상관없지만 똑같은건 들어가면 안됨, 학원에서 운영하는 카카오톡 채팅방(단톡방)에 사람이 들어와야함, 누가먼저 들어오고 나중에들어오는지는 중요하지 않음, 같은 사람이 또 들어가는건 안됨
		// 중요한것은 저장소를 뭘 쓸까? 각각의 저장소들이 특징이 있는데, 만약에 list를 골라서 한다면? set을 고른다면? 해야 할 작업이 달라지게 됨
		// 중복이 허용되는 list를 썼다면 중복 허용 안되는 상황에서 중복체크를 넣는 작업을 해야하지만, set을 쓴다면 안에 중복이 안들어가게 구현이 되어있으니 추가작업이 필요없음
		
		// 개발자에게 필요한 것은 컴퓨팅 사고 ==> 컴퓨터는 어떻게 동작하는가??????
		// 논리회로를 가지고 동작하는거니까 이것때문에 논리 이야기가 나온것이고, 진짜 삼단논법이 필요한게 아니라
		// 개발자한테 있어서 논리력이라는 것은 단순히 값과 값의 비교연산을 어떻게 하느냐가 중요한 부분
		// 컴퓨팅 사고가 어려움, 컴퓨터가 사고하는 방법
		
		// 리스트를 언제써야해요? 셋을 언제써야해요? 경험, 남이짠거 보고 배우고 시간을들여서 학습! 외우는건 아님
		
		// 부모한테 공통적으로 물려받은 것은 똑같이 쓸 수 있음
		
		// 요소 개수 구하기 size()
		System.out.println("set의 요소 개수 : " + set.size());
		
		// 리스트와는 특징이 다르다! 여러개의 Value를 저장하는 저장소이다!
		// 다른 특징을 기억하면 됨!
		
		// MBTI 16개를 다뤄야겠다.
		// 16개의 MBTI를 담을 수 있는 Set을 만들어보자.
		Set<MBTI> mbti = new HashSet();
		
		MBTI istj = new MBTI("I", "S", "T", "J");
		MBTI isfj = new MBTI("I", "S", "F", "J");
		MBTI estj = new MBTI("E", "S", "T", "J");
		MBTI estp = new MBTI("E", "S", "T", "P");
		
		mbti.add(istj);
		mbti.add(isfj);
		mbti.add(estj);
		mbti.add(estp);
		mbti.add(new MBTI("E", "S", "T", "P"));
		
		System.out.println(mbti); // 저장 순서 보장 X(안되는게 정상, 됐다면 운이 좋은 것^^!)
		
		// ESTP가 두번나옴 --> set의 특징을 확인하고 왔는데?
		// 지금 이렇게 넣으니까 순서보장 안되는건 오케인데 중복이 들어가버림 --> 주소가 다름? 객체가 다름?
		// Set은 순서 보장이 안되는 바구니 보따리같은것으로 생각!
		// 지금 MBTI를 넣었는데, 실질적으로 Set에 들어가는 MBTI객체는 객체의 주소값을 보관하는 것임! 진짜 객체가 들어갈수는 없음
		// 이 친구들의 참조자료형 주소값을 Set이 가지고 있음
		// 당연히 객체가 다를 것임! new로 생성했으니까! 중복 아니네? 라고 판단함! --> 이러면 말이 안되는게있음!
		// 주소가 다르면 다른 친구라고 생각해야함, 근데 이러면 말이 안되는게 있음... 아까 스트링 new로 한것도 주소값이 다를텐데 쟤네는 중복제거가 됐음!
		// 방금전에 만든 MBTI 클래스와 String 클래스가 다른 점을 생각해야함! 부모클래스는 Object클래스로 같음 --> String 클래스는 Object 클래스에서 상속받은 것 중에 오버라이딩 된 것이 두개있음! hashCode()와 equals()!
		// String은 "ABC"와 new String("ABC")의 실제 heap 주소는 다르지만, value들만 비교하게 오버라이딩 해둬서 같다고 반환해줌
		/*
		System.out.println("ABC".equals(new String("ABC")));
		System.out.println(new String("ABC").hashCode());
		System.out.println("ABC".hashCode());
		*/
		// HashSet => set에 요소를 추가할 때마다
		// equals()와 hashCode()의 반환값을 기준으로 일치하는 요소가 있는지 비교함
		// Object의 메소드를 쓰는 것이기 때문에 실제 주소값을 비교하므로 똑같다고 생각 안함!
		
		// 결론! 우리는 오버라이딩 해야한다!
		// 필드의 값이 같다면 equals도 hashCode도 같도록!
		// istj.equals(isfj); 이런식으로 사용할텐데 어떻게함?
		
		// Set에서 중복이 안되게 막을 수 있다~
		
		/*
		 * equals() 호출의 결과가 == true이고 hashCode()의 반환값을 동등비교 연산자를 통해 비교했을 때
		 * 값이 일치하다면 => 동일객체로 판단(중복저장을 하지않음)
		 * 
		 * 필드의 값은 같은데 주소값이 달라서 동일객체가 아닌것으로 판단하기 때문에
		 * VO클래스는 내부에 equals()와 hashCode()를 오버라이딩
		 * 
		 */
		
		System.out.println("==================================================");
		
		// Set에 담은 것을 반복하는 경우가 있겠죠? 반복문을 써서 돌려야 할텐데!
		
		// Set의 요소를 반복문을 통해 사용해보자
		/*
		// 문제가 있음! for문을 돌릴건데, set도 size가 있으니 사이즈만큼 반복하면 될것같다! --> 근데 Set에는 get이 없음...!
		for(int i = 0; i < mbti.size(); i++) { // get은 인덱스가 있어야 함, Set은 애초에 인덱스 개념이 없음 --> 일반 for 루프문은 못씀!
			System.out.println(mbti.get이 없음;;);
		} 못씀
		*/
		// 인덱스가 필요없는 반복문이 있음!
		for(MBTI e : mbti) {
			System.out.println(e);
		}
		
		System.out.println("==================================================");
		
		// 인덱스 개념을 사용하고싶을 수 있음, 그러면 어떻게 해야할까?
		// 2. Set의 요소들을 List에 옮겨담아 인덱스를 활용
		// List list = new ArrayList();
		// list.addAll(mbti);
		
		List list = new ArrayList(mbti); // addAll 대신 사용하는 법
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 중복제거하려고 Set으로 옮겼다가 다시 List로 옮기는 상황에서 쓸 수 있음!
		
		System.out.println("==================================================");
		
		// 좀더 고급진방법
		// 3. Iterator(반복자)
		// StringTokenizer와 비슷한 느낌
		// 세달있다가 쓸건데 맛보기
		
		Iterator it = mbti.iterator(); // import 주의! swing 말고 java.util의 것으로
		
		/*
		// iterator에 next 메소드가 있음
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next()); // 요소가 다 뽑히고 나면 예외 발생 --> NoSuchElementException
		*/
		
		while(it.hasNext()) {
			// hasNext 메소드는 요소가 더 있으면 true를 반환함
			System.out.println(it.next());
		}
		
		// List도 그렇고 Set도 그렇고 전부 다 iterator 구현중
		//
		// 모든 실제 객체를 Iterator타입으로 사용할 수 있음(다형성 적용)
		
		// => List계열 Set계열은 전부다 iterator()를 호출해서 반복을 시킬 수 있음
		// => Map계열에서는 바로는 불가능(Map은 컬렉션을 상속받지 않고 혼자 따로놀아요)
		
	}
	
}
