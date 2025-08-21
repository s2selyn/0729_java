package com.kh.chap05.run;

import com.kh.chap05.model.vo.Hiphop;
import com.kh.chap05.model.vo.Jazz;
import com.kh.chap05.model.vo.MusicI;

public class Run {

	public static void main(String[] args) {
		
		// 인터페이스는 객체생성을 할 수 없지만, 다형성을 적용해서 부모자료형으로 사용할 수 있음
		MusicI hiphop = new Hiphop();
		MusicI jazz = new Jazz(); // 부모클래스로 만들수있음
		hiphop.play();
		jazz.play(); // 재생가능~
		
	}

}
