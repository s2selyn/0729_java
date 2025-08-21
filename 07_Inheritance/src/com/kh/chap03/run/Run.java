package com.kh.chap03.run;

import com.kh.chap03.model.vo.Book;
import com.kh.chap03.model.vo.ElectronicBook;
import com.kh.chap03.model.vo.LastTime;
import com.kh.chap03.model.vo.PaperBook;

public class Run { // 이 클래스에서 객체 생성 해보자!

	public static void main(String[] args) {
		
		Book book = new Book("그 많던 싱아는 누가 다 먹었을까", "웅진 지식 하우스", "박완서", 16650);
		ElectronicBook eb = new ElectronicBook("저속노화 마인드셋", "웨일북", "정희원", 17550, "yes24");
		PaperBook pb = new PaperBook("혼모노", "창비", "성해나", 16200, 0);
		
		// 이번에 할 이야기는? information 메소드!
		// 우리가 어떤 용도로 만들었더라? 필드들에 값을 집어넣었는데 값이 들어갔는지 안들어갔는지 필드를 확인하고싶어서 --> getter를 써서 하나하나 확인하기 기차낭
		// 하나 다때려넣은 메소드를 만들어서 다들어가있는지 확인해보자! 했지
		System.out.println(book.information());
		System.out.println(eb.information());
		System.out.println(pb.information());
		// eb랑 pb는 아쉽다, 얘네만 가진 필드에 값이 들어가있음, 이걸 덧붙여서 출력해주고싶음
		// 메소드 재정의해준다! 동일한 이름, 반환형, 매개변수 타입으로 재정의
		
		// 이번에 해볼것은~?
		System.out.println(book); // com.kh.chap03.model.vo.Book@1ef7fe8e <-- 이렇게 주소값으로 출력됨
		// 근데 앞에서 표현할 방법이 없어 주소값이라고 얘기했는데, 그렇게 말하기에는 아리까리함 --> 사실은 메소드호출 반환값이 찍힌것 --> toString이라는 메소드 호출의 반환값!
		System.out.println(book.toString()); // 근데 Book 클래스에서 선언하거나 만들지 않은 toString메소드 그래도 toString 메소드 호출의 결과값이 나오네? --> 그럼 얘는 Object 클래스의 것!
		// 부모클래스인 Object 클래스가 가지고 있는 메소드, public이므로 외부에서 접근 가능 --> 까보러감
		// public String toString() {return getClass().getName() + "@" + Integer.toHexString(hashCode());}
		// 접근제한자 public 밖에서 부를 수 있음, 반환형 String, 메소드이름 toString
		// return으로 돌려주는것은? getClass().getName() + "@" + Integer.toHexString(hashCode());
		// getClass는 패키지 경로가 반환되는 메소드(com.kh.chap03.model.vo. 반환), getName은 클래스이름이 반환되는 메소드(Book 반환), 여기까지 풀클래스명 반환하는 부분 --> "@"문자는 구분문자(보편적으로 가운데 구분용으로 써줌)
		// 다하면 나온 정수값 1ef7fe8e은 정수를 16진수로 바꾼것(HexString) --> 뭘 16진수로 바꿈? 해시코드 메소드 호출의 반환값을 바꾼것
		// --> public native int hashCode(); --> 해시코드 메소드는 실제 객체의 메모리상 주소를 해시값으로 받는 메소드 -->  해시코드 메소드는 자바에서 구현이 안되있음 native 키워드 써서 호출함 --> 운영체제상에 있는 C언어로 만든 함수를 자바상에서 호출할 때 쓰는 키워드(native)
		// 자바 언어 안에서 구현되어서 하는게 아님 --> 운영체제상에 만들어진 C언어로 만든 함수를 호출해서 메모리상의 주소값을 가지고오는것, 주소를 가지고 오면 toHexString에 의해서 정수값이 만들어지고 앞에 붙어있는 풀클래스명과 골뱅이문자에 16진수값이 붙은 형태로 문자열로 반환됨
		// 실제로 찍어보면 toString 호출 결과가 com.kh.chap03.model.vo.Book@1ef7fe8e 으로 출력된것
		// 객체를 출력문 안에 집어넣었을때는 항상 toString() 메서드 호출의 반환값이 콘솔창에 출력되는거였음!(toString을 호출하는거였음)
		// 그렇다면...? toString 메소드는 모든 클래스가 다 사용할 수 있는 메소드가 아닐까요? 모든 클래스는 오브젝트의 후손 클래스이기 때문에
		// 만약에 PB, EB의 메소드를 쓸 때 toString() 이라고 만들어준다면...? --> 만들러 다녀옴
		
		// toString 특 : 참조자료형 변수를 출력문 안에 인자값으로 전달할 경우에는 굳이 무언가를 거치지 않아도 toString 메소드 호출의 반환값이 출력된다.
		// toString() : 해당 객체의 풀클래스명 + "@" + 해당 객체의 주소값(16진수형) : String
		System.out.println(eb);
		// 그러면 객체의 필드값을 문자열로 반환받고 싶을때는 우리가 굳이 information 이라는 메소드를 만들어주기 보다는 toString이라는 이름의 메소드로 만들어준다면? 자식클래스에 존재하는 메소드의 우선순위가 더 높기때문에 자식클래스에 정의한 메소드가 호출될 수 있다
		// toString() 메소드를 재정의하고왔음
		System.out.println(pb);
		// 참조자료형 변수를 출력문안에 기술하게되면? 알아서 toString메소드가 호출된 반환값이 나옴 --> 굳이 information 메소드를 호출하지 않아도됨
		
		LastTime lt = new LastTime();
		System.out.println(lt);
		// 출력문을 이용해 참조자료형 객체를 인자로 전달했을 때, overriding된 toString 메소드가 호출되면서 반환된 문자열 형태의 value값이 출력된다
		
	}

}
