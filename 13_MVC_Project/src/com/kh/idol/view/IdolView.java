package com.kh.idol.view;

import java.util.List;
import java.util.Scanner;

import com.kh.idol.controller.IdolController;
import com.kh.idol.model.vo.Fan;
import com.kh.idol.model.vo.Idol;

public class IdolView {
	
	// 필드부
	// 사용자한테 입력을 받아야함, 모든 메소드에서 받아야 하니 스캐너를 필드로 두자
	// 단점 : 반납 못함
	private Scanner sc = new Scanner(System.in);
	private IdolController ic = new IdolController();
	// 아이돌 정보, 회원 정보, 게시글 정보도 저장해야하므로
	
	// 로그인에 성공한 회원의 정보를 담아줄 필드
	private Fan loginFan; // 안적으면 null이 기본값으로 들어감, = null 적으면 바보임^^!
	// 로그인에 성공하면 로그인 성공한 친구의 주소를 담기로 하자
	
	// 생성자
	
	// 메소드부
	// 프로그램을 실행했을 때 가장 먼저 보여질 화면을 출력해주는 기능 --> 메인 메뉴 만들자는거지
	public void mainMenu() {
		
		System.out.println("\n\n 🎈aespa 커뮤니티에 오신것을 환영합니다🎈");
		
// 12:35 회원가입하고 로그인해야 게시판 서비스를 쓸 수 있음
		
		while(true) {
			
			System.out.println("이용하실 서비스를 선택해주세요.");
			
			System.out.println("1. 에스파 정보보기"); // 가입 안해도 정보 정도는 볼 수 있게 해줘야징ㅎ
			System.out.println("2. 회원 가입");
			System.out.println("3. 로그인");
			System.out.println("4. 게시판 서비스");
			System.out.println("5. 프로그램 종료");
			
			System.out.print("메뉴 번호 입력 > ");
			int menuNo = sc.nextInt(); // 시간 모자라서 예외처리 생략하고 가볼게요. 어제 딸깍으로 만드는거 배웠으니까 할 수 있음!
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : infoMenu(); break; // 정보보기 메소드
			case 2 : signUp(); break;
			case 3 : login(); break;
			case 4 : boardMenu(); break; // 게시판 서비스 가서 더 자세한거 할거임
			// 지금 board, fan, idol 세개가 있는데, 보드메뉴를 여기서 부르면 안됨, 보드메뉴는 보드뷰가 따로 있어야함 여기에 메인메뉴를 또 두고, 게시글 서비스입니다. 해줘야함
			// 그리고 뷰가 보드메뉴를 필드로 가지고 있어야함
			// 여기서 사실상 보드뷰에 있는 메인메뉴를 호출해야하는것
			// 보드뷰에서는 화면을 보여줄건데, 작성되는 게시글은 보드를 통해서 보여줄텐데, 그건 또 컨트롤러에서 할건데, 지금 컨트롤러도 보드 컨트롤러가 따로 있어야함
			// 팬을 여기서 작업했지만 팬도 팬의 메뉴가 따로 팬 컨트롤러가 있어야함
			// 회원 서비스가 이것만 있을건 아님 회원서비스도 CRUD가 있어야함 팬뷰, 팬컨트롤러가 있어야함
			// 시간 많았으면 싹 나눠서 했겠지만 어려웠을 일은 아니고~ 그냥 하면됨. 원래는 이렇게 하면 안되는데 몰아서 하고 있는 상황!
			// 계속 얘기하는거지만 하나의 메소드는 하나의 기능만 가져야하고 하나의 클래스는 하나의 책임만 가져야함
			// 지금은 아이돌, 팬, 보드 다갖고있음, 클래스가 하는 일이 너무 많아짐
			// 이런건 천천히 하자. 앞으로 시간이 많다. 오늘은 시간이 없음ㅎ
			case 5 : return;
			default : System.out.println("잘못된 메뉴를 선택하셨습니다.");
			} // 출력문 자동완성 어떻게함?? 졸업하고싶다
			
			// 회원가입부터가 우리의 일이지
			// 사용자에게 팬의 정보를 받아서 메모리상에 올려놓겠다, 한명의 회원은 3개의 필드값을 가질 것이고, 그걸 팬이라는 이름의 자료형으로 만들것임
			// 세개의 값을 입력받을것이다~
			// 이런 사이트의 성격은 join이 맞을지도 모르지만 아무튼 signUp으로 만들것임
			
		}
		
	}
	
	private void infoMenu() {
		
		System.out.println();
		System.out.println("정보보기 서비스입니다.");
		System.out.println("이용하실 메뉴를 선택해주세요!");
		System.out.println("1. 카리나의 정보보기");
		System.out.println("2. 지젤의 정보보기");
		System.out.println("3. 윈터의 정보보기");
		System.out.println("4. 닝닝의 정보보기");
		System.out.println("5. 모든 멤버 정보보기");
		System.out.println("6. 메인메뉴로 돌아가기");
		// 몇번하고싶은지 또 입력받기
		System.out.print("이용하실 메뉴를 입력해주세요 > ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		// 사용자의 입력에 따라 다른 결과를 보여줄 것이므로 뭘 써야할까요~ 입력한 것에 따라 전부 다르게 동작시키고 싶으니까 switch문 쓰자
		switch(menuNo) {
		case 1, 2, 3, 4 : findMember(menuNo); break;
		case 5 : findAll(); break;
		case 6 : return;
		}
		
		// 이걸 구성하다보니 1, 2, 3, 4가 하는 일은? --> 하나의 멤버 출력해주면 됨
// 14:24 정보를 보여주는 메뉴를 보여주는거랑, 정보 자체를 보여주는거랑 또 따로 분리를 하는게 좋겠다고요?
		// 5는 멤버 전체를 출력해주면 됨
		// 어쨌든 1부터 5까지는 View에서는 해결이 안되고 Controller로 넘어가서 해야함
		// 그래서 메소드를 2개로 분리하겠음!
		
	}
	
	// 한명을 보여주는 기능 구현하기
	// 아이돌 타입의 주소를 받고싶은것, 카리나의 주소나 지젤의 주소
	// 이걸 어쨌든 view에서 해결할수는 없고 컨트롤러에 요청을 보내야함
	// 이 멤버의 주소를 반환해줄래?
	private void findMember(int menuNo) {
		
		// 특정 멤버의 주소값을 반환 해줄래?
// 14:41 뭘 가지고 있고 뭘 가지고옴?
		Idol idol = ic.findMember(menuNo); // 누구 걸 내놓으라고 할 지 인자값을 보내야함
		// 근데 이 메소드 안에서 사용자가 누구를 선택했는지 알 수 있나? 모름...
		// 이건 어디가야 알 수 있음? 이 메소드를 호출한 infoMenu에 가야 알 수 있음
		// infoMenu에서 골라서 얘가 불린것임. 얘 입장에서는? 뭘 골랐는지 infoMenu에 가서 봐야 알 수 있음, 이건 menuNo를 보면 알 수 있음
		// 얘가 호출된다는 것은 1234 중에 하나가 입력된다는 뜻이니까, menuNo를 그대로 넘겨줌 --> infoMenu에 인자값 넣음
		// 넘겨준 정수값을 받으려면 매개변수가 있어야하므로 정수를 받을거니까 int로
		// 그리고 이 menuNo를 가지고 컨트롤러에 줘야함, 그래야 컨트롤러가 받아서 멤버에 맞게 보내줄것임! --> 메소드 호출할때의 인자값으로 담아줌
		// 1234 중에 뭔진 모르겠지만 정수인건 알 수 있음
		
		System.out.println();
		System.out.println("💗    "+ idol.getName() + "    💗");	
		System.out.println("🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣");
		System.out.println(idol.getImage());
		System.out.println("🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣");
		System.out.println("포지션 : " + idol.getPosition());
		System.out.println("전투 기술 : " + idol.getSkill());
		System.out.println("🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣🔵🟣");
		System.out.println();
		
		// 주소값 가져와서 getter로 출력한것
		
	}
	
	// findMember보다 이게 쉬워보이니까 이거먼저 해보자
	// 모든 멤버들의 정보를 출력해주고싶음, View 혼자서는 불가능함
	// 모든 회원의 정보는 Controller의 식별자가 aespa인 List에 들어가있음, 주소를 받아와야 출력할 수 있음
	// Controller에게 요청해야함, 요청방법은 메소드 호출방법뿐!
	private void findAll() {
		
		// 모든 멤버의 정보를 접근(출력)할 수 있는 값을 줘
		List<Idol> aespa = ic.findAll(); // 필드값이 필요한거고, 딱히 전달할 건 없음, 리스트만 들고오면 될 것 같음
		// --> 메소드 호출만 해놓고 컨트롤러로 넘어감, 컨트롤러에서 무슨일이 일어나는지는 모르지만 갔다오면 값이 옴, 주소값이 옴
		// 다행히 우리가 만들어서 무슨 모양 주소값이 올건지는 안다 --> List모양, generic 달아주면 다운캐스팅 안해도 get 해서 뽑아 쓸 수 있음
		// 근데 에스파가 다 탈퇴해서 멤버가 없고 저작권만 남을 수도 있음 ㅠㅠ 개발자는 경우의 수를 생각해야함
		// 멤버가 한명도 없을 수도 있음, 멤버가 있을때에만 내용을 출력해줘야함 --> 조건!
		if(aespa.isEmpty()) { // 식별자를 잘 달아두면 이해하기 쉽다, 에스파 다 나갔어요 의 의미가 됨
			System.out.println("멤버가 남아있지 않습니다...");
		} else {
			
// 14:33 웬만하면 있을것임, ???? 누가 억지로 건들지 않으면. 멤버만큼 돌려줘야지(반복 네번이면 됨), 근데 추가될수도 있지, 그런거 생각해야함 --> 리스트 요소에 순차적으로 접근해서 돌리는것이 올바른 방법이겠땅
			// 어쨌든 여기 들어왔다는것은 멤버가 한명이라도 있다는것임
			for(Idol i : aespa) {
				
				System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
				System.out.println();
				System.out.println("❤❤ 프로필 이미지 ❤❤");
				System.out.println(i.getImage());
				System.out.println();
				System.out.println("이름 : " + i.getName());
				System.out.println("포지션 : " + i.getPosition());
				System.out.println("전투기술 : " + i.getSkill());
				System.out.println();;
			
			}
			
			System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
		
		}

	}
	
	private void signUp() {
		
		// 하나의 메소드는 하나의 기능만을 수행해야한다.
		// 하지만 지금 이 회원가입 메소드는
		// 회원 가입 뿐만 아니라 아이디값에 대한 유효성검증을 진행하고 있다.
		// 이렇게 되면 이 메소드는 하는 일이
		// 1. 유효성 검증
		// 2. 회원가입
		// 두 개가 되어버리기 때문에 하는일이 너무 많은 것이다.
		// 분리를 하는 것이 올바르지만 아직은 너무 이른것 같아 나중에 다시 돌아오겠음
		
		// Fan이라는 자료형에 맞춰 필드에 set할 값 3개를 사용자에게 입력받음
		System.out.println("\n에스파 커뮤니티에 오신것을 환영합니다.");
		System.out.println("회원가입 서비스입니다.");
		
		// 입력받을건데 스캐너는 필드에 올려뒀음
		// 입력 => userId, userPwd, nickName
		// 세개 값을 입력받을것임, 삼총사
		// 성의있게 해볼까? 문자열 데이터를 입력받는건 맞는데, 제약조건을 두자, 그냥 받는건 맨날 해봤으니까
		
		// 제약조건 => 아이디는 4글자에서 10글자 사이일 것
		// 		 => 아이디는 다른 Fan의 아이디와 중복되면 안될 것(정규표현식 안배워서 뭐 더 걸고싶은데 아직은 못함, 이정도는 할수있음)
		// 이조건 못맞추면 비밀번호 입력 못하고 계속 다시 입력하게 할것임
		
		String userId; // 지역변수가 되므로 바깥에서 미리 선언
		while(true) {
			
			System.out.print("가입하실 아이디를 입력해주세요 > ");
			userId = sc.nextLine();
			
			// 제약조건 하나하나 확인하도록 해보자
			// 1. 아이디는 4글자에서 10글자 사이만 가능
			// 사용자가 입력한 아이디값은 userId 주소를 찾아가면 있겠지, 얘가 몇글자인지 봐야하므로 length 메소드 호출
			// userId.length() // 얘가 어떤 상태여야함? 3보다 크고, 추가로(&&) 11보다 작아야함 --> 이건 연산으로 처리 --> if로 감싸기
			if(!(3 < userId.length() && userId.length() < 11)) {
			
				// 그게 아니면 다시 받게 해야함 --> 아니면? 감싸서 부정 --> 올리고 싶은데? 올리는게 말이 됨? 세상에 올리는 코드는 없음, 반복으로 해줘야징
				// 왜 못쓰는지는 이유는 알려주고 돌려보내야지
				System.out.println("아이디는 4글자에서 10자 사이만 사용 가능합니다.");
				continue;
				
			}
			
			// 2. 중복체크
			// 필드 3개를 입력받아서 어디다 저장해둬야함? Fan에 저장해야함. Fan은 어디다 올려둠? Fan은 heap에 올려야함, heap에 올리려면 누군가는 들고 있어야함, controller에 fan들이 들어간 list가 들고있도록 해야함
// 15:20 list에 fan을 하나 담는거지, 필드값의 주소를 받아서????
			// 기존에 있는 아이디와 중복검사를 할건데, 얘를 어떻게 해야함? 받은걸 중복이 있나없나 확인하려면? 여기선 못함(그런 연산 하는데 아님)
			// 사실 위에서 아이디 길이 체크도 여기서 하는거 아니었음
			// 얘가 하는 일이 아니고 컨트롤러한테 해달라고 해야함
			// 보내면서 해야하고, 보내려면 메소드 호출해야함
			boolean duplicateId = ic.checkId(userId); // 컨트롤러 ㄱㄱ
			
			// true면 다시 입력받기, true가 아니면 탈출시키기 --> 조건
			if(duplicateId) {
				System.out.println("이미 존재하는 아이디 입니다. 다시 입력해주세요!");
			} else {
				System.out.println("사용 가능한 아이디입니다.");
				break;
			}
			
		}
	
		// 1메소드 1기능이 원칙인데 아이디 생성(가입시키기)과 유효성 검사를 하고 있음, 하는 일이 너무 많음 --> 분리하고싶다... 하러가자.. 아니 말자
		// 분리해도 여기 두면 의미없음 여기는 그런 검사 하는데 아님, 분리하려면 딴데 가야하고 컨트롤러도 이런거 하는데 아니라서 또 만들어야 하는데 너무 멀리 가야함 아무튼 잘못된것임
		
		System.out.print("비밀번호를 입력해주세요 > ");
		String userPwd = sc.nextLine();
		
		// 닉네임도 그냥 중복 가능하도록 하자 시간없으니까, 한번 해봤으니 이제 혼자서 해볼수 있다
		System.out.print("닉네임을 입력해주세요 > ");
		String nickName = sc.nextLine();
		
		// 입력을 다 받았음!
		// 뷰는 일단 자신의 할일을 1절까지 마무리함
		// 저장을 할 값을 다 입력을 받았기 때문에!
		// 입력을 받아서 하고싶은게 뭐였냐면?
		// 사용자가 입력한 아이디와 비밀번호와 닉네임을 가지고 Fan객체를 생성해서 필드에 담아서
		// Controller에 있는 fans라는 List의 요소로 추가
		// 이 일은 누가함? Controller가 함, view 입장에서는 Controller를 호출, 요청해줘야함
		// 컨트롤러야 signUp좀 해줘, 필요한 값은 내가 다 받았으니까 이거 전달해줄게, 이거 줄테니까 이 값들로 좀 signUp을 해줘 니가하는일이잖아 나는 할거다했어
		boolean result = ic.signUp(userId, userPwd, nickName); // controller ㄱㄱ
		// 갔다오면 true/false가 들어올거니까
		
		if(result) {
			System.out.println("회원가입에 실패했습니다. 다시 시도해주세요~");
		} else {
			System.out.println("추카포카양파링~~");
		}
		
	}
	
// 16:08 로그인의 대전제 : 회원가입이 되어있을것 --> 그래야 로그인을 시도할 수 있음!
	private void login() {
		System.out.println("\n로그인 서비스 입니다.");
		
		// 보편적으로 두개의 값을 입력받음, 아이디와 비밀번호
		System.out.print("아이디를 입력하세요 > ");
		String userId = sc.nextLine();
		
		System.out.print("비밀번호를 입력하세요 > ");
		String userPwd = sc.nextLine();
		// 이미 메모리에 두개랑 똑같은 필드를 가진 팬이 있으면 로그인 성공, 있는지 없는지 검사는 컨트롤러가 해야함
		// 컨트롤러야, 이 주소값 전달해줄테니 니가 가진 팬 객체의 필드를 까서 둘다 똑같은게 있는지 확인해줘
		Fan fan = ic.login(userId, userPwd); // 안에 들어가는건 식물할때 업데이트 로직이랑 똑같음, 이름만 다르고 필드값 비교하는거니까
		// Fan으로 돌아올것이므로 Fan으로 받음
		
		// fan을 보면 로그인 성공실패 여부를 알 수 있음 --> 이걸 또 사용자에게 알려줘야함
		// 성공실패에 따라 처리할 것이 달라지므로(다른 코드를 실행시키고 싶으니까) --> if-else --> 기준은 fan, 얘가 널이 아니라면 로그인에 성공한것임
		if(fan != null) {
			
			System.out.println(fan.getNickName() + "님 환영합니다~");
			loginFan = fan; // 이거 뭐임? 얕은 복사! 똑같은 주소값을 가리킴!
			
		} else { // null이라는 뜻
			System.out.println("로그인 실패 아이디 또는 비밀번호를 확인해주세요..");
		}
		
		// 로그인 된 정보를 쓰고싶음, 로그인이 된 상태면 로그아웃을 보여준다거나...
		// 지금은 이런걸 알 방법이 없음 --> 뷰에서 로그인 유무를 확인할 수 있도록 필드 만들러감
		
	}
	
	private void boardMenu() {
		
		while(true) { // 게시글을 계속 보고싶을 수 있으니까 while로 감싸기
			
			System.out.println("\n 에스파 게시판입니다.");
			System.out.println("이용하실 메뉴를 선택해주세요."); // 카테고리 없이 게시판 하나만 시원하게 갑시다
			System.out.println("1. 게시글 작성");
			System.out.println("2. 게시글 전체 조회");
			System.out.println("3. 게시글 상세 조회");
			System.out.println("4. 메인메뉴로 돌아가기");
			System.out.print("당신의 선택은!!! ㄷ구둑두굳구둑두 >");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			// 아직 우리가 만들어진 게시글이 없으므로 어쩔 수 없이 작성부터 구현해야 할 듯
			switch(menuNo) {
			case 1 : post(); break;
			case 2 : break;
			case 3 : break;
			case 4 : return;
			}
			
		}
		
	}
	
	private void post() {
		
		System.out.println("\n게시글 작성 서비슈~~");
		
		// 전제조건 : 로그인한 사용자만 게시글을 작성할 수 있음
		// 로그인하지 않은 사용자는 게시글을 작성 못하게 할거고, 로그인한 사용자는 게시글을 작성할 수 있게할거니까 --> 조건 if-else
		// 우리가 손에 들고있는게 뭐 없음, 세개중에 골라야함ㅎㅎ 객관식입니다, 문제를 해결해야하는데 이중에서 고르는거임. 나 뭐써야되지?
		// 1. 변수?
		// 2. if?
		// 3. for?
		// 여태까지 우리가 작성한 모든 코드가 이게 아니었던 적 있나? 무언가 연산처리를 해야해, 조건 분기를 나눠야해, 이러면 이거 세개 뿐임
		// 문제 해결해야 할 때 선택할 것.. 일단 셋중에 하나 찍어보세요. 여기서 안벗어남. 다 아니야? 셋다써~
		// 지금은 로그인 했을때만 쓰게 하고싶음! 아니면 못쓰게 하고싶음! 분기가 두개니까 분기문 쓰는거임
		if(loginFan != null) { // 로그인이 되어있을 것 --> 무엇을 봐야 알 수 있나요? 로그인이 성공하면 주소값을 대입하도록 해뒀음, 성공했으면 쟤가 널이 아닐것임
			
			// 이친구는 로그인을 했다는 친구. 게시글을 작성하게 해줄것.
			// 게시글을 작성한다의 의미는? 우리는 어떤 관점으로 봐야함?
			// 단순하게 생각해서 게시글이 가지는 정보들을 메모리에 올리겠다는 것(컴퓨터 하고 있는거니까)
			// 메모리 어디에 올라가느냐가 중요한것, 이게 첫번째
			// 오늘은 바쁘니까 후다닥 하느라고 그냥 넘어갔는데, 하나의 게시글에 대한 정보는 하나의 보드 객체를 만들어서 이걸 메모리에 올려야지, 했단말이야
			// 얘를 heap에 올리면 게시글 작성이 되는건데, 여기에 들어가야하는 값은? 입력을 받아야함, 일단 입력을 받자
			System.out.print("게시글 제목을 입력해주세요 > ");
			String boardTitle = sc.nextLine();
			
			System.out.print("게시글 내용을 입력해주세요 > ");
			String boardContent = sc.nextLine();
			
			// 이건 선생님이 생각한 보드, 일반적인 게시글을 생각했을 때 다섯개의 값을 넣겠다고 생각함
			// 로그인한 사용자만 쓰게했으니까 사용자의 정보가 들어가야한다고 생각함, 나중에 자기가 쓴것만 수정삭제 가능하도록 하게 하고싶음 --> 사용자의 정보를 담아둘게 필요할 것 같아서 필드로
			// 최종 목적은 결국 조회, 작성하는 것은 조회를 위함, 딱하나만 작성할게 아니고 여러개. 여러개 데이터 조회하려면 정렬 기준이 필요함, 지금은 보드넘버가 기준이 될 수 있음, 보통은 작성일이 언제인지 기록되니까 이것도 넣었다
			// 두개는 입력받아야지 생각하신거고, 작성자정보는 어차피 loginFan 보면 알 수 있고, 일자는 가져오면 되고, boardNo는 정수값이니 1씩올리면됨
			// 객체를 메모리에 올리는건 컨트롤러에서 할거고, 값들은 뷰가 컨트롤러에게 전달해줘야함
			// 전달하는 방법은 메소드 호출하면서 인자로 넘기는 방법뿐!
			ic.post(boardTitle, boardContent, loginFan.getUserId());
			
			// 성공실패여부 출력해주는거 생략되었음
			
			System.out.println("게시글 작성 성공~ ~!");
			
		} else { // null이면 로그인을 안한거지, 나가라고 해야함
			System.out.println("로그인 후 이용가능한 서비스 입니다.");
		}
		
	}
	
}
