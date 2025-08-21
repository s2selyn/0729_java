package com.kh.constant;

public class Constant {
	
	// * 상수
	// 변하지 않는 값(수학 익힘책)
	
	public static void main(String[] args) {
		 
		// 자바에서 다룰 수 있는 값들의 형태
		// 정수(양수, 음수)
		
		System.out.println(8); // print는 출력 기능을 가진 메서드, 괄호로 끝남
		// 컴퓨터가 봤을 때 얘는 정수 8
		
		System.out.println('8'); // 컴퓨터가 봤을 때 얘는 단일 문자 8
		System.out.println("8"); // 컴퓨터가 봤을 때 얘는 문자열 8
		// 사람이 봤을 때는 똑같이 8로 보이지만 컴퓨터가 봤을 때는 다르게 생겼다고 인식함
		// 자료형; 자료의 생김새가 다르게 생겼다, Data type
		
		System.out.println(-8); // println을 호출, print line을 줄인 것
		
		System.out.println("----------");
		
		// 실수(.)
		
		System.out.println(0.8);
		System.out.println(-0.8);
		
		// 앞에서 다룬 print 메서드에서 ""를 썼는데 정수와 실수는 ""없이도 사용되었음
		// (단일)문자, 문자열(문자열은 나중에 이름을 바꿀 것)
		
		System.out.println('금'); // ''는 단일 문자를 다룰 때 사용함, '금 10돈'은 불가능
		System.out.println("금 1000돈"); // 문자열을 다룰 때는 ""사용
		
		// 논리값(true, false)
		
		System.out.println(true);
		System.out.println(false);
		
		
	}

}
