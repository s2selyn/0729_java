package com.kh.chap04_assist.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	// 보조 스트림의 특징
	// 기반스트림이 input / output 계열일 경우
	// 보조스트림도 input / output 계열을 사용
	
	// 기반스트림이 Reader / Writer 계열일 경우
	// 보조스트림도 Reader / Writer 계열을 사용
	
// 11:47 문자스트림이냐 바이트스트림이냐에 따라서 정해져있음, 아무거나 갖다쓸 수는 없음!
	
	// BufferedReader / BufferedWriter
// 11:47 얘네 보조스트림임! 그럼 기반스트림도 문자스트림을 써야함, input/output에는 붙일 수 없음
	
	// -> 속도 향상이 목적인 보조스트림
	// -> 임시공간을 제공해서 한 번에 모아두었다가 한꺼번에 입/출력을 진행
	// 임시저장공간에 차곡차곡 모았다가 한번에 보내서 속도 향상을 노린다! 체감하기는 힘들다, 요새는 컴퓨터 성능이 다들 좋으니까
	
	// 빠름!
	// [ 표현법 ]
	// 기반스트림클래스이름 기반스트림 = new 기반스트림생성자(외부매체인자값);
	// 보조스트림은 보조스트림만 있을 수 없음, 반드시 기반스트림이 있어야 쓸 수 있음!
// 12:01 인자로 기반스트림 주소값을 전달해야 함!
	// 보조스트림클래스이름 보조스트림 = new 보조스트림생성자(기반스트림);
	
	// 출력은? 프로그램에서 밖으로 데이터를 내보내면 출력! 파일로 출력해보자
	// 출력
	public void outputFile() {
		
		// BufferedWriter
		
		// 순서!
		// 0. 변수 선언!
// 12:03 기반스트림이 있어야함, 예외발생, try에 넣어야함, 반납해야함, --> ?
		FileWriter fw = null;
		// 보조스트림도 같이 선언해서 사용
		BufferedWriter bw = null;
		
		try {
				
			// 먼저 선언부터 하고, 객체 생성은 따로 할 것이다.
			// 1. 객체 생성
			fw = new FileWriter("c_buffer.txt"); // 이렇게 하면 빨간줄! --> 예외처리 해줘야함, try로 들어가야함
			
			// 이번에는 보조스트림도 생성할것이다!
			bw = new BufferedWriter(fw); // 이렇게 하면 또 빨간줄! --> 보조스트림은 스트림인데, 내 파일이랑 자기가 붙을 수 없음, 기반스트림에 붙이는 옵션! 기생충, 숙주가 없으면 살아남을 수 없음, 만들 때 어디 스트림에 붙을건지 생성자 인자값으로 기반스트림 주소를 전달해야함 --> 소괄호에 fw
			// 이다음에는 할거 하는거지!
			// 2. 출력 => write()
			bw.write("하이~~~");
			bw.newLine(); // bufferedWriter에 있는 메소드, 개행하기
			bw.write("반가워용~~");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			// 여기다 쓰는 게 맞음, 근데 선생님은 우리가 무조건 여기다 써야된다고 생각은 안했으면 좋겠음
			// 얘는 사실 지금 우리 코드에서는 큰 의미가 없음, 얘가 의미가 있으려면 리턴하는 코드가 있어야 코드상으로 의미가 있음
			// 물론 여기 안에 적으면 의미상 얘는 무조건 해야돼, 무조건 할거야 하는 의미로 적는게 있어서, 유지보수, 가독성 부분에서 강점이 있음
			// 코드상으로 꼭 필요한 것은 아님. 여기에 쓰는게 정답인데 지금상황에서 무조건 필요한거냐? 그건 아님, 필요에 의해서 쓰는 것
			
			// 3. 자원반납 => close()
			// 자원반납은 반드시 생성의 역순으로 반납
			try {
				
				if(bw != null) { // NullPointException 예외처리
					bw.close(); // --> 예외 처리 해야함!, 이건 보조스트림 반납임, 기반스트림도 반납해야함
				}
				
				/*
				if(fw != null) {
					fw.close();
				}
				*/
				
			} catch(IOException e) { // 코딩컨벤션, 회사가면 다 있을것임, 로마가서 로마법을 따르면 되는데 까다로움
				e.printStackTrace();
			}
			
			// 1. 지금 코드가 기반스트림이 null인지 체크한 다음에 close 호출, 근데 기반스트림 닫히면 보조스트림 못닫음
// 12:20 기반스트림 닫으면 접근할 수 있는 매개체가 없음
			// 2. finally는 무조건 하는 친구임, 여기 와서 먼저 보조스트림을 닫을것임, 보조스트림을 닫다가 IOE가 발생할 수 있어서 예외처리를 해뒀음, 근데 예외처리하면? catch가 잡아감, 기반스트림을 못닫게됨
			// catch 다음으로 나가야함, 근데 나가면? 닫다가 IOE 발생할 수 있으므로 try-catch 해줘야한다
			
			try {
				
				if(fw != null) {
					fw.close();
				}
				
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	// 입력을 안받아보면 서운하죠
	// 입력
	public void inputFile() {
		
		// FileReader를 기반으로 BufferedReader를 사용해서 입력받기
		
		// 0. 변수 선언(인데 3번에서 자원반납 해야함, 솔직히 말해서 끔찍함...ㅎ 지금이야 두개지, 계속 늘어날것임, 그래서 우리가 뭘 배웠나요!)
		try(BufferedReader bfr = new BufferedReader(new FileReader("c_buffer.txt"))) {
// 12:28 생산성도 좋아지고, 자원반납을 해야하는데 순서를 거꾸로 했거나, 하나 반납하는걸 까먹었거나 그럴 걱정이 없다!
			
			String str = "";
			
// 12:29 BufferedReader의 좋은점! 시원하게 한줄씩 읽어옴 --> 뭐랑 비교?
			while((str = bfr.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
