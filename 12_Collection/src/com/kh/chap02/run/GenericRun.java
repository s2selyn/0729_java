package com.kh.chap02.run;

import java.util.ArrayList;

import com.kh.chap02.model.vo.Plant;

public class GenericRun {

	public static void main(String[] args) {
		
// 12:49 ??? 불편함을 해결하기 위한 문법
		/*
		 * 제네릭 <Generic>
		 * 일반적인, 포괄적인 --> 프로그래밍에서는 약간 일반화, 일반화한다는 의미로 받아들이자
		 * 
		 * 컬렉션을 사용하면서 다룰 타입들을 미리 지정할 수 있는 기능
		 * 컬렉션을 쓸 때 타입을 지정할 수 있음
		 * => 명시적으로 <integer>, <Plant>
		 * => 특정 타입의 요소들만 컬렉션에 담을 수 있도록 지정할 수 있음
		 * 
		 * 별도의 제네릭 없이 컬렉션 객체 생성 (E == Object 타입으로 생각)
* 14:10 나중에 뭘 담을지 알수없음 여러가지를 다 받을 수 있는 의미에서 Element를 받을거니까 E라고 적음
* 
		 * 1. 다룰 요소의 타입을 제한할 수 있음 => 실수를 줄일 수 있음
		 * 2. 매 번 형변환하는 절차를 없앨 수 있음 => 코드 짤 때 쫌 편함
		 * 
		 */
		//ArrayList plants = new ArrayList();
		// plants, 문자열, 뭐든지 담을 수 있음
		//plants.add("ㄴㅇㄹ");
		//plants.add(new Plant());
		//plants.add(1); // 이것도 되고 int형 리터럴, Object형 배열에 기본자료형을 담을 수 있나? Object 타입캐스팅이 됨?
		//plants.add(1.1); // 이것도 됨 double형 리터럴
//		int i = 1;
//		System.out.println((Object)i);
		// int나 double과 같은 기본자료형을 Object로 바꿀 수 있나요? 이게 되려면? 기본자료형 값인데 Object형 배열에 요소로 추가하고 싶음 --> 전제조건은? 기본자료형은 참조자료형값으로 바뀔 수 없음
// 14:09 Wrapper Class로 Boxing(포장)이 되어 들어감
		
		ArrayList<Plant> plants = new ArrayList();
		plants.add(new Plant("관엽", "산세베리아"));
// 14:13 plants.add("식물시작~"); // <Plant>로 선언했기 때문에 이렇게 할 수 없음
		plants.add(new Plant("관엽", "폴리샤스"));
		
		// String name = ((Plant)plants.get(0)).getName();
		// 아까처럼 이렇게 했을 때.
		Plant p = plants.get(0);
		
		for(Plant plant : plants) {
			System.out.println(plant);
		}
		
		// 사용할때 <Plant>만 넣도록 정해두었으므로 꺼낼 때 나올것도 <Plant>만 나오게 된다
		// 컴파일러가 알 수 있음
		// Generic이 웬만하면 꼭 붙는다고 보면 됨, 안그러면 귀찮아지니까
		
		// 좋은 개발자라면? ArrayList보다는 List
		// 부모자료형인 List를 사용해서 다형성을 적용시켜서 선언하고 사용하는 것이 유지보수에 유리하다.
		// ArrayList라면 구현체를 바꾸려고 할 때 불가능한 일을, List로 선언해뒀다면 바꿔서 사용할 수 있음(타입숨기기)
		// 지금 당장은 큰 차이나 문제가 없을수있지만 나중에 타입은 다형성을 적용해서 상위클래스의 자료형을 사용하는것이 유지보수에 유리하기 때문에 습관을 들이도록 하자
		
		// 개념은 천천히 해도, List 사용법에는 얼른 익숙해지자, 확실하게 알아둘 것 두가지, 활용할 것들
		
	}

}
