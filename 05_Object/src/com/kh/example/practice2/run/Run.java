package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {
	
	// 실행용 메소드
	public static void main(String[] args) {
		
		// 기본 생성자를 통해 Product type의 객체를 생성
		Product product = new Product();
		
		// information()을 이용해 출력
		product.information();
		
	}

}
