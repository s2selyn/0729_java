package com.kh.chap02.run;

import com.kh.chap02.model.vo.BeerDrinker;
import com.kh.chap02.model.vo.Drinker;
import com.kh.chap02.model.vo.RiceWineDrinker;
import com.kh.chap02.model.vo.SojuDrinker;

public class Constructor {

	public static void main(String[] args) {
		
		// 두명씩 만들어준다고 가정해보자
		SojuDrinker s1 = new SojuDrinker(1);
		SojuDrinker s2 = new SojuDrinker(3);
		BeerDrinker b1 = new BeerDrinker(false);
		BeerDrinker b2 = new BeerDrinker(true);
		RiceWineDrinker r1 = new RiceWineDrinker(40);
		RiceWineDrinker r2 = new RiceWineDrinker(50);
		// 실제 객체의 필드에 들어가는 값은 다 다름
		
		// 술 먹읍시다~ 를 코드상으로 구현하려면?
		s1.drink();
		s2.drink();
		b1.drink();
		b2.drink();
		r1.drink();
		r2.drink();
		// 이렇게 해야 한잔씩 다 먹일 수 있음
		
		// 술만 먹이냐? 안주도 먹여야함
		s1.eat();
		s2.eat();
		b1.eat();
		b2.eat();
		r1.eat();
		r2.eat();
		// 다 먹이기 힘들다...
		
		// 하나하나 호명하기 너무 힘들다 묶을 수 있는 방법 없나?
		// 소주먹는사람들, 맥주먹는사람들, 막걸리먹는사람들 하고 묶어버리면?
		System.out.println("==========");
		
		SojuDrinker[] sojuArr = new SojuDrinker[2];
		BeerDrinker[] beerArr = new BeerDrinker[2];
		RiceWineDrinker[] rwArr = new RiceWineDrinker[2];
		// 여기다가 넣어버리면 되잖아!
		
		// 배열에 요소를 담음
		sojuArr[0] = s1;
		sojuArr[1] = s2;
		beerArr[0] = b1;
		beerArr[1] = b2;
		rwArr[0] = r1;
		rwArr[1] = r2;
		
		for(int i = 0; i < sojuArr.length; i++) {
			sojuArr[i].drink();
			sojuArr[i].eat();
		}
		
		for(int i = 0; i < beerArr.length; i++) {
			beerArr[i].drink();
			beerArr[i].eat();
		}
		
		for(int i = 0; i < rwArr.length; i++) {
			rwArr[i].drink();
			rwArr[i].eat();
		}
		// 여기까지 해도 귀찮다
		
		// 공통적으로 묶을 수 있는 것? Drinker!
		System.out.println("====================");
		
		Drinker[] drinkArr = new Drinker[6]; // 부모타입자료형으로 배열 선언
		
		// 상속구조이므로 부모타입 자료형에 넣을 수 있음!
		drinkArr[0] = s1;
		drinkArr[1] = s2;
		drinkArr[2] = b1;
		drinkArr[3] = b2;
		drinkArr[4] = r1;
		drinkArr[5] = r2;
		
		for(int i = 0; i < drinkArr.length; i++) {
			drinkArr[i].drink();
			drinkArr[i].eat();
		}
		
		// 부모타입 자료형으로(부모타입 자료형을 이용해서) 여러개의 자식객체를 다루는 기술
		// 코드상으로 보면 왜 다형성을 쓰는게 좋은지 알 수 있음(각각 변수, 배열, 다형성을 이용해서 구현함)
		// 개념적인 이야기~
		/*
		 * 객체지향의 꽃, 다형성!
		 * 다형성을 구현하기 위한 대전제는 상속구조일것! 그래서 아직도 상속이 중요함(상속이 있어야 다형성을 구현할 수 있음, 상속 자체는 결합도가 높아지기 때문에 권장하는 기술이 아님)
		 * 상속해주는 멤버가 많으면 많을수록 자식클래스는 부모클래스의 멤버가 많아지니까, 부모클래스가 수정되면 자식클래스도 영향받을 확률이 커짐
		 * 근데 상속이 중요한 이유는 자료형! 자식클래스는 상속구조인 부모클래스의 자료형을 상속받아 사용할 수 있음!
		 * 실제로 사용하는 객체는 각자 다른 타입(각 클래스 안에 명확하게 구현됨) --> 이 바깥에서 객체를 사용하는쪽(실행클래스)에서는? 실제 쓰는 객체를 부모클래스(Drinker)로 바라보면서 쓰고있음
		 * 클래스 외부에서는 뭔지 관심이 없고, 난 그냥 부모로 보고 쓸거야 --> 객체를 어떻게 인식할것인가? 이때 필요한게 타입(자료형)
		 * 배열과 명확한 차이 --> for문으로 각 자식클래스가 가진 메소드 호출해서 동작시키고싶음 --> 이걸 위해 배열을 사용했을때는 for문을 객체의 타입마다 작성했음(소주맥주막걸리 세번)
		 * 다형성으로 구현 --> 그냥 술먹는애들로 바라보면서 술먹는애들이 가진 메소드를 호출함 --> 실제 만들어진 객체는 메소드를 오버라이딩함 --> 메소드 호출하는 시점에 보니 술먹는애가 각자 다른걸 먹고있음(동적바인딩, 오버라이딩된 메소드) --> 실제 자식 객체가 가진 오버라이딩된 메소드(멤버)를 호출함
		 * 
		 * 객체지향의 목적, 객체지향의 모든 기술이 추구하는 것 --> 객체끼리 안보여주려고, 안친하려고(캡슐화 상속 다형성 추상화 등)
		 * 캡슐화는 데이터, 필드값 숨기기!
		 * 다형성은 타입 숨기기!
		 * 
		 */
		
	}

}
