package com.kh.chap03_char.model.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCharDao {
	
	// 프로그램에서 외부매체(파일)로 내보내겠다! 프로그램 밖으로 나가는 이건 출력!
	// 프로그램 --> 외부매체(파일)
	// 출력
	public void outputToFile() {
		// 내보내는데 이번엔 문자스트림을 써보자
		
		// 문자출력스트림 특! Writer로 끝나면 아 이거 2바이트짜리 문자스트림이구나 생각! Writer야? 문자스트림이네
		// 앞에 XXX 하고 Writer로 끝남, XXXWriter 라고 생김, 우리 어디로 빼나요? File로 빼니까 FileWriter
		// FileWriter : 파일로 데이터를 2Byte단위로 출력하는 스트림
		
		/*
		
		// 0. 스트림선언, 나중에 약속을 지켜야(반납해야) 하니까, 선언하고 초기화까지
		FileWriter fw = null;
		
		try {
			
			// 1. 스트림생성
			fw = new FileWriter("b_char.txt");
			
			// 2. 데이터출력 => write()
			// 1바이트 바이트스트림과 다른점! 시원하게 뽑을 수 있음! 2바이트짜리 바이트스트림이니까~ 이친구 문자스트림, 문자열로 시원하게 나갑니다
			fw.write("와..IO..신기하당..");
			fw.write("E");
			
		} catch(IOException e) {// IOE가 FNF보다 부모클래스임
			System.out.println("다시 시도해주세요");
		} finally {
			
			// 3. 자원반납 => 꼭 지켜야하는 약속 => close()
			try {
				
				if(fw != null) {
					fw.close();
				}
				
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
		// 약속 안지켜서 얘가 계속 열려있다고 생각함, 파일 열면 아무것도 없음 --> finally 작성! close 해주기
		
		*/
		
		// try하고 괄호를 열고닫으면서, 괄호안에 스트림 만드는 부분을 넣어버림
		try(FileWriter fw = new FileWriter("c_char.txt"); Scanner scanner = new Scanner(System.in)) {
			
			// try 안에서 쓰고싶은거 씀
			fw.write("와..IO..gg..");
			fw.write("E");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		// 이렇게 하면 끝, 자원반납 알아서 해줌, 어디서 나가든 나가면 알아서 해줌, 만약에 스트림을 여러개 해야한다(자원 반납할게 여러개다)면 소괄호 안에 세미콜론 쓰고 다 넣음
		// 자기가 알아서 반납함, 정확히 표현하면 try 블록이 끝나거나 catch 블록이 끝나면 여기서 나가기 이전에 소괄호 안에 있는 친구의 close 메소드를 호출		
		// 사람이 하는 혹여나 할 수 있는 실수를 줄이는 문법
		
		/* 
		 * try ~ with ~ resource 구문
		 * 
		 * - JDK 7이상부터 사용가능(아예 구닥다리에서는 못씀)
		 * 
		 * try(스트림객체생성; ...) {
		 * 		예외가 발생할 수도있는 구문;
		 * } catch(예외클래스 e) {
		 * 		예외가 발생했을 때 실행할 구문;
		 * }
		 * 블럭이 끝나는 시점에 close()를 호출해서 자동으로 자원을 반납해줌
		 * 혹여나 할 수도 있는 실수를 줄일 수 있는 아주 훌륭한 문법(자원반납은 꼭 해줘야하는것, 자원반납할때 쓰는 예외처리도 꼭해줘야하는것, 그런것들을 얘가 대신해주는 알찬 친구)
		 * 대전제 : Closeable를 구현할 것
		 * 
		 */
		
		// 주의사항! 편한 문법이긴 한데 자동으로 자원 반납을 해주는 로직이 close()메소드 호출하는것임
		// close메소드가 있어야만 반납이 가능하지! 소괄호 안에 들어있는게 반드시 Closeable이라는 인터페이스를 구현해야함!!
		// close메소드는 Closeable인터페이스에 있음, 이 인터페이스를 구현하고 있지 않은 친구는 자동으로 자원 반납을 할 수 없음
		// Closeable 인터페이스를 구현하는 친구일 것 이거 안돼있으면 써봤자 반납안됨
		// FileWriter도 실질적으로 구현한 것은 아니지만 부모클래스 끝까지 가면 Closeable 인터페이스를 구현하고 있기 때문에 이게 가능함
		
	}
	// 얘는 쩨쩨하게 영어 숫자 안나눈다 한글도 문자열도 시원하게 잘나옴
	
	// 시원한거 배운김에 이런거 해보자!
	// TIL --> Today I Learned --> 개발자해야겠다 하면 오늘배운내용으로 일기를 씀
	// 주의점 : 내용은 매일 다르겠지만, 양이 중요한 건 아니고, 성실함을 어필하기 위한 것이므로 아무리 작은 내용이라도 매일 써야함
	// 안에서 어떻게 생각하는지 보여주는 것도 중요하긴 하지만 하루도 빠짐없이 매일 써야함, 빠지면 제출용이 아니라 내 학습용이 되므로 핑계가 들어가면 안됨ㅎㅎ
	public void writeTil() {
		
		// 사용자에게 오늘 학습내용을 입력받아서
		// 외부 파일에 내용을 출력
		
		// 기왕 하는거 신경써서 해보자! 파일명은?
		// 내보낼 파일명은 : 2025년 08월 14일 오늘의 학습일지
		// 내보내는거 앞에 오늘 날짜가 붙도록! 오늘 날짜를 붙여서 내보내보자!
		// 자바에서는 날짜 관련된걸 다룰 때 Date라는 친구를 씀~
		// Date 객체를 만든다
		Date now = new Date(); // sql의 Date는 나중에 배울거니까 util걸로 import!
		// System.out.println(now); // Thu Aug 14 17:21:40 KST 2025 --> 이런 모양으로 나오니까 가공하고싶다
		// 2025년 8월 14일 모양으로 바꿔보자~ 내가 원하는 형태로 바꾸기 위해서는? 형태(포맷)을 바꾸고 싶은것이므로 포매팅한다고 함
		// 날짜를 문자열로 포매팅하고싶은것 --> 자바의 SimpleDateFormat이라는 클래스를 씀 --> 포매팅할 형식 지정
		String titleDate =  new SimpleDateFormat("yyyy년 MM월 dd일").format(now);
		// 월을 가져오고싶으면 대문자M 써야함 소문자 m은 분을 가져옴 --> 나머지는 HH시 mm분 ss초
		// 반환형은 스트링이므로 스트링 타입으로 받아줌
		// System.out.println(titleDate); // 현재시간을 기준으로 가져오기때문에 바꿀일이 줄어들게됨
		
		// 파일명은 실질적으로 어떻게 되는가?
		// String fileName = titleDate + "오늘의 학습일지.txt"; // 이러면 뭔가 마음에 안드는데?
		// 오늘 오전에 배운거! 문자열과 문자열의 더하기를 참으면 안된다!!! --> 이렇게 더하기를 쓰지 말고 스트링버퍼를 쓰든 스트링 빌더를 쓰자!
		StringBuilder sb = new StringBuilder();
		sb.append(titleDate);
		sb.append(" 오늘의 학습일지.txt");
		
		// 여기까지 파일명 만든거고.. 외부로 데이터 출력하는 것과는 아무관련없죠
		
		// 출력하려면? 출력용 스트림이 있어야 함! 우리가 영어에 능수능란하게 작성할수있는건 아님, 오늘배운내용은 한글로 쓸래. 출력용 스트림중에 필요한것은? FileWriter
		// 바이트스트림쓰면 오늘배운내용 영어로 써야함 쉽지않음...
		FileWriter fw = null; // 여기서 선언 및 초기화할수없음! 약속을 지켜야하니까
		
		// 여기서 끝이 아님! 직접 입력받을것을 내보낼것이므로 스캐너 필요
		Scanner sc = new Scanner(System.in);
		
		// 선언하고 이제 진짜 스트림 생성!
		try {
			
			fw = new FileWriter(sb.toString()); // 파일명은 정해졌음, sb에 있는걸로 할것임, toString 해서 문자열로 내보내서 만들것임
			// sb로만 들어가면 String 타입이 아니어서 들어갈 수 없음, sb있는거 찍을때는 toString으로 문자열로 바꿔서 보내줘야함, 그럼 append 된 친구가 나옴!
			// 그냥 여기만 두면 아픔 --> 예외처리해줘야함!
			
			// 입력을 받아보자!
			System.out.print("내용을 한 번 작성해보시오 > ");
			String content = sc.nextLine();
			fw.write("오늘 학습한 내용 : \t" + content); // 근데 이러면 문자열과 문자열의 더하기라 참을 수 없지만 메모리 낭비를 선택해버림..ㅎ
			
		} catch(IOException e) {
			System.out.println("비상 비상 문제발생 비상 비상");
		} finally {
			
			try { // 반납할게 두개임, if문이 두개가됨
				
				if(sc != null) sc.close();
				if(fw != null) fw.close();
				
			} catch(IOException e) {
				System.out.println("자원 반납을 하다가 문제 발생 비상 비상 비상");
			}
			
		}

		// 약속이라 꼭 하긴 해야하는데 반납하기 너무 귀찮다 ㅠㅠ 중요한 건 try에 적을건데, 지금은 두개밖에 없는데 나중에 더 배우고 반납할게 많아지면? 더귀찮아짐
		// 사람하는 일이니까 깜빡하고 finally 쓰기를 빼먹거나 이럴 수 있음, 억지로 닫아주지 않으면 반납이 안됨
		// 스트림을 만들고 닫아주는건 꼭 해야함, 닫아주면서 예외처리도 해주고 널체크도 해야함 다 꼭 해야함
		// 이걸 줄일 수 있는 방법이 있다
		// OutputToFile 메소드에서 0번부터 3번까지 주석처리하고 똑같이 구현해보심
		
	}
	
}
