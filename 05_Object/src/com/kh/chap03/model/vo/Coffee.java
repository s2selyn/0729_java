package com.kh.chap03.model.vo;

public class Coffee {
	
	// 상품명, 가격, 원두, 크기
	// 필드를 boolean 타입을 써보고싶으셨다고함...(카페인/디카페인)
	
	// 클래스 상단부에는? 필드부
	private String name; // 상품명
	private String bean; // 원두
	private String size; // 크기
	private int price; // 가격
	// 네개의 공간이 있어야함, 필드는 결국 변수, 변수 선언한 것
	// 원래는 public했지만 캡슐화를 배웠으니 모든 필드의 접근제한자가 private이어야 한다.
	// 자료형끼리 묶고싶은 마음이 있어서 순서도 조정해봄
	
	// getter / setter도 2주 후에는 자동완성으로 만들것임, 자동완성하면 자바개발자라면 누구나 똑같이 이렇게 만드는 형태로 만들어줌
	// 계속 생각해야하니까 익숙해질때까지는 계속 직접 만들자
	
	// 생성자부(오늘 오후에 할것임)
	
	// 메소드부 getter / setter / info(필드값을 한번에 반환받아야 하니까)
	// 오늘 숙제는 아마도 어제 만든 VO private으로 만들고 getter(값 빼오고) / setter(값 대입하고) / info까지 다 만들고...?
	// 숙제의 의미 복습과 어제배운거-오늘배운거-내일배운거 매일 적용해보기
	
	// 필드값을 반환해주는 메소드 == getter(겟! 내놔!)
	// 필드는 다 안보임 -->  이 메소드를 외부로 노출시킬것임 --> 밖에서 불러야하니까 접근제한자 public
	// getter는 메소드 호출할 때 돌려줘야함, 반환타입이 void일 수 없음! 돌려줄 값의 자료형으로 반환타입을 붙여줌
	// name을 돌려주고 싶은 메소드는 name의 자료형으로 반환타입을 작성
	public String getName() {
		return name; // 돌아간다~ 돌아갈 때 name 들고간다~
	}
	
	// 밖에서 불렀을때 돌려줄 수 있는 메소드
	// 밖에서 불러야되니까 접근제한자는 public, bean에 대입되어있는 value값을 돌려주고싶으니 돌아가야하는 자료형은 String, 이름은 getBean
	public String getBean() {
		return bean; // Coffee == 콩물
	}
	
	public String getSize() {
		return size;
	}
	
	public int getPrice() {
		return price;
	}
	
	// 필드를 세팅해야 반환하는 의미가 있음, 지금은 기본값이 들어있음
	// 필드값을 셋팅 해주는 메소드
	// 외부에서 불러야되니까 접근제한자는 public, 메소드의 목적이 값을 받아서 필드에 대입해주는 것이므로 나를 부른 곳에는 따로 돌려줄 값이 없음(void), 식별자가 set으로 시작하고 뒤에 필드명이 붙음
	// setter를 호출해서 값을 넘겨줄것이므로 값을 받기 위한 공간인 변수가 필요함
	// name은 지역변수, 이 지역 안에서는 얘가 1등, heap에 생겨난 필드에 대입하고 싶음 --> heap에 가야하고 주소가 필요함, 주소를 의미하는 키워드 this
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBean(String bean) {
		this.bean = bean;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 필드에 값이 잘 대입되어있는지 확인해봐야하는데 확인해야하는 필드마다 매번 getter를 부르기 귀찮음 --> 모든 필드값을 한번에 합쳐서 하나로 보여주는 메소드를 만든다
	// info
	public String info() {
		
		String info = "상품명 : " + name
					+ ", 원두 : " + bean
					+ ", 사이즈 : " + size
					+ ", 가격 : " + price;
		return info;
		
	}
	
	
	
} // Coffee에 책임을 가지고 있는 클래스를 만들었음! 너는 커피에 관련된 모든 책임을 진다!
  // 설계도만 가지고 있으면 아무 의미가 없으니 메인 메소드 가서 커피 만들고 필드값도 넣어보고 출력도 해보자
