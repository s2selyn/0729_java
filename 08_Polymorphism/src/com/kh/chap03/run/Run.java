package com.kh.chap03.run;

import com.kh.chap03.model.vo.BaseBall;
import com.kh.chap03.model.vo.FootBall;
import com.kh.chap03.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		
		FootBall fb = new FootBall();
		fb.rule();
		
		BaseBall bb = new BaseBall();
		bb.rule();
		
		/*
		Sports s = new Sports();
		s.rule();
		추상클래스로 선언되었기 때문에 객체 생성이 불가능함
		*/
		// 이거 문제임. 객체지향을 발전시킨 사람들이 문제라고 생각함.
		// 개념적인 이야기 : 스포츠라는 클래스는 자식들에게 상속해줄 용도로(공통으로 가져야할 멤버를 가짐) 만든 클래스
		// 이걸로 객체를 생성할 수 있다는게 말이 되느냐? 스포츠라는 개념만 만들고 물려줘서 쓸 용도로 만들었는데 객체를 생성할 수 있네?
		// 자식클래스가 공통 메소드를 가지게 할 목적으로 메소드도 선언해뒀음. 근데 ... 그게 의미가 없는 코드가 됨
		// 이런 상황에서 공통적으로 자식클래스에 물려줄것을 모아둔 클래스, 실제로 그 클래스에서 작업을 할 건 아니고 부모타입으로 물려주는 용도로만 사용할 클래스는 추상클래스라는 개념!
		
		// 자료형을 물려주었기 때문에 다형성은 적용가능
		Sports[] sports = new Sports[2];
		sports[0] = fb;
		sports[1] = bb;
		
		for(int i = 0; i < sports.length; i++) {
			sports[i].rule();
		}
		
		// + 추상클래스가 더 영향력을 크게 가질 수 있음 --> GateBall 클래스 생성ㄱㄱ
		
	}

}
