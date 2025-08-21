package com.kh.chap01.run;

import com.kh.chap01.condition.A_If;
import com.kh.chap01.condition.B_Else;
import com.kh.chap01.condition.C_Switch;

public class Run {
	
	public static void main(String[] args) {
		
		// 메서드 호출하려면?
		// 1. import(Ctrl + Shift + o)
		A_If a = new A_If();
		
		// 2. 별칭
		// a.method1();
		
		// a.method2();
		
		// a.lunchMenu();
		
		// a.method3();
		
		// a.method4();
		
		// a.myKiosk();
		
		B_Else b = new B_Else(); // import
		// b.method1(); // 메서드 호출
		
		// b.method2();
		
		// b.ageCheck();
		
		C_Switch c = new C_Switch();
		// c.method0();
		
		// c.method1();
		
		c.login();
		
	}

}
