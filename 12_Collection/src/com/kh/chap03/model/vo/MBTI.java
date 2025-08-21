package com.kh.chap03.model.vo;

import java.util.Objects;

public class MBTI {
	// 원래 다 대문자면 안됨
	
// 14:10 필드가 하나면 객체에 넣는 의미가.. 두개는 있어야지 ㅎㅎ
	// 얘네가 주인공은 아니고, set 이용해서 쓰려고
	private String introversionExtroversion;
	private String sensingiNtuition;
	private String thinkingFeeling;
	private String judgingPerceiving;
	
	public MBTI() {
		super();
	}
	
	public MBTI(String introversionExtroversion, String sensingiNtuition, String thinkingFeeling,
			String judgingPerceiving) {
		super();
		this.introversionExtroversion = introversionExtroversion;
		this.sensingiNtuition = sensingiNtuition;
		this.thinkingFeeling = thinkingFeeling;
		this.judgingPerceiving = judgingPerceiving;
	}
	
	@Override
	public String toString() {
		return "MBTI [introversionExtroversion=" + introversionExtroversion + ", sensingiNtuition=" + sensingiNtuition
				+ ", thinkingFeeling=" + thinkingFeeling + ", judgingPerceiving=" + judgingPerceiving + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(introversionExtroversion, judgingPerceiving, sensingiNtuition, thinkingFeeling);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MBTI other = (MBTI) obj;
		return Objects.equals(introversionExtroversion, other.introversionExtroversion)
				&& Objects.equals(judgingPerceiving, other.judgingPerceiving)
				&& Objects.equals(sensingiNtuition, other.sensingiNtuition)
				&& Objects.equals(thinkingFeeling, other.thinkingFeeling);
	}
	
	// 결론적으로 우리가 해야할 일
	// 필드의 값이 동일하다면
	// equals() 와 hashCode()를 오버라이딩해서 동일한 결과값이 출력되도록 구현해야함
	/*
	@Override
	public boolean equals(Object obj) {
		
		// 지금 오버라이딩 해야하니 오브젝트 타입으로 매개변수를 받아야함, 넘어온건 오브젝트 타입으로 왔는데 MBTI로 다운캐스팅 해줘야함
		MBTI mbti = (MBTI)obj; // 부모타입으로 온 것을 MBTI로 바꿔줌
		// 필드값 비교
		// ei, sn, tf, jp 네개가 전부 똑같은지 비교해야함, 넷 중 하나라도 다르면 false을 반환, 모두 똑같다면 true를 반환하게 해야함
		// 내필드랑	매개변수로 받아온애 필드
		// 넷 중 하나라도 다르면 --> 조건! if로 감싸자
		if(!this.introversionExtroversion.equals(mbti.introversionExtroversion) ||
		   !this.sensingiNtuition.equals(mbti.introversionExtroversion) ||
		   !this.thinkingFeeling.equals(mbti.thinkingFeeling) ||
		   !this.judgingPerceiving.equals(mbti.judgingPerceiving)) { // 조건 : 필드를 네 개 다 비교해서 하나라도 다르면 --> 뭐랑 뭐를 비교해야함?
			// 내 필드랑 매개변수로 받아온애 필드를 하나만 비교한다고 가정해보자
			// 내 필드는 어떻게 접근함? this
			
			return false;
		} // if 소괄호 안을 다 이기고 왔다는 것은 다 똑같다는거지!
		
		return true;
		
	}
	@Override
	public int hashCode() {
		// 객체를 가지고 뭐 알아서 10진수로 만들어서 반환
		
		// 우리의 조건은?
		// 필드값 똑같으면 똑같은 해시코드 나오게하고싶다
		
		// 매개변수 받으면 오버라이딩 아니게됨!
		
// 15:18 설명

		String isfj = "I" + "S" + "F" + "J";
		isfj.toString().hashCode();
		"isfj".toString().hashCode();
		
		return (introversionExtroversion + sensingiNtuition + thinkingFeeling + judgingPerceiving).hashCode();
// 15:20 VO클래스의 특징, 반드시 오버라이딩 해야하는 메소드임
		
	}
	*/
	
}
