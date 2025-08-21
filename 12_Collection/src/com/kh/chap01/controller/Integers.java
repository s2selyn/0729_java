package com.kh.chap01.controller;

import java.util.Arrays;

public class Integers {
	
	// 외부에서 이친구가 갖고있는 것을 못건드려야하고,
	// 일단 자바에서 정수를 여러개 다룰 수 있는 방법은 배열밖에 없음 --> 배열로 해야겠다!
	private int[] integers; // int형 배열을 선언해놓고
	private int size; // 얘가 지금 몇 칸 찼는지 size같은것도 해놓음

	// 이 친구를 만들면 기본생성자로 생성하면 이 친구는 기본적으로 3칸짜리를 만들어줘야겠다.
	public Integers() {
		integers = new int[3];
	}
	
	// 이번에는 setter라고 하기에는 integers에 값을 대입하는 게 아니라, integers가 가진 인덱스에 값을 대입해야되는거니까 add라고 해봄
	public void add(int element) { // 밖에서 여기에 접근해서 요소에 밸류값을 추가하려면 메소드에 뭔가 있어야겠지? 밖에서 얘를 불러서 integers에 밸류를 넣으려면? 매개변수가 있어야함, 정수형 배열에 요소를 넣을거니까 매개변수는 타입이 정수(int형)
		
		if(integers.length == size + 1) {
			
			integers = Arrays.copyOf(integers, (integers.length * 2)); // 복사하는 방법, 원본 배열 넣고, 크기는 원본 배열의 길이의 두배, 이렇게만 하면 add 할때마다 배열이 두배로 늘어남
			// 배열 인덱스에 요소가 다 차서 공간이 부족할때만 늘리고 싶음 --> 조건!
			// size + 1과 같아질때마다 배열의 크기를 늘릴것임
			
		}
		
		integers[size++] = element; // 인덱스의 앞에서부터 차곡차곡 넣으면 되니까 0, 1, 2, 그걸 위해서 필드를 하나 만들어뒀음(size) --> 초기화 안했으니까 기본값은 0일것
		// size에 후위연산 이용해서 요소를 넣어줌
		
	} // 이렇게 하면 첫번째 add 할때는 0번 인덱스에 대입될거고, 두번째 add할때는 1번 인덱스에 대입될거고, 세번째 add할때는 2번 인덱스에 대입될것임
	
	// 정확히 필드값을 get 하는 것은 아니니까 그냥 get이라고 함, get을 할 때 항상 뭐가 필요함? 뭘 받아야 get을 해줄 수 있음? 반환형은 int형을 돌려줌, 요소값을 int형을 돌려보내는거니까, 뭐가 있어야지 값을 뽑아서 get을 해주려면 index가 있어야하고 index를 받아야하니까 매개변수가 있어야함 --> 매개변수 타입은 index를 받아야하니까 int가 필요함
	public int get(int index) {
		if(integers[index] == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return integers[index];
	}
	
	// 요소에(integers에) 잘 들어갔는지 확인도 해봐야함 --> toString 메소드 오버라이드
	@Override
	public String toString() {
		// return Arrays.toString(integers); // 배열의 요소 찍는거니까 그냥 Arrays것 사용
		
		// String의 toString 메소드 베껴옴
        if (integers == null)
            return "null";
        int iMax = integers.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; i < size; i++) {
            b.append(integers[i]);
            if (i+1 == size)
                return b.append(']').toString();
            b.append(", ");
        }
        
		return null;
		
	}
	
}
