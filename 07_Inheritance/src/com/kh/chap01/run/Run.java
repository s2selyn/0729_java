package com.kh.chap01.run;

import com.kh.chap01.model.vo.ItalyFood;
import com.kh.chap01.model.vo.JapanFood;
import com.kh.chap01.model.vo.KoreaFood;

public class Run {

	public static void main(String[] args) {
		
		// 한식 양식 일식
		// foodName, material, cookingTime, spicy
		KoreaFood kf = new KoreaFood("비빔밥", "밥", 5, 2);
		// 재료 여러개 하려면 스트링배열했어야함
		
		// foodName, material, cookingTime, oil
		ItalyFood yf = new ItalyFood("기름파스타", "기름", 15, 5);
		
		// foodName, material, cookingTime, fresh
		JapanFood jf = new JapanFood("스시", "밥", 10, 10);
		
		System.out.println(kf.information());
		System.out.println(yf.information());
		System.out.println(jf.information());
		
		// 만들고 넣고 출력하기를 만들었다! --> 만들고나니 드는생각? 만들던 시점에 드는 생각?
		// 쓰다보니 방금전에 작성한 내용 같은데? 똑같은거 썼던것같은데?
		// 한발자국 더 나아간다면? --> 중복이네! 그러면 필드가 네개씩 있는데, 여기다가 각자 가격같은 필드를 추가해야 한다면? 하나하나 가서 각 클래스에 가격 필드를 하나씩만들고, 생성자수정, getter/setter수정, information도 수정 
		// 조리시간을 지워줘야겠다면? --> 또 일일히 가서 다 지워줘야함
		/*
		 * 매 클래스마다 중복된 코드들을 하나하나 기술하다보면
		 * 코드의 추가 또는 수정과 같은 유지보수 시 전부 한땀한땀 찾아서 고쳐야하는 번거로움이 생김
		 * 
		 * 상속이라는 개념을 적용해서
		 * 매 클래스마다 주옥된 필드, 메소드들을
		 * 단 하나의 클래스(부모클래스)로 만들어놓고, 정의를 해두고
		 * 해당 부모클래스가 가지고 있는 요소를 상속받아서 사용하는 형태로 진행
		 * 
		 */
		
		// chap01은 상속받기 이전!
		// chap02로 넘어가기 이전에, 식품삼총사에서 어떤것들이 중복이지?
		// 필드 세개, information에서 마지막 필드를 제외한 나머지부분, 필드가 동일하니까 getter/setter도 중복된 필드는 똑같이생김, 생성자에서 매개변수명과 필드초기화하는 부분도 겹치는 필드부분은 중복
		// --> 클래스 내부에 중복되는 부분이 너무 많음 --> 하나의 클래스에서 9개, 나머지 클래스에서도 9개,, 너무 많아짐
		
	}

}
