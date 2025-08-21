package com.kh.chap04_assist;

import com.kh.chap04_assist.model.dao.BufferedDao;
import com.kh.chap04_assist.model.dao.ObjectDao;

public class AssistRun {

	public static void main(String[] args) {
		
		BufferedDao bd = new BufferedDao();
		
		// bd.outputFile(); // 무소식은 희소식이라는 뜻! refresh해보면 파일이 생김! 출력이 잘 된다는 뜻!
		// 우리는 체감이 잘 안됨
		
		// bd.inputFile();
		
		ObjectDao od = new ObjectDao();
		
		// od.outputFile(); // 무소식이 희소식인데, 무소식이 아니라는 것은? 예외가 발생함 --> NotSerializableException
		// Serializable 직렬화 해야함, 파일은 생겼는데, 예외가 일어난 내용이 출력됨
		// 내 프로그램이 있고, 외부 파일이 있음
// 12:42 바이트스트림을 생성했음, 지금 쓰는 스트림은? 직렬화의 의미
		// 직렬화 해주고 다시 실행하면 무소식
		
		od.inputFile();
		
	}

}
