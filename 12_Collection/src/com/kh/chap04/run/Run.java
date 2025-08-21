package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04.model.vo.Fish;

public class Run {

	public static void main(String[] args) {
		
		// Map
		// 여러개 담는 저장소, List, Set과 같이 크기제한 없는 무한으로 담기는 보딸
		// 정말 다른 특징을 가짐! 앞의것들은 값만 담았음
		// 얘는 키와 값이 하나의 세트! 무조간 값을 식별할 Key가 하나 필요함, 보편적으로 모든 개발자는 Key + Value 세트를 선호함, 편함!
		// 자바에서는 Map이 이것을 담당하고 있음, 언어마다 담당하는 친구들이 존재함(파이썬, 자바스크립트 등)
		// Key + Value 세트로 저장
		
		// 옛날에는 지하철역에 코인락커가 있었음, 지금은 디지털화가 되어버림(핸드폰 앱으로 함)
		// 열쇠를 받아서 써야했음, 네모네모 안에 물건을 보관하기 위한 용도, 키가 있어야만 안의 value를 얻을 수 있음 --> key가 식별자의 역할을 함 --> 안의 내용물은 똑같은게 들어갈 수 있음! 네모네모를 식별하는 열쇠는 똑같으면 안됨
		// 구닥다리 코인락커의 특징을 생각하면서 가보자
		
		// HashMap
		// [ 표현법 ]
		// Map 객체이름 = new HashMap();
		
		// 키 == 식별자 => 생선이름
		// 밸류 = 생선객체
		
		// fish를 만들 때 name 필드를 안만들었음 Map을 쓸 것이기 때문에 이름을 식별자로 할것
		
		// Map 선언부터, 제네릭에 키는 String, 밸류는 생선
		Map<String, Fish> aquarium = new HashMap();
		
		// 비어있는 맵에 요소를 추가해보기!
		// List, Set => add()
		// Collection을 구현한 클래스
		
		// Map은 둘과 다르고 코드상으로 Collection을 구현하지 않고 혼자 떨어져있음(그래서 컬렉션에 개념적으로 포함시키는게 맞느냐는 사람도 있음)
		// add라는 메소드는 존재하지 않고, 이 친구만의 요소추가 메소드가 따로 있음
		// HashMap -> put()
		// => key + value 함께 요소로 추가
		
		// 1. put(K key, V value) : Map에 key + value세트로 요소로 추가해줌
		aquarium.put("농어", new Fish("단맛", "회"));
		aquarium.put("대방어", new Fish("기름맛", "회"));
		aquarium.put("연어", new Fish("담백한맛", "스테이크"));
		aquarium.put("고등어", new Fish("맛있음", "구이"));
		aquarium.put("메기", new Fish("흙맛", "매운탕"));
		
		System.out.println(aquarium); // 저장 순서 보장 X
		// K=V로 출력됨 이뿌당, toString도 출력됐음
		aquarium.put("참치", new Fish("기름맛", "회"));
		System.out.println(aquarium); // 오버라이딩 했는데 필드값이 같아도 참치와 대방어 밸류가 공존함! --> Value값의 경우 중복 저장 O
		aquarium.put("참치", new Fish("감칠맛", "후토마키")); // 생선이 있지만 조리법이 다름, 밸류는 다르지만 키값이 동일한 참치로 들어감 --> 키가 식별자 역할을 하기 때문에 ! value가 덮어씌워짐
		System.out.println(aquarium); // key == 식별자 --> 중복이 발생하면 덮어씌워짐
		
		// 왜 Map이 좋을까? get 할때 좋음!
		// list는 get할때 인덱스를 넣어야함, 모든 요소의 인덱스를 외울수는 없지, 근데 얘는 get의 인자로 key를 넘김! key값으로 value를 찾아옴
		// 2. get(Object key) : Object
		// 전달된 key값에 해당하는 value값을 반환해주는 메소드
		// key -> value를 찾아옴
		System.out.println(aquarium.get("농어"));
		// key만 있으면 key에 해당하는 value를 뽑아낼수있당
		System.out.println(aquarium.get("메기"));
		
		// 없는 생선(광어)같은거 넣으면 null값이 나옴!
		System.out.println(aquarium.get("광어"));
		// 만약에 List에 넣었다면 요소를 다 돌면서 찾아야함, Set도 마찬가지, List로 바꿔서 똑같은거 해야함
		// Map은 키값만 넣어서 있으면 반환, 없으면 null 반환(for문, if문 안써도됨!)
		// 조심해야 할 것은 없는 키값 넣으면 null값 나오는것
		
		// 3. size() : Map에 담겨있는 요소의 개수
		// 컬렉션이 가져야하는 소양같은 느낌^_^
		System.out.println(aquarium.size());
		
		// 4. replace(K key, V value) : 키값으로 요소를 찾아서 Value값을 바꿔줌
		aquarium.replace("참치", new Fish("고소한맛", "구이")); // --> ? 그냥 put 하면 되는거 아님?
		
		// 존재하지 않는 key값을 인자로 넣었을때 변동이 없음!
		// 요소를 추가하고 싶지 않은 상태에서, 혹은 어떤 상황에서?
		aquarium.replace("없는거", null);
		// 기존에 존재하지 않는 키값을 인자로 전달하면 추가하지 않는 다는 것이 put과의 차이점
		
		System.out.println(aquarium);
		
		// 5. remove(Object key) => 해당 키 값을 찾아서 => 키 + 밸류 세트로 지워주는 메소드
		// 우왕 잘만들어뒀네
		aquarium.remove("참치");
		
		System.out.println(aquarium);
		
		System.out.println("--------------------------------------------------");
		
		// Map이 좋다, 그런데 이런 상황이 있을 수 있음
		// 많은 데이터를 가지고 있으니 우리가 이 요소들에 접근해서 작업해야할텐데
		// Map에 들어있는 모든 요소들에 순차적으로 접근해야 한다면??
		// for문은 인덱스가 없어서 못씀, 향상된 for문도 못씀, while X --> 지금까지 배웠던 모든 반복문이 다 안됨
		// for문 X, 향상된 for문 X, while X
		// Set은 addAll(Collection c) => X
		// Iterator => X
		// 어 뭐야 요소에 반복을 해야하는데 반복을 못하네? 하고 여기서 막힘!
		
		// 아직 배우지 않은 방법으로 사용할수는 있음
		aquarium.forEach((key, value) -> {
			System.out.println(key + ": " + value);
		}); // forEach 메소드와 람다 표현식을 사용해서 할 수 있음 --> 얘는 프로그램 패러다임이 함수형, 지금 객체지향도 버거운데 함수형 받아들이기도 힘들어서 뒤로 미뤄두심
		
		// 가장 이 상태에서 권장하는 방법은 entryset을 사용하는 방법!
		
		// 권장사항을 사용하기 이전에 Iterator를 한번 더 써보자
		// Map이 Key - Value를 가지고 있는데
		// Key값들만 Set으로 바꿀 수 있음(Value는 쓸 수 없음! Key만!)
		// Set으로 바꾸면 Iterator를 사용할 수 있기 때문에 반복을 시킬 수 있게 됨
		
		// 1) keySet() 호출하기
		
		// 1_1> Map이 가지고 있는 Key들만 Set에 담는다.
		// 어렵지 않음, 메소드 호출하면 끝!
		Set<String> fishSet = aquarium.keySet(); // 반환타입이 Set임, Set으로 받을 수 있음, 우리 key는 String타입임 --> 제네릭 작성
		System.out.println(fishSet); // --> 얘는 Set이니까 Iterator로 바꿀 수 있음
		
		// 1_2> Set를 Iterator에 담기
		Iterator<String> itKey = fishSet.iterator();
		
		// 얘가 생겼으니까 이제 할 수 있죠! 가능!
		// 1_3> 반복문 사용하기
		// while문 사용해서, hasNext!
		while(itKey.hasNext()) {
			
			String key = itKey.next();
			System.out.println(key + "-----" + aquarium.get(key));
			// Map의 메소드는 get하면?
			
		}
		
		// 조금 복잡하다, 이런 방법이 있다는 것만 알아두자
		// 구닥다리 자바 읭?
		
		System.out.println("==================================================");
		
		// 2) entrySet()를 이용하는 방법
		
		// 2_1> Map이 가지고 있는 Key-Value세트를 Set에 담기
		// 어쨌든 key와 value는 따로인데, 묶어줄 포장지가 필요함! 그 포장지를 entry라고 함
		Set<Map.Entry<String, Fish>> entrySet = aquarium.entrySet(); // 반환형과 제네릭은 Set<Map.Entry<String, Fish>>
		
		System.out.println(entrySet);
		
		for(Entry<String, Fish> e : entrySet) {
			System.out.println(e.getKey() + "::::::" + e.getValue());
		}
		
	}

}
