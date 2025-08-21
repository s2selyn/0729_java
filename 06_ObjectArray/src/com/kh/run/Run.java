package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class Run {

	public static void main(String[] args) {
		// 아 식당 객체 만들어야지~
		// Restaurant r1 = new Restaurant();
		// System.out.println(r1.information());
		
		// 이번에 만들 프로그램
		// 1절
		// 사용자에게 식당의 정보를 입력받아서
		// 입력받은 식당의 정보를 출력해주는 프로그램
		
		// 2절
		// (그러고 나서) 사용자에게 상호명을 입력받아서
		// 만약에 입력받은 상호와 일치하는 식당이 존재한다면 메인메뉴를 출력해주는 프로그램
		
		// 1절부터
		// 3개의 식당정보를 입력받겠다고 가정
		// 입력받으려면 일단 스캐너가 있어야겠따
		Scanner sc = new Scanner(System.in);
		
		// 중복코드 제거하려고 주석처리함
		/*
		// 그다음에 3개 받아야하니까 필드가 3개씩이니까 총 9개 --> 3개의 필드를 가진 3개의 객체
		System.out.print("식당의 상호를 입력해주세요 > ");
		String storeName = sc.nextLine();
		
		System.out.print("식당의 주소를 입력해주세요 > ");
		String address = sc.nextLine();
		
		System.out.print("식당의 주력메뉴를 입력해주세요 > ");
		String mainMenu = sc.nextLine();
		// 이제 사용자에게 입력받고 입력받은것을 변수에 대입함
		
		// 변수로 관리하지는 않을것임 --> 3개를 어디에 어떻게 관리할건가? --> 3개의 값을 식당 클래스의 필드에 담아서 관리하려고 세개의 값을 받음
		// 각각의 친구들을 지역변수로 관리하는 것이 아니라 식당 클래스의 필드값으로 대입하려고함 --> 세개의 값을 필드에 대입하고 싶다 --> 필드에 대입하려면 전제조건은? 식당이, 이 클래스를 가지고 heap메모리상에 올라가있어야, 올라가있는 공간에 값을 대입할 수 있음
		// 식당을 heap에 올리는 방법은 코드로 어떻게 작성? --> 변수를 선언하고 생성자를 호출해서 주소값을 변수에 대입해줍니다 라고 말할수있다
		Restaurant r = new Restaurant(storeName, address, mainMenu);
		// new 하면 heap에 올라갈텐데, 올라가면 값을 대입하고싶음, 방법 두가지
		// 1번 setter 호출 --> 이건 많이 해봄
		// 2번 생성자 매개변수로 인자값을 전달 --> 이건 한번 해봄
		// 생성자(생성자 호출하면서)로 인자값 넘길때 조심해야 할 부분 --> 매개변수 개수가 같아야 함, 순서도 필드에 대입하고 싶은 순서대로 전달, 자료형도 같은 자료형으로
		// 생성자가 생긴대로!!!
		
		// System.out.println(r.information());
		// 데이터값 입력하고 객체는 이번에 매개변수 생성자 호출해서 --> 생성과 동시에 필드에 값 대입하고 --> information 메소드로 스트링값 반환받아서 --> 콘솔창에 출력하는것까지
		// 하나의 식당 정보를 이렇게 받음
		
		// 이렇게 식당을 3개를 받을거니까 두번 더하자
		System.out.print("식당의 상호를 입력해주세요 > ");
		String storeName2 = sc.nextLine();
		// 변수명 중복돼서 storeName 못씀 
		
		System.out.print("식당의 주소를 입력해주세요 > ");
		String address2 = sc.nextLine();
		
		System.out.print("식당의 주력메뉴를 입력해주세요 > ");
		String mainMenu2 = sc.nextLine();
		
		Restaurant r2 = new Restaurant(storeName2, address2, mainMenu2);
		
		// 모범시민답게 내용확인!
		// System.out.println(r.information());
		// System.out.println(r2.information());
		// 두번째 식당까지 잘 들어옴 --> 변수명만 다르지 똑같이 썼음
		
		// 식당 3개 받기로 했으니까 또 해야함
		System.out.print("식당의 상호를 입력해주세요 > ");
		String storeName3 = sc.nextLine();
		
		System.out.print("식당의 주소를 입력해주세요 > ");
		String address3 = sc.nextLine();
		
		System.out.print("식당의 주력메뉴를 입력해주세요 > ");
		String mainMenu3 = sc.nextLine();
		
		Restaurant r3 = new Restaurant(storeName3, address3, mainMenu3);
		
		System.out.println(r.information());
		System.out.println(r2.information());
		System.out.println(r3.information());
		// 세번 식당의 정보를 입력받고 세번 식당 객체를 만들어서 세개의 객체 정보를 출력하는것까지
		
		// 식당의 세개의 정보를 입력을 받고 --> 입력받은 식당의 정보를 출력해주는 프로그램을 구현함
		*/
		
		// 짧은 코드가 좋다 X, 내가 해야할 작업이 있어서 코드를 쓰다보면 기본적으로 당연히 길어짐, 짦게 쓰는 방법이 있지만 무조건 짧은게 좋은건 아님 --> 제대로 돌아가면 맞게 쓴거임
		// 중복코드는 좋지않다 O --> 개선의 여지가 있는데? 라고 생각할 부분
		// 이 관점에서 따지면 지금 중복코드가 많음, 세번 반복함 --> 중복코드는 어떻게 해주는게 좋은가? 중복을 제거해주는게 좋지 --> 억지로 제거하면(빼면) 할 수 있음
		// 한 번 해보자!
		// 스캐너 아래부터 처음 구현한 3종 출력문 아래의 코멘트까지 주석처리하고옴
		
		// 세번 반복해야하니까 for문으로 감싸주자 --> for문의 소괄호 안에는? 초기식 조건식 증감식
		// 이후에 할 작업은? String storeName[ i +1 ] 로 수정하면 고장남
		// 결국 하려는 작업은 반복하면서 값을 3개 입력받고 --> 이 값들을 객체의 필드에 대입하고싶은것
		
		// 1. 객체를 for문 안에서 선언하면 밖에서 출력문을 쓸 수 없음
		// r은 지역변수이므로 for문 스코프 끝나면 밖에서 못씀 --> 밖에서도 쓸 수 있게 하려면? for문 끝나고 나서 아래에서도 사용하고 싶다면?
		// 안에 있던 객체 선언 Restaurant r = new Restaurant(storeName, address, mainMenu); 를 for문 앞으로 옮김
		Restaurant r0 = null; // 라고 선언만 하고 for문 안에서 대입해야지~
		// 하나만 가지고 돌릴 수 없음, 3개 있어야함
		Restaurant r1 = null;
		Restaurant r2 = null; // 선언만 해둔 상태였음, 출력문 그냥 쓰면  지역변수의 초기화 이전에는 실행할 수 없음 --> null값 대입해서 초기화(참조자료형이므로 초기화 할 때 넣을 수 있는 것이 null밖에 없음)
		// 각각의 변수에 선언해주고, 첫바퀴에는 r0, 두번째에는 r1, 세번째에는 r2로 대입하고싶음 --> for문 안의 r0을 어떻게 해줘야할까...? ri로 바꾸는 것은 안됨, ri는 변수식별자로 인식함(그런건 안만들었는데용)
		// 첫바퀴에는~ 두번째에는~ 세번째애는~ -->  조건! if로 감싸고 else if로 두세번째 구현
		
		for(int i = 0; i < 3; i++) { // 입력받기의 중복을 제거해봄
			// for문은 세개의 공식을 작성해야함 --> 제일 앞은 초기식 --> int i를 0으로 초기화
			// 초기식 다음에는 조건식 --> 몇번 반복? 세번
			// 조건식 다음에는 증감식 --> 1 늘리자 --> i++
			
			System.out.print("식당의 상호를 입력해주세요 > ");
			String storeName = sc.nextLine();
			
			System.out.print("식당의 주소를 입력해주세요 > ");
			String address = sc.nextLine();
			
			System.out.print("식당의 주력메뉴를 입력해주세요 > ");
			String mainMenu = sc.nextLine();
			
			// Restaurant r = new Restaurant(storeName, address, mainMenu);
			// r0 = new Restaurant(storeName, address, mainMenu);
			
			if(/*첫바퀴에는*/ i == 0) {
				r0 = new Restaurant(storeName, address, mainMenu);
			} else if(/*두번째바퀴에는*/ i ==1) {
				r1 = new Restaurant(storeName, address, mainMenu);
			} else {
				r2 = new Restaurant(storeName, address, mainMenu);
			}
			
		}
		
		// 출력문 안에 인자로 넣어줘야함
		System.out.println(r0.information());
		System.out.println(r1.information());
		System.out.println(r2.information());
		// 아까처럼 하면 각각의 레스토랑 객체에 빨간줄생김 --> 왜? 지역변수 --> 사용하기 위해서 반드시 초기화해야함 --> 위에서 초기화를 안해줬음 --> 초기화는 어떻게? 대입해주는데, 대입해주는 값을 null로 해줌, 참조자료형이므로 초기화 할 때 넣을 수 있는 것이 null밖에 없음
		
		// 세개의 값을 입력받아서 하나의 객체를 생성해서 객체의 필드에 입력받은 값들을 대입하는걸 세번 반복해서 세개의 식당정보를 출력해내면 1절 끝!
		
		// 2절
		// 사용자에게 상호명을 입력받아서
		// 입력받은 상호와 일치하는 식당의 메인메뉴를 출력해주는 프로그램을 하고싶음
		
		// 세개의 식당이 올라간 상태에서
		// 사용자에게 새로운 값을 하나 더 입력받을것임
		System.out.print("가게명을 입력해주세요 > ");
		String searched = sc.nextLine();
		// 사용자가 입력하는, 입력한 문자열과 일치하는 상호가 있다면? --> 이 가게의 메인메뉴 출력해주기
		// 2절의 사용자에게 상호명을 입력받아서 까지는 했음
		
		// 만약에 입력받은 상호와 일치하는 식당이 존재한다면 메인메뉴를 출력해주는 프로그램이므로
		// if로 시작 --> 입력받은 상호와 일치하는 식당이 존재하는지 찾아야함 --> 입력받은 상호는 searched를 보면 알 수 있음 --> 비교대상은? storeName? --> 그냥 storeName이 있는게 아니라 실제 비교하고 싶은 storeName은 세개의 식당객체가 가지고있는 필드에 넣어둔것과 비교하고싶음
		// --> store앞에 뭐가 붙어야함? 식당들이 가지고 있는 storeName의 필드 값이랑 비교하고싶은것임 --> getter()로 가져올까? 비교할건데 지금 식당이 세개임, 세개를 한꺼번에 비교할수는 없음, 하나씩 해야함
		// 첫번째 친구가 가진 storeName이랑비교하려고 가지고오고싶으면? 주소를 참조해서 storeName은 public이 아니므로 getStoreName으로 가져와서 동등비교해야함 --> eqauls메소드를 호출해서!
		if(searched.equals(r0.getStoreName())) {
			
			// 일치하다면? 일치하다면 의 뜻은? 사용자가 입력한거랑 상호명이 똑같다 --> 똑같다면 그 식당의 메인메뉴를 출력해주기로함
			System.out.println("대표 메뉴 : " + r0.getMainMenu());
			// 대표메뉴도 메인메뉴 필드에 들어있음, 누구의 메인메뉴? r0의 메인메뉴, 필드그냥접근안됨, getter
			
		}
		// else if로 한다고 가정, 상호가 같은 식당이 존재한다면?(r0랑 r1의 상호명이 동일하다면) 그러면 r0의 것만 출력되고 r1것은 볼 수 없게됨
		// r0.getStoreName과도 비교해야하고 r1.getStoreName과도 비교 해야함 --> 첫번째 if를 만족하고 수행하고 나면 그냥 빠져나가버림 --> 이런 상황에서는 else if보다 그냥 if가 더 나음
		
		if(searched.equals(r1.getStoreName())) {
			System.out.println("대표 메뉴 : " + r1.getMainMenu());
		}
		
		if(searched.equals(r2.getStoreName())) {
			System.out.println("대표 메뉴 : " + r2.getMainMenu());
		}
		
	} // 이렇게 하면 일단 의도한데까지는 동작을 시킬 수 있음
	// 가게명을 지역이름으로 바꿔서 지역에 있는 식당들을 나열한다든지 하는 거라든지 메뉴를 입력받아서 가게명을 뽑아준다든지 이런식으로 얼마든지 바꿔서 구현할수 있음
	// 하고나서 보니까 if문 세개가 변수명 빼고 중복됨 --> 중복 제거해야함, 위에는 꾸역꾸역 억지로 제거했는데 아래는 어떻게? 아까처럼 반복문으로 하면 되는거 아니야?
	/*
	for(int = 0; i < 3; i++) {
		if(searched.equals(ri..??))
	}
	*/
	/*
	억지로 switch로 돌려볼까?
	switch(searched) {
	case "뼈구이"
	}
	*/
	// --> 이 문제를 해결하기 위해서 새롭게 학습할 내용이 객체를 배열에 담아버리겠다!

}
