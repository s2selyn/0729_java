package com.kh.chap07.remote.controller;

import com.kh.chap07.remote.model.vo.Television;

	// 데이터(VO)와 화면(View)의 중간다리 역할
	// 제어, 연산 등의 필요한 작업을 가운데서 수행
public class RemoteController {
	
	private Television tv = new Television(); // TV를 이 친구의 필드로 넣음
	private int channelNo; // 켜지면 채널 0번이라고 가정한 필드(원래 필드였다면 초기화 안하고 선언만해도 int형은 기본값이 0이 들어있음 --> heap에 올라갈때 비어있을수없으니까, 굳이 channelNo = 0;으로 안함)
		// 이거 선언하고 이 클래스의 channelUp 메소드 수정ㄱㄱ
	
	// 전원을 켠다는 것은 TV 객체(tv)의 on 필드값을 true로 대입해주겠다는 뜻
	// 대입하려면? set 해줘야함, private이라 직접접근 못함 --> 무슨 방법으로? 메소드중에 on이라는 이름의 필드를 set할수있는 setOn 메소드를 호출해서 대입
	// setOn을 부르려면? TV객체에 가야함, tv를 참조(.)해서 setOn()을 호출하면서 켜는거니까 true를 인자로 전달 --> tv.setOn(true); 지금은 무조건 켠다고 가정
	// View 클래스에 가서 powerOn 호출해줌
	public int powerOn() { // 얘는 나를 부른 곳으로 1이나 0을 리턴한다
		
		// 근데 이미 켜져있으면 켤 필요 없잖아, TV가 꺼져있을때만 켜고싶음 --> 조건
		// RV에서 여기로 와서 return을 작성함, true/false로 쓸 수도 있고, 정수형으로도 할 수 있음(무난하게 많이 씀), 성공하면 1, 그게 아니라면 0으로 사용
		if(!tv.isOn()) { // tv가 켜져있을때만 이 조건이므로, tv가 켜졌는지 보려면? VO 객체의 on 필드에 있음, 여기서 필드값을 받아오려면? tv에 참조해서 게터로 가져와야함(isOn으로 만들었음)
			// 근데 처음 TV가 생성되면 초기값이 false이므로 if가 동작하지 않을것임 --> 부정으로 바꿔줌(tv.isOn() == false로도 구현가능)
			tv.setOn(true);
			return 1;
			// System.out.println("티비 꺼져있어서 켜짐"); // 꺼져있을때는 켜고 꺼졌어용 출력
		// } else { // else라면 TV가 켜져있는 상태겠지, 켜져있을때는 안켜고 또 안켰어용 출력
			// System.out.println("티비 켜져있어서 또 안켬"); // 상태를 알려주고싶음, 사용자가 확인할수있게 이러면 되나? 되긴됨
			// 근데 출력문은 전부 view에서 쓰기로 다짐했는뎅! 어카지? 이걸 여기서 하는게 아니라 조건에 따라 나눠서 뷰에서 출력하고싶은것임 --> RV의 powerOn 메소드 내부를 수정
		}
		return 0; // 이렇게 할거면 else 필요없어져서 주석처리함, if로 들어갔다면 return으로 돌아감, 못들어갔다면 바로 여기로 오기때문에 return으로 0을 되돌려보냄
		
	}
	
	// 지금 하고싶은 일 : RV에서 출발해서 Array까지 가서 Array에 있는 편성 받아와서 출력하기
	// RV에서 출발해서 RC로 왔음, RC입장에서도 Array까지 바로 갈 수는 없음, TV가 Array의 주소를 갖고있음, RC가 받으려면? --> TV한테 물어봐야함, TV는 Array의 주소를 자신의 필드로 가지고있음! 필드 접근제한자 private이므로 tv.channel로 받을 수 없음
	// --> getter!
	public String channelUp() { // 이 채널에서 뭐할건지 돌려줄거니까 반환타입 String으로 정해져있음
		
		// 꺼져있을때는 채널이 올라가면 안되니까 --> 조건 달아줌
		if(!tv.isOn()) {
			
			// getter메소드를 호출해서 받아오기(필드값-private으로 Array의 주소를 가지고 있기 때문)
			// TV의 것을 get 하고싶다면 어디가야함? TV의 주소를 찾아가야함, 주소는 내 필드인 tv에 담아둠 --> tv 하고 참조(.)해서 getChannel
			// tv.getChannel(); // 이러면 뭐가돌아오나요? 문자열형으로 배열의 주소가 들어있음(가서 게터 보면 알수있다)
			// 주소값 하나를 변수에 저장해둬야 사용할수있다, String형 배열이 올거니까 String[]으로 변수 선언
			String[] channel = tv.getChannel();
			// 예를 들어서 무조건 1번 채널을 돌려주겠다면?(return channel;으로 작성하면 주소가 돌아감) --> return channel[1]; 이러면 1번 인덱스안의것이 돌아갈것임
			// rc.channelUp();이라고 불렀다면 TV에 있는 channel 이라는 String형 배열에 1번 인덱스를 돌려줄것임
			// 사실 아까 그림에 생략한 게 있음, String도 참조자료형이기 때문에 인덱스에 들어있는 것도 주소값이고 실제로 편성표에 대입한 것은 어딘가에 생성된 공간의 주소, 그 공간 안에 우리가 쓴 편성표의 내용이 들어있는것
			// 그래서 엄밀히 말하면 1번 인덱스에 들어있는 주소값(어딘가에 생긴 String 객체의 주소값)을 반환한것임 --> 어쨌든 돌아갈 값을 편성표 내용이라고 가정하자
			
			// 우리가 하고싶은것은 1번 채널 출력이 아님.
			// 기존 필드의 값에 1증가시킨 인덱스의 밸류값을 반환해주고싶은것
			// 4번 인덱스까지 갔는데 또 증가(5번 인덱스 내놔)하면 오류남
			// 내가가진 인덱스 이상으로 못넘어가게 하고싶음 --> 조건! 채널증가를 반환할 return을 조건으로 감쌈
			if(channelNo < (channel.length - 1)) { // 4번 인덱스 이상이라면(channel < 4), 채널 가짓수가 늘어날수도 있는 경우가 있으니 리터럴 4보다는 length 이용하기(length는 칸수이므로 5가 됨, 4를 의미하도록 - 1)
				// 채널 가짓수가 늘어나는 것은 TV의 책임임, 여기서 책임지고 싶지 않음
				
				return channel[++channelNo]; // 보통 반환타입 있는 메소드를 선언하고 나면 반환값이 없어서 빨간줄뜨는데, ""이나 null 같은거 써두면 당장은 빨간줄 없어지긴 하는데 나중에 까먹을수도있음 조심!
				
			}
			
			channelNo = 0;
			
			// if문에 못들어가고 나오면 문자열 형태의 돌려줘야할것도 만들어줘야함(안만들면 메소드 이름에 빨간줄생김) 5가 넘어가면 다시 처음부터(0번 채널) 도는 것으로 만들자
			return channel[0]; // 0으로 돌려보내고싶으면? 뭘 하나 도 해줘야함. 현재 채널이 만약에 늘어난다면? channelNo는 계속 증가함, 채널 번호도 0으로 바꿔줘야함 --> channelNo = 0;으로 만들어주는 부분을 이 return문 위에 작성
			
		} // 여기까지 만들고 일단 RV가서 channelUp 출력문 넣고 수정해줌
		
		// 전원 꺼져있으면 채널업 안되게 하고싶어요 --> if로 감싸버림
		return null; // <-- channelUp 호출했을때 return값을 받아주는 곳으로 가서 if문 써서 null이면 TV 꺼져있는데요 라고 출력하도록 들면됨, RV의 channelUp으로 감
	}
	
	// RV에서 채널번호 출력하고싶어서 getter로 접근할 수 있도록 만들어줌
	public int getChannelNo() {
		return channelNo;
	}
	
}
