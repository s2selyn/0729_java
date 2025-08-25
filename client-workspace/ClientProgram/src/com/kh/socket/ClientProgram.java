package com.kh.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {
		
		// sealed는 상속할 때 어떤 클래스를 상속할 수 있는지 지정할 수 있는 것(우리는 쓸 일 없음)
		
		/*
		 * 클라이언트 측 프로그램 작성 절차
		 * 
		 * 서버소켓 이런거 필요없이 그냥 바로 소켓 만들어버림
		 * 클라이언트는 전화들고 전화하면 끝, 근데 일단 이게 있어야함
		 * 1) 요청하고자하는 서버의 IP주소와 Port번호를 지정
		 * 
		 * 1을 가지고 이제 연결요청
		 * 2) 서버에 연결요청 보내기 => Socket객체 생성(IP주소, Port번호)
		 * 이 아래는 서버랑 똑같음
		 * 
		 * 3) 서버와 통신할 수 있는 입/출력 스트림 생성
		 * 
		 * 4) 보조스트림 달기
		 * 
		 * 5) 스트림을 통해 데이터 주고받기
		 * 
		 * 6) 자원반납 끝!
		 * 
		 */
		
		// 클라이언트용 프로그램
		Scanner sc = new Scanner(System.in);
		
		// 자원반납을 위한 참조변수 선언 및 초기화
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 1) 요청하고자하는 서버의 IP주소와 포트번호 지정
		// 요청하고자 하는 IP주소 : 내 PC의 IP주소(서버) == 127.0.0.1(루프백 IP, 어떻게 쓰든 내거라는 의미)
		// 						LoopbackIp		== localhost(???)
// 16:23 지금 서버랑 클라이언트가 같은 컴퓨터니까
// 루프백 아이피 설명
		// 요청하고자 하는 Port번호 : 1024(아까 서버에서 설정했던것), 이걸 알아야 서버에 요청을 보낼 수 있음(소켓을 달 수 있음)
		// 가독성을 위해서 변수로 빼놓을게요
		String serverIp = "127.0.0.1";
		int portNumber = 1024;
		
		// 2) 서버에게 연결 요청 보내기 => (그냥 소켓 만들면 연결 요청임)Socket객체 생성 시 인자를 전달하면됨
		// 전달할 인자값은 첫 번째 : 서버의IP주소:String, 두 번째 : Port번호:int
		try {
			
			socket = new Socket(serverIp, portNumber);// 얘는 어쩔 수 없음, IP잘못적었을 수 있고 Port 안열려있을수있음, 납득이 간다
			// 연결 성공하면 연결 객체 주소 들어오고, 실패하면 null 들어옴, 위에서 null로 초기화했으니까
			// 연결 실패시 null
			
// 16:28 성의있게 해주기^^ 소켓이 null이 아닐때만 작업을 하겠다
			if(socket != null) {
				
				// if문 안에 들어왔다는 것은
				// 서버와의 연결이 성공했다~~~~~~~~~~
				System.out.println("서버와의 연결에 성공했습니다!");
				
				// 3) 입/출력용 스트림 소켓객체로 받아오기 +
				// 4) 보조스트림 달기
				// 3, 4를 한번에 시원하게 하겠습니다, 코드는 아까랑 똑같음
				
				// 입력용
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				// 출력용
				pw = new PrintWriter(socket.getOutputStream());
				
				// 다했어요. 시원하게 이제 데이터 주고받기 하면 됨
				// 5) 데이터 주고받기
				while(true) {
					
					// 서버로 데이터 출력하기
					System.out.println("그만 하고 싶으시면 그만 하고 싶어요를 입력해주세요.");
					System.out.print("보내고픈 메시지 > ");
					String sendMessage = sc.nextLine();
					
					// 클라이언트가 그만하고싶으면 그만 하고 싶어요를 입력하게 할거고, 그러면 그만하게 할것임
					if("그만 하고 싶어요".equals(sendMessage)) {
						break; // 반복문 탈출
					}
					
					// 그게 아니라면 서버로 출력
					pw.println(sendMessage);
					
					// 스트림에 있는거 강제로 내보내기
					pw.flush();
					
					// 반대로 서버가 보낼수도 있음
					// 서버로부터 입력받기
					String message = br.readLine(); // 시원하게 한줄씩 입력받자
					System.out.println("띵똥 메시지가 도착했어요 > " + message);
					
				}
				
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
// 여기 제대로 작성했는지 확인해야함! 6) 자원반납 => 생성의 역순으로
			
			try {
				
				if(pw != null) {
					pw.close();
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				
				if(br != null) {
					br.close();
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				
				if(socket != null) {
					socket.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			// 스캐너는 이것의 영향을 받지 않으므로 먼저 닫아도 됨.. 그치만 해야하는 순서대로 하자!
			try {
				
				if(sc != null) {
					sc.close();
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
