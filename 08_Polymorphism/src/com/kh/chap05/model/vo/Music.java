package com.kh.chap05.model.vo;

public abstract class Music {

	// (보통은 필드도) 클라이언트 요구사항에 따라서 기획 및 설계해야함(개발자나 기획자가), 구현하고 싶은 프로그램을 생각해야함
	// 프로그램 만들때 중요한것은 유연한 프로그램을 만들자! 유연한 설계와 구현! 수정/확장이 가능하도록!
	// 인터페이스는 유연한 프로그램을 만들기 위한 핵심적인 도구
	
	// 프로그램 업계의 격언 1. 바퀴를 다시 만들지 말라(이미 있는데 만들지말고) --> Scanner 사용의 예 --> 나만의 스캐너를 만들어서 쓴다고 가정하자. 나의 스캐너는 더 옵션이 있어! 근데 그러지마..
	// 이미 멀쩡하게 잘 돌아가는 친구가 있는데 굳이? 스캐너를 써놓으면? 모든 자바개발자가 보면 의도를 알 수 있음
	// 근데 나만의 것을 써놓으면? 내가 만든 클래스를 공부해야함.. 의도가 뭔지 어떻게 생겼는지 --> 협업이 안되는거겠지(모두의 퇴근을 늦추는 작업)
	// 2. 은탄환(총알)은 없다 --> 무슨 문제든 해결할 수 있는 마법의 아이템같은건 없음 --> 그런거 상상할 시간에 그냥 코드쳐서 문제해결해라
	// 꾸준히 고객과 의사소통하면서 점진적으로 발전시켜라, 처음부터 완성할수는 없다.
	
	private String code;
	private String title;
	private String runningTime;
	
	public Music() {}
	
	public Music(String code, String title, String runningTime) {
		
		this.code = code;
		this.title = title;
		this.runningTime = runningTime;
		
	}
	
	public String getCode() {
		return code;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getRunningTime() {
		return runningTime;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}
	
	// 재생하는 메소드를 만들고싶은데, 여기에 구현하지 않고
	// 이 클래스는 모든 음악클래스가 가져야하는 필드와 메소드를 물려주기 위한(상속) 용도, 객체를 생성해서 뭘 하고싶은건 아님, 재생기능도 안넣을거임, 근데 앞으로 만들 클래스들이 공통적으로 이걸 가질 것 같음, 상속해주기 위한 용도로 만들었음
	// --> 추상 클래스로 바꿔주자, 클래스 선언부 public과 class 사이에 abstract
	
}
