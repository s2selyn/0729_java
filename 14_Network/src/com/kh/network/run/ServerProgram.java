package com.kh.network.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

	public static void main(String[] args) {

		// 서버의 역할을 할 친구, 통신을 소켓을 쓸것임
		// 웹통신은 문자메세지같은것.
		// 클라이언트가 서버에게 문자메세지를 보내면 서버가 응답을 보내줌
		// 소켓통신은 전화같은것, 전화하려면 둘다 계속 전화기를 들고있어야하고, 전화하는 동안에는 둘이 계속 연결되어있음
		// 자원을 많이 소모한다는 뜻
		
		/*
		 * 통신을 하기 위해서는 데이터 전송 이전에 서버와 클라이언트의 연결이 필요함
* 15:15
		 * ServerSocket
		 * - 포트번호와 연결(Bind)해서 외부의 연결요청을 기다리다가 연결요청이 들어오면 수락해줄 용도
		 * - 수락하는 순간 서버의 Socket객체 생성(전화기가 만들어진다는 뜻)
		 * 
		 * 서버는 항상 대기상태, 클라이언트가 요청할때까지
		 * 자기가 알아서 수락함
* 서버 소켓 열어두면 수락하고 어쩌구...
		 * 
		 * Socket
		 * - Process간의 통신을 담당
		 * 
		 * 데이터를 출력하고 데이터를 입력받음 --> 이러려면 스트림이 있어야함! IO해야지
		 * - Socket객체를 이용해서 통신을 위한 기반스트림 InputStream / OutputStream을 제공받음
		 * 데이터 주고받을 때 영어 숫자 특수문자밖에 안될것임
		 * 한글같은거 주고받고싶으니까..
		 * - 기반스트림만으로는 제약이 있으니 보조스트림을 사용할 것!
		 * 
		 * -- 소켓통신용 서버측 프로그램 작성 절차
		 * 
		 * 1) 포트번호 지정(서버측에서 몇 번 포트를 열어둘 것인지)
		 * 포트가 열려있어야지 올라감, 나중에 방화벽 친구들이 들어오면 서비스하는 포트만 열어둠, 기본적으로 모든 포트를 방화벽에서 다 열어놓으면 공격의 대상이 됨, 포트 열렸나 안열렸나 체크하는걸로 공격할 수 있음
		 * 보안 관련 장치들이 들어오면 내가 서비스하는 포트만 열어둬야해서 지정해두는것
		 * 
		 * 2) ServerSocket객체 생성 => 생성자 인자값으로 포트번호 전달(포트결합/Binding)
		 * 
		 * 3) 대기상태 돌입
		 * 
		 * 4) 클라이언트가 연결요청을 하면 수락 후 통신가능한 Socket객체를 반환받음
		 * 
		 * 5) Socket객체를 이용해서 입/출력용 스트림을 열어주기
		 * 단점 : 소켓 객체를 가지고 스트림을 받을건데, 이게 1바이트짜리 바이트스트림, 좁은거란말이야
		 * 
		 * 6) 보조스트림을 추가하여 성능 개선
		 * 
		 * 7) 데이터 주고받기
		 * 
		 * 8) 자원반납
		 * 
		 */
		
		// 서버 프로그램 구현해보기
		// 서버측 프로그램
		// 나중에 스트림 쓴다니까 마지막에 자원반납 해줘야해서
		
		// 0) 필요한 변수 세팅
		Scanner sc = new Scanner(System.in); // 사용자에게 입력받아서 보낼거라서
		
		// 자원반납을 위해 미리 참조변수 선언 및 null값으로 초기화
		// 서버 역할을 하기 위한 클래스 --> ServerSocket 클래스
		ServerSocket server = null;
		
		// 서버도 클라이언트한테서 입력받고 클라이언트에게 출력해줘야 하므로
		PrintWriter pw = null;
		BufferedReader br = null;
		// 미리 선언함, 반납하기 편하려고(try 블록 안에 넣을거니까)
		
		// 1) 서버에서 열어둘 포트번호 지정
		// 몇번을 열어놓을 지 정수값으로 지정하면 됨
		int portNumber = 1024;
		// well-known 포트가 있음 --> 충돌이 있을 수 있어서 쓰지말라는것
		// 0번부터 65535(2바이트 크기)까지 가능한데, 0번부터 1023까지는 잘 알려진 포트들이 사용하고 있음
		// 1024부터 45151은 마음대로 써도 됨
		// 1024로 ㄱㄱ
// 15:25 나중에 웹개발 할때는 80, 443, 8080 세개중하나로 정해져있음
		// 소켓 프로그래밍은 새로운 통신방식(프로토콜)을 만드는거라고 설명하기도 하는데 그것까진 아닌 것 같다고 하시네요
		
		try {
			
			// 2) ServerSocket객체 생성 및 포트결합(bind)
			server = new ServerSocket(portNumber); // Unhandled exception type IOException
			
			// 서버 객체를 올리는데, 몇 번 포트에 올려놓을건지 정해야함, 그래서 1)에서 포트번호를 지정
			// 올림과 동시에 포트 결합을 해줘야함 --> 인자로 넣어주면 됨
			
			// 이러면 올라가면서 항상 대기상태가 됨
			// 항상 대기상태 클라이언트가 연결요청을 할 때까지 하염없이 기다림
			// 3) 대기상태
			System.out.println("나는 하염없이 기다린다........");
			// 실행하면 서버 올리는거라서 네트워크 경고창 뜸, 과감하게 액세스 허용!
			
			// 4) 연결요청이 오면 수락 후 해당 클라이언트와 통신할 수 있는 서버 측 Socket객체 생성
			// 메소드 호출하면 끝!
			// ServerSocket클래스의 메소드로 accept() : Socket객체 반환
			Socket socket = server.accept(); // 사실 얘까지 해줘야 찐으로 하염없이 기다리는 상태가 됨
			// 콘솔창에 빨간 네모! 클라이언트 언제오나 기다리고 있음 --> 이렇게 하염없이 기다리면 안되잖아요ㅠ
			// 클라이언트가 연결에 성공할 때 까지 여기서 대기함
			
			System.out.println("클라이언트와의 연결 성공!");
			// 이 아래로 내려왔다는 뜻은 클라이언트와 연결했다는 뜻
			// 소켓 객체를 이용하면 클라이언트의 정보를 반환받을 수 있음
			// socket객체를 이용해서 Client의 정보를 반환받을 수 있음
			System.out.println(socket.getInetAddress().getHostName());
			
			// 5) 클라이언트와 통신할 수 있는 입/출력용 스트림 생성
			// 6) 보조스트림을 추가해서 성능 개선
			// 5, 6 동시에 할것
			// 입력받는거 인풋!
			// socket에 getInputStream하면 나옴, 얘를 기반스트림으로 쓸것임, 한글 못읽어오니까 bufferedreader 쓸것임
			// socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 버퍼로 시원시원하게 땡겨오는거 쓰고싶은데! 얘 보조스트림임, 기반스트림으로 InputStream 쓸건데 이게 가능한가?
			// InputStream은 바이트스트림인데 BR은 문자열용 보조스트림임 --> 그래서 보조스트림을 하나 더 써야함 --> InputStream과 Reader를 호환시켜줄수있는 보조스트림
			// InputStreamReader
// 15:38 아악
// 보조의 보조스트림 작성과정
			// socket에서 제공하는 입력용 기반스트림 => InputStream => 1Byte
			// 바이트스트림과 문자스트림을 호환해줄 수 있는 보조스트림 => InputStreamReader(보조의 보조!)
			// 속도향상, 한글전달도 위한 입력용 보조스트림 => BufferedReader => 2Byte
			// 얘는 입력용 스트림
// 15:43 뭐하면 좋다고?
			
			// 출력용 스트림(서버가 클라이언트에게 데이터를 전송하기 위한 스트림)
			pw = new PrintWriter(socket.getOutputStream()); // 안배운 친구 써보자, 위에서 너무 번거로웠음
			// 소켓에서 받아오는 output 스트림은 이름만 봐도 바이트스트림
			// 프린트라이터 보조스트림인데 이름만 봐도 문자스트림
			// 둘이 또 호환이 안될것임 --> 아웃풋 스트림 라이터가 있어야되겠지, 근데 프린트라이터는 그런거 신경안씀
			// PrintWriter는 2Byte짜리 문자용이지만 1Byte짜리도 시원하게 사용이 가능
			// 그러면 입력용은 없냐? 없습니다.
			
			// 다했당 드디어 이제 데이터 주고받기 ㄱㄱ
			// 7) 데이터 주고받ㄷ기
			// 소켓은 계속 연결되어 있는 상태니까 클라이언트가 나 그만할래 할때까지 주고받을 수 있다고 가정해보자
			// Client와 데이터를 주거니 받거니 하도록 구성
			// 반복해야지 뭐
			while(true) {
				
				// 7_1) 입력받기
				String message = br.readLine(); // 시원하게 한줄씩 읽음!
				System.out.println("클라이언트로 부터 받은 메시지 : " + message); // 먼저 클라이언트가 데이터를 보낸다고 가정
				if(message.equals("null")) {
					break;
				}
				// 7_2) 출력하기
				System.out.print("클라이언트에게 보낼 메시지 > ");
				String sendMessage = sc.nextLine();	// 스캐너로 한 줄 입력받아서
				pw.println(sendMessage);// println하면서 보낼 수 있음, 개행하면서 보내기
				
// 15:49 여기까지 한 사이클 돌면 호출해야 하는 메소드가 있음
				// 스트림에 있는 데이터를 강제로 내보내는 메소드
				pw.flush();
				
// 15:49 주거니받거니하다가 클라이언트가 연결 끊으면 그만하는걸로 구현할것임
				
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			// 8) 자원 반납 => 생성의 역순으로
			try {
				
				if(pw != null) {
					pw.close();
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				
				if(sc != null) {
					sc.close();
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				
				if(br != null) {
					br.close();
				}
				
			} catch(IOException e) {
				e.printStackTrace();
			}
			
			try {
				
				if(server != null) {
					server.close();
				}
				
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
