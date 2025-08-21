package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class ByteRun {

	public static void main(String[] args) {
		
		FileByteDao fbd = new FileByteDao();
		// fbd.outputToFile(); // 무소식이 희소식! 새로고침하면 "a_byte.txt" 파일 생김
		
		fbd.inputFromFile();
		
	}

}
