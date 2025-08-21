package com.kh.chap07.remote.model.vo;

	// 프로그램에서 필요한 값들을 저장하는 역할
public class Television {
	
	// 껐다켰다 구분할 변수(필드)
	private boolean on; // getter / setter 다 있어야 할 것 같음
		// 얘는 boolean타입 값이니까 기본값이 false임 TV 객체 생성해도 TV는 꺼진상태이므로 전원켜기부터해보자
		// 원래대로라면 TV 객체를 mainMenu 메소드 안에 만들어서 했을텐데, 전원을 켤때도 전원이 이미 켜져있는지, 전원을 끌때도 원래 전원이 꺼져있는지, 채널을 올릴때도 마지막 채널이라 못올리는지, 내릴때도 안내려가는지 이런것들을 하나하나 if문이라든가 조건이라든가 검사해서 해야함
		// 그런 코드는 또 RemoteView에서 안하려고함 --> TV를 만들어서 사용하는 것을 화면을 출력하는 곳에서 하지 않고 다른 클래스를 하나 만들어서 거기에서 작업해보려고함
		// 연산하는 친구, 제어용 클래스를 만들어보자 --> RemoteController 클래스
	
	/*
	 * 채널 어떡하지?
	 * 1. 정수형(올리기내리기에 따라 정수값변경)
	 * 2. String[](배열의 요소에 방송중인 프로그램을 문자열로 넣어두고 올리기내리기에 따라 출력) <-- 이걸로 ㄱㄱ
	 * 
	 */
	private String[] channel; // setter는 필요없을듯(채널 그대로 쓸거니까), getter만 있으면 될듯
	
	// 생성자
	public Television() {
		
		// TV가 올라가는데 채널에 아무것도 없음 --> 생성되면 채널 배열에 객체를 담아서 넣어주자
		channel = new String[5];
		// 각 인덱스에 프로그램넣자
		channel[0] = "대한민국 24 뉴스채널";
		channel[1] = "시니어 토크쇼";
		channel[2] = "스튜디오K";
		channel[3] = "EBS 평생학교 2교시";
		channel[4] = "꾸러기TV";
		// 생성자 코드 블록에서 내가 가진 channel 필드를 초기화하는 코드를 작성함
		
	} // 지금은 TV 채널 추가 기능이 있는 것을 만드는게 아님, 고정되어있는것을 채널올리고내리고 보는 것
	
	
	// 필드들의 getter / setter 만들기
	// TV 안에 채널같은 경우에는 채널 바꾸기, 채널 새로운 프로그램 넣기 이런거 안만들거임, 배열 값을 바꾸지는 않을 것 같음 getter만 만들자(값 받아오는 것), setter는 안만들고
	public String[] getChannel() {
		return channel;
	}
	
	public boolean isOn() {
		// boolean 타입은 getter 메소드에 get 대신 is를 붙임
		
		return on;
		
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
}
