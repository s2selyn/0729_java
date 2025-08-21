package com.kh.chap07.remote.run;

import java.util.Scanner;

import com.kh.chap07.remote.model.vo.Television;
import com.kh.chap07.remote.view.RemoteView;

	// 프로그램 실행하고 화면띄우기
public class Run {
	
	public static void main(String[] args) {
		
		/*
		System.out.println("리모콘 조작을 시작합니다~");
		메뉴를 선택해주세요~
		이런식으로썼음
		
		이제 프로그램 Run 클래스를 실행용으로만 쓰자
		입력받고 출력할거 이런건 클래스를 분리해서 메소드를 만들어서 작업
		*/
		
		// 프로그램 시작하면 출력될 것들을 작성하고 왔음
		// 객체 생성 + 담을 공간(변수)에 대입
		RemoteView view = new RemoteView();
		
		// 변수에 들어있는 객체의 주소를 참조해서 메소드호출
		view.mainMenu();
		
		// 이 클래스에서는 실행하는 것만 하고 끝내고싶음, 다 때려넣고 싶지 않음, 그래서 메인 화면을 띄우는 기능을 하나의 메소드로 만들어서 메소드를 호출하는 방법으로 메인화면을 출력해보겠다~ 끝!
		
		// System.out.println("리모콘 조작하기는 즐거우셨나요? 안녕히가세요.");
		// 근데 이렇게 하고싶지 않음, 얘는 출력해주는 코드임 --> 출력해주는 코드는 출력해주는 클래스에 넣고싶음, 명확하게 구분하고싶음
		// 종료되는거 알려주고 끝내고 싶음 --> 돌아가서 종료되는거 알려줘도됨(서비스메세지) --> 돌아가면 서비스 메세지 출력하고 메인 메소드 끝나서 종료될것임. 근데 출력해주는 코드는 출력해주는 클래스에 모아놓고싶음 --> case 5의 return문 앞에 출력문 작성
		// 출력해주는게 많을텐데 여기저기 클래스에 넣으면 출력해야되는 내용이 바뀌었을 때 내가 클래스들을 찾아가서 바꿔야함 --> 하나에 몰아놓으면? 입력을 받는거라든지 출력을 받아야하는거라든가 --> 이걸 몰아넣어서 해주는 클래스에 가면 찾아서 수정할 수 있음(그래서 출력해주는 클래스 바깥에 쓰고싶지않음) --> 유지보수를 위해서
		// 출력하는 건 출력해주는 클래스에서 하고 돌아오는건 바뀌는 게 없음
		
	/*
	 * 그림그리기~
	 * RV의 powerOn() 메소드 블럭 안에서 RC 객체를 생성하면 안되는 이유를 흐름을 보면서 설명했음
	 * 
	 * 왼쪽이 stack, 오른쪽이 heap
	 * 메인메소드부터 시작함
	 * 
	 * RemoteView view = new RemoteView(); RemoteView 타입의 view라는 변수를 선언 --> stack에 할당
	 * 우항에서는 View 객체를 생성함 --> heap에 리모트뷰 객체 할당, 리모트뷰안에는 메인메뉴라는 메소드와 파워온이라는 메소드가 있음 등등
	 * 뉴 리모트뷰하면 뉴에서 힙영역에 뷰객체를 생성, 뷰객체를 생성하면서 제일처음하는일은? 뷰가 가지고있는 필드공간을 확보함
	 * 리모트뷰 클래스가 생기면? 첫줄부터 스캐너타입의 변수를 선언하고있음(왼쪽) private Scanner sc = new Scanner(System.in); 스캐너 객체를 생성함(오른쪽)
	 * 스캐너의 주소값이 뷰 객체의 sc 변수에 대입됨 --> 이러면 View 객체 생성이 끝남 --> 뷰 객체의 주소값이 스택영역의 view에 대입
	 * 
	 * view.mainMenu(); view에 있는 메소드를 호출함 --> stack 영역에 maimMenu()가 올라감 --> 들어가자마자 while 만남
	 * 
	 * while 블럭도 stack 메모리에 올라감, 반복은 여는 스코프부터 닫는 스코프까지 메모리에 올라가있다가 끝나면 내려갔다가, 다시 또 바로 이 while 블럭이 올라감 --> 내려갔다 올라갔다를 반복
	 * 그러니까 말이 되는 부분 --> 반복이 내려갔다올라갔다가 아니라 영구적으로 지속된다면? 변수를 이미 첫바퀴에 선언했는데 두번째에 또 선언할 수 없음 --> 메모리에서 내려가야 menuNo 변수를 다시 생성할 수 있음
	 * while문이 메모리에 올라가서 출력문을 와다다 출력함 --> int menuNo = sc.nextInt(); 를 만남 --> stack의 while 영역 내부에서 menuNo 식별자로 공간을 만들어냄 --> 
	 * sc는 누가 가지고있음? 지금 지역변수 아님! 스캐너 변수 공간(sc)은 리모트뷰 클래스가 필드로 갖고있음(스캐너는 sc가 계속 가리키고 있는 상태!, View 객체는 view가 가리키고 있으므로 둘 다 유지되고 있음)
	 * sc.nextInt()는 어떻게 해석? sc필드 주소를 참조해서 스캐너에 있는 nextInt()를 호출해라
	 * 1을 입력했다면 menuNo에 1이들어감(sc.nextLine(); 이건 입력버퍼 날리는거니 패스)
	 * 
	 * 그리고 나서 switch를 만남 --> 블럭을 만난다 = 메모리에 올라간다 --> 스위치 블럭도 스택에 생김 --> 메뉴넘버가 1이 들어있으므로 스위치 블럭 안에서 케이스1로감 --> 케이스 1에 갔더니 파워온 메소드를 호출하고있음
	 * 
	 * --> 파워온 메소드가 스택에 올라감 --> 파워온 메소드 스코프 안에 들어감 --> RemoteController rc = new RemoteController();를 만남 --> 좌항에서 RC타입의 변수 rc를 선언 --> 공간이 필요함, powerOn 메소드 공간 안에 rc 공간 생김
	 * --> 우항에서 new 하니까 heap 영역에 RC모양으로 생성하는데 RC는 필드를 가지고 있으므로 필드 공간 확보해야함
	 * 
	 * --> RC가 생성될 때 private Television tv = new Television(); 를 만남 --> 좌항에서 RC가 TV 타입의 변수 tv를 선언 --> heap에 공간이 생기고 tv 필드의 공간도 같이 생김
	 * --> 우항에서 new 하니까 heap 영역에 TV 모양의 공간 생김 --> TV에는 필드가 두개있음(boolean 타입이랑 String[] 타입)
	 * 
	 * --> TV가 생성될 때 on 이름의 자리에 false가 들어가고, channel 이름의 자리에 null 들어가고 new 끝남 --> TV의 기본생성자 호출함
	 * 
	 * --> TV의 기본생성자는 channel 필드에 배열(5칸 있어야함)을 new 생성해서 할당해야함 --> new 를 만나서 heap에 배열이 생성되고 생성자에 의해 편성프로그램이 각 인덱스를 채웠다고 가정
	 * --> 배열에도 주소가 생겼을거임, 배열의 주소를 channel 필드에 대입함(처음에 TV 객체 생성되고 null이 들어있던곳)
	 * 
	 * --> 여기까지 하면 TV 객체의 주소가 생겨남 --> RC에 있는 tv 필드에 TV 객체의 주소 대입
	 * --> 여기까지 하면 private Television tv = new Television(); 끝남
	 * --> 여기까지는 view의 RemoteController rc = new RemoteController(); 우항 하다가 온것임 --> 우항이 끝났으므로 RC 객체의 주소가 생겼을것임 --> RC 객체의 주소를 rc 공간에 대입
	 * 
	 * 여기까지 하면 powerOn의 지역변수 rc가 RC 객체의 주소를 가리키고 있고
	 * RC 안의 tv 변수가 TV 객체의 주소를 가리키고 있고
	 * TV 안의 channel 변수가 배열을 카리키고 있음
	 * 
	 * 지금 해야 할 것은? RC 안의 powerOn 호출하고 싶어서 하고있는것(지금 powerOn은 RV도 갖고있고 RC도 갖고있음!!!) --> RV에서 호출한 것은 RC의 powerOn --> rc에 있는 RC 주소를 참조해서 부른 것
	 * 메소드를 호출하면 스택에 올라감 --> RC가 가진 powerOn이 올라감 --> 그 안에 있는 tv.setOn(true);가 실행되어야함 --> RC가 가진 tv 안의 주소를 참조해서 TV의 on 필드 안의 false를 true로 바꿔줘! --> RC에는 TV의 주소값이 tv에 들어있으므로 TV가 가진 setter 메소드를 호출하는 것이 가능함
	 * 스택에 setOn 메소드가 올라감, boolean 타입의  on 매개변수가 있으므로 on의 공간도 같이 생김 --> on 공간에 true값이 있음 --> 이것을 TV가 받아와서 on 필드에 대입
	 * --> TV의 켜짐꺼짐 상태가 true로 대입됨 --> setOn 메소드가 끝남 --> stack에서 사라짐
	 * --> 그 아래에는 RC의 powerOn 메소드가 있음 --> tv.setOn(true);가 끝나면 메소드 끝남 --> stack에서 사라짐
	 * --> 그 아래에는 RV의 powerOn 메소드가 있음 --> rc.powerOn();이 끝나면 출력문 출력하고 메소드 끝남 --> stack에서 사라짐
	 * --> 그 아래에는 switch가 있음 --> powerOn 메소드는 끝나고 그다음 break를 만남 --> switch문 밖으로 나감 --> stack에서 사라짐
	 * --> while 블록이 끝난 것이므로 다시 처음부터 돌아야함 --> while의 영역도 stack에서 사라짐 --> 그리고 다시 메뉴 출력하고 메뉴 입력받기 할것임
	 * 
	 * 근데 여기서 문제임! RC의 tv를 가리키던애(RV의 powerOn 메소드 안에서 선언된 rc 공간 안에 RC객체의 주소값이 들어있었음)가 stack에서 사라짐
	 * RV의 powerOn 메소드가 호출되었을 때 RC의 주소값을 가지고 있던 아이가 살아있었다면, RC 객체의 tv에 담긴 주소값이 TV 객체를 가리키고, RV 객체의 channel에 담긴 주소값이 Array를 가리켜서 다 생존가능
	 * stack에서 RV의 powerOn이 방 빼는 순간 줄줄이 다죽어버림
	 * 
	 */
	
	/*
	 * channelUp() 메소드를 부르면 일어나는 일도 그려보기
	 * 
	 * 메뉴넘버 2로 선택해서 switch문 안으로 들어감, 들어가서 RV의 channelUp을 호출 --> stack의 switch 영역 위에 RV가 가진 channelUp 영역이 쌓임
	 * String channel = rc.channelUp(); 에서 문자열 타입의 변수를 선언함 --> channelUp 영역 안에 channel 이름으로 공간이 생김 --> 우항에서 메소드를 호출함
	 * rc.channelUp은 RC의 주소가 있음, RC의 channelUp영역이 stack에 쌓임 --> String[] channel = tv.getChannel();로 String형 배열 channel이라는 이름으로 선언 --> stack에 생긴 channelUp 메소드 영역 안에 channel 변수공간생김(얘네는 RC꺼!)
	 * tv.getChannel() 호출함, tv는 RC의 필드, 필드를 참조해서 TV가 가지고 있는 channel 필드의 값을 반환받는 메소드를 호출한것 --> getChannel을 호출했으므로 TV가 가진 getChannel메소드가 stack영역에 쌓임
	 * --> getChannel은 return channel;이라고 되어있음, TV는 Array(String형 배열)의 주소값을 channel에 담고있음 --> Array의 주소값을 돌려줘야겠다~ 하고 반환, 스택에서 사라짐 --> 돌려줄 주소값을 getChannel을 호출했던 tv.getChannel()로 돌려줌
	 * --> String[] channel = tv.getChannel(); 이었으므로 channel(지역변수)에 반환받은 주소값을 대입함 --> 주소를 가지고 온것이므로 Array에 접근할 수 있음(이러면 지금 TV의 channl도 가리키고 있고, 스택에 쌓인 RC메소드 영역의 channel에서도 가리키고 있으므로 얕은복사상태)
	 * --> RC의 channelUp 메소드 내부에서 if를 만남 --> 조건검사 --> 처음 채널이 0이니까 조건식 true이므로 스코프 내부로 진입 --> return channel[++channelNo]; 에 의해 인덱스는 채널번호가 1증가한것으로 들어감, 최종적으로 channel[1]이됨 --> 사실 주소값이지만 어쨌든 편성내용이 반환됨,, 걍 주소값으로 설명 ㄱ
	 * --> RC의 channelUp 메소드 영역은 stack에서 사라지면서, return 으로 받아왔던 편성의 주소값을 RV의 channelUp 메소드에 돌려줌, 돌아오기 전에 이미 채널 번호는 증가한 상태임!(RC의 channelNo = 1) --> 주소값은 RV의 channelUp 메소드에 선언된 String 타입의 channel 지역변수에 들어감
	 * 
	 * RV의 String channel = rc.channelUp(); 다음은?
	 * --> int channelNo = rc.getChannelNo();에 의해서 stack에 있던 RV의 channelUp 메소드 공간에 channelNo 변수 공간이 생김(좌항끝) --> 우항은 RV가 가진 rc를 참조해서 RC의 getter메소드 호출
	 * --> 메소드에는 RC의 channelNo 반환문이 적혀있음 --> 1을 들고감 RV안의 channelNo공간에 1 대입 --> 출력문 주루루~ 하다가 channel 만남 --> 여기에 들어있는 것은 편성표의 내용이 들어있는 주소 --> 출력 다 끝나면 RV의 channelUp 메소드 끝남
	 * --> stack 영역에서 RV의 channelUp 사라짐, 끝
	 * 
	 */
		
	}

}
