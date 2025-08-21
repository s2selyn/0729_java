package com.kh.run;

import com.kh.controller.StringController;

public class Run {

	public static void main(String[] args) {
		
		StringController sc = new StringController(); // import 해야함!
		
		sc.method1(); // 호출하니 잘 나옴, 문자열이 잘 대입되었다! 말이되는가?
		
		// sc.method2();
		
		// sc.method3();
		
		// sc.method4();
		
		// sc.stringMethod();
		
		// sc.split();
		
	}

}
